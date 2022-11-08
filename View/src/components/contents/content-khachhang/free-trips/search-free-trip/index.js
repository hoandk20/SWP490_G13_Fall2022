import { EyeOutlined } from '@ant-design/icons';
import { Col, DatePicker, Form, Input, Row, Select, TimePicker, Button, Table } from 'antd';
import axios from 'axios';
import React, { useState } from 'react';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate } from 'react-router';
import { getListFreeTripIsOpen } from '../../../../../redux/apiRequest';
import ModalViewDetail from '../../../../commons/modals/modal-view-detail';
const { Option } = Select;



const SerachFreeTripForPassenger = () => {
    
    // const [freeTrips,setFreeTrips] =useState([]);
    const dispatch=useDispatch();
    
    const trips = useSelector((state) => state.freeTrip.trips?.allTrip) ; 
    const freeTrips=trips.object.map(row=>({
        key:row.id,
        timeStart:row.timeStart,
        from:row.from,
        to:row.to,
        price:row.price,
        //  seatRemind:`${row.seatRegistered}/${row.seat}`,
        driverEmail:row.driverEmail,
        seatRegistered:row.seatRegistered,
        status:row.status,
        listPassenger:row.listPassenger,
        tripID:row.tripID,
        waitingTime:row.waitingTime,
        seatRemind:row.seat
    }))
    useEffect(()=>{
       getListFreeTripIsOpen(dispatch);
  
      },[]) 
//  const getListFreeTripIsOpen =async () =>{

//     const res=await axios.get(`${URL}:8080/api/tripdriver/listOpen`,{
//       headers: { 'Content-Type': 'application/json' }
//     })
//     .then(function (response) {
//         setFreeTrips(
//             response.data.object.map(row=>({
//                 key:row.id,
//                 timeStart:row.timeStart,
//                 from:row.from,
//                 to:row.to,
//                 price:row.price,
//                 seat:row.seat,
//                 driverEmail:row.driverEmail,
//                 seatRegistered:row.seatRegistered,
//                 status:row.status,
//                 listPassenger:row.listPassenger,
//                 tripID:row.tripID,
//                 waitingTime:row.waitingTime,
//                 seatRemind:row.seat-row.seatRegistered
//             }))
//         );
//     })
//     .catch(function (error) {
//       console.log(error);
//     });
//   }


      
const columns = [
    {
        key: 'index',
        title: 'Số',
        dataIndex: 'index',
    },
    {
        key: 'timeStart',
        title: 'Thời gian bắt đầu',
        dataIndex: 'timeStart',
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
            return <div>

                <EyeOutlined onClick={() => {
                    navigate('/khachhang/freeTrip/detail-of-taixe',{state:{record}})

                }} />

            </div>
        },
    }
];
    const navigate = useNavigate();
    const showModal = () => {

        navigate('/khachhang/freeTrip/detail-of-taixe')
    }

    const data = [
        {
            key: '1',
            timeStart: '08:00:00 ngày 20/10/2000',
            from: 'Tân Xã, Thạch Thất, Hà Nội, Việt Nam',
            to: 'Tân Xã, Thạch Thất, Hà Nội, Việt Nam',
            fee: '10000 vnd',
            seat: '3',
            // status:'Đang mở',
            // action: <EyeOutlined onClick={showModal} />,
        },
        {
            key: '2',
            timeStart: '09:00:00 ngày 20/10/2000',
            from: 'Thạch Hòa, Thạch Thất, Hà Nội, Việt Nam',
            to: 'Tân Xã, Thạch Thất, Hà Nội, Việt Nam',
            fee: '20000 vnd',
            seat: '2',
            // status:'Đang mở',
            // action: <EyeOutlined onClick={showModal} />,
        },
        {
            key: '3',
            timeStart: '09:20:00 ngày 20/10/2000',
            from: 'Thạch Hòa, Thạch Thất, Hà Nội, Việt Nam',
            to: 'Bình Yên, Thạch Thất, Hà Nội, Việt Nam',
            fee: '15000 vnd',
            seat: '1',
            // status:'Đang mở',
            // action: <EyeOutlined onClick={showModal} />,
        },
    ];
    const [filterData, setfilterData] = useState(data);

    const onFinish = (values) => {

        // const trip = {
        //     from: values.from,
        //     to: values.to,
        //     seat: values.seat,
        //     dateStart: values.dateStart,
        //     hStart: values.hStart,
        //     // price:values.price,
        // }
        // if (values.from === undefined) {
        //     trip.from = '';
        // }
        // if (values.to === undefined) {
        //     trip.to = '';
        // }
        // if (values.seat === undefined) {
        //     trip.seat = '';
        // }
        // if (values.dateStart === undefined) {
        //     trip.dateStart = null;
        // }
        // if (values.hStart === undefined) {
        //     trip.hStart = null;
        // }

        // console.log(trip)
        // if (trip.from === '' && trip.to === '' && trip.seat === '' && trip.dateStart === null && trip.hStart === null) {
        //     setfilterData(data);
        // } else {

        //     if (trip.from !== '') {
        //         setfilterData(data.filter((obj) => obj["from"].includes(trip.from)));
        //         if (trip.to !== '') {
        //             setfilterData(filterData.filter((obj) => obj["to"].includes(trip.to)));
        //         }
        //     }

        // }

    }


    return (
        <div className='container'>
            <div className='container-info'>
                <h2>CHUYẾN ĐI MIỄN PHÍ</h2>
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={16} md={8}>
                            <Form
                                onFinish={onFinish}
                            >
                                <Form.Item
                                    name="from"
                                >
                                    <Input placeholder='Từ' />
                                </Form.Item>
                                <Form.Item
                                    name="to"
                                >
                                    <Input placeholder='Đến' />
                                </Form.Item>
                                <Form.Item
                                    label="Đăng ký"
                                    name="seat"
                                >
                                    <Select
                                        style={{ width: "100px" }}

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
                                    <DatePicker />
                                </Form.Item>
                                <Form.Item
                                    name='hStart'
                                    label="Giờ"
                                    style={{ display: "inline-block" }}
                                >
                                    <TimePicker />
                                </Form.Item>
                                {/* <Form.Item
                                    style={{ display: "inline-block", width: "60px" }}
                                >
                                    <Input />
                                </Form.Item> */}
                                <Form.Item>
                                    <Button className='btn-submit' type="primary" htmlType="submit">
                                        Tìm kiếm
                                    </Button>
                                </Form.Item>
                            </Form>
                        </Col>
                    </Row>
                    <div className='table-info' style={{ marginTop: "5%" }}>
                        <Table  columns={columns} dataSource={freeTrips} size="middle" />
                    </div>
                </div>
            </div>
        </div>
    )
}
export default SerachFreeTripForPassenger;