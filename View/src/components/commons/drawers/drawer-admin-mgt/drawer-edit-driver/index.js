import { EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import './drawer-edit.css';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddDriverByCompany, EditDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
const { Option } = Select;
const EditDriverForCompany = (props) => {
    const dispatch = useDispatch();
    const drivers = props.state;
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [form] = Form.useForm();

    const showDrawer = () => {
        setOpen(true);
    };
    const onClose = () => {
        setOpen(false);
    };
    const onfinish = (values) => {
        console.log(values);
        const driver = {
            ...values,
            companyEmail: user.email,
        }
        EditDriverByCompany(driver, toast, dispatch)
        // getDriversForCompany(user.email,dispatch);
        setOpen(false);
    };


    return (
        <>
            <EyeOutlined onClick={showDrawer} />
            <Drawer
                title="Add driver"
                width={720}
                onClose={onClose}
                open={open}
                bodyStyle={{
                    paddingBottom: 80,
                }}
            >
                <Form onFinish={onfinish} layout="vertical" hideRequiredMark name="basic" form={form}>
                    <p>Thông tin công ty</p>
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
                                label="Số ĐT"
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
                    <p>Thông tin cá nhân</p>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="name"
                                initialValue={drivers.firstName}
                                label="Tên đầy đủ"
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
                                label="Địa chỉ"
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
                                name="city"
                                initialValue={drivers.city}
                                label="Thành phố"
                                rules={[
                                    {
                                        required: true,
                                        message: 'please enter  description',
                                    },
                                ]}
                            >
                                <Select>
                                    <Option value="Hà nội">Hà nội</Option>
                                    <Option value="Đà nẵng">Đà nẵng </Option>
                                    <Option value="Thành phố Hồ Chí Minh">Thành phố Hồ Chí Minh </Option>
                                </Select>
                            </Form.Item>

                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="vitri"
                                initialValue='MDR'
                                label="Vị trí"
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
                    <p>Tài khoản</p>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="abc"
                                initialValue={drivers.email}
                                label="Tài khoản"
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
                    </Row>
                    <Form.Item>
                        <Button className='btn-register' type="primary" htmlType="submit">
                            Submit
                        </Button>
                    </Form.Item>
                </Form>
            </Drawer>
        </>
    );
};
export default EditDriverForCompany;