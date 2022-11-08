import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';

import { useDispatch, useSelector } from 'react-redux';


import { toast } from 'react-toastify';


const { Option } = Select;
const DriverManagementAdmin = () => {

    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);

    const data=[];


    const columns = [
        // {
        //     key: 'index',
        //     title: 'Số',
        //     dataIndex: 'index',
        // },
        {
            key: 'producer',
            title: 'Tài khoản',
            dataIndex: 'producer',
        },
        {
            key: 'plate',
            title: 'Biển số',
            dataIndex: 'plate',
        },
        {
            key: 'produceYear',
            title: 'Năm sản xuất',
            dataIndex: 'produceYear',
        },
        {
            key: 'price',
            title: 'Giấy chứng nhận bảo hiểm',
            dataIndex: 'price',
        },
        {
            key: 'irs',
            title: 'Giấy đăng kiểm',
            dataIndex: 'irs',
        },
        {
            key: 'status',
            title: 'Trạng thái',
            dataIndex: 'status',
        },


        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                // return <div>
                //     <EditVehico state={record} />

                // </div>

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
                    <Table columns={columns} dataSource={data} size="middle" />
                </div>
            </div>
        </div >
    )
}
export default DriverManagementAdmin