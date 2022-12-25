import { Col, DatePicker, Form, Row, Select, TimePicker, Button, Spin } from 'antd';
import { useRef, useState, useEffect, useMemo } from 'react'
import React from 'react';
import { useNavigate } from 'react-router';
import { CreateFreeTrip, getTripDetailDriver } from '../../../../../redux/apiRequest';
import moment from 'moment';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import {
    Box,
    ButtonGroup,
    Flex,
    HStack,
    IconButton,
    SkeletonText,
    Text,
    Input,
    NumberInput
} from '@chakra-ui/react'

import {
    useJsApiLoader,
    GoogleMap,
    Marker,
    Autocomplete,
    DirectionsRenderer,
    useLoadScript,
} from '@react-google-maps/api'
import Geocode from "react-geocode";
import { createTripSuccess } from '../../../../../redux/freeTripSlice';
import axios from 'axios';
// import usePlacesAutocomplete, {
//     getGeocode,
//     getLatLng,
//   } from "use-places-autocomplete";

//   import {
//     Combobox,
//     ComboboxInput,
//     ComboboxPopover,
//     ComboboxList,
//     ComboboxOption,
//   } from "@reach/combobox";

// import { FaLocationArrow, FaTimes } from 'react-icons/fa'





const { RangePicker } = DatePicker;
const range = (start, end) => {
    const result = [];
    for (let i = start; i < end; i++) {
        result.push(i);
    }
    return result;
};
const { Option } = Select;



