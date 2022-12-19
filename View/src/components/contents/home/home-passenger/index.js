
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { FilterOutlined } from '@ant-design/icons';
import "./home-passenger.css"
import { Button } from 'react-bootstrap';
import { Col, Row } from 'antd';



// const user=useSelector((state)=>state.user.userInfo.currentUser);

const HomePassenger = (props) => {
    const data=props.data;
    return (
        <>
            <div className='container-home'>
                <div className='home-content-ac'>
                    <div className='home-btn'>
                        <Button className='btn-home-a' >
                            <Row>
                                <Col md={18} sm={36}>
                                    Tổng số chuyến đi
                                </Col>
                                <Col md={6} sm={12}>
                                    {data.tripNo}
                                </Col>
                            </Row>

                        </Button>
                    </div>
                    <div className='home-btn'>

                        <Button className='btn-home-a' >
                            <Row>
                                <Col md={18} sm={36}>
                                    Số chuyến đi đang chờ
                                </Col>
                                <Col md={6} sm={12}>
                                    {data.tripOpenNo}
                                </Col>
                            </Row>
                        </Button>
                    </div>


                </div>
                <div className='home-content-ab'>
                    <div className='home-btn'>
                        <Button className='btn-home-a' >
                            <Row>
                                <Col md={18} sm={36}>
                                    Số chuyến đi đã đóng
                                </Col>
                                <Col md={6} sm={12}>
                                    {data.tripClose}
                                </Col>
                            </Row>

                        </Button>
                    </div>
                    <div className='home-btn'>

                        <Button className='btn-home-a' >
                            <Row>
                                <Col md={18} sm={36}>
                                    Số chuyến đi đã bị hủy
                                </Col>
                                <Col md={6} sm={12}>
                                    {data.tripCancel}
                                </Col>
                            </Row>
                        </Button>
                    </div>


                </div>
            </div>
        </>

    )
}
export default HomePassenger