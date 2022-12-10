import { Col, button, DatePicker, Form, Row, Select, TimePicker, Button, Descriptions, List, Avatar, Badge } from 'antd';
import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { changeStatusTripDriver, getTripDetailDriver } from '../../../../../redux/apiRequest';
import PassengerCard from '../../../../commons/passenger-card';
import { FloatButton } from 'antd';
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
import { useRef, useState, useEffect } from 'react'
import { useLocation, useNavigate } from 'react-router';
const { Option } = Select;
const center = { lat: 21.013255, lng: 105.52597 }

const TripDetailAdmin = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const location = useLocation(); 
    const detail = location.state.record;
    const check = useState(false);
    const [map, setMap] = useState(/** @type google.maps.Map */(null))
    const [directionsResponse, setDirectionsResponse] = useState(null)
    const [distance, setDistance] = useState('')
    const [duration, setDuration] = useState('')
    const originRef = useRef()
    const destiantionRef = useRef()
    const freeTrip = useSelector((state) => state.freeTrip);
    // const createTrip = useSelector((state) => state.freeTrip.createTrip?.detail);
    const tripDriverDetail = useSelector((state) => state.freeTrip.tripDriverDetail?.detail);
    const listPassengerRegister = tripDriverDetail?.listPassenger;

    console.log(tripDriverDetail);

    var date_str = tripDriverDetail?.timeStart,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");

    var formatted_date = date_parts + formatted.substr(formatted.indexOf(",") + 1);
    // console.log(formatted_date);
    // var timeStart=new Date(tripDriverDetail?.timeStart);
    // console.log(timeStart.toString("dd/M/yyyy hh:mm:ss tt"));
    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: process.env.REACT_APP_GOOGLE_MAP_KEY,
        libraries: ['places'],
    })
    async function calculateRoute() {
        // eslint-disable-next-line no-undef
        const directionsService = new google.maps.DirectionsService()
        const results = await directionsService.route({
            origin: tripDriverDetail?.from,
            destination: tripDriverDetail?.to,
            // eslint-disable-next-line no-undef
            travelMode: google.maps.TravelMode.DRIVING,
        })
        setDirectionsResponse(results)
        console.log(results)
        setDistance(results.routes[0].legs[0].distance.text)
        setDuration(results.routes[0].legs[0].duration.text)
    }
    // console.log(listPassengerRegister);
    // console.log("freeTrip: ", freeTrip);
    // console.log("createTrip: ", createTrip);
    // console.log("tripDriverDetail: ", tripDriverDetail);
    //  const [detailTrip,setDetailTrip]=useState(); 
    const cancelTrip = () => {
        changeStatusTripDriver(tripDriverDetail.id, "CANC", dispatch, navigate);
    }
    const startTrip = () => {
        changeStatusTripDriver(tripDriverDetail.id, "RUN", dispatch, navigate);
    }
    const endTrip = () => {
        changeStatusTripDriver(tripDriverDetail.id, "CLOS", dispatch, navigate);
    }
    useEffect(() => {
        getTripDetailDriver(detail.id, dispatch);
        calculateRoute()
    }, [])
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>CHI TIẾT CHUYẾN ĐI</h2>
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={12} md={6}>
                            <div className='tripDriverDetail-detail'>

                                <Descriptions size='middle' bordered title="Thông tin chi tiết chuyến đi">
                                    <Descriptions.Item span={3} label="Từ">{tripDriverDetail?.from}</Descriptions.Item>
                                    <Descriptions.Item span={3} label="Đến">{tripDriverDetail?.to}</Descriptions.Item>
                                    <Descriptions.Item span={3} label="Thời gian xuất phát">{formatted_date}</Descriptions.Item>
                                    <Descriptions.Item label="Số ghế ">{tripDriverDetail?.seat}</Descriptions.Item>
                                    <Descriptions.Item span={2} label="Cước">{tripDriverDetail?.price}</Descriptions.Item >
                                    {/* <Descriptions.Item label="Số ghế">{tripDriverDetail?.seat}</Descriptions.Item> */}
                                    <Descriptions.Item label="Tài xế">{tripDriverDetail?.driverEmail}</Descriptions.Item>
                                </Descriptions>
                                <br />
                                <h3>Thông tin hành khách đã đăng ký</h3>
 
                                {/* <div className='scroll-bg'>
                                    <div className='scroll-div'>
                                        <div className='scroll-object'>
                                            {
                                                listPassengerRegister && listPassengerRegister.length > 0 &&
                                                listPassengerRegister.map((obj) => {
                                                    return (
                                                        <>
                                                            <div key={obj.id}>
                                                                <PassengerCard id={obj.id} from={obj.from} to={obj.to} passengerEmail={obj.passengerEmail} seatRegister={obj.seatRegister} status={obj.status} note={obj.note} waitingTime={obj.waitingTime} timeStart={obj.timeStart} />
                                                            </div>
                                                        </>
                                                    )
                                                })
                                            }
                                        </div>
                                    </div>
                                </div> */}
                                {/* <PassengerCard /> */}
                                <div className='scroll-bg'>
                                    <div className='scroll-div'>
                                        <div className='scroll-object'>
                                            {
                                                listPassengerRegister && listPassengerRegister.length > 0 &&
                                                listPassengerRegister.map((obj) => {
                                                    return (
                                                        <>
                                                            <div key={obj.id}>
                                                                {
                                                                    obj?.status !== 'REJE' ? (
                                                                        <div className='list-passenger'>
                                                                            <div className='header-list'>
                                                                                <span>
                                                                                    {obj?.passengerEmail}
                                                                                    <div className='status'>CHẤP NHẬN</div>

                                                                                </span>
                                                                                <div className='content-list'>
                                                                                    <div> <Badge color="hsl(102, 53%, 61%)" text={obj?.from} /></div>
                                                                                    <div><Badge color="#f50" text={obj?.to} /></div>
                                                                                    <p>Số ghế:{obj?.seatRegister}</p>

                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    ) : (
                                                                        <>
                                                                         <div className='list-passenger'>
                                                                            <div className='header-list'>
                                                                                <span>
                                                                                    {obj?.passengerEmail}
                                                                                    <div className='status' style={{color:"red"}}>TỪ CHỐI</div>

                                                                                </span>
                                                                                <div className='content-list'>
                                                                                    <div> <Badge color="hsl(102, 53%, 61%)" text={obj?.from} /></div>
                                                                                    <div><Badge color="#f50" text={obj?.to} /></div>
                                                                                    <p>Số ghế:{obj?.seatRegister}</p>

                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        </>
                                                                    )
                                                                }

                                                            </div>
                                                        </>
                                                    )
                                                })
                                            }
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </Col>
                        <Col sm={36} md={18}>
                            <div style={{ marginLeft: "60px" }}>
                                <Flex
                                    position='relative'
                                    flexDirection='column'
                                    alignItems='center'
                                    h='100vh'
                                    w='100vw'
                                >
                                    <Box position='absolute' left={0} top={0} h='70%' w='50%'>
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
                                </Flex>
                            </div>
                        </Col>
                    </Row>
                </div>
            </div>
        </div >
    )
}
export default TripDetailAdmin