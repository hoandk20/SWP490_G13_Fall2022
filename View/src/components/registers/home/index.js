import React from 'react';
import 'antd/dist/antd.css';
import './register-home.css';
import { Button, Card, Col, Row } from 'antd';
import { useNavigate } from 'react-router';
import { useDispatch } from 'react-redux';
import { deleteUser } from '../../../redux/userSlice';
import { useEffect } from 'react';
import { getAllCity } from '../../../redux/apiRequest';
import ImagePassenger from '../../../assets/image-app/passenger-register.jpg';
import ImageDriver from '../../../assets/image-app/driver-register.jpg';

const { Meta } = Card;
const RegisterHome = () => {
    const navigate =useNavigate();
    const dispatch =useDispatch();
    dispatch(deleteUser());
    const onClickPassenger = () => {
        navigate('/signup/passenger')
        
    };
    const onClickDriver = () => {
        navigate('/signup/driver&company')
        
    };
    useEffect(() => {
        getAllCity(dispatch);
    }, [])
    return (
        <div className='container'>
            <div className='container-register'>
                <Row>
                    <Col sm={24} md={12}>
                        <div className='cards'>
                            <Card
                                hoverable
                                style={{
                                    width: 370,
                                }}
                                cover={<img alt="example" src={ImagePassenger} />}
                            >
                                <Meta title="HÀNH KHÁCH" description="Tìm các chuyến đi miến phí, quản lý tùy chọn phương thức thanh toán, xem lại lịch sử chuyến đi và thực hiện nhiều hoạt động khác." />
                                <div>
                                    <Button className='btn-regiter-home' type="primary"  onClick={onClickPassenger} >Đăng ký cho hành khách</Button>
                                </div>
                            </Card>
                        </div>
                    </Col>
                    <Col sm={24} md={12}>
                        <div className='cards'>
                            <Card
                                hoverable
                                style={{
                                    width: 370,
                                }}
                                cover={<img style={{height:"460px"}} alt="example" src={ImageDriver} />}
                            >
                                <Meta title="TÀI XẾ" description="Quản lý các hoạt động, tìm thông tin bạn cần để theo dõi thành công trong hành trình." />
                                <br/>
                                <div>
                                    <Button className='btn-regiter-home' type="primary"  onClick={onClickDriver} >Đăng ký cho tài xế</Button>
                                </div>
                            </Card>
                        </div>
                    </Col>
                    {/* <Col sm={16} md={8}>
                        <div className='cards'>
                            <Card
                                hoverable
                                style={{
                                    width: 340,
                            
                                }}
                                cover={<img alt="example" src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png" />}
                            >
                                <Meta title="ĐẠI LÝ" description="Quản lý đối tác lái xe, nạp tiền, quản lý tài khoản, theo dõi lịch sử giao dịch và các hoạt động khác" />
                                <div>
                                    <Button className='btn-regiter-home' type="primary" onClick={onClickDriver}>Register Company</Button>
                                </div>
                            </Card>
                        </div>
                    </Col> */}
                </Row>
            </div>
        </div>
    );
}


export default RegisterHome;