import { Button, Col, DatePicker, Form, Row, Select } from 'antd';
import React from 'react';
import "../register-congty-document.css"
import { RightOutlined, CheckOutlined } from '@ant-design/icons';

import ImageAvatar from '../../../../../assets/image-app/avatar.jpg'

const { Option } = Select;
const RegisterCompanyDoc1 = () => {
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>Tài liệu cho cá nhân</h2>
                <h3>Chấp nhận các kiểu định dạng tệp: PDF, GIF, PNG, JPG, JPEG</h3>
                <div className='contents'>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        Ảnh
                                        <div className='status'>Đã gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <Row>
                                        <Col sm={12} md={6} style={{ textAlign: "center" }}>
                                            {/* <ImageAvatar/> */}
                                        </Col>
                                        <Col sm={34} md={18} >
                                            Ghi Chú: Ảnh chụp kiểu chân dung, mới nhất, thẳng mặt và rõ nét.
                                            Kích thước ảnh tối đa là 256 kilô byte (256 KB)
                                        </Col>
                                    </Row>
                                </div>
                            </div>
                        </Col>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    Ghi chú
                                </div>
                                <div className='form-content'>
                                    <p>1. Đối với tài xế xe mô tô là sinh viên thì hồ sơ tư pháp có thể thay thế bằng thẻ sinh viên, sơ yếu lý lịch có chứng nhận của địa phương</p>
                                    <p> 2. Các giấy tờ chụp phải rõ nét, không tẩy xóa. Các tài liệu có thể bị coi là không hợp lệ nếu:</p>
                                    <p> . Tài liệu không rõ ràng hoặc bị mờ</p>
                                    <p> . Ngày hết hạn không đúng.</p>
                                    <p> . Tài Liệu không hợp lệ hoặc đã hết hạn.</p>
                                    <p> 3. Kích thước tệp các tài liệu tối đa là 1 mega byte (1MB)</p>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                        <div className='status'>Đã gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>

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


                                    </span>
                                    <Row>
                                        <Col sm={40} md={20}>
                                            Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                            hoặc lý lịch tư pháp
                                        </Col>
                                        <Col sm={8} md={4}>
                                            <div className='status'>Đã gửi</div>
                                        </Col>
                                    </Row>
                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>

                                    </div>
                                    <div className='content-bottom'>
                                        <Button className='btn-submit' type='primary'>+ Tải lên</Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                    Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                        <div className='status'>Đã gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>

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
                                    Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                        <div className='status'>Đã gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>

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
export default RegisterCompanyDoc1