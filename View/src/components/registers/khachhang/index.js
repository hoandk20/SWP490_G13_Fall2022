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
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate } from 'react-router';
import { registerPassenger } from '../../../redux/apiRequest';


import { toast } from 'react-toastify';

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
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const onFinish = (values) => {
        const newUser = {
            email: values.email,
            password: values.password,
            firstName: values.firstName,
            lastName: values.lastName,
            phoneNumber: values.phoneNumber,
            role: "ROLE_PASSENGER",
            cityId:values.city.value
        }
        registerPassenger(newUser, dispatch, navigate, toast);
        // navigate("/signup/confirm-email",{ state: { newUser } });

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
            <h2 style={{ marginTop: "5%" }}>ĐĂNG KÝ ĐỂ ĐI XE</h2    >
            <div className='container-info-register-passenger' style={{ marginTop: "5%" }}>
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

                                    <Form.Item
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',
                                        }}
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
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',

                                        }}
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
                                    {/* <p>Mật khẩu phải có từ 6-20 ký tự và không có khoảng trắng.</p> */}
                                    <h3>
                                        HỒ SƠ
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
                                                message: 'Tên không được để trống',
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
                                                message: 'Tên không được để trống',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='*Họ và Tên Đệm' />
                                    </Form.Item>
                                    <Form.Item
                                        name="phoneNumber"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui lòng nhập lại số điện thoại',
                                                pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
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
                                    <Form.Item
                                        name="city"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui lòng chọn thành phố',
                                            },
                                        ]}
                                    >
                                        <Select
                                            placeholder="Thành phố đăng ký"
                                            labelInValue
                                            options={citys}
                                        />
                                    </Form.Item>
                                    {/* <h3>MÃ MỜI</h3>

                                    <Form.Item
                                        name="gift"

                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your gift!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='Nhập mã mời giới thiệu để nhận phần thưởng' />
                                    </Form.Item> */}


                                    <ReCAPTCHA
                                        sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"

                                    />,
                                    <Form.Item

                                    // {...tailFormItemLayout}
                                    >
                                        <Button className='btn-register' type="primary" htmlType="submit">
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