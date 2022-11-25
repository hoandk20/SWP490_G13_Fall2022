import React from 'react';
import ImageLogo from "../../../assets/image-app/logo.png"
import { Avatar, Image } from 'antd';
import './header.css'
import { useSelector } from 'react-redux';
const Header1 = () =>{
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    
    return(
        <div className='header-logo'>
            <div style={{position: 'absolute',right: '50px'}}>
            <a href="#"> <Avatar src={user?.avatarBase64}  alt="abc"/></a>


            <p style={{marginTop:'-20px', fontWeight: 'bold'}}>{user.firstname} {user.lastname}</p>
            </div>
        </div>
    );
};
export default Header1