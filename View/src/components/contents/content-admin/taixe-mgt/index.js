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
    const [date1, setDate1] = useState('');
    const [date2, setDate2] = useState('');
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const all = useSelector((state) => state.user.drivers?.all);

    const dateFormat = (date) =>{
        const date_str = date,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");      
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }

    const drivers = all?.map((row) => ({ ...row, key: row.driverID,crDate:dateFormat(row.createDate) ,name: row.firstName + " " + row.lastName }));
    console.log(drivers);
    function onChangeDateStart(date, dateString) {
        setDate1(date.toISOString());
    }
    function onChangeDateEnd(date, dateString) {
        setDate2(date.toISOString());
    }
    const onFinish = (values) => {
        console.log(values); 
        getDriversByAdmin(values,dispatch);

    }

    useEffect(() => {
        getDriversByAdminAll(dispatch);

    }, [])

    const data = [];


    const columns = [
        {
            key: 'email',
            title: 'Tài khoản',
            dataIndex: 'email',
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
            key: 'crDate',
            title: 'Ngày đăng ký',
            dataIndex: 'crDate',
        },
        {
            key: 'docStatus',
            title: 'Tài liệu',
            dataIndex: 'docStatus',
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
                                    name="regFrom1"
                                    label="Đăng ký từ"
                    
                                >
                                <DatePicker style={{width:"100%"}}  placeholder='Chọn ngày' onChange={onChangeDateStart} />
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