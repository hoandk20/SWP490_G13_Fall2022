import { EyeOutlined } from '@ant-design/icons';
import { Col, DatePicker, Form, Input, Row, Select, TimePicker, Button, Table, Descriptions, Modal } from 'antd';
import TextArea from 'antd/lib/input/TextArea';
import React from 'react';
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation, useNavigate } from 'react-router';
import ModalViewDetail from '../../../../commons/modals/modal-view-detail';
import { toast } from 'react-toastify';
import { CreateFreeTrip, getListFreeTripIsOpen, RegisterTripForPassenger } from '../../../../../redux/apiRequest';
import {
    Box,
    ButtonGroup,
    Flex,
    HStack,
    IconButton,
    SkeletonText,
    Text,
} from '@chakra-ui/react'
import { FaLocationArrow, FaTimes } from 'react-icons/fa'

import {
    useJsApiLoader,
    GoogleMap,
    Marker,
    Autocomplete,
    DirectionsRenderer,
} from '@react-google-maps/api'
import { useRef, useEffect } from 'react'
const { Option } = Select;
const center = { lat: 21.013255, lng: 105.52597 }

const FreeTripDetailOfDriver = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [seatRegister, setSeatRegister] = useState();
    const [note, setNote] = useState();

    const [map, setMap] = useState((null))
    const [directionsResponse, setDirectionsResponse] = useState(null)
    const [distance, setDistance] = useState('')
    const [duration, setDuration] = useState('')
    const originRef = useRef()
    const destiantionRef = useRef()
    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: 'AIzaSyD-r8Ye5leGyYgD4tEYvOa6LJnq2nH-e-I',
        libraries: ['places'],
    })


    // const [tripInfo,setTripInfo]=useState()
    const location = useLocation();
    const tripInfo = location.state?.record;

    var date_str = tripInfo?.timeStart,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");

    var formatted_date = date_parts + formatted.substr(formatted.indexOf(",") + 1);
    async function calculateRoute() {

        // eslint-disable-next-line no-undef
        const directionsService = new google.maps.DirectionsService()

        const results = await directionsService.route({
            origin: tripInfo?.from,
            destination: tripInfo?.to,
            // eslint-disable-next-line no-undef
            travelMode: google.maps.TravelMode.DRIVING,

        })
        setDirectionsResponse(results)
        console.log(results)
        setDistance(results.routes[0].legs[0].distance.text)
        setDuration(results.routes[0].legs[0].duration.text)
    }
    console.log(tripInfo);
    const handleOk = () => {
        if (seatRegister < tripInfo.seat) {
            const trip = {
                tripID: tripInfo.key,
                driverEmail: tripInfo.driverEmail,
                passengerEmail: user.email,
                from: tripInfo.from,
                to: tripInfo.to,
                seatRegister: seatRegister,
                timeStart: tripInfo.timeStart,
                waitingTime: tripInfo.waitingTime,
                price: tripInfo.price,
                note: note,
            }
            RegisterTripForPassenger(trip, dispatch, navigate, toast);
            getListFreeTripIsOpen(dispatch);
        } else {
            toast.error('Không đủ số ghế để đăng ký')
        }

        setIsModalOpen(false);
    };

    const handleCancel = () => {
        setIsModalOpen(false);
    };
    const onChangeTextArea = (e) => {
        setNote(e.target.value);
    };
    const handleOnChangeSelect = (selectedValue) => {
        setSeatRegister(selectedValue);
    }

    const showModal = () => {
        setIsModalOpen(true);
    };

    useEffect(() => {
        calculateRoute()
    }, [])
    return (
        <div className='container'>
            <div className='container-info'>
                {/* <h2>CHUYẾN ĐI MIỄN PHÍ</h2> */}
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={16} md={8}>
                            <Descriptions size='middle' bordered title="Thông tin chi tiết chuyến đi">
                                <Descriptions.Item span={3} label="Từ">{tripInfo?.from}</Descriptions.Item>
                                <Descriptions.Item span={3} label="Đến">{tripInfo?.to}</Descriptions.Item>
                                <Descriptions.Item span={3} label="Thời gian xuất phát">{formatted_date}</Descriptions.Item>

                                {
                                    tripInfo?.tripID !== null ? (
                                        <Descriptions.Item label="Số ghế đã đặt">{tripInfo?.seatRegister}</Descriptions.Item>
                                    ) : (
                                        <Descriptions.Item label="Số ghế còn trống">{tripInfo?.seat - tripInfo?.seatRegistered}</Descriptions.Item>
                                    )
                                }
                                <Descriptions.Item span={2} label="Cước">{tripInfo?.price}</Descriptions.Item >
                                <Descriptions.Item span={3} label="Tài xế">{tripInfo?.driverEmail}</Descriptions.Item>
                            </Descriptions>

                            <div style={{ marginTop: "20px" }}>
                                <Descriptions size='middle' bordered title="Thông tin phương tiện tài xế">

                                    <Descriptions.Item span={3} label="Biển số xe">{tripInfo?.vehiclePlate}</Descriptions.Item>
                                    <Descriptions.Item span={2} label="Loại xe">{tripInfo?.vehicleName}</Descriptions.Item>
                                    <Descriptions.Item span={1} label="Màu xe">{tripInfo?.vehicleColor}</Descriptions.Item>
                                </Descriptions>
                            </div>
                            <div style={{ marginTop: '30px', display: 'inline-block' }}>

                                <div>
                                    {
                                        tripInfo?.tripID !== null ? (
                                            <></>
                                        ) : (
                                            <div>
                                                <div>

                                                    <Select
                                                        style={{ width: "100px" }}
                                                        onChange={handleOnChangeSelect}
                                                    >
                                                        <Option value='1'>1 chỗ</Option>
                                                        <Option value='2'>2 chỗ</Option>
                                                        <Option value='3'>3 chỗ</Option>
                                                        <Option value='4'>4 chỗ</Option>
                                                    </Select>

                                                </div>
                                                <div style={{ marginTop: "25px", textAlign: "center" }}>
                                                    <Button type="primary" danger style={{ marginTop: "25px", display: 'inline-block' }}>
                                                        Hủy
                                                    </Button>
                                                    <Button type="primary" style={{ marginLeft: "15px", display: 'inline-block' }} onClick={showModal}   >Xác nhận</Button>
                                                </div>
                                            </div>
                                        )
                                    }

                                    <Modal title="Đăng ký chuyến đi" width={700} open={isModalOpen} onOk={handleOk} onCancel={handleCancel}
                                        footer={[
                                            <Button key="back" onClick={handleCancel}>
                                                Hủy
                                            </Button>,
                                            <Button style={{ marginTop: "100px" }} key="submit" type="primary" onClick={handleOk}>
                                                Xác nhận
                                            </Button>,

                                        ]}
                                    >
        
                                        <h3>Ghi chú với tài xế</h3>
                                        <TextArea onChange={onChangeTextArea} style={{
                                            height: 200,
                                        }} />
                                    </Modal>
                                </div>
                            </div>
                        </Col>
                        <Col sm={16} md={8}>
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
        </div>
    )
}
export default FreeTripDetailOfDriver;