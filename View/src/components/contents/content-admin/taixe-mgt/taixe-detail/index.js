import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';
import { AddDriverByCompany, EditDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
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


    const onfinish = (values) => {
        console.log(values);
        const driver = {
            ...values,
            companyEmail: user.email,
        }
        EditDriverByCompany(driver, toast, dispatch)
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
                    <Col span={8}>
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
                            <div className='status-ad'>Chưa gửi</div>
                        </span>

                    </div>
                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                        <div className='form-image-ad' style={{ minHeight: "50px" }} >

                        </div>
                        <div className='upload-doc'>
                            <span>
                                <Button style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                <span style={{ fontSize: "20px" }}>Ngày hết hạn :</span>
                            </span>


                        </div>
                        <div className='form-bottom-ad' >
                            <Button style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                            <Button type="primary"> <CloseOutlined /> Từ chối</Button>
                        </div>
                    </div>
                </div>
            </div>
            <p style={{ marginTop: "20px" }}>Thông tin phương tiện</p>
            <div className='vehico-info'>
                <Collapse accordion>
                    <Panel header="This is panel header 1" key="1" extra={<div className='status-ad'>Chưa gửi</div>}>
                        <>
                            <Form onFinish={onfinishUploadVehicle}
                                labelCol={{
                                    span: 4,
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
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                    <Col sm={24} md={12}>
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                        <Form.Item
                                            name=""
                                            initialValue={drivers.vehicle.a}
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
                                </Row>
                                <p>Thông tin tài liệu của phương tiện</p>
                                <div className='doc-taixe'>
                                    <div className='card-doc-ad'>
                                        <div className='form-header-ad' style={{ height: "40px" }}>
                                            <span>
                                                Giấy chứng nhận bảo hiểm
                                                <div className='status-ad'>Chưa gửi</div>
                                            </span>

                                        </div>
                                        <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                            <div className='form-image-ad' style={{ minHeight: "50px" }} >

                                            </div>
                                            <div className='upload-doc'>
                                                <span>
                                                    <Button style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                    <span style={{ fontSize: "20px" }}>Ngày hết hạn :</span>
                                                </span>


                                            </div>
                                            <div className='form-bottom-ad' >
                                                <Button style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                                <Button type="primary"> <CloseOutlined /> Từ chối</Button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div className='doc-taixe'>
                                    <div className='card-doc-ad'>
                                        <div className='form-header-ad' style={{ height: "40px" }}>
                                            <span>
                                                Giấy chứng nhận đăng kiểm
                                                <div className='status-ad'>Chưa gửi</div>
                                            </span>

                                        </div>
                                        <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                            <div className='form-image-ad' style={{ minHeight: "50px" }} >

                                            </div>
                                            <div className='upload-doc'>
                                                <span>
                                                    <Button style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                    <span style={{ fontSize: "20px" }}>Ngày hết hạn :</span>
                                                </span>


                                            </div>
                                            <div className='form-bottom-ad' >
                                                <Button style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                                <Button type="primary"> <CloseOutlined /> Từ chối</Button>
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