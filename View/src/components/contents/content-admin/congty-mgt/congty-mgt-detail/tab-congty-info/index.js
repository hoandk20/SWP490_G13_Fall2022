import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space, Image, } from 'antd';
import axios from 'axios';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';
import { AddDriverByCompany, ChaangeStatusDoc, EditDriverByCompany, getDriversForCompany, UploadFile } from '../../../../../../redux/apiRequest'
// import '../taixe-detail.css'
const { Option } = Select;
const TabCompanyInfo = (props) => {
    const { Panel } = Collapse;
    const location = useLocation();
    const dispatch = useDispatch();
    const [companys, setCompanys] = useState(props.companys);

    const listDoc = companys.listDoc;
    console.log(companys);
    console.log(listDoc);
    const Bang_lai_xe = listDoc.find(doc => doc.file_name === "Bang_lai_xe");
    const Chung_Nhan_Kinh_nghiem = listDoc.find(doc => doc.file_name === "Chung_Nhan_Kinh_nghiem");
    const GP_Kinh_Doanh = listDoc.find(doc => doc.file_name === "GP_Kinh_Doanh");
    const GP_Hoat_Dong = listDoc.find(doc => doc.file_name === "GP_Hoat_Dong");

    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [form] = Form.useForm();
    const URL = "http://26.36.110.116";
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
    const getFile1 = async () => {
        const file_name = "Bang_lai_xe";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage1(res.data.object.base64)
    }
    const getFile2 = async () => {
        const file_name = "Chung_Nhan_Kinh_nghiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage2(res.data.object.base64)
    }
    const getFile6 = async () => {
        const file_name = "GP_Kinh_Doanh";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage6(res.data.object.base64)
    }
    const getFile7 = async () => {
        const file_name = "GP_Hoat_Dong";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage7(res.data.object.base64)
    }

    const changeStatusValid1 = () => {
        ChaangeStatusDoc(Bang_lai_xe.id, "VALID", toast, dispatch);
    }
    const changeStatusInValid1 = () => {
        ChaangeStatusDoc(Bang_lai_xe.id, "INVALID", toast, dispatch);
    }
    const changeStatusValid2 = () => {
        ChaangeStatusDoc(Chung_Nhan_Kinh_nghiem.id, "VALID", toast, dispatch);
    }
    const changeStatusInValid2 = () => {
        ChaangeStatusDoc(Chung_Nhan_Kinh_nghiem.id, "INVALID", toast, dispatch);
    }
    const changeStatusValid6 = () => {
        ChaangeStatusDoc(GP_Kinh_Doanh.id, "VALID", toast, dispatch);
    }
    const changeStatusInValid6 = () => {
        ChaangeStatusDoc(GP_Kinh_Doanh.id, "INVALID", toast, dispatch);
    }
    const changeStatusValid7 = () => {
        ChaangeStatusDoc(GP_Hoat_Dong.id, "VALID", toast, dispatch);
    }
    const changeStatusInValid7 = () => {
        ChaangeStatusDoc(GP_Hoat_Dong.id, "INVALID", toast, dispatch);
    }
    const onfinish = (values) => {
        console.log(values);
        const driver = {
            ...values,
            companyEmail: user.email,
        }
        // EditDriverByCompany(driver, toast, dispatch)
        // getDriversForCompany(user.email,dispatch);
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
        console.log(file);
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
    const uploadfile1 = () => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: companys.email,
            fileName: "Bang_lai_xe",
            year: year,
            month: month
        }
        UploadFile(object, toast);
        setCheckdoc1(false)
    };

    const uploadfile2 = () => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: companys.email,
            fileName: "Chung_Nhan_Kinh_nghiem",
            year: year,
            month: month,
        }
        UploadFile(object, toast);
        setCheckdoc2(false)
    };

    const uploadfile6 = () => {
        const arr = date6.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage6,
            createBy: companys.email,
            fileName: "GP_Kinh_Doanh",
            year: year,
            month: month,
        }
        UploadFile(object, toast);
        setCheckdoc6(false)
    };
    const uploadfile7 = () => {
        const arr = date7.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage7,
            createBy: companys.email,
            fileName: "GP_Hoat_Dong",
            year: year,
            month: month,
        }
        UploadFile(object, toast);
        setCheckdoc7(false)
    };

    return (
        <>
            <Form onFinish={onfinish} layout="vertical" hideRequiredMark name="basic" form={form}
                labelCol={{
                    span: 8,
                }}
                wrapperCol={{
                    span: 18,
                }}
            >
                <p>Thông tin công ty</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="companyName"
                            initialValue={companys.companyName}
                            label="Tên công ty"
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
                            initialValue={companys.companyName}
                            label="Địa chỉ"
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
                        <Form.Item
                            name="status"
                            initialValue={companys.status}
                            label="Trạng thái"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name=""
                            initialValue={companys.lastName}
                            label="Số ĐT"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>

                    </Col>
                    <Col span={8}>

                    </Col>
                </Row>
                <p>Thông tin cá nhân</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="name"
                            initialValue={companys.firstName}
                            label="Tên đầy đủ"
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
                            initialValue={companys.email}
                            label="Email"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please enter user name',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name=""
                            initialValue={companys.firstName}
                            label="Ngôn ngữ"
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
                        <Form.Item
                            name="lastName"
                            initialValue={companys.lastName}
                            label="Địa chỉ"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name="email"
                            initialValue={companys.email}
                            label="Số di động"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please enter user name',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name=""
                            initialValue={companys.lastName}
                            label="Trạng thái"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name="city"
                            initialValue={companys.city}
                            label="Thành phố"
                            rules={[
                                {
                                    required: true,
                                    message: 'please enter  description',
                                },
                            ]}
                        >
                            <Select>
                                <Option value="Hà nội">Hà nội</Option>
                                <Option value="Đà nẵng">Đà nẵng </Option>
                                <Option value="Thành phố Hồ Chí Minh">Thành phố Hồ Chí Minh </Option>
                            </Select>
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                        <Image
                            id='avatarImage'
                            src={companys.avatar}
                            className='avatar'
                        />

                    </Col>
                </Row>
                <p>Thôn tin Tài khoản</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="abc"
                            initialValue={companys.email}
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

                    </Col>
                    <Col span={8}>

                    </Col>
                </Row>

            </Form>
            <div className='doc-taixe'>
                <p>Các tài liệu</p>

                {
                    checkdoc1 === true ? (
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


                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                    <div className='status-ad'>{Bang_lai_xe.status}</div>
                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage1} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        <Button onClick={getFile1} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {Bang_lai_xe.expired_month}-{Bang_lai_xe.expired_year}</span>
                                        <Button onClick={editDocument1} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                <div className='form-bottom-ad' >
                                    <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                    <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
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
                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                    hoặc lý lịch tư pháp
                                    <div className='status'>Chưa gửi</div>
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

                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                    hoặc lý lịch tư pháp
                                    <div className='status-ad'>{Chung_Nhan_Kinh_nghiem.status}</div>
                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage2} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        <Button onClick={getFile2} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {Chung_Nhan_Kinh_nghiem.expired_month}-{Chung_Nhan_Kinh_nghiem.expired_year}</span>
                                        <Button onClick={editDocument2} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                <div className='form-bottom-ad' >
                                    <Button onClick={changeStatusValid2} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                    <Button onClick={changeStatusInValid2} type="primary"> <CloseOutlined /> Từ chối</Button>
                                </div>
                            </div>
                        </div>

                    )
                }

                {
                    checkdoc6 === true ? (

                        <div className='card-doc'>
                            <div className='form-header'>
                                <span>
                                Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                    <div className='status'>Chưa gửi</div>
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
                                    <input
                                        type="file"
                                        style={{ color: "#fff" }}
                                        onChange={(e) => {
                                            uploadImage6(e);
                                        }}
                                    />
                                    <Button className='btn-submit' onClick={uploadfile6} type='primary'>Gửi <CheckOutlined /></Button>
                                </div>
                            </div>
                        </div>
                    ) : (
                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                    <div className='status-ad'>{GP_Kinh_Doanh.status}</div>
                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage6} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        <Button onClick={getFile1} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {GP_Kinh_Doanh.expired_month}-{GP_Kinh_Doanh.expired_year}</span>
                                        <Button onClick={editDocument6} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                <div className='form-bottom-ad' >
                                    <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                    <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                                </div>
                            </div>
                        </div>
                    )
                }

                {
                    checkdoc7 === true ? (

                        <div className='card-doc-ad'>
                            <div className='form-header'>
                                <span>
                                Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                    <div className='status'>Chưa gửi</div>
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
                                    <input
                                        type="file"
                                        style={{ color: "#fff" }}
                                        onChange={(e) => {
                                            uploadImage7(e);
                                        }}
                                    />
                                    <Button className='btn-submit' onClick={uploadfile7} type='primary'>Gửi <CheckOutlined /></Button>
                                </div>
                            </div>
                        </div>
                    ) : (
                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                    <div className='status-ad'>{GP_Hoat_Dong.status}</div>
                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage7} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        <Button onClick={getFile1} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {GP_Hoat_Dong.expired_month}-{GP_Hoat_Dong.expired_year}</span>
                                        <Button onClick={editDocument7} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                <div className='form-bottom-ad' >
                                    <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                    <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                                </div>
                            </div>
                        </div>
                    )
                }
            </div>
        </>

    );
};
export default TabCompanyInfo;