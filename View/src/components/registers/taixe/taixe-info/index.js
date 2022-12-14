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
import ImageRegister from '../../../../assets/image-app/registerDiver.jpg'

import { toast } from 'react-toastify';
const { Option } = Select;


const RegisterDriverInfo = () => {
    const [form] = Form.useForm();
    const navigate = useNavigate();
    const dispatch = useDispatch();
    const location = useLocation();
    const onFinish = (values) => {
        const newUser = {
            ...location.state.newUser,
            firstName: values.firstName,
            lastName: values.lastName,
            email: values.email,
            password: values.password
        }
        registerDriver(newUser, dispatch, navigate, toast);
        // navigate('/signup/confirm-email', { state: { newUser } });
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
           
            <div style={{marginTop:"20px"}} className='container-info'>
                <Row>
                    <Col sm={28} md={14} >
                        <div className='container-left'>
                            <img width="95%" height="600vh" src={ImageRegister} alt="abc" />
                        </div>
                    </Col>
                    <Col sm={20} md={10}>
                        <div className='container-right'>
                            {/* <h1>ĐĂNG KÝ ĐỂ ĐI XE</h1> */}
                            <div className='container-right-info'>
                            <h2>ĐĂNG KÝ ĐỂ ĐI XE</h2    >
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
                                                message: 'Please input your firstname!',
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
                                                message: 'Please input your lastname!',
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
                                                message: 'Email không hợp lệ',
                                            },
                                            {
                                                required: true,
                                                message: 'Email không được để trống',
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
                                                min: 6,
                                                max: 32,
                                                message: 'Mật khẩu phải lớn hơn 6 ký tự'
                                            },
                                            {
                                                required: true,
                                                message: 'Mật khẩu không được để trống',  
                                            }
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
                                                message: 'Vui lòng xác nhận lại mật khẩu',
                                            },
                                            ({ getFieldValue }) => ({
                                                validator(_, value) {
                                                    if (!value || getFieldValue('password') === value) {
                                                        return Promise.resolve();
                                                    }

                                                    return Promise.reject(new Error('Không khớp với mật khẩu'));
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
                                            Gửi
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