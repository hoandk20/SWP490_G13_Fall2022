
import React, { useState } from 'react';
import { Button, Col, DatePicker, Form, Modal, Row, Select } from 'antd';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { UploadDocumentForVehicle, UploadFile } from '../../../../redux/apiRequest';
import { useNavigate } from 'react-router';
const ModalUploadDocumentVehicle = (props) => {
    const navigate = useNavigate();
    const [open, setOpen] = useState(false);
    const vehicleId = props.vehicoId;
    const driverEmail=props.driverEmail
    const newUser = useSelector((state) => state.user.userInfo?.currentUser);
    const dispatch=useDispatch();

    const [count, setCount] = useState(0);
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();

    const [Chung_Nhan_Bao_Hiem,serChung_Nhan_Bao_Hiem]=useState(false);
    const [Chung_Nhan_Dang_Kiem,setChung_Nhan_Dang_Kiem]=useState(false);
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
    const uploadfile1 = async() => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: driverEmail,
            fileName: "Chung_Nhan_Bao_Hiem",
            vehicleId:vehicleId,
            year: year,
            month: month,
            companyEmail:newUser.email,
        }
        UploadDocumentForVehicle(object, toast,dispatch);
   
    };



    const uploadfile2 = async() => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: driverEmail,
            vehicleId:vehicleId,
            fileName: "Chung_Nhan_Dang_Kiem",
            year: year,
            month: month,
            companyEmail:newUser.email,
        }
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
             <div>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        Giấy chứng nhận bảo hiểm.
                                        {/* <div className='status'>Đã gửi</div> */}
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "170px" }}>
                                        <img src={baseImage1} height="160px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <div style={{marginBottom:"10px"}}>
                                            Ngày hết hạn <DatePicker onChange={getTime1}  picker='month' />
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
                                        Giấy chứng nhận đăng kiểm
                                        {/* <div className='status'>Đã gửi</div> */}
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "170px" }}>
                                        <img src={baseImage2} height="160px" />
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
export default ModalUploadDocumentVehicle;