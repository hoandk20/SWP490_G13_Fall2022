import { Button, Col, Row, Table } from 'antd';
import React from 'react';
import { EditOutlined, StopOutlined, FileOutlined,RollbackOutlined } from '@ant-design/icons';
import './driver-detail.css'
import ModalAddVehico from '../../../../commons/modals/modal-add-vehico';

const DriverDetail = () => {

    const columns = [
        {
            title: 'Số',
            dataIndex: 'index',
        },
        {
            title: 'Kiểu phương tiện',
            dataIndex: 'vehico',
        },
        {
            title: 'Biển số',
            dataIndex: 'name',
        },
        {
            title: 'Hạng phương tiện',
            dataIndex: 'email',
        },
        {
            title: 'Số di động',
            dataIndex: 'phoneNumber',
        },
        {
            title: 'Trạng thái',
            dataIndex: 'status',
        },

        {
            title: '',
            dataIndex: 'action',
        },
    ];
    const data = [

    ];
    return (
        <div className='container'>
            <div className='container-info'>

                <Row>
                    <Col sm={32} md={16}>
                        <h2>THÊM TÀI XẾ</h2>
                        <div className='left-infos'>

                            <h3>Thông tin cá nhân</h3>
                            <table className='infos'>
                                <tbody>
                                    <tr>
                                        <td className='title-name'><p>Tên : </p>  </td>
                                        <td >Anh</td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Họ và Tên Đệm :</p>  </td>
                                        <td>Trọng</td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Quốc gia : </p>  </td>
                                        <td>Việt Nam</td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Email : </p>  </td>
                                        <td>Anhdthe141459@fpt.edu.vn</td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Số di động : </p>  </td>
                                        <td>(+84) 123123123</td>
                                    </tr>

                                </tbody>
                            </table>
                            <h3 style={{ marginTop: "50px" }}>Thông tin tài khoản T.NET</h3>
                            <table className='infos'>
                                <tbody>
                                    <tr>
                                        <td className='title-name'><p>Tài khoản : </p>  </td>
                                        <td>Anhdthe141459@fpt.edu.vn</td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Số dư (đ) : </p>  </td>
                                        <td>0,00</td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Số Dư Tài Khoản KM 1(đ) : </p>  </td>
                                        <td>0,00</td>
                                        <td className='title-name'><p>Số Dư Tài Khoản KM 2(đ) : </p>  </td>
                                        <td>0,00</td>
                                    </tr>
                                </tbody>
                            </table>
                            <h3>Phương tiện</h3>

                        </div>

                    </Col>
                    <Col sm={16} md={8}>
                        <div className='btn-right'>
                            <Button type='primary'> <EditOutlined />Sửa</Button>
                            <Button type='primary' style={{ marginLeft: "20px" }}><StopOutlined />Dừng hoạt động</Button>
                        </div>

                    </Col>
                </Row>
                <div className='form-table'>
                    <Table columns={columns} dataSource={data} size="middle" />
                </div>
                {/* <div className='btn-typeVehico'>
                    <Button type='primary'>Phân phương tiện</Button>
                </div> */}
                    <ModalAddVehico/>
                <div style={{marginTop:"100px",marginBottom:"20px"}}>
                    <div className='form-license'>
                        <div className='form-header'>
                            <span>
                                Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                <div className='status'>Đã gửi</div>
                            </span>

                        </div>
                        <div className='form-content'>
                            <Row>
                                <Col sm={4} md={2} style={{ textAlign: "center" }}>
                                    <FileOutlined style={{ fontSize: '42px' }} />
                                </Col>
                                <Col sm={14} md={7} >

                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                </Col>
                                <Col style={{ marginLeft: "90px" }}>
                                    Ngày hết hạn 2022/12
                                </Col>
                            </Row>
                        </div>

                    </div>
                    <div className='form-license'>
                        <div className='form-header'>
                            <span>
                                Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên) hoặc lý lịch tư pháp
                                <div className='status'>Đã gửi</div>
                            </span>

                        </div>
                        <div className='form-content'>
                            <Row>
                                <Col sm={4} md={2} style={{ textAlign: "center" }}>
                                    <FileOutlined style={{ fontSize: '42px' }} />
                                </Col>
                                <Col sm={14} md={7} >
                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên) hoặc lý lịch tư pháp
                                </Col>
                            </Row>
                        </div>

                    </div>
                </div>
                <Button type='primary'><RollbackOutlined />Tài xế</Button>

            </div>

        </div>
    )
}
export default DriverDetail