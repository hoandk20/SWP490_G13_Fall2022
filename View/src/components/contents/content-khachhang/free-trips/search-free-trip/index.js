import { EyeOutlined } from '@ant-design/icons';
import { Col, DatePicker, Form, Row, Select, TimePicker, Button, Table, InputNumber, Spin } from 'antd';
import axios from 'axios';
import React from 'react';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate } from 'react-router';
import { getListFreeTrip, getListFreeTripIsOpen, getTripDetailDriver } from '../../../../../redux/apiRequest';
import ModalViewDetail from '../../../../commons/modals/modal-view-detail';

import {
    Box,
    ButtonGroup,
    Flex,
    HStack,
    IconButton,
    SkeletonText,
    Text,
    Input
} from '@chakra-ui/react'
import { FaLocationArrow, FaTimes } from 'react-icons/fa'

import {
    useJsApiLoader,
    GoogleMap,
    Marker,
    Autocomplete,
    DirectionsRenderer,
} from '@react-google-maps/api'
import { useRef, useState } from 'react'

const { Option } = Select;
const center = { lat: 21.013255, lng: 105.52597 }


const SerachFreeTripForPassenger = () => {

    // const [freeTrips,setFreeTrips] =useState([]);
    const dispatch = useDispatch();
    const [loading, setLoading] = useState(false);
    const trips = useSelector((state) => state.freeTrip.trips?.allTrip);


    const dateFormat = (date) => {
        const date_str = date,
            options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
            formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
            date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }
    const freeTrips = trips?.map((row) => ({ ...row, key: row.id, seatRemind: row.seat - row.seatRegistered, dateStart: dateFormat(row.timeStart) ,price:Math.round(row.price/1000)*1000}));
    useEffect(() => {
        getListFreeTripIsOpen(dispatch);

    }, [])

    const columns = [

        {
            key: 'dateStart',
            title: 'Thời gian bắt đầu',
            dataIndex: 'dateStart',
        },
        {
            key: 'from',
            title: 'Từ',
            dataIndex: 'from',
        },
        {
            key: 'to',
            title: 'Đến',
            dataIndex: 'to',
        },
        {
            key: 'price',
            title: 'Cước (đ)',
            dataIndex: 'price',
        },
        {
            key: 'seatRemind',
            title: 'Số chỗ còn trống',
            dataIndex: 'seatRemind',
        },

        {
            title: 'Đăng ký',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                const a=record;
                return <div>

                    <EyeOutlined onClick={() => {
                        getTripDetailDriver(record.id,dispatch);
                        setLoading(true);
                       
                        setTimeout(() => {
                            setLoading(false);
                            navigate('/khachhang/freeTrip/detail-of-taixe', { state: { a } })
                        }, 1000)
                    }} />

                </div>
            },
        }
    ];

    const navigate = useNavigate();
    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: process.env.REACT_APP_GOOGLE_MAP_KEY,
        libraries: ['places'],
    })

    const [map, setMap] = useState(/** @type google.maps.Map */(null))
    const [directionsResponse, setDirectionsResponse] = useState(null)
    const [distance, setDistance] = useState('')
    const [duration, setDuration] = useState('')
    const [date, setDate] = useState('');
    const [time, setTime] = useState('');
    const [listPolyline, setListPolyline] = useState('')
    var polyline = '';
    const options = {
        fields: ["formatted_address", "geometry", "name"],
        strictBounds: false,
        types: ["establishment"],
    };

    /** @type React.MutableRefObject<HTMLInputElement> */
    const originRef = useRef()
    /** @type React.MutableRefObject<HTMLInputElement> */
    const destiantionRef = useRef()

    if (!isLoaded) {
        return <></>
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
        setDistance(results.routes[0].legs[0].distance.text)
        setDuration(results.routes[0].legs[0].duration.text)
        for (let index = 0; index < results.routes[0].overview_path.length; index++) {
            const e = results.routes[0].overview_path[index];
            polyline += e.lat() + ',' + e.lng() + ';';
        }
        setListPolyline(polyline);
    }


    function onChangeDateStart(date, dateString) {
        setDate(date.toISOString());
    }
    function onChangeTimeStart(time, dateString) {
        setTime(time.toISOString());
    }

    const onFinish = (values) => {
        // calculateRoute();
        const trip = {
            from: originRef.current.value,
            to: destiantionRef.current.value,
            registerSeat: values.seat,
            timeStart: values.timeStart,
            dateStart: date,
            listPolyline: listPolyline,
            // price:values.price,
        }
        getListFreeTrip(trip, dispatch);

    }
    const onPlaceChanged = () => {
        // eslint-disable-next-line no-undef
        const geocoder = new google.maps.Geocoder();

        if (originRef.current.value === "" && destiantionRef.current.value === "") {
            return
        } else if (originRef.current.value !== "" && destiantionRef.current.value === "") {
            geocoder.geocode({ address: originRef.current.value }, (results, status) => {
                if (status === 'OK') {
                    center = results[0].geometry.location;
                } 
            })
        } else if (destiantionRef.current.value !== "" && originRef.current.value === "") {

            geocoder.geocode({ address: destiantionRef.current.value }, (results, status) => {
                if (status === 'OK') {
                    center = results[0].geometry.location;
                } 
            })
        } else {
            calculateRoute();
        }
    }

    return (
        <Spin spinning={loading}  tip="Loading" size="large">
        <div className='container'>
            <div className='container-info'>
                <h2>CHUYẾN ĐI MIỄN PHÍ</h2>
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={14} md={7}>
                            <Form
                                onFinish={onFinish}
                            >
                                <Form.Item 
                                name="origin"
                                // rules={[
                                //     {
                                //         required: true,
                                //         message: 'Vui lòng chọn quốc gia đăng ký',
                                //     },
                                // ]}
                                >
                                <Autocomplete
                                    onPlaceChanged={onPlaceChanged}
                                >
                                    <Input type='text' placeholder='Điểm bắt đầu' ref={originRef} style={{ borderColor:"blue", borderRadius:"5px",height:"37px",width: "400px" }}
                                    />
                                </Autocomplete>
                                </Form.Item>


                                <Autocomplete
                                    onPlaceChanged={onPlaceChanged}
                                >
                                    <Input
                                        type='text'
                                        placeholder='Điểm kết thúc'
                                        ref={destiantionRef}
                                        style={{ borderColor:"red", borderRadius:"5px",height:"37px",width: "400px" ,marginBottom:"20px"}}
                                    />
                                </Autocomplete>

                                <Form.Item
                                    defaultValue="1"
                                    label="Đăng ký"
                                    name="seat"
                                >
                                    <Select
                                        style={{ width: "200px" }}

                                    >
                                        <Option value='1'>1 chỗ</Option>
                                        <Option value='2'>2 chỗ</Option>
                                        <Option value='3'>3 chỗ</Option>
                                        <Option value='4'>4 chỗ</Option>
                                    </Select>
                                </Form.Item>
                                <Form.Item
                                    name="dateStart"
                                    label="Ngày xuất phát"
                                >
                                    <DatePicker placeholder='Chọn ngày' onChange={onChangeDateStart} />
                                </Form.Item>
                                <Form.Item
                                    name='timeStart'
                                    label="Giờ"
                                    style={{ display: "inline-block" }}
                                >
                                    <InputNumber min={0} max={24} style={{ width: "200px" }} />
                                </Form.Item>

                                <Form.Item>
                                    <Button style={{ justifyContent: "center" }} type="primary" htmlType="submit">
                                        Tìm kiếm
                                    </Button>
                                </Form.Item>
                            </Form>
                        </Col>
                        <Col sm={32} md={16}>
                            <div style={{ float:"left" }} >
                                <Flex
                                    position='relative'
                                    flexDirection='column'
                                    alignItems='center'
                                    h='100vh'
                                    w='100vw'
                                >
                                    <Box position='absolute' left={0} top={0} h='80%' w='52%'>
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
                                            <Marker position={center} />
                                            {directionsResponse && (
                                                <DirectionsRenderer directions={directionsResponse} />
                                            )}
                                        </GoogleMap>
                                    </Box>
                                    {/* <Box
                                    p={4}
                                    borderRadius='lg'
                                    m={4}
                                    bgColor='white'
                                    shadow='base'
                                    minW='container.md'
                                    zIndex='1'
                                >
                                    <HStack spacing={2} justifyContent='space-between'>
                                        <Box flexGrow={1}>
                                            <Autocomplete>
                                                <Input type='text' placeholder='Origin' ref={originRef} />
                                            </Autocomplete>
                                        </Box>
                                        <Box flexGrow={1}>
                                            <Autocomplete>
                                                <Input
                                                    type='text'
                                                    placeholder='Destination'
                                                    ref={destiantionRef}
                                                />
                                            </Autocomplete>
                                        </Box>
                                        <ButtonGroup>
                                            <Button colorScheme='pink' type='submit' onClick={calculateRoute}>
                                                Calculate Route
                                            </Button>
                                            <IconButton
                                                aria-label='center back'
                                                icon={<FaTimes />}
                                                onClick={clearRoute}
                                            />
                                        </ButtonGroup>
                                    </HStack>
                                    <HStack spacing={4} mt={4} justifyContent='space-between'>
                                        <Text>Distance: {distance} </Text>
                                        <Text>Duration: {duration} </Text>
                                        <IconButton
                                            aria-label='center back'
                                            icon={<FaLocationArrow />}
                                            isRound
                                            onClick={() => {
                                                map.panTo(center)
                                                map.setZoom(15)
                                            }}
                                        />
                                    </HStack>
                                </Box> */}
                                </Flex>
                            </div>

                        </Col>
                    </Row>
                    <div className='table-info' style={{ width:"80%"}}>
                        <Table columns={columns} dataSource={freeTrips} size="middle" />
                    </div>
                </div>
            </div>
        </div>
        </Spin>
    )
}
export default SerachFreeTripForPassenger;