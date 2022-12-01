import React from 'react';
import { Avatar, Image } from 'antd';
import { useSelector } from 'react-redux';
import "./header-home.css"
const HeaderHome = () =>{
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    
    return(
        <div className='header-home'>
            <div className='container-header'>
            <div className='login-header'>
                <span style={{marginRight:"20px"}}>
                    <button class="btn-header" role="button">Đăng Nhập</button>
                </span>
                <span>
                    <button    class="btn-header" role="button">Đăng Ký</button>
                </span>
            </div>
            </div>

        </div>
    );
};
export default HeaderHome