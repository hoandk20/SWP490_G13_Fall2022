import React from 'react';
import { Avatar, Image } from 'antd';
import { useSelector } from 'react-redux';
import "./header-home.css"
import { useNavigate } from 'react-router';
import ImageTnet from "../../../../assets/image-app/logo.png"
const HeaderHome = () => {
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    const navigate = useNavigate()
    return (
        <div className='header-home'>
            <div className='container-header'>
                <span>
                    <span className='login-header-logo'>
                        <a href="#"> <img className='image-logo' src={ImageTnet} alt="app store" /></a>
                    </span>
                    <span className='login-header'>
                        <span style={{ marginRight: "20px" }}>
                            <button onClick={() => { navigate("/signin") }} class="btn-header" role="button">Đăng Nhập</button>
                        </span>
                        <span>
                            <button onClick={() => { navigate("/signup/home") }} class="btn-header" role="button">Đăng Ký</button>
                        </span>
                    </span>
                </span>

            </div>

        </div>
    );
};
export default HeaderHome
