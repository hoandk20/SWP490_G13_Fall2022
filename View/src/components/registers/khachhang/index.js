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
import './register-passenger.css'
import ImageRegisterKh from '../../../assets/image-app/register-khachhang.png'

const { Option } = Select;
const formItemLayout = {
    labelCol: {
        xs: {
            span: 24,
        },

    },
    wrapperCol: {
        xs: {
            span: 24,

        },
        // sm: {
        //     span: 16,
        //     offset: 0,
        // },
    },
};
const tailFormItemLayout = {
    wrapperCol: {
        xs: {
            span: 24,
            offset: 0,
        },
        sm: {
            span: 16,
            offset: 8,
        },
    },
};



const RegisterPassenger = () => {
    const [form] = Form.useForm();

    const onFinish = (values) => {
        console.log('Received values of form: ', values);
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
                            <img src={ImageRegisterKh} alt="abc" />
                        </div>
                    </Col>
                    <Col sm={24} md={12}>
                        <div className='container-right'>
                            {/* <h1>ĐĂNG KÝ ĐỂ ĐI XE</h1> */}
                            <div className='container-right-info'>
                                <h3>
                                    TÀI KHOẢN
                                </h3>

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

                                    <Form.Item
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',
                                        }}
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
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',

                                        }}
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
                                    {/* <p>Mật khẩu phải có từ 6-20 ký tự và không có khoảng trắng.</p> */}
                                    <h3>
                                        HỒ SƠ
                                    </h3>
                                    <Form.Item
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',

                                        }}
                                        name="username"
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
                                        name="username"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your username!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='*Họ và Tên Đệm' />
                                    </Form.Item>
                                    <Form.Item
                                        name="phone"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your phone number!',
                                            },
                                        ]}
                                    >
                                        <Input
                                            addonBefore={prefixSelector}
                                            style={{
                                                width: '50%',
                                            }}
                                        />
                                    </Form.Item>
                                    <h3>MÃ MỜI</h3>

                                    <Form.Item
                                        name="username"

                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your username!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='Nhập mã mời giới thiệu để nhận phần thưởng' />
                                    </Form.Item>


                                    <ReCAPTCHA
                                        sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"
                                    
                                    />,
                                    <Form.Item
                                  
                                    // {...tailFormItemLayout}
                                    >
                                        <Button   className='btn-register' type="primary" htmlType="submit">
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

export default RegisterPassenger;