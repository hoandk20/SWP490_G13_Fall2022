import React from 'react';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import Image from 'react-bootstrap/Image'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import "./index.css"
import ImageLogo from "../../assets/avatar-login.png";
const Login = () => {
    return (
        <Form>
            <div className="container h-100">
                <div className="d-flex justify-content-center h-100">
                    <div className="user_card">
                        <div className="d-flex justify-content-center">
                            <div className="brand_logo_container">
                                <img src={ImageLogo} className="brand_logo" alt="Logo" />
                            </div>
                        </div>
                        <div className="d-flex justify-content-center form_container">
                            <Form.Group className='form-group'>
                                <Form.Label className='label-white-bold'>Số Di Động</Form.Label>
                                <div className="input-group mb-3">
                                    <span className="input-group-text"><Image src="https://tnetvietnam.com/resources/images/icon-email.png" /></span>
                                    <Form.Control type="text" name='' className="form-control input_user" placeholder="Số Di Động - 0971321425" />
                                    
                                </div>
                                <Form.Label className='label-white-bold'>Mật Khẩu</Form.Label>
                                <div className="input-group mb-2">
                                    <div className="input-group-append">
                                        <span className="input-group-text"><Image src='https://tnetvietnam.com/resources/images/icon-password.png' /></span>
                                    </div>
                                    <Form.Control type="password" name='' className="form-control input_pass" placeholder="Mật Khẩu" />
                                </div>
                                <div className="form-group">
                                    <div className="custom-control custom-checkbox">
                                        {['checkbox'].map((type) => (
                                            <div key={`default-${type}`} className="custom-control-input">
                                                <Form.Check
                                                    type={type}
                                                    id={`Remember me`}
                                                    label={`Nhớ mật khẩu?`}
                                                />
                                            </div>
                                        ))}
                                    </div>
                                </div>
                                <div className="d-flex justify-content-center mt-3 login_container">
                                    <Button variant="primary" className='btn login_btn' type="submit">
                                        ĐĂNG NHẬP
                                    </Button>
                                </div>
                                <div className="mt-4">
                                    <div className="d-flex links">
                                        <a href='#'><Form.Label className='label-white'>Quên mật khẩu?</Form.Label></a>
                                    </div>
                                    <div className=" links">
                                    <a href='#'><Form.Label className='label-white'>Bạn chưa có tài khoản?</Form.Label></a>
                                    <a href='#'><Form.Label className='label-white-right'>ĐĂNG KÍ</Form.Label></a>
                                    </div>
                                </div>
                            </Form.Group>
                        </div>

                    </div>
                </div>
            </div>
        </Form>

    );

};

export default Login;