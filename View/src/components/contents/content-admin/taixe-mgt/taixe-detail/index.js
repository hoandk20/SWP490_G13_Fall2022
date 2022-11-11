import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space, Image, } from 'antd';
import axios from 'axios';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';
import { AddDriverByCompany, ChaangeStatusDoc, EditDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
import './taixe-detail.css'
const { Option } = Select;
const DriverDetailAdmin = (props) => {
    const { Panel } = Collapse;
    const location = useLocation();
    const dispatch = useDispatch();
    const drivers = location.state?.record;
    console.log(drivers);
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [form] = Form.useForm();
    const URL = "http://26.36.110.116";
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [baseImage6, setBaseImage6] = useState("");
    const [baseImage7, setBaseImage7] = useState("");
    const getFile1 = async () => {
        const file_name = "Bang_lai_xe";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage1(res.data.object.base64)
    }
    const getFile2 = async () => {
        const file_name = "Chung_Nhan_Kinh_nghiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage2(res.data.object.base64)
    }
    const getFile6 = async () => {
        const file_name = "Chung_Nhan_Bao_Hiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage6(res.data.object.base64)
    }
    const getFile7 = async () => {
        const file_name = "Chung_Nhan_Dang_Kiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${drivers.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage7(res.data.object.base64)
    }

    const changeStatusValid1 = () => {
        ChaangeStatusDoc(drivers.listDocs[0].id, "VALID", toast, dispatch);
    }
    const changeStatusInValid1 = () => {
        ChaangeStatusDoc(drivers.listDocs[0].id, "INVALID", toast, dispatch);
    }
    const changeStatusValid2 = () => {
        ChaangeStatusDoc(drivers.listDocs[1].id, "VALID", toast, dispatch);
    }
    const changeStatusInValid2 = () => {
        ChaangeStatusDoc(drivers.listDocs[1].id, "INVALID", toast, dispatch);
    }
    const changeStatusValid6 = () => {
        ChaangeStatusDoc(drivers.listDocs[2].id, "VALID", toast, dispatch);
    }
    const changeStatusInValid6 = () => {
        ChaangeStatusDoc(drivers.listDocs[2].id, "INVALID", toast, dispatch);
    }
    const changeStatusValid7 = () => {
        ChaangeStatusDoc(drivers.listDocs[3].id, "VALID", toast, dispatch);
    }
    const changeStatusInValid7 = () => {
        ChaangeStatusDoc(drivers.listDocs[3].id, "INVALID", toast, dispatch);
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
                            initialValue={drivers.companyName}
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
                            initialValue={drivers.companyName}
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
                            initialValue={drivers.status}
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
                            initialValue={drivers.lastName}
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
                            initialValue={drivers.firstName}
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
                            initialValue={drivers.email}
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
                            initialValue={drivers.firstName}
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
                            initialValue={drivers.lastName}
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
                            initialValue={drivers.email}
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
                            initialValue={drivers.lastName}
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
                            initialValue={drivers.city}
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
                    <Col  span={8}>
                        <Image
                            id='avatarImage'
                            src={drivers.avatar}
                            className='avatar'
                        />

                    </Col>
                </Row>
                <p>Thôn tin Tài khoản</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="abc"
                            initialValue={drivers.email}
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
                <div className='card-doc-ad'>
                    <div className='form-header-ad' style={{ height: "40px" }}>
                        <span>
                            Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                            <div className='status-ad'>{drivers.listDocs[0].status}</div>
                        </span>

                    </div>
                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                        <div className='form-image-ad' style={{ minHeight: "50px" }} >
                            <img src={baseImage1} height="150px" />
                        </div>
                        <div className='upload-doc'>
                            <span>
                                <Button onClick={getFile1} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                <span style={{ fontSize: "20px" }}>Ngày hết hạn : {drivers.listDocs[0].expired_month}-{drivers.listDocs[0].expired_year}</span>
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
                            <div className='status-ad'>{drivers.listDocs[1].status}</div>
                        </span>

                    </div>
                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                        <div className='form-image-ad' style={{ minHeight: "50px" }} >
                            <img src={baseImage2} height="150px" />
                        </div>
                        <div className='upload-doc'>
                            <span>
                                <Button onClick={getFile2} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                <span style={{ fontSize: "20px" }}>Ngày hết hạn : {drivers.listDocs[1].expired_month}-{drivers.listDocs[1].expired_year}</span>
                            </span>


                        </div>
                        <div className='form-bottom-ad' >
                            <Button onClick={changeStatusValid2} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                            <Button onClick={changeStatusInValid2} type="primary"> <CloseOutlined /> Từ chối</Button>
                        </div>
                    </div>
                </div>
            </div>
            <p style={{ marginTop: "20px" }}>Thông tin phương tiện</p>
            <div className='vehico-info'>
                <Collapse accordion>
                    <Panel header={drivers.vehicleInfo.plate} key="1" extra={<div className='status-ad'>Chưa gửi</div>}>
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
                                            initialValue={drivers.vehicle.a}
                                            label="Hạng phương tiện"
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
                                            name="produceYear"
                                            initialValue={drivers.vehicleInfo.produceYear}
                                            label="Năm sản xuất"
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
                                            name="plate"
                                            initialValue={drivers.vehicleInfo.plate}
                                            label="Biển số"
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
                                            name="exteriorColor"
                                            initialValue={drivers.vehicleInfo.exteriorColor}
                                            label="Màu sơn"
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
                                    <Col sm={24} md={12}>
                                        <Form.Item
                                            name="interiorColor"
                                            initialValue={drivers.vehicleInfo.interiorColor}
                                            label="Màu nội thất"
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
                                            name="plateCountry"
                                            initialValue={drivers.vehicleInfo.plateCountry}
                                            label="Quốc gia đăng ký"
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
                                            name="platState"
                                            initialValue={drivers.vehicleInfo.platState}
                                            label="Thành phố đăng ký"
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

                                </Row>
                                <p>Thông tin tài liệu của phương tiện</p>
                                <div className='doc-taixe'>
                                    <div className='card-doc-ad'>
                                        <div className='form-header-ad' style={{ height: "40px" }}>
                                            <span>
                                                Giấy chứng nhận bảo hiểm
                                                <div className='status-ad'>{drivers.listDocs[2].status}</div>
                                            </span>

                                        </div>
                                        <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                            <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                                <img src={baseImage6} height="150px" />
                                            </div>
                                            <div className='upload-doc'>
                                                <span>
                                                    <Button onClick={getFile6} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                    <span style={{ fontSize: "20px" }}>Ngày hết hạn :{drivers.listDocs[2].expired_month}-{drivers.listDocs[2].expired_year}</span>
                                                </span>


                                            </div>
                                            <div className='form-bottom-ad' >
                                                <Button onClick={changeStatusValid6} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                                <Button onClick={changeStatusInValid6} type="primary"> <CloseOutlined /> Từ chối</Button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div className='doc-taixe'>
                                    <div className='card-doc-ad'>
                                        <div className='form-header-ad' style={{ height: "40px" }}>
                                            <span>
                                                Giấy chứng nhận đăng kiểm
                                                <div className='status-ad'>{drivers.listDocs[3].status}</div>
                                            </span>

                                        </div>
                                        <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                            <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                                <img src={baseImage7} height="150px" />
                                            </div>
                                            <div className='upload-doc'>
                                                <span>
                                                    <Button onClick={getFile7} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                    <span style={{ fontSize: "20px" }}>Ngày hết hạn :{drivers.listDocs[3].expired_month}-{drivers.listDocs[3].expired_year}</span>
                                                </span>


                                            </div>
                                            <div className='form-bottom-ad' >
                                                <Button onClick={changeStatusValid7} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                                <Button onClick={changeStatusInValid7} type="primary"> <CloseOutlined /> Từ chối</Button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </Form>
                        </>
                    </Panel>

                </Collapse>
            </div>
        </>

    );
};
export default DriverDetailAdmin;