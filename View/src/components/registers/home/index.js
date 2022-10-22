import React from 'react';
import 'antd/dist/antd.css';
import './register-home.css';
import { Button, Card, Col, Row } from 'antd';
import { useNavigate } from 'react-router';


const { Meta } = Card;
const RegisterHome = () => {
    const navigate =useNavigate();
    const onClickPassenger = () => {
        navigate('/signup/passenger')
        
    };
    const onClickDriver = () => {
        navigate('/signup/driver')
        
    };
    return (
        <div className='container'>
            <div className='container-register'>
                <Row>
                    <Col sm={16} md={8}>
                        <div className='cards'>
                            <Card
                                hoverable
                                style={{
                                    width: 340,
                                }}
                                cover={<img alt="example" src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png" />}
                            >
                                <Meta title="HÀNH KHÁCH" description="Tìm các chuyến đi miến phí, quản lý tùy chọn phương thức thanh toán, xem lại lịch sử chuyến đi và thực hiện nhiều hoạt động khác." />
                                <div>
                                    <Button className='btn-regiter-home' type="primary"  onClick={onClickPassenger} >Register Passenger</Button>
                                </div>
                            </Card>
                        </div>
                    </Col>
                    <Col sm={16} md={8}>
                        <div className='cards'>
                            <Card
                                hoverable
                                style={{
                                    width: 340,
                                }}
                                cover={<img alt="example" src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png" />}
                            >
                                <Meta title="TÀI XẾ" description="Quản lý các hoạt động, tìm thông tin bạn cần để theo dõi thành công trong hành trình." />
                                <br/>
                                <div>
                                    <Button className='btn-regiter-home' type="primary"  onClick={onClickDriver} >Register Driver</Button>
                                </div>
                            </Card>
                        </div>
                    </Col>
                    <Col sm={16} md={8}>
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
                                    <Button className='btn-regiter-home' type="primary">Register Company</Button>
                                </div>
                            </Card>
                        </div>
                    </Col>
                </Row>
            </div>
        </div>
    );
}


export default RegisterHome;