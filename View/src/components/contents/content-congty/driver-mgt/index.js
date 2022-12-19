import { Button, Checkbox, Form, Input, Row, Col, Select, Table, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';
import AddVehico from '../../../commons/drawers/drawer-vehico-mgt/drawer-add--vehico';
import { useDispatch, useSelector } from 'react-redux';
import { AcceptDriverAdmin, deleteDriverByCompany, getAllCity, getDriversForCompany, getDriversForCompanyFilter } from '../../../../redux/apiRequest';
import { useEffect } from 'react';
import AddDriverForCompany from '../../../commons/drawers/drawer-driverCompany-mgt/drawer-add-driver'
import EditDriverForCompany from '../../../commons/drawers/drawer-driverCompany-mgt/drawer-edit-driver';
import { toast } from 'react-toastify';
import axios from 'axios';

const { Option } = Select;

const data = [

];

const DriverManagement = () => {
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const all = useSelector((state) => state.user.drivers?.all);
    const drivers = all?.map((row) => ({ ...row, key: row.driverID, name: row.firstName + " " + row.lastName }));
    const allDriver = drivers?.map((row) => {
        if (row.status === "NEW") {
            return { ...row, row, statusDriver: "Chưa hoạt động" }
        } else if (row.status === "ACT") {
            return { ...row, row, statusDriver: "Hoạt động" }
        }
    })

    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const [city, setCity] = useState("");

    const handleDelete = (key) => {
        deleteDriverByCompany(key, user.email, toast, dispatch);
    };
    const handleAcceptDriver = async (key) => {
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/admin/ChangeStatusDriver`,
                {
                    id: key,
                    status: "NEW",
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            getDriversForCompany(user.email, dispatch);
            toast.success("Thay đổi hoạt động của tài xế thành công")
        } catch (error) {
            toast.error("Thay đổi hoạt động của tài xế không thành công")
        }
    };
    const cancel = (e) => {

    };
    const handleChange = (a) => {
        setCity(a);
    };
    const onFinish = (values) => {
        if (values.name === undefined) {
            values.name = ""
        }
        if (values.driverEmail === undefined) {
            values.driverEmail = ""
        }
        if (city === undefined) {
            setCity("")
        }
        if (values.status === undefined) {
            values.status = ""
        }
        const driver = {
            ...values,
            address: city,
            companyEmail: user.email,
        }
        getDriversForCompanyFilter(driver, dispatch);
    }
    useEffect(() => {
        getDriversForCompany(user.email, dispatch);

    }, [])

    const columns = [

        {
            key: 'email',
            title: 'Tài khoản',
            dataIndex: 'email',
        },
        {
            key: 'name',
            title: 'Tên đầy đủ',
            dataIndex: 'name',
        },
        {
            key: 'email',
            title: 'Email',
            dataIndex: 'email',
        },
        {
            key: 'phoneNumber',
            title: 'Số di động',
            dataIndex: 'phoneNumber',
        },
        {
            key: 'statusDriver',
            title: 'Trạng thái',
            dataIndex: 'statusDriver',
        },


        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>
                    <EditDriverForCompany state={record} />

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
        {
            title: '',
            dataIndex: '',
            key: 'z',
            render: (record) => {
                if (record.statusDriver==="Hoạt động") {
                    return <div >

                        <Popconfirm
                            title="Bạn có muốn dừng hoạt động cho tài xế này?"
                            onConfirm={() => handleAcceptDriver(record.key)}
                            onCancel={cancel}
                            okText="Yes"
                            cancelText="No"
                        >
                            <Button >Dừng hoạt động</Button>
                        </Popconfirm>
                    </div>
                } else {
                    return <></>
                }

            },
        },


    ];
    return (
        <div className='container'>
            <div className='container-infos'>
                <h2 style={{ marginBottom: "50px" }}>TÀI XẾ</h2>
                <div className='driver-info'>

                    <Form
                        onFinish={onFinish}
                        labelCol={{
                            span: 4,
                        }}
                        wrapperCol={{
                            span: 16,
                        }}
                    >
                        <Row>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="status"
                                    label="Trạng thái"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="NEW">Mới</Option>
                                        <Option value="ACT">Hoạt đông</Option>

                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="driverEmail"
                                    label="Tài khoản"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="name"
                                    label="Tên   "
                                >
                                    <Input />
                                </FormItem>
                            </Col>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="city"
                                    label="Vị trí"

                                >
                                    <Select
                                        onChange={handleChange}
                                        allowClear
                                        options={citys}
                                    />
                                </FormItem>
                                <FormItem />
                                <FormItem
                                >
                                    <Button className='btn-register' type="primary" htmlType="submit">
                                        <FilterOutlined />  Lọc tài xế
                                    </Button>
                                </FormItem>

                            </Col>
                        </Row>
                    </Form>
                </div>
                <div style={{ marginLeft: "50px", float: "left" }}>
                    <AddDriverForCompany />
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={allDriver} size="middle" />
                </div>

            </div>
        </div>
    )
}
export default DriverManagement