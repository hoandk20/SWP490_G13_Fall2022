import {  Col, Row, } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { FilterOutlined } from '@ant-design/icons';
import "../home-passenger/home-passenger.css"
import { Button } from 'react-bootstrap';
const HomeCompany = (props) => {

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
                                    Tổng số chuyến đi đang chờ
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
                                    Số tài xế chưa có phương tiện
                                </Col>
                                <Col md={6} sm={12}>
                                    {data.driverNoVehicle}
                                </Col>
                            </Row>

                        </Button>
                    </div>
                    <div className='home-btn'>

                        <Button className='btn-home-a' >
                            <Row>
                                <Col md={18} sm={36}>
                                    Số phương tiện chưa có tài xế
                                </Col>
                                <Col md={6} sm={12}>
                                    {data.vehicleNoDriver}
                                </Col>
                            </Row>
                        </Button>
                    </div>


                </div>
            </div>
        </>

    )
}
export default HomeCompany