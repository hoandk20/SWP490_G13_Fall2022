import { Col, Row } from 'antd';
import React from 'react';
import './footer.css'
import ImageAppStore from "../../../assets/image-app/google-play.png"
import ImageGooglePlay from "../../../assets/image-app/app-store.png"
import ImageFaceBook from "../../../assets/image-app/facebook.png"
import ImageInstagram from "../../../assets/image-app/instagram.png"
import ImageTwitter from "../../../assets/image-app/twitter.png"
import ImageSkype from "../../../assets/image-app/skype.png"
const Footers = () => {
    return (
        <div className='footer-info'>
            <Row>
                <Col span={8}>
                    <div className='infos'>
                        <p>Bản quyền thuộc Công ty T.NET VietNam</p>
                        <p>Địa chỉ: Số 35, Ngách 545/19, Xuân Đỉnh, Bắc Từ Liêm, Hà Nội</p>
                    </div>
                </Col>
                <Col span={8}>
                    <div className='footer-infos'>
                        <div className='footer-info-menu'>
                            <div className='footer-menu'>
                                <ul>
                                    <li><a href="#">BẢO MẬT </a>|{'\u00A0'}</li>
                                    <li><a href="#">ĐIỀU KHOẢN </a>|{'\u00A0'}</li>
                                    <li><a href="#">GIỚI THIỆU </a></li>
                                </ul>

                            </div>
  
                        </div>
                        <span className='footer-icons'>
                                <a href="#"> <img src={ImageFaceBook} alt="Facebook" /></a>
                                <a href="#"> <img src={ImageInstagram} alt="Instagram" /></a>
                                <a href="#"> <img src={ImageTwitter} alt="Twitter" /></a>
                                <a href="#"> <img src={ImageSkype} alt="Skype" /></a>
                            </span>
                    </div>

                </Col>
                <Col span={8}>
                    <div className='footer-link'>
                        <div className='footer-link-app'>
                            <span className='footer-image'>
                                <a href="#"> <img className='image-app' src={ImageAppStore} alt="app store" /></a>
                                <a href="#"> <img className='image-app' src={ImageGooglePlay} alt="google play" /></a>
                            </span>


                        </div>
                    </div>
                </Col>
            </Row>


        </div>
    )

}
export default Footers