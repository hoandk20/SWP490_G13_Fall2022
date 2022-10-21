import {  Col, Row, } from 'antd';
import React from 'react';
import '../info-contact.css'
import ModalRePassword from '../../../../commons/modals/modal-re-password';

const InfoContactTaixe = () => {

    return (
        <div className='container'>
            <div className='container-infoss'>
                <h2>THÔNG TIN LIÊN HỆ</h2>
                <Row style={{ marginTop: "50px" }}>
                    <Col sm={32} md={16}>
                        <div className='left-infos'>

                            <h3>Thông tin cá nhân</h3>
                            <table className='infos'>
                                <tbody>
                                    <tr>
                                        <td className='title-name'><p>Tên : </p>  </td>
                                        <td ><p>Anh</p></td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Họ và Tên Đệm :</p>  </td>
                                        <td><p>Trọng</p></td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Quốc gia : </p>  </td>
                                        <td><p>Việt Nam</p></td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Email : </p>  </td>
                                        <td><p>Anhdthe141459@fpt.edu.vn</p></td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Số di động : </p>  </td>
                                        <td><p>(+84) 123123123</p></td>
                                    </tr>

                                </tbody>
                            </table>
                            <h3 style={{ marginTop: "50px" }}>Thông tin tài khoản T.NET</h3>
                            <table className='infos'>
                                <tbody>
                                    <tr>
                                        <td className='title-name'><p>Tài khoản : </p>  </td>
                                        <td><p>Anhdthe141459@fpt.edu.vn</p></td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Số dư (đ) : </p>  </td>
                                        <td><p>0,00</p></td>
                                    </tr>
                                    <tr>
                                        <td className='title-name'><p>Số Dư Tài Khoản KM 1(đ) : </p>  </td>
                                        <td><p>0,00</p></td>
                                        <td className='title-name'><p>Số Dư Tài Khoản KM 2(đ) : </p>  </td>
                                        <td><p>0,00</p></td>
                                    </tr>

                                </tbody>
                            </table>
                            <div style={{marginTop:"50px"}}>
                                <ModalRePassword/>
                            </div>
                        </div>

                    </Col>
                    <Col sm={16} md={8}>

                    </Col>
                </Row>
            </div>

        </div>
    )
}
export default InfoContactTaixe