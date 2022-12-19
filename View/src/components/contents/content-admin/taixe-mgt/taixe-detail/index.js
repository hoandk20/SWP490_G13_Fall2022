import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space, Image, Modal, } from 'antd';
import axios from 'axios';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';

import { AcceptDriverAdmin, AddDriverByCompany, ChaangeStatusDoc, EditDriverByCompany, editInforDriver, getDriverDetail, getDriversForCompany, UploadFile } from '../../../../../redux/apiRequest';

import ModalSendEmail from '../../../../commons/modals/modal-send-email';

import './taixe-detail.css'
import { useEffect } from 'react';
import { createContext } from 'react';
const { Option } = Select;
const ReachableContext = createContext(null);
const UnreachableContext = createContext(null);

const config = {
    title: 'Use Hook!',
    content: (
        <>
            <ReachableContext.Consumer>{(name) => `Reachable: ${name}!`}</ReachableContext.Consumer>
            <br />
            <UnreachableContext.Consumer>{(name) => `Unreachable: ${name}!`}</UnreachableContext.Consumer>
        </>
    ),
};

const prefixSelector = (
    <Form.Item name="prefix" noStyle>
        <Select
            style={{
                width: 70,
            }}
        >
            <Option value="84">+84</Option>
        </Select>
    </Form.Item>
);
const DriverDetailAdmin = (props) => {

    const { Panel } = Collapse;
    const location = useLocation();
    const dispatch = useDispatch();
    const [modal, contextHolder] = Modal.useModal();
    const info = location.state?.record;
    const all = useSelector((state) => state.user.driver?.info);
    var drivers
    if (all.status === "NE") {
        drivers = {
            ...all,
            status: "Chưa hoạt động"
        }
    } else {
        drivers = {
            ...all,
            status: "Chưa hoạt động"
        }
    }
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));

    const [city, setCity] = useState(drivers.cityId);
    const listDoc = drivers?.listDocs;
    const Bang_lai_xe = drivers.blx;

    const Chung_Nhan_Kinh_nghiem = drivers.cnkn;
    var Chung_Nhan_Bao_Hiem = null;
    var Chung_Nhan_Dang_Kiem = null
    if (drivers.vehicleInfo === null) {
    } else {
        Chung_Nhan_Bao_Hiem = drivers.vehicleInfo.cnbh;
        Chung_Nhan_Dang_Kiem = drivers.vehicleInfo.cndk;
    }

    const [open, setOpen] = useState(false);
    // const [check1, setCheck1] = useState(Bang_lai_xe.status != "SENDED");
    // const [check2, setCheck2] = useState(Chung_Nhan_Kinh_nghiem.status != "SENDED");
    // const [check3, setCheck3] = useState(Chung_Nhan_Bao_Hiem.status != "SENDED");
    // const [check4, setCheck4] = useState(Chung_Nhan_Dang_Kiem.status != "SENDED");
    const [form] = Form.useForm();

    const [baseImageAvatar, setBaseImageAvatar] = useState("");
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [baseImage6, setBaseImage6] = useState("");
    const [baseImage7, setBaseImage7] = useState("");
  
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();
    const [date6, setDate6] = useState();
    const [date7, setDate7] = useState();
    const [checkdoc1, setCheckdoc1] = useState(false);
    const [checkdoc2, setCheckdoc2] = useState(false);
    const [checkdoc6, setCheckdoc6] = useState(false);
    const [checkdoc7, setCheckdoc7] = useState(false);

    const handleChangeCity = (e) => {

        setCity(e.key)
    }


    const getFileAvatar = async () => {
        const file_name = "Avatar";
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        setBaseImageAvatar(res.data.object.base64)
    }
    const getFile1 = async () => {
        const file_name = "Bang_lai_xe";
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
     
        setBaseImage1(res.data.object.base64)
    }
    const getFile2 = async () => {
        const file_name = "Chung_Nhan_Kinh_nghiem";
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
    
        setBaseImage2(res.data.object.base64)
    }
    const getFile6 = async () => {
        const file_name = "Chung_Nhan_Bao_Hiem";
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
  
        setBaseImage6(res.data.object.base64)
    }
    const getFile7 = async () => {
        const file_name = "Chung_Nhan_Dang_Kiem";
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });

        setBaseImage7(res.data.object.base64)
   
    }

    const changeStatusValid1 = () => {
        // setCheck1(true);
        ChaangeStatusDoc(Bang_lai_xe.id, "VALID", drivers?.email, toast, dispatch);
    }
    const changeStatusInValid1 = () => {
        // setCheck1(true);
        ChaangeStatusDoc(Bang_lai_xe.id, "INVALID", drivers?.email, toast, dispatch);
    }
    const changeStatusValid2 = () => {
        // setCheck2(true);
        ChaangeStatusDoc(Chung_Nhan_Kinh_nghiem.id, "VALID", drivers?.email, toast, dispatch);
    }
    const changeStatusInValid2 = () => {
        // setCheck2(true);
        ChaangeStatusDoc(Chung_Nhan_Kinh_nghiem.id, "INVALID", drivers?.email, toast, dispatch);
    }
    const changeStatusValid6 = () => {
        // setCheck3(true);
        ChaangeStatusDoc(Chung_Nhan_Bao_Hiem.id, "VALID", drivers?.email, toast, dispatch);
    }
    const changeStatusInValid6 = () => {
        // setCheck3(true);
        ChaangeStatusDoc(Chung_Nhan_Bao_Hiem.id, "INVALID", drivers?.email, toast, dispatch);
    }
    const changeStatusValid7 = () => {
        // setCheck4(true);
        ChaangeStatusDoc(Chung_Nhan_Dang_Kiem.id, "VALID", drivers?.email, toast, dispatch);
    }
    const changeStatusInValid7 = () => {
        // setCheck4(true);
        ChaangeStatusDoc(Chung_Nhan_Dang_Kiem.id, "INVALID", drivers?.email, toast, dispatch);
    }


    const uploadAvatar = async (e) => {
        const file = await e.target.files[0];
        const base64 = await convertBase64(file);
        await setBaseImageAvatar(base64);
    };

    const onfinish = (values) => {

        // const image = {
        //     base64: baseImageAvatar,
        //     createBy: drivers.email,
        //     fileName: "Avatar",
        //     year: '',
        //     month: ''
        // }
        // UploadFile(image, toast, dispatch);
        const driver = {
            username: values.email,
            firstname: values.firstName,
            lastname: values.lastName,
            avatarBase64: values.avatarBase64,
            address: values.address,
            email: values.email,
            phone: values.phoneNumber,
            country: 'vi',
            cityId: city,
        }
        editInforDriver(driver, toast, dispatch)
        setOpen(false);
    };
    const editDocument1 = () => {
        setCheckdoc1(true);
    }
    const editDocument2 = () => {
        setCheckdoc2(true);
    }
    const editDocument6 = () => {
        setCheckdoc6(true);
    }
    const editDocument7 = () => {
        setCheckdoc7(true);
    }
    const onfinishUploadVehicle = (values) => {

    }
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
    const uploadImage6 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage6(base64);
    };
    const uploadImage7 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage7(base64);
    };
    function getTime1(date, dateString) {
        setDate1(dateString);
    }
    function getTime2(date, dateString) {
        setDate2(dateString);
    }
    function getTime6(date, dateString) {
        setDate6(dateString);
    }
    function getTime7(date, dateString) {
        setDate7(dateString);
    }
    const uploadfile1 = async () => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: drivers?.email,
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
            getDriverDetail(drivers?.email, dispatch);
            setCheckdoc1(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }


    };

    const uploadfile2 = async () => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: drivers?.email,
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
            getDriverDetail(drivers?.email, dispatch);
            setCheckdoc2(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }

    };

    const uploadfile6 = async () => {
        const arr = date6.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage6,
            createBy: drivers?.email,
            fileName: "Chung_Nhan_Bao_Hiem",
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
            getDriverDetail(drivers?.email, dispatch);
            setCheckdoc6(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }

    };
    const uploadfile7 = async () => {
        const arr = date7.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage7,
            createBy: drivers?.email,
            fileName: "Chung_Nhan_Dang_Kiem",
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
            getDriverDetail(drivers?.email, dispatch);
            setCheckdoc7(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }


    };
    const acceptDriver = () => {
        AcceptDriverAdmin(drivers.driverID, "ACT", toast, drivers.email, dispatch);
    }
    const notAcceptDriver = () => {
        AcceptDriverAdmin(drivers.driverID, "NEW", toast, drivers.email, dispatch);
    }

    // const getDriverDetail = async () => {
    //     try {
    //         const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/driver/detail?driverEmail=${info.email}`, {
    //             headers: { 'Content-Type': 'application/json' }
    //         })
    //         setDrivers(res.data.object)
    //     } catch (error) {

    //     }
    // }
    useEffect(() => {
        // setTimeout(() => {
        //     getDriverDetail(drivers.email, dispatch);
        // }, 1000)
        getDriverDetail(drivers.email, dispatch);
    }, [])
    // getFileAvatar();
    return (
        <>
            <Form onFinish={onfinish}
                initialValues={{
                    prefix: '+84'
                }}
                labelCol={{
                    span: 8,
                }}
                wrapperCol={{
                    span: 20,
                }}
            >
                {
                    drivers.companyInfo === null ? (
                        <>
                            <h2 style={{ marginTop: "30px" }}>
                                Tài xế không thuộc công ty nào
                            </h2>
                        </>
                    ) : (
                        <>
                            <p>Thông tin công ty</p>
                            <Row>
                                <Col span={8}>
                                    <Form.Item
                                        name="companyName"

                                        initialValue={drivers.companyInfo.companyName}

                                        label="Tên công ty"
                                    >
                                        <Input disabled />
                                    </Form.Item>
                                    <Form.Item

                                        name="companyAddress"
                                        initialValue={drivers.companyInfo.companyAddress}

                                        label="Địa chỉ"
                                    >
                                        <Input disabled />
                                    </Form.Item>

                                </Col>
                                <Col span={8}>
                                    {/* <Form.Item
                            name="status"

                            // initialValue={drivers.companyInfo.companyStatus}

                            label="Trạng thái"
                        >
                            <Input />
                        </Form.Item> */}
                                    <Form.Item

                                        name="companyPhone"
                                        initialValue={drivers.companyInfo.phone}

                                        label="Số Điện thoại"
                                    >
                                        <Input disabled addonBefore={prefixSelector} />
                                    </Form.Item>

                                </Col>

                            </Row>
                        </>
                    )
                }

                <p>Thông tin cá nhân</p>
                <Row>
                    <Col span={8}>


                        <Form.Item

                            name="firstName"
                            initialValue={drivers?.firstName}
                            label="Họ và tên đệm"

                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name="email"
                            initialValue={drivers?.email}
                            label="Email"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please enter user name',
                                },
                            ]}
                        >
                            <Input disabled />
                        </Form.Item>
                        <Form.Item

                            name="language"
                            initialValue={drivers?.language}

                            label="Ngôn ngữ"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input disabled />
                        </Form.Item>
                        <Form.Item
                            name="city"
                            initialValue={drivers.cityId}
                            label="Thành phố"
                            rules={[
                                {
                                    required: true,
                                    message: 'Vui lòng chọn thành phố',
                                },
                            ]}
                        >
                            <Select
                                labelInValue
                                options={citys}
                                onChange={handleChangeCity}
                            />
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                        <Form.Item
                            name="lastName"
                            initialValue={drivers?.lastName}
                            label="Tên"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item

                            name="address"
                            initialValue={drivers?.address}

                            label="Địa chỉ"
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item

                            name="phoneNumber"
                            initialValue={drivers?.phoneNumber}

                            label="Số di động"
                        >
                            <Input addonBefore={prefixSelector} />
                        </Form.Item>
                        <Form.Item
                            name="status"
                            initialValue={drivers?.status}

                            label="Trạng thái"
                        >

                            <Input disabled />

                        </Form.Item>

                    </Col>
                    <Col span={8}>

                        <div style={{ margin: "0px 40%" }}>
                            <Image
                                // style={{ marginLeft: "50%" }}
                                // id='avatarImage'
                                src={drivers?.avatarBase64}
                                className='avatar'
                            />


                        </div>

                    </Col>
                </Row>

                <p>Thôn tin Tài khoản</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="abc"
                            initialValue={drivers?.email}
                            label="Tài khoản"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please select an owner',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                        <Button style={{ marginLeft: "30%" }} type="primary" htmlType="submit">Thay đổi thông tin tài xế</Button>
                    </Col>
                    <Col span={8}>

                    </Col>
                </Row>
            </Form>
            <p>Các tài liệu</p>

            {
                checkdoc1 === true ? (
                    <div className='card-doc'>
                        <div className='form-header'>
                            <span>
                                Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                {/* <div className='status'>Chưa gửi</div> */}
                            </span>

                        </div>
                        <div className='form-content'>
                            <div className='form-image' style={{ height: "230px" }}>
                                <img src={baseImage1} height="220px" />
                            </div>
                            <div className='content-bottom'>
                                <span style={{ marginRight: "20px" }}>
                                    Ngày hết hạn <DatePicker onChange={getTime1} picker='month' />
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
                ) : (
                    <div className='doc-taixe'>

                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                    {
                                        Bang_lai_xe === null ? (
                                            <>
                                                <div className='status-ad'>Chưa gửi</div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    Bang_lai_xe?.status === "SENDED" ? (
                                                        <>
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </>
                                                    ) : (
                                                        <>
                                                            {
                                                                Bang_lai_xe?.status === "VALID" ? (
                                                                    <>
                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }


                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage1} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        {
                                            Bang_lai_xe === null ? (
                                                <></>
                                            ) : (
                                                <>
                                                    {
                                                        baseImage1 !== "" ? (
                                                            <></>
                                                        ) : (
                                                            <>
                                                                <Button onClick={getFile1} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                            </>
                                                        )
                                                    }
                                                </>
                                            )
                                        }

                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {Bang_lai_xe?.expired_month}-{Bang_lai_xe?.expired_year}</span>
                                        <Button onClick={editDocument1} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                {
                                    Bang_lai_xe?.status === "SENDED" ? (
                                        <div className='form-bottom-ad' >
                                            <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                            <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                                        </div>
                                    ) : (
                                        <></>
                                    )
                                }
                            </div>
                        </div>

                    </div>
                )
            }

            {
                checkdoc2 === true ? (

                    <div className='card-doc'>
                        <div className='form-header'>
                            <span>
                                Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên) hoặc lý lịch tư pháp
                                <div className='status'></div>
                            </span>

                        </div>
                        <div className='form-content'>
                            <div className='form-image' style={{ height: "230px" }}>
                                <img src={baseImage2} height="220px" />
                            </div>
                            <div className='content-bottom'>
                                <span style={{ marginRight: "20px" }}>
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
                ) : (
                    <div className='doc-taixe'>
                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                    hoặc lý lịch tư pháp
                                    {
                                        Chung_Nhan_Kinh_nghiem === null ? (
                                            <>
                                                <div className='status-ad'>Chưa gửi</div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    Chung_Nhan_Kinh_nghiem?.status === "SENDED" ? (
                                                        <>
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </>
                                                    ) : (
                                                        <>
                                                            {
                                                                Chung_Nhan_Kinh_nghiem?.status === "VALID" ? (
                                                                    <>
                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage2} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        {
                                            Chung_Nhan_Kinh_nghiem === null ? (
                                                <></>
                                            ) : (
                                                <>
                                                    {
                                                        baseImage2 !== "" ? (
                                                            <></>
                                                        ) : (
                                                            <>
                                                                <Button onClick={getFile2} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                            </>
                                                        )
                                                    }
                                                </>
                                            )
                                        }

                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {Chung_Nhan_Kinh_nghiem?.expired_month}-{Chung_Nhan_Kinh_nghiem?.expired_year}</span>
                                        <Button onClick={editDocument2} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                {
                                    Chung_Nhan_Kinh_nghiem?.status === "SENDED" ? (
                                        <div className='form-bottom-ad' >
                                            <Button onClick={changeStatusValid2} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                            <Button onClick={changeStatusInValid2} type="primary"> <CloseOutlined /> Từ chối</Button>
                                        </div>
                                    ) : (
                                        <></>
                                    )
                                }
                            </div>
                        </div>
                    </div>
                )
            }
            {
                drivers?.vehicleInfo === null ? (
                    <>
                        <div style={{ marginTop: "50px", fontSize: "30px" }}>
                            Hiện tài xế chưa có phương tiện
                        </div>
                    </>
                ) : (
                    <>
                        <p style={{ marginTop: "20px" }}>Thông tin phương tiện</p>
                        <div className='vehico-info'>

                            <Collapse accordion>
                                <Panel header={drivers?.vehicleInfo?.plate} key="1" >
                                    <>
                                        <Form onFinish={onfinishUploadVehicle}
                                            labelCol={{
                                                span: 6,
                                            }}
                                            wrapperCol={{
                                                span: 14,
                                            }}
                                        >


                                            <Row>
                                                <Col sm={24} md={12}>
                                                    <Form.Item
                                                        name=""
                                                        // initialValue={drivers?.vehicle.a}
                                                        label="Hạng phương tiện"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input disabled/>
                                                    </Form.Item>
                                                    <Form.Item
                                                        name="produceYear"
                                                        initialValue={drivers?.vehicleInfo?.produceYear}
                                                        label="Năm sản xuất"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input disabled/>
                                                    </Form.Item>
                                                    <Form.Item
                                                        name="plate"
                                                        initialValue={drivers?.vehicleInfo?.plate}
                                                        label="Biển số"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input disabled/>
                                                    </Form.Item>

                                                </Col>
                                                <Col sm={24} md={12}>
                                                    <Form.Item
                                                        name="exteriorColor"
                                                        initialValue={drivers?.vehicleInfo?.exteriorColor}
                                                        label="Màu sơn"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input disabled/>
                                                    </Form.Item>
                                                    {/* <Form.Item
                                                        name="interiorColor"
                                                        initialValue={drivers?.vehicleInfo?.interiorColor}
                                                        label="Màu nội thất"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input />
                                                    </Form.Item> */}
                                                    <Form.Item
                                                        name="plateCountry"
                                                        initialValue={drivers?.vehicleInfo?.plateCountry}
                                                        label="Quốc gia đăng ký"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input disabled/>
                                                    </Form.Item>
                                                    <Form.Item
                                                        name="platState"
                                                        initialValue={drivers?.firstName}
                                                        label="Thành phố đăng ký"
                                                        rules={[
                                                            {
                                                                required: true,
                                                                message: 'Please select an owner',
                                                            },
                                                        ]}
                                                    >
                                                        <Input disabled/>
                                                    </Form.Item>

                                                </Col>

                                            </Row>
                                            <p>Thông tin tài liệu của phương tiện</p>
                                            {
                                                checkdoc6 === true ? (

                                                    <div className='card-doc'>
                                                        <div className='form-header'>
                                                            <span>
                                                                Giấy chứng nhận bảo hiểm

                                                            </span>

                                                        </div>
                                                        <div className='form-content'>
                                                            <div className='form-image' style={{ height: "230px" }}>
                                                                <img src={baseImage6} height="220px" />
                                                            </div>
                                                            <div className='content-bottom'>
                                                                <span style={{ marginRight: "20px" }}>
                                                                    Ngày hết hạn <DatePicker onChange={getTime6} picker='month' />
                                                                </span>
                                                                <span style={{ display: "inline-block" }}>
                                                                    <input
                                                                        type="file"
                                                                        style={{ color: "#fff" }}
                                                                        onChange={(e) => {
                                                                            uploadImage6(e);
                                                                        }}
                                                                    />
                                                                </span>

                                                                <span style={{ display: "inline-block", float: "right" }}>
                                                                    <Button className='a' onClick={uploadfile6} type='primary'>Gửi <CheckOutlined /></Button>
                                                                </span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                ) : (
                                                    <div className='doc-taixe'>
                                                        <div className='card-doc-ad'>
                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                <span>
                                                                    Giấy chứng nhận bảo hiểm
                                                                    {
                                                                        Chung_Nhan_Bao_Hiem === null ? (
                                                                            <>
                                                                                <div className='status-ad'>Chưa gửi</div>
                                                                            </>
                                                                        ) : (
                                                                            <>
                                                                                {
                                                                                    Chung_Nhan_Bao_Hiem?.status === "SENDED" ? (
                                                                                        <>
                                                                                            <div className='status-ad'>Đã gửi</div>
                                                                                        </>
                                                                                    ) : (
                                                                                        <>
                                                                                            {
                                                                                                Chung_Nhan_Bao_Hiem?.status === "VALID" ? (
                                                                                                    <>
                                                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                                                    </>
                                                                                                ) : (
                                                                                                    <>
                                                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                                                    </>
                                                                                                )
                                                                                            }
                                                                                        </>
                                                                                    )
                                                                                }
                                                                            </>
                                                                        )
                                                                    }

                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                                                    <img src={baseImage6} height="150px" />
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>

                                                                        {
                                                                            Chung_Nhan_Bao_Hiem === null ? (
                                                                                <></>
                                                                            ) : (
                                                                                <>
                                                                                    {
                                                                                        baseImage6 !== "" ? (
                                                                                            <></>
                                                                                        ) : (
                                                                                            <>
                                                                                                <Button onClick={getFile6} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                                                            </>
                                                                                        )
                                                                                    }
                                                                                </>
                                                                            )
                                                                        }

                                                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn :{Chung_Nhan_Bao_Hiem?.expired_month}-{Chung_Nhan_Bao_Hiem?.expired_year}</span>
                                                                        <Button onClick={editDocument6} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                                                    </span>


                                                                </div>
                                                                {
                                                                    Chung_Nhan_Bao_Hiem?.status === "SENDED" ? (
                                                                        <div className='form-bottom-ad' >
                                                                            <Button onClick={changeStatusValid6} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                                                            <Button onClick={changeStatusInValid6} type="primary"> <CloseOutlined /> Từ chối</Button>
                                                                        </div>
                                                                    ) : (
                                                                        <></>
                                                                    )
                                                                }
                                                            </div>
                                                        </div>
                                                    </div>
                                                )
                                            }
                                            {
                                                checkdoc7 === true ? (

                                                    <div className='card-doc'>
                                                        <div className='form-header'>
                                                            <span>
                                                                Giấy chứng nhận đăng kiểm

                                                            </span>

                                                        </div>
                                                        <div className='form-content'>
                                                            <div className='form-image' style={{ height: "230px" }}>
                                                                <img src={baseImage7} height="220px" />
                                                            </div>

                                                            <div className='content-bottom'>
                                                                <span style={{ marginRight: "20px" }}>
                                                                    Ngày hết hạn <DatePicker onChange={getTime7} picker='month' />
                                                                </span>
                                                                <span style={{ display: "inline-block" }}>
                                                                    <input
                                                                        type="file"
                                                                        style={{ color: "#fff" }}
                                                                        onChange={(e) => {
                                                                            uploadImage7(e);
                                                                        }}
                                                                    />
                                                                </span>

                                                                <span style={{ display: "inline-block", float: "right" }}>
                                                                    <Button className='a' onClick={uploadfile7} type='primary'>Gửi <CheckOutlined /></Button>
                                                                </span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                ) : (
                                                    <div className='doc-taixe'>
                                                        <div className='card-doc-ad'>
                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                <span>
                                                                    Giấy chứng nhận đăng kiểm
                                                                    {
                                                                        Chung_Nhan_Dang_Kiem === null ? (
                                                                            <>
                                                                                <div className='status-ad'>Chưa gửi</div>
                                                                            </>
                                                                        ) : (
                                                                            <>
                                                                                {
                                                                                    Chung_Nhan_Dang_Kiem.status === "SENDED" ? (
                                                                                        <>
                                                                                            <div className='status-ad'>Đã gửi</div>
                                                                                        </>
                                                                                    ) : (
                                                                                        <>
                                                                                            {
                                                                                                Chung_Nhan_Dang_Kiem?.status === "VALID" ? (
                                                                                                    <>
                                                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                                                    </>
                                                                                                ) : (
                                                                                                    <>
                                                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                                                    </>
                                                                                                )
                                                                                            }
                                                                                        </>
                                                                                    )
                                                                                }
                                                                            </>
                                                                        )
                                                                    }

                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                                                    <img src={baseImage7} height="150px" />
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        {
                                                                            Chung_Nhan_Dang_Kiem === null ? (
                                                                                <></>
                                                                            ) : (
                                                                                <>
                                                                                    {
                                                                                        baseImage7 !== "" ? (
                                                                                            <></>
                                                                                        ) : (
                                                                                            <>
                                                                                                <Button onClick={getFile7} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                                                            </>
                                                                                        )
                                                                                    }
                                                                                </>
                                                                            )
                                                                        }

                                                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn :{Chung_Nhan_Dang_Kiem?.expired_month}-{Chung_Nhan_Dang_Kiem?.expired_year}</span>
                                                                        <Button onClick={editDocument7} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                                                    </span>


                                                                </div>
                                                                {
                                                                    Chung_Nhan_Dang_Kiem?.status === "SENDED" ? (
                                                                        <div className='form-bottom-ad' >
                                                                            <Button onClick={changeStatusValid7} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                                                            <Button onClick={changeStatusInValid7} type="primary"> <CloseOutlined /> Từ chối</Button>
                                                                        </div>
                                                                    ) : (
                                                                        <></>
                                                                    )
                                                                }
                                                            </div>
                                                        </div>
                                                    </div>

                                                )
                                            }


                                        </Form>
                                    </>
                                </Panel>

                            </Collapse>
                        </div>
                    </>
                )
            }



            <div style={{ marginTop: "50px" }}>
                <span style={{ display: "inline-block", marginRight: "50px" }}><ModalSendEmail email={drivers?.email} /></span>
                {
                    drivers.status !== "ACT" ? (
                        <span style={{ display: "inline-block" }}>
                            <ReachableContext.Provider value="Light">


                                <Button type="primary" onClick={() => {
                                    modal.confirm({
                                        title: "Bạn có muốn cho phép tài xế hoạt động",
                                        onOk() {
                                            acceptDriver();
                                        }
                                    })

                                }} style={{ marginLeft: "30%" }}>
                                    Xác nhận tài xế hoạt động
                                </Button>
                                {contextHolder}

                                <UnreachableContext.Provider value="Bamboo" />
                            </ReachableContext.Provider>
                        </span>
                    ) : (
                        <span style={{ display: "inline-block" }}>
                            <ReachableContext.Provider value="Light">


                                <Button type="primary" onClick={() => {
                                    modal.confirm({
                                        title: "Bạn có muốn hủy hoạt động của tài xế",
                                        onOk() {
                                            notAcceptDriver();
                                        }
                                    })

                                }} danger style={{ marginLeft: "30%" }}>
                                    Hủy hoạt động
                                </Button>
                                {contextHolder}

                                <UnreachableContext.Provider value="Bamboo" />
                            </ReachableContext.Provider>
                        </span>
                    )
                }


            </div>
        </>

    );
};
export default DriverDetailAdmin;