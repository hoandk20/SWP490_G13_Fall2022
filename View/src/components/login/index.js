import React from 'react';
import "./login.css"
import ReCAPTCHA from "react-google-recaptcha";
import ImageLogo from "../../assets/image-app/avatar-login.png";
import { Button, Checkbox, Form, Image, Input } from 'antd';
import { EyeInvisibleOutlined, MailOutlined, SettingOutlined } from '@ant-design/icons';
import { useState } from 'react';
import { loginUser } from '../../redux/apiRequest';
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate } from 'react-router';
import ForgotPassword from '../../components/commons/modals/modal-forgotPassword'

const Login = () => {
    const [form] = Form.useForm();
    const [email, setEmail] =useState("") ;
    const [password, setPassword] =useState("") ;
    const dispatch = useDispatch();
    const navigate =useNavigate();

    const onFinish = (values) => {
     
        const newUser = {
            username:values.email,
            password:values.password,
        };
        loginUser(newUser,dispatch,navigate);
    };
    return (
        <div className='container'>
            <div className='container-info-login'>
                <div className="user_card">

                    <div className="brand_logo_container">
                        <img src={ImageLogo} className="brand_logo" alt="Logo" />
                    </div>
                    <div className='form-signin'>
                        <Form
                            form={form}
                            name="login"
                            onFinish={onFinish}
                            scrollToFirstError
                        >
                            <div className='form-lable'>
                                Email
                            </div>
                            <Form.Item
                                name="email"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Email là bắt buộc',
                                    }
                                ]}
                                style={{ margin: "10px 40px" }}
                            >
                                {/* <p style={{color:"white",textAlign:"left"}}>SỐ gi động</p> */}
                                <Input onChange={(e) =>{setEmail(e.target.value)}} addonBefore={<MailOutlined style={{ fontSize: "24px" }} />} size="large" />


                            </Form.Item>
                            <div className='form-lable'>
                                Mật khẩu
                            </div>
                            <Form.Item
                                name="password"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Mật khẩu là bắt buộc',
                                    }
                                ]}
                                style={{ margin: "10px 40px" }}
                            >

                                <Input.Password onChange={(e) =>{setPassword(e.target.value)}} addonBefore={<MailOutlined style={{ fontSize: "24px" }} />} size="large" />


                            </Form.Item>
                            <Form.Item
                                name="remember"
                                valuePropName="checked"
                                wrapperCol={{
                                    offset: 2,
                                    span: 7,
                                }}
                            >
                                <Checkbox style={{ color: "white" }}>Remember me</Checkbox>
                            </Form.Item>
                            <Form.Item
                                style={{ margin: "10px 40px" }}
                            >
                                <ReCAPTCHA
                                    sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"
                                />,
                            </Form.Item>

                            <Form.Item>
                                <Button className='btn-login' htmlType='submit'>Đăng nhập</Button>
                            </Form.Item>
                        </Form>

                        <div className="form-bottom">
                            <div className="a links">
                                <ForgotPassword/>
                            </div>
                            <div className=" links">
                                <a href='/'>Trang chủ</a>
                                <a style={{float:"right",marginRight:"40px"}} href='http://localhost:3000/signup/home'>ĐĂNG KÍ</a>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

        </div>
    )
}
export default Login
