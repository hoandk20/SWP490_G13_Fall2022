
import { Button, Col, Row, Table } from 'antd';
import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router';
import CarouselHome from '../../../commons/carousel';
import { EyeOutlined } from '@ant-design/icons';
import "./homeAll.css"
import axios from 'axios';
import { getAllCity, getListFreeTrip } from '../../../../redux/apiRequest';
import { useDispatch } from 'react-redux';
import {

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
import { useRef } from 'react'






const center = { lat: 21.013255, lng: 105.52597 }


const HomeAll = () => {
    const navigate = useNavigate();
    const dispatch = useDispatch();
    const [allTrip, setAllTrip] = useState();
    const getTop10Trips = async () => {
        try {

            const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/GetTop10Trip`, {
                headers: { 'Content-Type': 'application/json' }
            })
            setAllTrip(res.data.object);
        } catch (error) {

        }
    }

    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: process.env.REACT_APP_GOOGLE_MAP_KEY,
        libraries: ['places'],
    })

    console.log(allTrip);
    const dateFormat = (date) => {
        const date_str = date,
            options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
            formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
            date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }
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

    const trips = allTrip?.map((item) => {
        if (item.status === "OPEN") {
            return { ...item, item, dateStart: dateFormat(item.timeStart), key: item.tripID, status: "Đang mở" }
        }
        else if (item.status === "CLOS") {
            return { ...item, item, key: item.tripID, dateStart: dateFormat(item.timeStart), status: "Đã đóng" }
        }
        else if (item.status === "CANC") {
            return { ...item, item, key: item.tripID, dateStart: dateFormat(item.timeStart), status: "Đã bị hủy" }
        }
        else if (item.status === "RUN") {
            return { ...item, item, key: item.tripID, dateStart: dateFormat(item.timeStart), status: "Đang chạy" }
        }

    })
    const onFinish = async() => {
        // calculateRoute();
        const trip = {
            from: originRef.current.value,
            to: destiantionRef.current.value,
            registerSeat: "",
            timeStart: "",
            dateStart: "",
            listPolyline: listPolyline,
            // price:values.price,
        }
        // getListFreeTrip(trip, dispatch);
        try {
        
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/tripdriver/search`, {
              listPolyline: trip.listPolyline,
              status: "OPEN",
              registerSeat: trip.registerSeat,
              dateStart: trip.dateStart,
              timeStart: trip.timeStart
            },
              {
                headers: { 'Content-Type': 'application/json' }
              })
              setAllTrip(res.data.object);
          } catch (error) {
           
          }

    }
    useEffect(() => {
        getTop10Trips();
        getAllCity(dispatch);
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
            key: 'status',
            title: 'Trạng thái',
            dataIndex: 'status',
        },


        {
            title: 'Đăng ký',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>

                    <EyeOutlined onClick={() => {
                        // navigate('/khachhang/freeTrip/detail-of-taixe', { state: { record } })

                    }} />

                </div>
            },
        }
    ];

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

    // const onFinish = (values) => {
    //     // calculateRoute();
    //     const trip = {
    //         from: originRef.current.value,
    //         to: destiantionRef.current.value,
    //         registerSeat: values.seat,
    //         timeStart: values.timeStart,
    //         dateStart: date,
    //         listPolyline: listPolyline,
    //         // price:values.price,
    //     }
    //     getListFreeTrip(trip, dispatch);

    // }
    const onPlaceChanged = () => {
        // eslint-disable-next-line no-undef
        const geocoder = new google.maps.Geocoder();

        if (originRef.current.value === "" && destiantionRef.current.value === "") {
            return
        } else if (originRef.current.value !== "" && destiantionRef.current.value === "") {
            geocoder.geocode({ address: originRef.current.value }, (results, status) => {
                if (status === 'OK') {
                    center = results[0].geometry.location;
                } else {
                    console.log("not ok");
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
        <>
            <div cotainer-home>
                <div className='home'>
                    <div className='home-content'>
                        <div className='home-content-a'>
                            <CarouselHome />
                        </div>
                        <div style={{ margin: "20px 10%" }}>
                            <div className='home-table-header'>
                                <Row>
                                    <Col span={7.8}>
                                        <span className='text-home'>CHUYẾN ĐI MIỄN PHÍ</span>
                                    </Col>
                                    <Col span={7}>

                                        <span style={{ margin: "20px 10px" }}>
                                            <Autocomplete
                                                onPlaceChanged={onPlaceChanged}
                                            >
                                                <Input focusBorderColor='lime' type='text' placeholder='Điểm bắt đầu' ref={originRef} 
                                                style={{ borderColor:"blue", borderRadius:"5px",height:"40px",width: "320px" }}
                                                />
                                            </Autocomplete>
                                        </span>

                                    </Col>
                                    <Col span={7}>
                                        <span style={{ margin: "20px 10px" }}>
                                            <Autocomplete
                                                onPlaceChanged={onPlaceChanged}
                                            >
                                                <Input
                                                    type='text'
                                                    placeholder='Điểm kết thúc'
                                                    ref={destiantionRef}
                                                    style={{ borderColor:"red", borderRadius:"5px",height:"40px",width: "320px"}}
                                                />
                                            </Autocomplete>
                                        </span>
                                    </Col>
                                    <Col span={2}>
                                        {/* <Button style={{marginTop:"25px"}}>Tìm kiếm</Button> */}
                                        <button onClick={onFinish} class="btn-home" role="button">Tìm kiếm</button>
                                    </Col>
                                </Row>



                            </div>
                            <div className='home-content-table'>
                                <Table columns={columns} dataSource={trips} size="middle" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </>

    )
}
export default HomeAll