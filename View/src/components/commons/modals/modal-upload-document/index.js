
import React, { useState } from 'react';
import { Button, Col, DatePicker, Form, Modal, Row, Select } from 'antd';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';
import { useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { UploadFile } from '../../../../redux/apiRequest';
import './modal-upload-document.css'
const ModalUploadDocument = (props) => {
    const [open, setOpen] = useState(false);
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const driver = props.driver;
 
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();

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
            createBy: driver.email,
            fileName: "Bang_lai_xe",
            year: year,
            month: month
        }
        UploadFile(object, toast);
    };



    const uploadfile2 = () => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: driver.email,
            fileName: "Chung_Nhan_Kinh_nghiem",
            year: year,
            month: month,
        }
        UploadFile(object, toast);
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

    return (
        <>
            <Button type="primary" onClick={() => setOpen(true)}>
                Upload tài liệu
            </Button>
            <Modal
                title="Upload tài liệu"
                centered
                open={open}
                onOk={() => setOpen(false)}
                onCancel={() => setOpen(false)}
                width={1200}
            >
                <div className='contents'>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc' >
                                <div className='form-header'>
                                    <span>
                                        Ảnh
                                        {/* <div className='status'>Chưa gửi</div> */}
                                    </span>

                                </div>
                                <div className='form-content' style={{height:"300px"}}>
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
                                <div className='form-content' >
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
                                        {/* <div className='status'>Chưa gửi</div> */}
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "200px" }}>
                                        <img src={baseImage1} height="170px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <div  style={{marginBottom:"10px"}}>                                     
                                            Ngày hết hạn <DatePicker onChange={getTime1} picker='month' />
                                        </div>
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


                                    </span>
                                    <Row>
                                        <Col sm={40} md={20}>
                                            Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                            hoặc lý lịch tư pháp
                                        </Col>
                                        <Col sm={8} md={4}>
                                            {/* <div className='status'>Chưa gửi</div> */}
                                        </Col>
                                    </Row>
                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "200px" }}>
                                        <img src={baseImage2} height="170px" />
                                    </div>

                                    <div className='content-bottom'>
                                        <div style={{marginBottom:"10px"}}>
                                            Ngày hết hạn <DatePicker onChange={getTime2} picker='month' />
                                        </div>
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
            </Modal>
        </>
    );
};
export default ModalUploadDocument;