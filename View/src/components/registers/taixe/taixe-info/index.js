import {
    Button,
    Checkbox,
    Col,
    Form,
    Input,
    Row,
    Select,
} from 'antd';
import React, { useState } from 'react';
import ReCAPTCHA from "react-google-recaptcha";
import '../../khachhang/register-passenger.css'
import { useLocation } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import { registerCompany, registerDriver } from '../../../../redux/apiRequest';
import { useDispatch } from 'react-redux';

import { toast } from 'react-toastify';
const { Option } = Select;


const RegisterDriverInfo = () => {
    const [form] = Form.useForm();
    const navigate = useNavigate();
    const dispatch = useDispatch();
    const location = useLocation();
    console.log(location.state.newUser)
    const onFinish = (values) => {
        const newUser = {
            ...location.state.newUser,
            firstName: values.firstName,
            lastName: values.lastName,
            email: values.email,
            password: values.password
        }
        registerDriver(newUser, dispatch, navigate, toast);
        navigate('/signup/confirm-email', { state: { newUser } });
        // navigate('/signup/driver-doc', { state: { newUser } });
    };

    const prefixSelector = (
        <Form.Item name="prefix" noStyle>
            <Select
                style={{
                    width: 70,
                }}
            >
                <Option value="84">+84</Option>
            </Select>
        </Form.Item>
    );
    return (
        <div className='container'>
            <h2>ĐĂNG KÝ ĐỂ ĐI XE</h2    >
            <div className='container-info'>
                <Row>
                    <Col sm={24} md={12} >
                        <div className='container-left'>
                            {/* <img src={ImageRegisterKh} alt="abc" /> */}
                        </div>
                    </Col>
                    <Col sm={24} md={12}>
                        <div className='container-right'>
                            {/* <h1>ĐĂNG KÝ ĐỂ ĐI XE</h1> */}
                            <div className='container-right-info'>

                                <Form
                                    // {...formItemLayout}
                                    form={form}
                                    name="register"
                                    onFinish={onFinish}
                                    initialValues={{
                                        prefix: '+84'
                                    }}
                                    scrollToFirstError
                                >
                                    <h3>
                                        THÔNG TIN LIÊN HỆ
                                    </h3>
                                    <Form.Item
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',

                                        }}
                                        name="firstName"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your username!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='*Tên' />
                                    </Form.Item>
                                    <Form.Item
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',

                                        }}
                                        name="lastName"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your username!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='*Họ và Tên Đệm' />
                                    </Form.Item>

                                    <h3>
                                        TÀI KHOẢN
                                    </h3>
                                    <p>Email *</p>
                                    <Form.Item
                                        name="email"

                                        rules={[
                                            {
                                                type: 'email',
                                                message: 'The input is not valid E-mail!',
                                            },
                                            {
                                                required: true,
                                                message: 'Please input your E-mail!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder="*Email:name@example.com"
                                        // style={{ width: '700px', }}
                                        />
                                    </Form.Item>
                                    <p>Mật khẩu *</p>
                                    <Form.Item
                                        name="password"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your password!',
                                            },
                                        ]}
                                        hasFeedback
                                    >
                                        <Input.Password placeholder='*Mật khẩu: có tối thiểu 6 ký tự' />
                                    </Form.Item>

                                    <Form.Item
                                        name="confirm"

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
                                        <Input.Password placeholder='*Nhập lại mật khẩu' />
                                    </Form.Item>
                                    <ReCAPTCHA
                                        sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"
                                    />,
                                    <Form.Item
                                    >
                                        <Button className='btn-register' type="primary" htmlType="submit" >
                                            Register
                                        </Button>
                                    </Form.Item>

                                </Form>
                            </div>
                        </div>
                    </Col>
                </Row>
            </div>



        </div>
    );

};

export default RegisterDriverInfo;