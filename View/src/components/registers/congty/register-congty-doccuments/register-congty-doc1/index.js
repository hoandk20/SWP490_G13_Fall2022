import { Button, Col, DatePicker, Form, Row, Select } from 'antd';
import React from 'react';
import "../register-congty-document.css"
import { RightOutlined, CheckOutlined } from '@ant-design/icons';

import ImageAvatar from '../../../../../assets/image-app/avatar.jpg'
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { getUser, UploadFile } from '../../../../../redux/apiRequest';
import { toast } from 'react-toastify';
import { useLocation, useNavigate } from 'react-router';
import { useEffect } from 'react';
import jwtDecode from 'jwt-decode';
import axios from 'axios';


const { Option } = Select;
const RegisterCompanyDoc1 = () => {

    const location = useLocation();
    const dispatch = useDispatch();
    const currentUser = useSelector((state) => state.auth.login?.currentUser);
    const decodedTocken = jwtDecode(currentUser.access_token);
    const userName = decodedTocken.sub;
    const newUser = useSelector((state) => state.user.userInfo?.currentUser);
    const navigate = useNavigate();
    const [count, setCount] = useState(0);
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [baseImage3, setBaseImage3] = useState("");
    const [baseImage4, setBaseImage4] = useState("");
    const [baseImageAvatar, setBaseImageAvatar] = useState("");
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();
    const [date3, setDate3] = useState();
    const [date4, setDate4] = useState();
    const [Bang_lai_xe, setBang_lai_xe] = useState(false);
    const [Chung_Nhan_Kinh_nghiem, setChung_Nhan_Kinh_nghiem] = useState(false);
    const [GP_Kinh_Doanh, setGP_Kinh_Doanh] = useState(false);
    const [GP_Hoat_Dong, setGP_Hoat_Dong] = useState(false);
    function getTime1(date, dateString) {
        setDate1(dateString);
    }
    function getTime3(date, dateString) {
        setDate3(dateString);
    }
    function getTime2(date, dateString) {
        setDate2(dateString);
    }
    function getTime4(date, dateString) {
        setDate4(dateString);
    }
    const uploadImageAvatar = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImageAvatar(base64);
    };

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
    const uploadfileAvatar = async () => {
        const year = "";
        const month = "";
        const object = {
            base64: baseImageAvatar,
            createBy: newUser.email,
            fileName: "Avatar",
            year: year,
            month: month
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            setChung_Nhan_Kinh_nghiem(true)
            toast.success("Upload file th??nh c??ng")
        } catch (error) {
            toast.error("Upload file th???t b???i")
        }
    };

    const uploadfile1 = async () => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: newUser.email,
            fileName: "Bang_lai_xe",
            year: year,
            month: month
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            setBang_lai_xe(true)
            toast.success("Upload file th??nh c??ng")
        } catch (error) {
            toast.error("Upload file th???t b???i")

        }
    };



    const uploadfile2 = async () => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: newUser.email,
            fileName: "Chung_Nhan_Kinh_nghiem",
            year: year,
            month: month,
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            setChung_Nhan_Kinh_nghiem(true)
            toast.success("Upload file th??nh c??ng")
        } catch (error) {
            toast.error("Upload file th???t b???i")

        }
    };

    const uploadfile3 = async () => {
        const arr = date3.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage3,
            createBy: newUser.email,
            fileName: "GP_Kinh_Doanh",
            year: year,
            month: month
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            setGP_Kinh_Doanh(true)
            toast.success("Upload file th??nh c??ng")
        } catch (error) {
            toast.error("Upload file th???t b???i")

        }
    };

    const uploadfile4 = async () => {
        const arr = date4.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage4,
            createBy: newUser.email,
            fileName: "GP_Hoat_Dong",
            year: year,
            month: month
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            setGP_Hoat_Dong(true)
            toast.success("Upload file th??nh c??ng")
        } catch (error) {
            toast.error("Upload file th???t b???i")

        }
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
        navigate('/signup/add-vehico');
    };

    useEffect(() => {
        getUser(userName, dispatch);

    }, [])
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>T??i li???u cho c?? nh??n</h2>
                <h3>Ch???p nh???n c??c ki???u ?????nh d???ng t???p: PDF, GIF, PNG, JPG, JPEG</h3>
                <div className='contents'>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        ???nh
                                    </span>

                                </div>
                                <div className='form-content' >
                                    <Row>
                                        <Col sm={24} md={12} style={{ textAlign: "center", height: "230px" }}>
                                            <img src={baseImageAvatar} height="220px" />
                                        </Col>
                                        <Col sm={24} md={12} >
                                            Ghi Ch??: ???nh ch???p ki???u ch??n dung, m???i nh???t, th???ng m???t v?? r?? n??t.
                                            K??ch th?????c ???nh t???i ??a l?? 256 kil?? byte (256 KB)
                                        </Col>
                                    </Row>
                                    <div className='content-bottom'>

                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImageAvatar(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfileAvatar} type='primary'>G???i <CheckOutlined /></Button>
                                    </div>
                                </div>

                            </div>
                        </Col>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    Ghi ch??
                                </div>
                                <div className='form-content'>
                                    <p>1. ?????i v???i t??i x??? xe m?? t?? l?? sinh vi??n th?? h??? s?? t?? ph??p c?? th??? thay th??? b???ng th??? sinh vi??n, s?? y???u l?? l???ch c?? ch???ng nh???n c???a ?????a ph????ng</p>
                                    <p> 2. C??c gi???y t??? ch???p ph???i r?? n??t, kh??ng t???y x??a. C??c t??i li???u c?? th??? b??? coi l?? kh??ng h???p l??? n???u:</p>
                                    <p> . T??i li???u kh??ng r?? r??ng ho???c b??? m???</p>
                                    <p> . Ng??y h???t h???n kh??ng ????ng.</p>
                                    <p> . T??i Li???u kh??ng h???p l??? ho???c ???? h???t h???n.</p>
                                    <p> 3. K??ch th?????c t???p c??c t??i li???u t???i ??a l?? 1 mega byte (1MB)</p>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                        {
                                            Bang_lai_xe === false ? (
                                                <div className='status'>Ch??a g???i</div>
                                            ) : (
                                                <div className='status'>???? g???i</div>
                                            )
                                        }
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>
                                        <img src={baseImage1} height="220px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span style={{ marginRight: "20px" }}>
                                            Ng??y h???t h???n <DatePicker onChange={getTime1} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage1(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile1} type='primary'>G???i <CheckOutlined /></Button>
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
                                            Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                            ho???c l?? l???ch t?? ph??p
                                        </Col>
                                        <Col sm={8} md={4}>
                                            {
                                                Chung_Nhan_Kinh_nghiem === false ? (
                                                    <div className='status'>Ch??a g???i</div>
                                                ) : (
                                                    <div className='status'>???? g???i</div>
                                                )
                                            }

                                        </Col>
                                    </Row>
                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>
                                        <img src={baseImage2} height="220px" />
                                    </div>

                                    <div className='content-bottom'>
                                        <span style={{ marginRight: "20px" }}>
                                            Ng??y h???t h???n <DatePicker onChange={getTime2} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage2(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile2} type='primary'>G???i <CheckOutlined /></Button>
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
                                        Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                        {
                                        GP_Kinh_Doanh===false?(
                                            <div className='status'>Ch??a g???i</div>
                                            ):(
                                            <div className='status'>???? g???i</div>
                                            )
                                        }

                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>
                                        <img src={baseImage3} height="220px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span style={{ marginRight: "20px" }}>
                                            Ng??y h???t h???n <DatePicker onChange={getTime3} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage3(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile3} type='primary'>G???i <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                        {
                                         GP_Hoat_Dong===false?(
                                            <div className='status'>Ch??a g???i</div>
                                            ):(
                                            <div className='status'>???? g???i</div>
                                            )
                                        }

                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "230px" }}>
                                        <img src={baseImage4} height="220px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span style={{ marginRight: "20px" }}>
                                            Ng??y h???t h???n <DatePicker onChange={getTime4} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage4(e);
                                            }}

                                        />
                                        <Button className='btn-submit' onClick={uploadfile4} type='primary'>G???i <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                    </Row>
                </div>
                <div style={{ marginTop: "50px" }}>
                    {Bang_lai_xe === true && Chung_Nhan_Kinh_nghiem === true && GP_Hoat_Dong === true && GP_Kinh_Doanh === true ? (
                        <Button type='primary' onClick={onClickNext}>Ti???p t???c <RightOutlined /> </Button>
                    ) : (
                        <Button type='primary' disabled >Ti???p t???c <RightOutlined /> </Button>
                    )}
                </div>
            </div>
        </div>
    )
}
export default RegisterCompanyDoc1