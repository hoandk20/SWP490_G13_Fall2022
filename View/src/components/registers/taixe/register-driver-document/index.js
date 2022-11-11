import { Button, Col, DatePicker, Form, Row, Select } from 'antd';
import React from 'react';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';

import { useState } from 'react';
import { useSelector } from 'react-redux';
import { UploadFile } from '../../../../redux/apiRequest';
import { toast } from 'react-toastify';
import { useLocation, useNavigate } from 'react-router';

const { Option } = Select;
const RegisterDriverDoc = () => {

    const location = useLocation();
    const newUser = location.state.newUser;
    const navigate =useNavigate();
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [baseImage3, setBaseImage3] = useState("");
    const [baseImage4, setBaseImage4] = useState("");
    const [date1,setDate1]=useState();
    const [date2,setDate2]=useState();
    const [date3,setDate3]=useState();
    const [date4,setDate4]=useState();

    function getTime1(date,dateString) {
        setDate1(dateString);
    }
    function getTime3(date,dateString) {
        setDate3(dateString);
    }
    function getTime4(date,dateString) {
        setDate4(dateString);
    }
    
    const uploadImage1 = async (e) => {
        const file = e.target.files[0];
        console.log(file);
        const base64 = await convertBase64(file);
        setBaseImage1(base64);
    };
    const uploadImage2 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage2(base64);
    };
    const uploadImage3 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage3(base64);
    };

    const uploadImage4 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage4(base64);
    };

    const uploadfile1 = () => {
        const arr=date1.split("-");
        const year=arr[0];
        const month=arr[1];
        const object={
            base64:baseImage1,
            createBy:newUser.email,
            fileName:"Bang_lai_xe",
            year:year,
            month:month
        }
        UploadFile(object,toast);
    };
    


    const uploadfile2 = () => {
        const object={
            base64:baseImage2,
            createBy:newUser.email,
            fileName:"Chung_Nhan_Kinh_nghiem",
            year:'',
            month:''
        }
        UploadFile(object,toast);
    };
    
    const uploadfile3 = () => {
        const arr=date3.split("-");
        const year=arr[0];
        const month=arr[1];
        const object={
            base64:baseImage3,
            createBy:newUser.email,
            fileName:"GP_Kinh_Doanh",
            year:year,
            month:month
        }
        console.log(object);
        UploadFile(object,toast);
    };
    
    const uploadfile4 = () => {
        const arr=date4.split("-");
        const year=arr[0];
        const month=arr[1];
        const object={
            base64:baseImage4,
            createBy:newUser.email,
            fileName:"GP_Hoat_Dong",
            year:year,
            month:month
        }
        console.log(object);
        UploadFile(object,toast);
    };

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

    const onClickNext = () => {
        navigate('/signup/add-vehico' ,{state:{newUser}})       
    };

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
                                        <div className='status'>Chưa gửi</div>
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
                                        <div className='status'>Chưa gửi</div>
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>
                                        <img src={baseImage1} height="220px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span style={{marginRight:"20px"}}>
                                            Ngày hết hạn <DatePicker onChange={getTime1} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{color:"#fff"}}
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


                                    </span>
                                    <Row>
                                        <Col sm={40} md={20}>
                                            Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                            hoặc lý lịch tư pháp
                                        </Col>
                                        <Col sm={8} md={4}>
                                            <div className='status'>Chưa gửi</div>
                                        </Col>
                                    </Row>
                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>
                                    <img src={baseImage2} height="220px" />
                                    </div>
                                   
                                    <div className='content-bottom'>
                                    <input
                                            type="file"
                                            style={{color:"#fff"}}
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
                    <Button type='primary' onClick={onClickNext}>Tiếp tục <RightOutlined /> </Button>
                </div>
            </div>
        </div>
    )
}
export default RegisterDriverDoc