const CreateFreeTripForDriver = () => {
    const center = {
        lat: 21.013255
        , lng: 105.52597
    }
    const [maker, setMaker] = useState();
    const [date, setDate] = useState('');
    const dispatch = useDispatch();
    const navigate = useNavigate();

    const user = useSelector((state) => state.user.userInfo?.currentUser);



    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: process.env.REACT_APP_GOOGLE_MAP_KEY,
        libraries: ['places'],
    })

    const [map, setMap] = useState(/** @type google.maps.Map */(null))
    const [directionsResponse, setDirectionsResponse] = useState(null)
    const [distance, setDistance] = useState('')
    const [loading, setLoading] = useState(false);
    const [duration, setDuration] = useState('')
    const [from, setFrom] = useState('')
    const [to, setTo] = useState('')
    const [fee, setFee] = useState('');
    const [listPolyline, setListPolyline] = useState('')
    var polyline = '';

    /** @type React.MutableRefObject<HTMLInputElement> */
    const originRef = useRef()
    /** @type React.MutableRefObject<HTMLInputElement> */
    const destiantionRef = useRef()

    if (!isLoaded) {
        return <></>
    }
    const disabledDate = (current) => {
        // Can not select days before today and today
        return current && current < moment().endOf('day');
    };
    const disabledDateTime = () => ({
        disabledHours: () => range(0, 24).splice(4, 20),
        disabledMinutes: () => range(30, 60),
        disabledSeconds: () => [55, 56],
    });
    const disabledRangeTime = (_, type) => {
        if (type === 'start') {
            return {
                disabledHours: () => range(0, 60).splice(4, 20),
                disabledMinutes: () => range(30, 60),
                disabledSeconds: () => [55, 56],
            };
        }
        return {
            disabledHours: () => range(0, 60).splice(20, 4),
            disabledMinutes: () => range(0, 31),
            disabledSeconds: () => [55, 56],
        };
    };
    function onChange(date, dateString) {
        setDate(date.toISOString());
    }

    const feeTrip = () => {
   
        const a = 0
        if (distance < 31) {
            if (distance < 1) {
                setFee(9000);
            } else {
                setFee(9000 + (distance - 1) * 11000)
            }
        } else {
            setFee(9000 + 11000 * 29 + (distance - 31) * 9500);
        }

    }
    const CreateTripDriver = async (trip) => {
        try {
          const res = await axios
            .post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/tripdriver/create`, {
              driverEmail: trip.driverEmail,
              from: trip.from,
              to: trip.to,
              seat: trip.seat,
              timeStart: trip.timeStart,
              waitingTime: trip.waitingTime,
              price: trip.price,
              listPolyline: trip.listPolyline
            },
              {
                headers: { 'Content-Type': 'application/json' }
              });
          
          const record = res.data.object;
          dispatch(createTripSuccess(res.data.object));
          getTripDetailDriver(record.id, dispatch);
      
          setLoading(true);

          setTimeout(() => {
              setLoading(false);
              navigate('/taixe/freeTrip/detail', { state: { record } })
          }, 1000)
      
        } catch (error) {
          toast.error(error);
        }
      
      }
    const onFinish = (values) => {
        if (user.statusDriver === "NEW") {
            toast.error("Tài xế chưa được cấp phép hoạt động.Vui lòng upload đầy đủ tài liệu và chờ xác nhận!")
        } else {
            if (fee === "") {
                toast.error("Vui lòng nhập điểm bắt đầu và điểm kết thúc")
            } else {
                if (values.price > fee) {
                    toast.error("Cước không được vượt quá giá cước tối đa")
                } else {
                    var trip
                    if(user.vehicleRequest?.typeId === 1){
                         trip = {
                            driverEmail: user.email,
                            from: originRef.current.value,
                            to: destiantionRef.current.value,
                            seat: 1,
                            timeStart: date,
                            waitingTime: values.waitingTime,
                            price: values.price,
                            listPolyline: listPolyline,
                        }
                    }else{
                         trip = {
                            driverEmail: user.email,
                            from: originRef.current.value,
                            to: destiantionRef.current.value,
                            seat: values.seat,
                            timeStart: date,
                            waitingTime: values.waitingTime,
                            price: values.price,
                            listPolyline: listPolyline,
                        }
                    }
                    CreateTripDriver(trip);
                    // CreateFreeTrip(trip, dispatch, navigate, toast);
                }
            }
        }



    }

    async function calculateRoute() {

        if (originRef.current.value === '' || destiantionRef.current.value === '') {
            return
        }

        // eslint-disable-next-line no-undef
        const directionsService = new google.maps.DirectionsService()


        const results = await directionsService.route({
            origin: originRef.current.value,
            destination: destiantionRef.current.value,
            // eslint-disable-next-line no-undef
            travelMode: google.maps.TravelMode.DRIVING,
        })
        setDirectionsResponse(results)
        setDistance(results.routes[0].legs[0].distance.value)
        setDuration(results.routes[0].legs[0].duration.value)

        for (let index = 0; index < results.routes[0].overview_path.length; index++) {
            const e = results.routes[0].overview_path[index];
            polyline += e.lat() + ',' + e.lng() + ';';
        }
        setListPolyline(polyline);
        const a = results.routes[0].legs[0].distance.value;

        if (a / 1000 < 31) {
            if (a / 1000 < 1) {
                setFee(9000);
            } else {
                setFee(9000 + (a / 1000 - 1) * 11000)
            }
        } else {
            setFee(9000 + 11000 * 29 + (a / 1000 - 31) * 9500);
        }


  
    }
   
    const autocomplete = null;
    const onLoad = (autocomplete) => {

        autocomplete = autocomplete
    }

    const onPlaceChanged = () => {
        // eslint-disable-next-line no-undef
        const geocoder = new google.maps.Geocoder();

        if (originRef.current.value === "" && destiantionRef.current.value === "") {
            return
        } else if (originRef.current.value !== "" && destiantionRef.current.value === "") {

            geocoder.geocode({ address: originRef.current.value }, (results, status) => {
                if (status === 'OK') {

                    const lat = results[0].geometry.location.lat();
                    const lng = results[0].geometry.location.lng();

                    setMaker({ lat, lng })
                
                } else {
      
                }
            })
        } else if (destiantionRef.current.value !== "" && originRef.current.value === "") {
            console.log(originRef.current.value);
            console.log(destiantionRef.current.value);
            geocoder.geocode({ address: destiantionRef.current.value }, (results, status) => {
                if (status === 'OK') {

                    center = results[0].geometry.location;
                } else {
                    console.log("not ok");
                }
            })
        } else {
            calculateRoute();
        }
    }


    return (
        <Spin spinning={loading} tip="Loading" size="large">
        <div className='container'>
            <div className='container-info'>
                <h2>CHUYẾN ĐI MIỄN PHÍ</h2>

                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={12} md={6}>
                            <Form
                                labelCol={{
                                    span: 3.5,
                                }}
                                wrapperCol={{
                                    span: 18,
                                }}
                                onFinish={onFinish}
                            >
                                <Form.Item
                                    name="origin"

                                >
                                    <Autocomplete
                                        onLoad={onLoad}
                                        onPlaceChanged={onPlaceChanged}
                                    >
                                        <Input className='abc' type='text' placeholder='Điểm bắt đầu' ref={originRef} style={{ borderColor: "blue", borderRadius: "5px", height: "37px", width: "400px" }} />
                                    </Autocomplete>
                                </Form.Item>
                                <Form.Item
                                    name="destination"

                                >
                                    <Autocomplete
                                        onPlaceChanged={onPlaceChanged}
                                    >
                                        <Input
                                            className='abc'
                                            type='text'
                                            placeholder='Điểm kết thúc'
                                            ref={destiantionRef}
                                            style={{ borderColor: "red", borderRadius: "5px", height: "37px", width: "400px" }}
                                        />
                                    </Autocomplete>
                                </Form.Item>
                                {
                                    user.vehicleRequest?.typeId === 1 ? (
                                        <>
                                            <div style={{ marginBottom: "20px" }}>
                                                <span style={{ marginRight: "10px" }}>Phương tiện:</span>
                                                <Input value={"Xe máy"} disabled />
                                                {/* <span style={{marginLeft:"10px"}} >VNĐ</span> */}
                                            </div>
                                        </>
                                    ) : (
                                        <>
                                            <div style={{ marginBottom: "20px" }}>
                                                <span style={{ marginRight: "10px" }}>Phương tiện:</span>
                                                <Input value={"Ô tô"} disabled />

                                            </div>
                                            <Form.Item
                                                style={{ marginTop: "27px" }}
                                                label="Đăng ký"
                                                name="seat"

                                            >
                                                <Select
                                                    style={{ width: "200px" }}
                                                    defaultValue='1'
                                                >
                                                    <Option value='1'>1 chỗ</Option>
                                                    <Option value='2'>2 chỗ</Option>
                                                    <Option value='3'>3 chỗ</Option>
                                                    <Option value='4'>4 chỗ</Option>
                                                </Select>
                                            </Form.Item>
                                        </>
                                    )

                                }



                                <Form.Item
                                    style={{ display: "inline-block" }}
                                    name="timeStart"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'Ngày không được để trống',
                                        },
                                    ]}
                                >
                                    {/* <DatePicker
                                        // format="YYYY-MM-DD HH:mm:ss"
                                        disabledDate={disabledDate}
                                        disabledTime={disabledDateTime}
                                        showTime={{
                                            defaultValue: moment('00:00:00', 'HH:mm:ss'),
                                        }}
                                        onChange={onChange}
                                    /> ± */}
                                    <DatePicker placeholder='Chọn ngày' disabledDate={(current) => current.isBefore(moment().subtract(1, "day"))} onChange={onChange}
                                        renderExtraFooter={() => ''} showTime />
                                </Form.Item>
                                <Form.Item
                                    style={{ display: "inline-block", width: "20px" }}
                                    name="waitingTime"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'Thời gian chờ không được để trống',
                                        }
                                    ]}
                                >
                                    <Input style={{ borderRadius: "5px", height: "34px" }} placeholder='Thời gian chờ (Phút)' />
                                    {/* <span style={{ display: "inline-block",marginLeft:"10px"}} >Phút</span> */}
                                </Form.Item>
                                {/* <Form.Item
                                name="abc" 
                                initialValue={fee}
                                    label="Cước tối đa"
                                >
                                    <Input disabled/>
                                </Form.Item> */}
                                <div style={{ marginBottom: "20px" }}>
                                    <span style={{ marginRight: "10px" }}>Cước tối đa:</span>
                                    <Input value={Math.round(fee / 1000) * 1000 + " VNĐ"} style={{ borderRadius: "5px", height: "34px" }} disabled />
                                    {/* <span style={{marginLeft:"10px"}} >VNĐ</span> */}
                                </div>
                                <Form.Item
                                    name="price"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'Cước không được để trống',
                                        }
                                    ]}
                                    label="Cước"
                                >
                                    <Input style={{ borderRadius: "5px", height: "34px" }} placeholder='VNĐ' />
                                    {/* <span style={{marginLeft:"10px"}} >VNĐ</span> */}
                                </Form.Item>

                                <Form.Item>
                                    <Button type="primary" htmlType="submit">
                                        Tạo chuyến đi
                                    </Button>
                                </Form.Item>

                            </Form>
                        </Col>
                        <Col sm={36} md={18}>
                            <div style={{ marginLeft: "20px" }}>
                                <Flex
                                    position='relative'
                                    flexDirection='column'
                                    alignItems='center'
                                    h='100vh'
                                    w='100vw'
                                >
                                    <Box position='absolute' left={0} top={0} h='70%' w='52%'>
                                        {/* Google Map Box */}
                                        <GoogleMap
                                            center={center}
                                            zoom={15}
                                            mapContainerStyle={{ width: '100%', height: '100%' }}
                                            options={{
                                                zoomControl: true,
                                                streetViewControl: true,
                                                mapTypeControl: false,
                                                fullscreenControl: false,
                                            }}
                                            onLoad={map => setMap(map)}
                                        >
                                            <Marker position={maker} />

                                            {directionsResponse && (
                                                <DirectionsRenderer directions={directionsResponse} />
                                            )}
                                        </GoogleMap>
                                    </Box>

                                </Flex>
                            </div>

                        </Col>
                    </Row>

                </div>
            </div>
        </div>
        </Spin>
    )
}
export default CreateFreeTripForDriver

