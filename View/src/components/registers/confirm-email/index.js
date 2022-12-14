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
const RegisterSignup = () => {
    const [counter, setCounter] = useState(60);
    const [code, setCode] = useState("");
    const dispatch = useDispatch();
    const location = useLocation();
    const newUser = location.state.newUser; 
    const navigate = useNavigate();
    const user = {
        username: newUser.email,
        password: newUser.password,
    };
    const currentUser = useSelector((state)=>state.auth.login?.currentUser);
   
    const decodedTocken=jwtDecode(currentUser.access_token);
    const userName=decodedTocken.sub; 
    const user1=useSelector((state)=>state.user.userInfo?.currentUser);
 

    const handleChangeCode = (e) => {
        setCode(e.target.value)
    }

    const login = async () => {
        const res = await axios({
            method: "post",
            url: `${process.env.REACT_APP_BACKEND_KEY}:8080/api/login`,
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
        resendCode(newUser.email,toast)
        setCounter(60);
    }
    const verifyCode = async () => {
        VerifyCodeEmail(newUser, code, toast, navigate);
        
    }


    // useEffect(() => {
    //     setTimeout(()=>{
    //         login();
    //       },3000)   
          
    // }, []);

    return (
        <>
            <div className='content-confirm-email'>
                <div className='box-cf-email'>
                    <div className='content-cf-email'>
                        <h3>
                            X??c th???c EMAIL
                        </h3>
                        {/* {counter == 0 ? (
                            <p style={{ color: "red" }}>M?? x??c th???c ???? h???t h???n vui l??ng g???i l???i m??</p>
                        ) : (
                            <p>
                                Vui l??ng nh???p m?? x??c th???c, m?? s??? h???t h???n sau 60 s
                            </p>
                        )} */}
                            <p>
                                Vui l??ng nh???p m?? x??c th???c, m?? s??? h???t h???n sau 10 ph??t
                            </p>
                        <div className=''>
                            <Form.Item
                                wrapperCol={7}
                                labelCol={5}
                                label="M?? nh???p"

                                style={{ width: "90%" }}
                            >
                                <Input onChange={handleChangeCode} />
                            </Form.Item>
                        </div>
                        <div className='bottom-cf-email'>
                            <Form.Item
                            >
                                  <Button onClick={verifyCode} style={{ marginRight: "20px" }} type='primary'>X??c nh???n</Button>
                                <Button onClick={getCodeAgain} type='primary'>G???i l???i m?? x??c th???c</Button>
                                {/* {counter == 0 ? (
                                    <Button onClick={getCodeAgain} type='primary'>G???i l???i m?? x??c th???c</Button>
                                ) : (
                                    <Button onClick={verifyCode} style={{ marginRight: "20px" }} type='primary'>X??c nh???n</Button>
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