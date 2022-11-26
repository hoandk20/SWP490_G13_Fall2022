import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';

import { useDispatch, useSelector } from 'react-redux';


import { toast } from 'react-toastify';
import { getDriverDetail, getDriversByAdmin, getDriversByAdminAll } from '../../../../redux/apiRequest';
import EditDriverForCompany from '../../../commons/drawers/drawer-admin-mgt/drawer-edit-driver';
import { useNavigate } from 'react-router';


const { Option } = Select;
const DriverManagementAdmin = () => {

    const navigate = useNavigate();
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const all = useSelector((state) => state.user.drivers?.all);
    console.log(all);
    const drivers = all?.map((row) => ({ ...row, key: row.driverID, name: row.firstName + " " + row.lastName }));

    const onFinish = (values) => {
        console.log(values); 
        getDriversByAdmin(values,dispatch);

    }

    useEffect(() => {
        getDriversByAdminAll(dispatch);

    }, [])

    const data = [];


    const columns = [
        // {
        //     key: 'index',
        //     title: 'Số',
        //     dataIndex: 'index',
        // },
        {
            key: 'email',
            title: 'Tài khoản',
            dataIndex: 'eamil',
        },
        {
            key: 'name',
            title: 'Tên tài xế',
            dataIndex: 'name',
        },
        {
            key: 'phoneNumber',
            title: 'Số di động',
            dataIndex: 'phoneNumber',
        },
        {
            key: 'deviceType',
            title: 'Loại',
            dataIndex: 'deviceType',
        },
        {
            key: 'companyName',
            title: 'Công ty',
            dataIndex: 'companyName',
        },
        {
            key: 'status',
            title: 'Trạng thái',
            dataIndex: 'status',
        },
        {
            key: 'createDate',
            title: 'Ngày đăng ký',
            dataIndex: 'createDate',
        },
        {
            key: 'docStatus',
            title: 'Tài liệu',
            dataIndex: 'docStatus',
        },
        {
            key: 'lh',
            title: 'LH',
            dataIndex: 'lh',
        },


        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (record) => {
                return <div>
                    <EyeOutlined onClick={() => {
                        console.log(record.email);
                        getDriverDetail(record.email,dispatch);
                        setTimeout(()=>{
                            navigate('/admin/taixe-mgt/detail', { state: { record } })
                          },1500)   
                         
                    }} />

                </div>
            },
        },
        

        // {
        //     title: '',
        //     dataIndex: '',
        //     key: 'y',
        //     render: (record) => {
        //         return <div>
        //             <Popconfirm
        //                 title="Bạn có muốn xóa tài khoản này?"
        //                 onConfirm={() => handleDelete(record.key)}
        //                 onCancel={cancel}
        //                 okText="Yes"
        //                 cancelText="No"
        //             >
        //                 <DeleteOutlined/>
        //             </Popconfirm>
        //         </div>
    
        //     },
        // },
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
                    <Form onFinish={onFinish}
                        labelCol={{
                            span: 6,
                        }}
                        wrapperCol={{
                            span: 16,
                        }}
                    >
                        <Row>
                            <Col md={8} sm={16}>
                                <FormItem
                                    name="regFrom"
                                    label="Đăng ký từ"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="driverName"
                                    label="Tên tài xế"

                                >
                                      <Input />
                                </FormItem>
                                <FormItem
                                    name="city"
                                    label="Địa chỉ"

                                >
                                 <Input/>
                                </FormItem>
                            </Col>
                            <Col md={8} sm={16}>
                                <FormItem
                                    name="regTo"
                                    label="Đến"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="phone"
                                    label="Số di động"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="status"
                                    label="Trạng thái"
                                >
                                    <Select>
                                        <Option value="mới">Mới</Option>
                                        <Option value="đang hoạt động">Đang hoạt động</Option>
                                    </Select>
                                </FormItem>
                            </Col>
                            <Col md={8} sm={16}>
                                <FormItem
                                    name="email"
                                    label="Email"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="plate"
                                    label="Biển số"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                style={{marginLeft:"26%"}}
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
                    <Table columns={columns} dataSource={drivers} size="middle" />
                </div>
            </div>
        </div >
    )
}
export default DriverManagementAdmin