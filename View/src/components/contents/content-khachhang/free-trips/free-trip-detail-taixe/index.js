import { EyeOutlined } from '@ant-design/icons';
import { Col, DatePicker, Form, Input, Row, Select, TimePicker, Button, Table, Descriptions, Modal } from 'antd';
import TextArea from 'antd/lib/input/TextArea';
import React from 'react';
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation, useNavigate } from 'react-router';
import ModalViewDetail from '../../../../commons/modals/modal-view-detail';
import { toast } from 'react-toastify';
import { CancleTripForPassenger, CreateFreeTrip, getListFreeTripIsOpen, RegisterTripForPassenger } from '../../../../../redux/apiRequest';
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
import axios from 'axios';
import PassengerCard from '../../../../commons/passenger-card';
import { passengerRegisterTripSuccess } from '../../../../../redux/freeTripSlice';
import { createContext } from 'react';
const { Option } = Select;
const ReachableContext = createContext(null);
const UnreachableContext = createContext(null);
const center = { lat: 21.013255, lng: 105.52597 }

const FreeTripDetailOfDriver = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);

    const [isModalOpen, setIsModalOpen] = useState(false);
    const [seatRegister, setSeatRegister] = useState(1);
    const [note, setNote] = useState();
    const [modal, contextHolder] = Modal.useModal();


    const [map, setMap] = useState((null))
    const [directionsResponse, setDirectionsResponse] = useState(null)
    const [distance, setDistance] = useState('')
    const [duration, setDuration] = useState('')
    const location = useLocation();
    const view = location.state?.a;
    const fromPassenger = location.state?.from;
    const toPassenger = location.state?.to;

    console.log(toPassenger);
    const tripInfo = useSelector((state) => state.freeTrip.tripDriverDetail?.detail);
    const tripPassenger = tripInfo.listPassenger.find(t => t.passengerEmail === user.email);

    const listPassenger = tripInfo.listPassenger.filter(t => t.status === "APPR");


    var date_str = tripInfo?.timeStart,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");

    var formatted_date = date_parts + formatted.substr(formatted.indexOf(",") + 1);
    console.log("tripsInfo", tripInfo);
    // const [tripInfo, setTripInfo] = useState('')
    const originRef = useRef()
    const destiantionRef = useRef()

    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: process.env.REACT_APP_GOOGLE_MAP_KEY,
        libraries: ['places'],
    })
    useEffect(() => {
        calculateRoute();
    }, [isLoaded])


    if (!isLoaded) {
        return <></>
    }

    // const [tripInfo,setTripInfo]=useState()

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

        setDistance(results.routes[0].legs[0].distance.text)
        setDuration(results.routes[0].legs[0].duration.text)
    }

    const CancelTrip = () => {
        const object = {
            id: tripPassenger.id,
            passengerEmail: user.email
        }
        CancleTripForPassenger(object, navigate);
    }

    const registerTrip = async (trip, dispatch, navigate, toast) => {

        const res = await axios
            .post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/tripPassenger/create`, {
                tripID: trip.tripID,
                driverEmail: trip.driverEmail,
                passengerEmail: trip.passengerEmail,
                from: trip.from,
                to: trip.to,
                seatRegister: trip.seatRegister,
                timeStart: trip.timeStart,
                waitingTime: trip.waitingTime,
                price: trip.price,
                note: trip.note,
            },
                {
                    headers: { 'Content-Type': 'application/json' }
                })
            .then(function (response) {
                toast.success("????ng k?? th??nh c??ng,vui l??ng ?????i t??i x??? x??c nh???n")
                dispatch(passengerRegisterTripSuccess(res.data.object));
            })
            .catch(function (error) {
                if (error.response.data.object.IsRegisted) {
                    toast.error("T??i kho???n c???a b???n ???? ????ng k?? chuy???n ??i.Vui l??ng h???y chuy???n ??i r???i ????ng k?? l???i")
                } else {
                    toast.error("????ng k?? th???t b???i");
                }
            });
    }
    const handleOk = () => {
        if (seatRegister <= tripInfo.seat) {
            var trip
            if (fromPassenger === "") {
                trip = {
                    tripID: tripInfo.tripID,
                    driverEmail: tripInfo.driverEmail,
                    passengerEmail: user.email,
                    from: tripInfo.from,
                    to: tripInfo.to,
                    seatRegister: seatRegister,
                    timeStart: tripInfo.timeStart,
                    waitingTime: tripInfo.waitingTime,
                    price: view.price,
                    note: note,
                }
            } else {
                trip = {
                    tripID: tripInfo.tripID,
                    driverEmail: tripInfo.driverEmail,
                    passengerEmail: user.email,
                    from: fromPassenger,
                    to: toPassenger,
                    seatRegister: seatRegister,
                    timeStart: tripInfo.timeStart,
                    waitingTime: tripInfo.waitingTime,
                    price: view.price,
                    note: note,
                }
            }

            console.log("trip", trip);
            registerTrip(trip, dispatch, navigate, toast);
            getListFreeTripIsOpen(dispatch);
        } else {
            toast.error('Kh??ng ????? s??? gh??? ????? ????ng k??')
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


    return (
        <div className='container'>
            <div className='container-info'>
                {/* <h2>CHUY???N ??I MI???N PH??</h2> */}
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={14} md={7}>
                            <Descriptions size='middle' bordered title="Th??ng tin chi ti???t chuy???n ??i">
                                {
                                    view === "history" ? (
                                        <>
                                            <Descriptions.Item span={3} label="T???">{tripPassenger?.from}</Descriptions.Item>
                                            <Descriptions.Item span={3} label="?????n">{tripPassenger?.to}</Descriptions.Item>
                                        </>
                                    ) : (
                                        <>
                                            <Descriptions.Item span={3} label="T???">{tripInfo?.from}</Descriptions.Item>
                                            <Descriptions.Item span={3} label="?????n">{tripInfo?.to}</Descriptions.Item>
                                        </>
                                    )
                                }

                                <Descriptions.Item span={3} label="Th???i gian xu???t ph??t">{formatted_date}</Descriptions.Item>
                                
                                {
                                    view === "history" ? (
                                        <>
                                            <Descriptions.Item span={1} label="S??? gh??? ???? ?????t">{tripPassenger?.seatRegister}</Descriptions.Item>
                                            <Descriptions.Item span={2} label="C?????c ph???i tr???">{tripPassenger?.price}</Descriptions.Item >
                                        </>
                                    ) : (
                                        <>
                                            <Descriptions.Item span={2} label="S??? gh??? c??n tr???ng">{tripInfo?.seat - tripInfo?.seatRegistered}</Descriptions.Item>
                                            {/* <Descriptions.Item span={1} label="C?????c ph???i tr???">{view?.price}</Descriptions.Item > */}
                                        </>
                                    )
                                }
                                <Descriptions.Item span={1} label="S??? ng?????i ??i c??ng">{listPassenger.length}</Descriptions.Item >

                                
                                <Descriptions.Item span={2} label="C?????c t???ng chuy???n ??i">{tripInfo?.price}</Descriptions.Item >
                                <Descriptions.Item span={3} label="T??i x???">{tripInfo?.driverEmail}</Descriptions.Item>
                                <Descriptions.Item span={3} label="S??T T??i x???">{user?.phone}</Descriptions.Item>
                                {
                                    view === "history" ? (
                                        <>
                                            <Descriptions.Item span={3} label="Tr???ng th??i ????ng k?? ">
                                                {
                                                    tripPassenger?.status === "APPR" ? (
                                                        <div style={{ color: "blue" }}>
                                                            ???? ???????c ch???p nh???n
                                                        </div>
                                                    ) : (
                                                        <div>
                                                            {
                                                                tripPassenger?.status === "PEND" ? (
                                                                    <div style={{ color: "blue" }}>
                                                                        ??ang ch??? t??i x??? ch???p nh???n
                                                                    </div>
                                                                ) : (
                                                                    <div style={{ color: "blue" }}>
                                                                        Kh??ng ???????c ch???p nh???n
                                                                    </div>
                                                                )
                                                            }

                                                        </div>
                                                    )
                                                }
                                            </Descriptions.Item>
                                            <Descriptions.Item span={3} label="Tr???ng th??i chuy???n ??i ">
                                                {
                                                    tripInfo?.status === "CLOS" ? (
                                                        <div style={{ color: "red" }}>
                                                            ???? ????ng
                                                        </div>
                                                    ) : (
                                                        <div>
                                                            {
                                                                tripInfo?.status === "OPEN" ? (
                                                                    <div style={{ color: "red" }}>
                                                                        ??ang m???
                                                                    </div>
                                                                ) : (
                                                                    <div style={{ color: "red" }}>
                                                                        ???? b??? h???y
                                                                    </div>
                                                                )
                                                            }

                                                        </div>
                                                    )
                                                }
                                            </Descriptions.Item>
                                        </>
                                    ) : (
                                        <>
                                        </>
                                    )
                                }



                            </Descriptions>
                            <div style={{ marginTop: "20px" }}>
                                {
                                    view === "history" ? (
                                        <>

                                        </>
                                    ) : (
                                        <>
                                            {
                                                fromPassenger === "" ? (
                                                    <>
                                                        <Descriptions size='middle' bordered title="Th??ng tin chuy???n ??i c???a ng?????i d??ng">
                                                            <Descriptions.Item span={3} label="T???">{tripInfo?.from}</Descriptions.Item>
                                                            <Descriptions.Item span={3} label="?????n">{tripInfo?.to}</Descriptions.Item>
                                                            <Descriptions.Item span={3} label="C?????c ph???i tr???">{view?.price}</Descriptions.Item >
                                                        </Descriptions>
                                                    </>
                                                ) : (
                                                    <>
                                                        <Descriptions size='middle' bordered title="Th??ng tin chuy???n ??i c???a ng?????i d??ng">
                                                            <Descriptions.Item span={3} label="T???">{fromPassenger}</Descriptions.Item>
                                                            <Descriptions.Item span={3} label="?????n">{toPassenger}</Descriptions.Item>
                                                            <Descriptions.Item span={3} label="C?????c ph???i tr???">{view?.price}</Descriptions.Item >
                                                        </Descriptions>
                                                    </>
                                                )
                                            }

                                        </>
                                    )
                                }
                            </div>

                            <div style={{ marginTop: "20px" }}>
                                <Descriptions size='middle' bordered title="Th??ng tin ph????ng ti???n t??i x???">

                                    <Descriptions.Item span={2} label="Bi???n s??? xe">{tripInfo?.vehiclePlate}</Descriptions.Item>
                                    {
                                        tripInfo?.vehicleType === 1 ? (
                                            <>
                                                <Descriptions.Item span={2} label="Lo???i xe">Xe m??y</Descriptions.Item>
                                            </>
                                        ) : (
                                            <>
                                                <Descriptions.Item span={2} label="Lo???i xe">?? t??</Descriptions.Item>
                                            </>
                                        )
                                    }

                                    <Descriptions.Item span={2} label="H??ng xe">{tripInfo?.vehicleName}</Descriptions.Item>
                                    <Descriptions.Item span={1} label="M??u xe">{tripInfo?.vehicleColor}</Descriptions.Item>
                                </Descriptions>
                            </div>

                            <div style={{ marginTop: '30px', display: 'inline-block' }}>

                                <div>
                                    {
                                        view === "history" ? (
                                            <>
                                                <ReachableContext.Provider value="Light">


                                                    <Button type="primary" danger onClick={() => {
                                                        modal.confirm({
                                                            title: "B???n c?? mu???n h???y chuy???n ??i n??y",
                                                            onOk() {
                                                                CancelTrip();
                                                            }
                                                        })

                                                    }} style={{ marginLeft: "30%" }}>
                                                        H???y chuy???n ??i
                                                    </Button>
                                                    {contextHolder}

                                                    <UnreachableContext.Provider value="Bamboo" />
                                                </ReachableContext.Provider>

                                            </>
                                        ) : (
                                            <div>
                                                <div>

                                                    <Select
                                                        style={{ width: "100px" }}
                                                        onChange={handleOnChangeSelect}
                                                        defaultValue="1"
                                                    >
                                                        <Option value='1'>1 ch???</Option>
                                                        <Option value='2'>2 ch???</Option>
                                                        <Option value='3'>3 ch???</Option>
                                                        <Option value='4'>4 ch???</Option>
                                                    </Select>

                                                </div>
                                                <div style={{ marginTop: "25px", textAlign: "center" }}>
                                                    {/* <Button type="primary" danger style={{ marginTop: "25px", display: 'inline-block' }}>
                                                        H???y
                                                    </Button> */}
                                                    <Button type="primary" style={{ width:"150px" }} onClick={showModal}   >????ng k??</Button>
                                                </div>
                                            </div>
                                        )
                                    }

                                    <Modal title="????ng k?? chuy???n ??i" width={700} open={isModalOpen} onOk={handleOk} onCancel={handleCancel}
                                        footer={[
                                            <Button key="back" onClick={handleCancel}>
                                                H???y
                                            </Button>,
                                            <Button style={{ marginTop: "100px" }} key="submit" type="primary" onClick={handleOk}>
                                                X??c nh???n
                                            </Button>,

                                        ]}
                                    >

                                        <h3>Ghi ch?? v???i t??i x???</h3>
                                        <TextArea onChange={onChangeTextArea} style={{
                                            height: 200,
                                        }} />
                                    </Modal>

                                </div>
                            </div>

                        </Col>
                        <Col sm={34} md={17}>
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