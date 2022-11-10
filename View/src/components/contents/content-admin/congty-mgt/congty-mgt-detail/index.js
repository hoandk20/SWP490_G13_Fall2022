import { EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';
import { AddDriverByCompany, EditDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
const { Option } = Select;
const CompanyDetailAdmin = (props) => {
    const location = useLocation();
    const dispatch = useDispatch();
    const drivers = location.state?.record;
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [form] = Form.useForm();
    // const onfinish = (values) => {
    //     console.log(values);
    //     const driver = {
    //         ...values,
    //         companyEmail: user.email,
    //     }
    //     EditDriverByCompany(driver, toast, dispatch)
    //     // getDriversForCompany(user.email,dispatch);
    //     setOpen(false);
    // };


    return (
        <>
            <Form
                // onFinish={onfinish} 
                layout="vertical" hideRequiredMark name="basic" form={form}>
                <h1>THÔNG TIN CÔNG TY</h1>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name="companyName"
                            initialValue={drivers.companyName}
                            label="Tên công ty"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>

                    <Col span={12}>
                        <Form.Item
                            name="status"
                            initialValue={drivers.status}
                            label="Trạng thái"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name="address"
                            initialValue={drivers.companyName}
                            label="Địa chỉ"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>

                    <Col span={12}>
                        <Form.Item
                            name=""
                            initialValue={drivers.lastName}
                            label="Thành phố"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name="address"
                            initialValue={drivers.companyName}
                            label="Số ĐT"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>

                    <Col span={12}>
                        <Form.Item
                            name=""
                            initialValue={drivers.lastName}
                            label="Số dư"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name="address"
                            initialValue={drivers.companyName}
                            label="Mã số VAT"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>

                    <Col span={12}>
                        <Form.Item
                            name="abc"
                            initialValue='Taxi tài'
                            label="Loại hình KD"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                <p>Thông tin người đại diện</p>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name="name"
                            initialValue={drivers.firstName}
                            label="Tên"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>

                    <Col span={12}>
                        <Form.Item
                            name="lastName"
                            initialValue={drivers.lastName}
                            label="Họ và tên đệm"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name="email"
                            initialValue={drivers.email}
                            label="Email"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please enter user name',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                    <Col span={12}>
                        <Form.Item
                            name="email"
                            initialValue={drivers.email}
                            label="Số di động"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please enter user name',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                <Row gutter={16}>
                    <Col span={12}>
                        <Form.Item
                            name=""
                            initialValue={drivers.firstName}
                            label="Ngôn ngữ"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>

                    <Col span={12}>
                        <Form.Item
                            name=""
                            initialValue={drivers.lastName}
                            label="Tài khoản"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                </Row>
                               
                <Form.Item>
                    <Button className='btn-register' type="primary" htmlType="submit">
                        Submit
                    </Button>
                </Form.Item>
            </Form>
        </>
    );
};
export default CompanyDetailAdmin;