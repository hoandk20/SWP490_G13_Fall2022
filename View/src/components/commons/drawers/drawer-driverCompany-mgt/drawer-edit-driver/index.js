import { EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddDriverByCompany, EditDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
const { Option } = Select;
const EditDriverForCompany = (props) => {
    const dispatch =useDispatch();
    const drivers=props.state;
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
        EditDriverByCompany(driver,toast,dispatch)
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
                    <Row gutter={16}>
                        <Col span={24}>
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
                        {/* <Col span={12}>

                            <Form.Item
                                name="password"
                                label="Password"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please input your password!',
                                    },
                                ]}
                                hasFeedback
                            >
                                <Input.Password />
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                        <Form.Item
                                name="confirm"
                                label="Confirm Password"
                                dependencies={['password']}
                                hasFeedback
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please confirm your password!',
                                    },
                                    ({ getFieldValue }) => ({
                                        validator(_, value) {
                                            if (!value || getFieldValue('password') === value) {
                                                return Promise.resolve();
                                            }
                                            return Promise.reject(new Error('The two passwords that you entered do not match!'));
                                        },
                                    }),
                                ]}
                            >
                                <Input.Password />
                            </Form.Item>
                        </Col> */}
                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="firstName"
                                initialValue={drivers.firstName}
                                label="First Name"
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
                                label="Last name"
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
                                name="phoneNumber"
                                initialValue={drivers.phoneNumber}
                                label="Phone number"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please enter plate',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={24}>
                            <Form.Item
                                name="country"
                                initialValue={drivers.country}
                                label="Country"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please choose country',
                                    },
                                ]}
                            >
                                <Select>
                                    <Option value="vi">Việt Nam</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={24}>
                            <Form.Item
                                name="city"
                                initialValue={drivers.city}
                                label="City"
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
                            <Form.Item
                            >
                                <Button className='btn-register' type="primary" htmlType="submit">
                                    Submit
                                </Button>
                            </Form.Item>
                        </Col>
                    </Row>
                </Form>
            </Drawer>
        </>
    );
};
export default EditDriverForCompany;