import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Popconfirm, Spin } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';

import { useDispatch, useSelector } from 'react-redux';


import { toast } from 'react-toastify';
import { getDriverDetail, getDriversByAdmin, getDriversByAdminAll, getPassengerDetail, getPassengersByAdmiAll, getPassengersByAdmin } from '../../../../redux/apiRequest';
import EditDriverForCompany from '../../../commons/drawers/drawer-admin-mgt/drawer-edit-driver';
import { useNavigate } from 'react-router';


const { Option } = Select;
const PassengerManagementAdmin = () => {

    const navigate = useNavigate();
    const dispatch = useDispatch();
    const [loading, setLoading] = useState(false);
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const all = useSelector((state) => state.user.passengers?.all);

    const passengers = all?.map((row) => ({ ...row, key: row.email, name: row.firstName + " " + row.lassName }));
    console.log(all);
    const onFinish = (values) => {
        console.log(values); 
        getPassengersByAdmin(values,dispatch);

    }

    useEffect(() => {
        getPassengersByAdmiAll(dispatch);

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
            dataIndex: 'email',
        },
        {
            key: 'name',
            title: 'Tên khách hàng',
            dataIndex: 'name',
        },
        {
            key: 'phone',
            title: 'Số di động',
            dataIndex: 'phone',
        },
       
        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (record) => {
                return <div>
                    <EyeOutlined onClick={() => {
                        getPassengerDetail(record.email,dispatch);
                        setLoading(true);
                        setTimeout(()=>{
                            setLoading(false);
                            navigate('/admin/passenger-mgt/detail', { state: { record } })
                          },1000)   
                         
                    }} />

                </div>
            },
        },
        
    ];


    return (
        <Spin spinning={loading}  tip="Loading" size="large">
        <div className='container'>
            <div className='container-infos' style={{
                textAlign: "left",
                marginLeft: "20px"
            }}>
                <h2>HÀNH KHÁCH</h2>
                <h3>TÌM HÀNH KHÁCH</h3>
                <div className='driver-info'>
                    <Form onFinish={onFinish}
                        labelCol={{
                            span: 4,
                        }}
                        wrapperCol={{
                            span: 14,
                        }}
                    >
                        <Row>
                            <Col md={12} sm={24}>
                                <FormItem
                                    name="name"
                                    label="Tên Hành khách"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="email"
                                    label="Tên tài khoản"

                                >
                                      <Input />
                                </FormItem>
                              
                            </Col>
                            <Col md={12} sm={24}>
                                <FormItem
                                    name="phone"
                                    label="Số điện thoại"
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
                    <Table columns={columns} dataSource={passengers} size="middle" />
                </div>
            </div>
        </div >
        </Spin>

    )
}
export default PassengerManagementAdmin