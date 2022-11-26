import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker } from 'antd';
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

    const navigate=useNavigate();
    const dispatch=useDispatch();
    // const [tripHistory,setTripHistory] =useState();
    const user=useSelector((state)=>state.user.userInfo?.currentUser);
    const trips=useSelector((state)=>state.tripHistory.tripHistory?.trips);
   const tripHistory=trips?.map((row)=> ({ ...row, seatRemind: row.seat-row.seatRegistered,key:row.id }))
   console.log(tripHistory);

   const onfinish = (values) => {
    const trip = {
        email: user?.email,
        driverEmail: values.driverEmail,
        dateFrom: values.dateFrom,
        dateTo: values.dateTo,
        status: values.status
    }
    // getTripHistoryPassenger(trip, dispatch);
}

    useEffect(()=>{
        const trip ={
            email:user?.email,
        }
        getTripHistoryDriver(trip,dispatch);
       },[]) 
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
                         <EyeOutlined onClick={()=>{navigate('/taixe/freeTrip/detail', { state: { record } })}}/> 
                        
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
                        onfinish={onfinish}
                        labelCol={{
                            span: 2,
                        }}
                        wrapperCol={{
                            span: 10,
                        }}
                    >

<FormItem
                            name="driverEmail"

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
                                    <DatePicker />
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
                                    <DatePicker />
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
                    <Table columns={columns} dataSource={tripHistory} size="middle" />
                </div>
            </div>
        </div>
    )
}
export default TripHistoryDriver