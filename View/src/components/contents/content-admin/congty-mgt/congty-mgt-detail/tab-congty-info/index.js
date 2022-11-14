import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space, Image, } from 'antd';
import axios from 'axios';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';
import { AddDriverByCompany, ChaangeStatusDoc, EditDriverByCompany, getDriversForCompany, UploadFile} from '../../../../../../redux/apiRequest'
// import '../taixe-detail.css'
const { Option } = Select;
const TabCompanyInfo = (props) => {
    const { Panel } = Collapse;
    const location = useLocation();
    const dispatch = useDispatch();
    const [companys,setCompanys]=useState(props.companys);
    
    const listDoc=companys.listDoc;
    console.log(companys);
    console.log(listDoc);
    const Bang_lai_xe=listDoc.find(doc =>doc.file_name==="Bang_lai_xe");
    const Chung_Nhan_Kinh_nghiem=listDoc.find(doc =>doc.file_name==="Chung_Nhan_Kinh_nghiem");
    const GP_Kinh_Doanh=listDoc.find(doc =>doc.file_name==="GP_Kinh_Doanh");
    const GP_Hoat_Dong=listDoc.find(doc =>doc.file_name==="GP_Hoat_Dong");

    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [form] = Form.useForm();
    const URL = "http://26.36.110.116";
    const [baseImageAvatar, setBaseImageAvatar] = useState("");
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [baseImage6, setBaseImage6] = useState("");
    const [baseImage7, setBaseImage7] = useState("");

    const getFileAvatar = async () => {
        const file_name = "Avatar";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        setBaseImageAvatar(res.data.object.base64)
    }
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
    const uploadAvatar = async (e) => {
        const file = await  e.target.files[0];
        const base64 = await convertBase64(file);        
        await setBaseImageAvatar(base64);
    };
    const onfinish = (values) => {
        console.log(values);
        const image= {
            base64:baseImageAvatar,
            createBy:companys.email,
            fileName:"Avatar",
            year:'',
            month:''
        }
        UploadFile(image,toast,dispatch);
        const driver = {
            ...values,
            companyEmail: user.email,
        }
        // EditDriverByCompany(driver, toast, dispatch)
        // getDriversForCompany(user.email,dispatch);
        setOpen(false);
    };
    getFileAvatar();

    const onfinishUploadVehicle = (values) => {

    }

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
                            <Input  disabled/>
                        </Form.Item>
                        <Form.Item
                            name="companyAddress"
                            initialValue={companys.companyAddress}
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
                            <Input disabled/>
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                        <Form.Item
                            name="companyStatus"
                            initialValue={companys.companyStatus}
                            label="Trạng thái"
                        >
                            <Input disabled/>
                        </Form.Item>
                        <Form.Item
                            name="phone"
                            initialValue={companys.phone}
                            label="Số ĐT"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please choose the type',
                                },
                            ]}
                        >
                            <Input disabled/>
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                    <div >
                                <Image
                                    id='avatarImage'
                                    src={baseImageAvatar}
                                    className='avatar'
                                />
                                <div className='inputFile'>
                                    <input
                                        type="file"
                                        style={{ color: "#fff" }}
                                        onChange={(e) => {
                                            uploadAvatar(e);
                                        }}
                                    />
                                </div>
                            </div>
                    </Col>
                </Row>
                <Button type="primary" htmlType="submit">Thay đổi thông tin</Button>

            </Form>
            <div className='doc-taixe'>
                <p>Các tài liệu</p>
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
                            </span>


                        </div>
                        <div className='form-bottom-ad' >
                            <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                            <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                        </div>
                    </div>
                </div>
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
                            </span>


                        </div>
                        <div className='form-bottom-ad' >
                            <Button onClick={changeStatusValid2} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                            <Button onClick={changeStatusInValid2} type="primary"> <CloseOutlined /> Từ chối</Button>
                        </div>
                    </div>
                </div>
                <div className='card-doc-ad'>
                    <div className='form-header-ad' style={{ height: "40px" }}>
                        <span>
                            Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
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
                            </span>


                        </div>
                        <div className='form-bottom-ad' >
                            <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                            <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                        </div>
                    </div>
                </div>
                <div className='card-doc-ad'>
                    <div className='form-header-ad' style={{ height: "40px" }}>
                        <span>
                            Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
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
                            </span>


                        </div>
                        <div className='form-bottom-ad' >
                            <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                            <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                        </div>
                    </div>
                </div>
            </div>
        </>

    );
};
export default TabCompanyInfo;