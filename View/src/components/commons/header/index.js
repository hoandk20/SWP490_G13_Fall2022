import React from 'react';
import ImageLogo from "../../../assets/image-app/logo.png"
import { Avatar, Image } from 'antd';
import './header.css'
import { useSelector } from 'react-redux';
import ImageTnet from "../../../assets/image-app/logo.png"
const Header1 = () =>{
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    
    return(
        <div className='header-logo' style={{width: '100%'}}>
            <span style={{float:"left", height:"35px" ,  padding: 0 ,  margin:"5px 3%"}}>
                <a href="/"> <img className='image-logo' src={ImageTnet} alt="app store" /></a>
            </span>
            <span>
            <div style={{position: 'absolute',right: '50px'}}>
            <a href="#"> <Avatar src={user?.avatarBase64}  alt="abc"/></a>


            <p style={{marginTop:'-20px', fontWeight: 'bold'}}>{user?.firstname} {user?.lastname}</p>
            </div>
            </span>

        </div>
    );
};
export default Header1