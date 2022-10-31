import { Col, DatePicker, Form, Input, Row, Select, TimePicker, Button } from 'antd';
import React, { useState } from 'react';
import { useNavigate } from 'react-router';
import { CreateFreeTrip } from '../../../../../redux/apiRequest';
import moment from 'moment';
import { useDispatch, useSelector } from 'react-redux';
import {  toast } from 'react-toastify';
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
    const [date,setDate]=useState('');
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const user=useSelector((state)=>state.user.userInfo?.currentUser);
    console.log(user);
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
    function onChange(date,dateString) {
        setDate(date.toISOString());
    }

    const onFinish = (values) => {
        const trip={
            driverEmail: user.email,
            from:values.from,
            to:values.to,
            seat:values.seat,
            timeStart:date,
            waitingTime:values.waitingTime,
            price:values.price,
        }
        CreateFreeTrip(trip,dispatch,navigate,toast);
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
                                    rules={[
                                        {
                                            required: true,
                                            message: 'không được để trống',
                                        }
                                    ]}
                                >
                                    <Input placeholder='Từ' />
                                </Form.Item>
                                <Form.Item
                                    name="to"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'không được để trống',
                                        }
                                    ]}
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
                                    style={{ display: "inline-block" }}
                                    name="timeStart"
                                >
                                    <DatePicker
                                        // format="YYYY-MM-DD HH:mm:ss"
                                        disabledDate={disabledDate}
                                        disabledTime={disabledDateTime}
                                        showTime={{
                                            defaultValue: moment('00:00:00', 'HH:mm:ss'),
                                        }}
                                        onChange={onChange}
                                    /> ±
                                </Form.Item>
                                <Form.Item
                                    style={{ display: "inline-block", width: "60px" }}
                                    name="waitingTime"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'không được để trống',
                                        }
                                    ]}
                                >
                                    <Input />
                                </Form.Item>
                                <Form.Item
                                    name="price"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'không được để trống',
                                        }
                                    ]}
                                    label="Cước"
                                    style={{ width: "200px" }}
                                >
                                    <Input />
                                </Form.Item>

                                <Form.Item>
                                    <Button className='btn-submit' type="primary" htmlType="submit">
                                        Tạo chuyến đi
                                    </Button>
                                </Form.Item>

                            </Form>
                        </Col>
                    </Row>
                </div>
            </div>
        </div>
    )
}
export default CreateFreeTripForDriver