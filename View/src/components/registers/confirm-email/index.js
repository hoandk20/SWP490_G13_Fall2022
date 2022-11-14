import { Button, Form, Input } from 'antd';
import axios from 'axios';
import React from 'react';
import { useEffect } from 'react';
import { useState } from 'react';
import { useLocation, useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { resendCode, VerifyCodeEmail } from '../../../redux/apiRequest';
import Timer from '../../commons/timer';
import './confirm-email.css'
const RegisterSignup = () => {
    const [counter, setCounter] = useState(60);
    const [code, setCode] = useState("");

    const location = useLocation();
    const newUser = location.state.newUser;
    const navigate = useNavigate();

    const handleChangeCode= (e) => {
        setCode(e.target.value)
    }


    const getCodeAgain = async() =>{
        resendCode(newUser.email)
        setCounter(60);
    }
    const verifyCode = async() =>{
        VerifyCodeEmail(newUser,code,toast,navigate);
    }
    useEffect(() =>{
        if(counter > 0){
            const myTimeOut=setTimeout(()=>setCounter(counter - 1), 1000);
            if(counter==60){
                clearTimeout(myTimeOut)
                setTimeout(()=>setCounter(counter - 1), 1000);
            }
        }
        console.log(counter);
    },[counter]);
    

    return (
        <>
            <div className='content-confirm-email'>
                <div className='box-cf-email'>
                    <div className='content-cf-email'>
                        <h3>
                            Xác thực EMAIL
                        </h3>
                        {counter==0?(
                            <p style={{color:"red"}}>Mã xác thực đã hết hạn vui lòng gửi lại mã</p>
                        ):(
                            <p>
                            Vui lòng nhập mã xác thực, mã sẽ hết hạn sau {counter} s
                            </p>
                        )}

                        <div className=''>
                            <Form.Item
                                wrapperCol={4}
                                label="Mã nhập"
                                style={{ width: "50%" }}
                            >
                                <Input onChange={handleChangeCode}/>
                            </Form.Item>
                        </div>
                        <div className='bottom-cf-email'>
                            <Form.Item
                            >
                                
                                {counter==0?(
                                    <Button onClick={getCodeAgain} type='primary'>Gửi lại mã xác thực</Button>
                                ):(
                                    <Button onClick={verifyCode} style={{marginRight:"20px"}} type='primary'>Xác nhận</Button>
                                )}
                            </Form.Item>

                        </div>
                    </div>


                </div>
            </div>
        </>
    )
}
export default RegisterSignup