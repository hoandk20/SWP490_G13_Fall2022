import { Button, Form, Input } from 'antd';
import axios from 'axios';
import jwtDecode from 'jwt-decode';
import React from 'react';
import { useEffect } from 'react';
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation, useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { loginUser, resendCode, VerifyCodeEmail } from '../../../redux/apiRequest';
import { loginFailed, loginSuccess } from '../../../redux/authSlice';
import Timer from '../../commons/timer';
import './confirm-email.css'
const URL = "http://26.36.110.116";
const RegisterSignup = () => {
    const [counter, setCounter] = useState(60);
    const [code, setCode] = useState("");
    const dispatch = useDispatch();
    const location = useLocation();
    const newUser = location.state.newUser;
    console.log(newUser);
    const navigate = useNavigate();
    const user = {
        username: newUser.email,
        password: newUser.password,
    };

    // const currentUser = useSelector((state) => state.auth.login?.currentUser);
    // const decodedTocken = jwtDecode(currentUser?.access_token);
    // const userName = decodedTocken?.sub;
    // const newUser = useSelector((state) => state.user.userInfo?.currentUser);
    // console.log(newUser);

    const handleChangeCode = (e) => {
        setCode(e.target.value)
    }

    const login = async () => {
        const res = await axios({
            method: "post",
            url: `${URL}:8080/api/login`,
            data: user,
            headers: { "Content-Type": "application/x-www-form-urlencoded" },
        })
            .then(function (response) {
                dispatch(loginSuccess(response.data));

            })
            .catch(function (error) {
                dispatch(loginFailed());
            });
    }
    const getCodeAgain = async () => {
        resendCode(newUser.email)
        setCounter(60);
    }
    const verifyCode = async () => {
        VerifyCodeEmail(newUser, code, toast, navigate);
        
    }

    useEffect(() => {
      
        if (counter > 0) {
            const myTimeOut = setTimeout(() => setCounter(counter - 1), 1000);
            if (counter == 60) {
                clearTimeout(myTimeOut)
                setTimeout(() => setCounter(counter - 1), 1000);
            }
        }
        console.log(counter);
    }, [counter]);


    useEffect(() => {
        setTimeout(()=>{
            login();
          },2000)   
    }, []);

    return (
        <>
            <div className='content-confirm-email'>
                <div className='box-cf-email'>
                    <div className='content-cf-email'>
                        <h3>
                            Xác thực EMAIL
                        </h3>
                        {/* {counter == 0 ? (
                            <p style={{ color: "red" }}>Mã xác thực đã hết hạn vui lòng gửi lại mã</p>
                        ) : (
                            <p>
                                Vui lòng nhập mã xác thực, mã sẽ hết hạn sau 60 s
                            </p>
                        )} */}
                            <p>
                                Vui lòng nhập mã xác thực, mã sẽ hết hạn sau 60 s
                            </p>
                        <div className=''>
                            <Form.Item
                                wrapperCol={4}
                                label="Mã nhập"
                                style={{ width: "50%" }}
                            >
                                <Input onChange={handleChangeCode} />
                            </Form.Item>
                        </div>
                        <div className='bottom-cf-email'>
                            <Form.Item
                            >
                                  <Button onClick={verifyCode} style={{ marginRight: "20px" }} type='primary'>Xác nhận</Button>
                                <Button onClick={getCodeAgain} type='primary'>Gửi lại mã xác thực</Button>
                                {/* {counter == 0 ? (
                                    <Button onClick={getCodeAgain} type='primary'>Gửi lại mã xác thực</Button>
                                ) : (
                                    <Button onClick={verifyCode} style={{ marginRight: "20px" }} type='primary'>Xác nhận</Button>
                                )} */}                        
                            </Form.Item>

                        </div>
                    </div>


                </div>
            </div>
        </>
    )
}
export default RegisterSignup