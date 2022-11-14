import React from 'react';
import { Button, Col, DatePicker, Form, Row, Select } from 'antd';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';
import { useLocation, useNavigate } from 'react-router';
import { useDispatch } from 'react-redux';
import { useState } from 'react';
import { toast } from 'react-toastify';
import { UploadFile } from '../../../../redux/apiRequest';
const RegisterDriverInfoVehico = () => {
    const navigate = useNavigate();
    const dispatch = useDispatch();
    const location = useLocation();
    const newUser = location.state.newUser;
    const vehicle = location.state.vehicle;
    const [count, setCount] = useState(0);
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();
    const convertBase64 = (file) => {
        return new Promise((resolve, reject) => {
            const fileReader = new FileReader();
            fileReader.readAsDataURL(file);

            fileReader.onload = () => {
                resolve(fileReader.result);
            };

            fileReader.onerror = (error) => {
                reject(error);
            };
        });
    };
    const onClickFinish = () => {
        navigate('/signin');
    };
    function getTime1(date, dateString) {
        setDate1(dateString);
    }
    function getTime2(date, dateString) {
        setDate2(dateString);
    }
    const uploadImage1 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage1(base64);
    };
    const uploadImage2 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage2(base64);
    };
    const uploadfile1 = () => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: newUser.email,
            fileName: "Chung_Nhan_Bao_Hiem",
            year: year,
            month: month
        }
        UploadFile(object, toast);
        setCount(count+1);
    };



    const uploadfile2 = () => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: newUser.email,
            fileName: "Chung_Nhan_Dang_Kiem",
            year: year,
            month: month
        }
        UploadFile(object, toast);
        setCount(count+1);
    };

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
                        <div className='form-info'>
                            <Row>
                                <Col sm={12} md={6} >
                                    <p>Năm sản xuất:</p> {vehicle.produceYear}
                                </Col>
                                <Col sm={12} md={6} >
                                    <p>Màu sơn:</p> {vehicle.exteriorColor}
                                </Col>
                                <Col sm={12} md={6} >
                                    <p>Màu nội thất:</p> {vehicle.interiorColor}
                                </Col>
                                <Col sm={12} md={6} >
                                    <p>Nơi đăng ký:</p> {vehicle.platState}
                                </Col>
                            </Row>
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
                                        <img src={baseImage1} height="160px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span>
                                            Ngày hết hạn <DatePicker onChange={getTime1}  picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage1(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile1} type='primary'>Gửi <CheckOutlined /></Button>
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
                                        <img src={baseImage2} height="160px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span>
                                            Ngày hết hạn <DatePicker onChange={getTime2} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage2(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile2} type='primary'>Gửi <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                    </Row>
                </div>
                <div style={{ marginTop: "50px" }}>
                    
                    {count == 2 ? (
                       <Button type='primary' onClick={onClickFinish}>Finish <RightOutlined /> </Button>
                    ) : (
                        <Button type='primary' disabled>Finish <RightOutlined /> </Button>
                    )}
                </div>
            </div>
        </div>
    )
}
export default RegisterDriverInfoVehico