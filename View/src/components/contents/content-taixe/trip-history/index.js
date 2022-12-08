import { Button, Checkbox, Form, Input, item, Col, Select, Table, DatePicker, Row } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect } from 'react';
import { FilterOutlined, EyeOutlined } from '@ant-design/icons';
import { useNavigate } from 'react-router';
import { useDispatch, useSelector } from 'react-redux';
import { getTripHistoryDriver, tripHistoryDriver } from '../../../../redux/apiRequest';
import { useState } from 'react';


const { Option } = Select;


const data = [

];

const TripHistoryDriver = () => {

    const navigate = useNavigate();
    const dispatch = useDispatch();
    // const [tripHistory,setTripHistory] =useState();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const all = useSelector((state) => state.tripHistory.tripHistory?.trips);

    console.log(all);
    const dateFormat = (date) =>{
        const date_str = date,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");      
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }

  const trips =all?.map((item)=>{
    if(item.status==="OPEN"){
        return {...item,item,dateStart:dateFormat(item.timeStart),key:item.tripID,seatRemind: item.seat - item.seatRegistered,status:"Đang mở"}
    }
    else if(item.status==="CLOS"){
        return {...item,item,key:item.tripID,dateStart:dateFormat(item.timeStart),seatRemind: item.seat - item.seatRegistered,status:"Đã đóng"}
    }
    else if(item.status==="CANC"){
        return {...item,item,key:item.tripID,dateStart:dateFormat(item.timeStart),seatRemind: item.seat - item.seatRegistered,status:"Đã bị hủy"}
    }
    else if(item.status==="RUN"){
        return {...item,item,key:item.tripID,dateStart:dateFormat(item.timeStart),seatRemind: item.seat - item.seatRegistered,status:"Đang chạy"}
    }

  })
  console.log(trips);
    const onfinish = (values) => {
        console.log("ád");
        const trip = {
            email: user?.email,
            passengerEmail: values.passengerEmail,
            dateFrom: values.dateFrom,
            dateTo: values.dateTo,
            status: values.status
        }

        getTripHistoryDriver(trip, dispatch);
    }

    useEffect(() => {
        const trip = {
            email: user?.email,
        }
        getTripHistoryDriver(trip, dispatch);
    }, [])
    const columns = [
        {
            key: 'index',
            title: 'Số',
            dataIndex: 'index',
        },
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
                    <EyeOutlined onClick={() => { navigate('/taixe/freeTrip/detail', { state: { record } }) }} />

                </div>
            },
        },

    ];
    return (
        <div className='container'>
            <div className='container-infos' style={{
                textAlign: "left",
                marginLeft: "20px"
            }}>
                <h2>LỊCH SỬ CHYẾN ĐI</h2>
                <h3>Trạng thái</h3>
                <div className='driver-info'>

                    <Form
                        onFinish={onfinish}
                        labelCol={{
                            span: 2,
                        }}
                        wrapperCol={{
                            span: 10,
                        }}
                    >


                        <FormItem
                            name="passengerEmail"

                            label="Tài khoản"
                        >
                            <Input />
                        </FormItem>
                        <Row>
                            <Col sm={12} md={6} >
                                <FormItem
                                    name="dateFrom"
                                    label="Từ ngày"
                                    labelCol={{
                                        span: 8,
                                    }}
                                >
                                    <DatePicker placeholder='Chọn ngày' />
                                </FormItem>
                            </Col>
                            <Col sm={12} md={6} >
                                <FormItem
                                    name="dateTo"
                                    label="Đến ngày"
                                    labelCol={{
                                        span: 6,
                                    }}
                                >
                                    <DatePicker placeholder='Chọn ngày' />
                                </FormItem>
                            </Col>
                        </Row>

                        <FormItem
                            name="status"

                            label="Trạng thái"
                        >
                            <Select
                                style={{ width: "200px" }}
               
                            >
                                <Option value='OPEN'>Đang mở</Option>
                                <Option value='CLOS'>Đã đóng</Option>
                                <Option value='CANC'>Đã bị hủy</Option>
                            </Select>
                        </FormItem>


                        <FormItem
                        >
                            <Button className='btn' type="primary" htmlType="submit">
                                <FilterOutlined />  Lọc chuyến đi
                            </Button>
                        </FormItem>


                    </Form>
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={trips} size="middle" />
                </div>
            </div>
        </div>
    )
}
export default TripHistoryDriver