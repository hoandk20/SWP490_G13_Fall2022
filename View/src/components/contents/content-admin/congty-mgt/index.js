import { Button, Form, Input, Row, Col, Select, Table, Popconfirm, DatePicker, Spin } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';

import { useDispatch, useSelector } from 'react-redux';


import { toast } from 'react-toastify';
import { useNavigate } from 'react-router';
import { getCompanyDetail, getCompanysByAdmin, getCompanysByAdmiAll } from '../../../../redux/apiRequest';


const { Option } = Select;
const CompanyManagementAdmin = () => {

    const navigate = useNavigate();
    const [date1, setDate1] = useState('');
    const [date2, setDate2] = useState('');
    const dispatch = useDispatch();
    const [loading, setLoading] = useState(false);
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const all = useSelector((state) => state.user.companys?.all);
    console.log(all);



    const dateFormat = (date) =>{
        const date_str = date,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");      
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }

    const drivers = all?.map((row) => ({ ...row, key: row.companyID, bangphi: 'Không',regDate:dateFormat(row.createDate) }));


    function onChangeDateStart(date, dateString) {
        setDate1(date.toISOString());
    }
    function onChangeDateEnd(date, dateString) {
        setDate2(date.toISOString());
    }
    useEffect(() => {
        getCompanysByAdmiAll(dispatch);
    }, [])

    const onFinish = (values) => {
        const object ={
            ...values,
            regFrom:date1,
            regTo:date2
        }

         getCompanysByAdmin(object, dispatch);
    }


    const columns = [
        {
            key: 'email',
            title: 'Tài Khoản Quản Trị',
            dataIndex: 'email',
        },
        {
            key: 'companyName',
            title: 'Tên Công Ty',
            dataIndex: 'companyName',
        },
        {
            key: 'companyAddress',
            title: 'Địa Chỉ',
            dataIndex: 'companyAddress',
        },
        {
            key: 'companyStatus',
            title: 'Trạng thái',
            dataIndex: 'companyStatus',
        },
        {
            key: 'regDate',
            title: 'Ngày Đăng Ký',
            dataIndex: 'regDate',
        },
        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (record) => {
                return <div>
                    <EyeOutlined onClick={() => {
                        getCompanyDetail(record.email, dispatch);
                        setLoading(true);
                        setTimeout(() => {
                            setLoading(false);
                            navigate('/admin/company-mgt/detail', { state: { record } })
                        }, 1000)
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
                <h2>QUẢN TRỊ VÀ NHÂN VIÊN</h2>
                <h3>TÌM ĐỐI TÁC</h3>
                <div className='driver-info'>
                    <Form labelCol={{
                        span: 6,
                    }}
                        wrapperCol={{
                            span: 16,
                        }}
                        onFinish={onFinish}
                    >
                        <Row>
                            <Col md={8} sm={16}>
                                <FormItem
                                    name="regFrom1"
                                    label="Đăng ký từ"
                                >
                                <DatePicker style={{width:"100%"}} placeholder='Chọn ngày' onChange={onChangeDateStart} />
                                </FormItem>
                                <FormItem
                                    name="companyName"
                                    label="Tên công ty"

                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="city"
                                    label="Địa chỉ"

                                >
                                    <Input />
                                </FormItem>
                            </Col>
                            <Col md={8} sm={16}>
                                <FormItem
                                    name="regTo1"
                                    label="Đến"
                                >
                                <DatePicker style={{width:"100%"}} placeholder='Chọn ngày' onChange={onChangeDateEnd} />
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

                                >
                                </FormItem>
                                <FormItem
                                    style={{ marginLeft: "26%" }}
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
        </Spin>

    )
}
export default CompanyManagementAdmin