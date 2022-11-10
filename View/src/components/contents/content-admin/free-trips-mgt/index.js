import { Button, Form, Input, Row, Col, Select, Table, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';

import { useDispatch, useSelector } from 'react-redux';


import { toast } from 'react-toastify';
import { Await, useNavigate } from 'react-router';


const { Option } = Select;
const FreeTripManagementAdmin = () => {

    const navigate = useNavigate();
    const URL = "http://26.36.110.116";
    let [allTrips, setAllTrips] = useState();
    useEffect(() => {
        fetch(`${URL}:8080/api/admin/GetAllTrip`, {
            headers: { 'Content-Type': 'application/json' }
        })
            .then(response => response.json())
            .then(data => setAllTrips(data.object))
    }, [])
    console.log(allTrips);
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const all = allTrips?.map((row) => ({ ...row, key: row.tripID}));

    const data = [];


    const columns = [
        {
            key: 'timeStart',
            title: 'Thời Gian Bắt Đầu',
            dataIndex: 'timeStart',
        },
        {
            key: 'from',
            title: 'Từ',
            dataIndex: 'from',
        },
        {
            key: 'to',
            title: 'Đến',
            dataIndex: 'to',
        },
        {
            key: 'price',
            title: 'Cước(đ)',
            dataIndex: 'price',
        },
        {
            key: 'status',
            title: 'Trạng Thái',
            dataIndex: 'status',
        },
        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>
                    <EyeOutlined onClick={() => {
                        // navigate('/admin/company-mgt/detail',{state:{record}})
                    }} />

                </div>
            },
        },

        {
            title: '',
            dataIndex: '',
            key: 'y',
            render: (text, record, index) => {
                return <div>
                    <Popconfirm
                        title="Bạn có muốn xóa phương tiện này?"

                        okText="Yes"
                        cancelText="No"
                    >
                        <DeleteOutlined />
                    </Popconfirm>
                </div>

            },
        },
    ];

    return (
        <div className='container'>
            <div className='container-infos' style={{
                textAlign: "left",
                marginLeft: "20px"
            }}>
                <h2>QUẢN TRỊ VÀ NHÂN VIÊN</h2>
                <h3>TÌM TÀI XẾ</h3>
                <div className='driver-info'>
                    <Form labelCol={{
                        span: 4,
                    }}
                        wrapperCol={{
                            span: 12,
                        }}
                    >
                        <Row>
                            <Col md={12} sm={24}>
                                <FormItem
                                    name="account"
                                    label="Biển số"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="status"
                                    label="Trạng thái"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="Tất cả"></Option>
                                        <Option value="Đã gửi lại tài liệu"></Option>
                                        <Option value="Hoạt động"></Option>
                                        <Option value="Đã gửi tài liệu"></Option>
                                        <Option value="Không hoạt động"></Option>
                                        <Option value="Đang chờ xem xét"></Option>
                                        <Option value="Chưa gửi tài liệu"></Option>
                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="vehicoType"
                                    label="Loại xe"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="Tất cả"></Option>
                                        <Option value="A3"></Option>
                                        <Option value="A6"></Option>
                                        <Option value="FF"></Option>
                                    </Select>
                                </FormItem>
                            </Col>
                            <Col md={12} sm={24}>
                                <FormItem
                                >
                                    <Button className='btn' type="primary" htmlType="submit">
                                        <FilterOutlined />  Lọc phương tiện
                                    </Button>
                                </FormItem>
                            </Col>
                        </Row>
                    </Form>
                    {/* <div
                        style={{ float: "right" }}
                    >
                        <p>*IRS: Giấy Đăng Kiểm</p>
                    </div> */}
                </div>
                <div style={{ marginLeft: "50px", float: "left" }}>
                    {/* <AddVehico /> */}
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={all} size="middle" />
                </div>
            </div>
        </div >
    )
}
export default FreeTripManagementAdmin