import React from 'react';
import ImageLogo from "../../../assets/image-app/logo.png"
import './header.css'
const Header1 = () =>{

    return(
        <div className='header-logo' >
        <a href="#"> <img src={ImageLogo} alt="Logo" /></a>
        </div>
    );
};
export default Header1