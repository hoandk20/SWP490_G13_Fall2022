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
            <h2 style={{ marginTop: "5%" }}>????NG K?? ????? ??I XE</h2    >
            <div className='container-info-register-passenger' style={{ marginTop: "5%" }}>
                <Row>
                    <Col sm={24} md={12} >
                        <div className='container-left'>
                            <img src={ImageRegisterKh} alt="abc" />
                        </div>
                    </Col>
                    <Col sm={24} md={12}>
                        <div className='container-right'>
                            {/* <h1>????NG K?? ????? ??I XE</h1> */}
                            <div className='container-right-info'>
                                <h3>
                                    T??I KHO???N
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
                                                message: 'Email kh??ng h???p l???',
                                            },
                                            {
                                                required: true,
                                                message: 'Email kh??ng ???????c ????? tr???ng',
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
                                                message: 'M???t kh???u ph???i l???n h??n 6 k?? t???'
                                            },
                                            {
                                                required: true,
                                                message: 'M???t kh???u kh??ng ???????c ????? tr???ng',
                                            }
                                        ]}
                                        hasFeedback
                                    >
                                        <Input.Password placeholder='*M???t kh???u: c?? t???i thi???u 6 k?? t???' />
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
                                                message: 'Vui l??ng x??c nh???n l???i m???t kh???u',
                                            },
                                            ({ getFieldValue }) => ({
                                                validator(_, value) {
                                                    if (!value || getFieldValue('password') === value) {
                                                        return Promise.resolve();
                                                    }

                                                    return Promise.reject(new Error('Kh??ng kh???p v???i m???t kh???u'));
                                                },
                                            }),
                                        ]}
                                    >
                                        <Input.Password placeholder='*Nh???p l???i m???t kh???u' />
                                    </Form.Item>
                                    {/* <p>M???t kh???u ph???i c?? t??? 6-20 k?? t??? v?? kh??ng c?? kho???ng tr???ng.</p> */}
                                    <h3>
                                        H??? S??
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
                                                message: 'T??n kh??ng ???????c ????? tr???ng',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='*T??n' />
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
                                                message: 'T??n kh??ng ???????c ????? tr???ng',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='*H??? v?? T??n ?????m' />
                                    </Form.Item>
                                    <Form.Item
                                        name="phoneNumber"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui l??ng nh???p l???i s??? ??i???n tho???i',
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
                                                message: 'Vui l??ng ch???n th??nh ph???',
                                            },
                                        ]}
                                    >
                                        <Select
                                            placeholder="Th??nh ph??? ????ng k??"
                                            labelInValue
                                            options={citys}
                                        />
                                    </Form.Item>
                                    {/* <h3>M?? M???I</h3>

                                    <Form.Item
                                        name="gift"

                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your gift!',
                                            },
                                        ]}
                                    >
                                        <Input placeholder='Nh???p m?? m???i gi???i thi???u ????? nh???n ph???n th?????ng' />
                                    </Form.Item> */}


                                    <ReCAPTCHA
                                        sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"

                                    />,
                                    <Form.Item

                                    // {...tailFormItemLayout}
                                    >
                                        <Button className='btn-register' type="primary" htmlType="submit">
                                            G???i
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