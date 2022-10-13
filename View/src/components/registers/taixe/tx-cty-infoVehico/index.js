import React from 'react';
import { Button, Col, DatePicker, Form, Row, Select } from 'antd';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';
const RegisterDriverInfoVehico = () => {

    return (
        <div className='container'>
            <div className='info-vehico'>
                <h2>TÀI LIỆU CẦN CHO PHƯƠNG TIỆN</h2>
                <div className='info-vehico-content'>

                    Xin vui lòng thêm thông tin và tải các tài liệu liên quan đến xe của bạn. Xe của bạn cần có năm sản xuất
                    từ năm 2008 trở lên. Đối với xe 7 chỗ cần có năm sản xuất từ năm 2012 trở lên. Đối với xe mô tô, vui lòng
                    tải giấy đăng ký lên thay cho giấy đăng kiểm
                </div>
                <div className='card-doc'>
                    <div className='form-header1'>
                        <span>
                            Thông tin phương tiện :
                            {/* <div className='status'>Đã gửi</div> */}
                        </span>

                    </div>
                    <div className='form-content'>
                        <div className='form-image'>

                        </div>
                    </div>
                </div>
                <div>
                <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                    Giấy chứng nhận bảo hiểm.
                                        <div className='status'>Đã gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "170px" }}>

                                    </div>
                                    <div className='content-bottom'>
                                        <span>
                                            Ngày hết hạn <DatePicker picker='month' />
                                        </span>
                                        <Button className='btn-submit' type='primary'>Gửi <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                    Giấy chứng nhận đăng kiểm
                                        <div className='status'>Đã gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "170px" }}>

                                    </div>
                                    <div className='content-bottom'>
                                        <span>
                                            Ngày hết hạn <DatePicker picker='month' />
                                        </span>
                                        <Button className='btn-submit' type='primary'>Gửi <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                    </Row>
                </div>
                <div style={{ marginTop: "50px" }}>
                    <Button type='primary'>Tiếp tục <RightOutlined /> </Button>
                </div>
            </div>
        </div>
    )
}
export default RegisterDriverInfoVehico