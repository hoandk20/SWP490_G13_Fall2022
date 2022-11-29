import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Popconfirm, Modal } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';
import ModalAddVehico from '../../commons/modals/modal-add-vehico';
import AddVehico from '../../commons/drawers/drawer-vehico-mgt/drawer-add--vehico';
import { useDispatch, useSelector } from 'react-redux';
import { deleteVehicelByCompany, getAllVehico, getAllVehicoFilter } from '../../../redux/apiRequest';
import EditVehico from '../../commons/drawers/drawer-vehico-mgt/drawer-edit-vehico';
import { toast } from 'react-toastify';


const { Option } = Select;
const VehicoManagement = () => {
    const [open, setOpen] = useState(false);
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);

    const all = useSelector((state) => state.vehico.vehicos?.all);
    const vehicos = all?.map((row) => ({ ...row, key: row.id }))

    const vehicles = all?.map((item) => {

        if (item.listDoc.length === 0) {
            return { ...item, item, key: item.id, cnbh: "Chưa gửi", cndk: "Chưa gửi" }
        } else if (item.listDoc.length === 1) {
            if (item.listDoc[0].file_name === "Chung_Nhan_Bao_Hiem") {
                if (item.listDoc[0].status === "SENDED") {
                    return { ...item, item, key: item.id, cnbh: "Đã gửi", cndk: "Chưa gửi" }
                } else if (item.listDoc[0].status === "VALID") {
                    return { ...item, item, key: item.id, cnbh: "Hợp lệ", cndk: "Chưa gửi" }
                } else if (item.listDoc[0].status === "INVALID") {
                    return { ...item, item, key: item.id, cnbh: "Không Hợp lệ", cndk: "Chưa gửi" }
                }
            } else if (item.listDoc[0].file_name === "Chung_Nhan_Dang_Kiem") {
                if (item.listDoc[0].status === "SENDED") {
                    return { ...item, item, key: item.id, cndk: "Đã gửi", cnbh: "Chưa gửi" }
                } else if (item.listDoc[0].status === "VALID") {
                    return { ...item, item, key: item.id, cndk: "Hợp lệ", cnbh: "Chưa gửi" }
                } else if (item.listDoc[0].status === "INVALID") {
                    return { ...item, item, key: item.id, cndk: "Không Hợp lệ", cnbh: "Chưa gửi" }
                }
            }
        } else if (item.listDoc.length === 2) {

            if (item.listDoc[0].status === "SENDED") {
                if (item.listDoc[1].status === "SENDED") {
                    return { ...item, item, key: item.id, cnbh: "Đã gửi", cndk: "Đã gửi" }
                } else if (item.listDoc[1].status === "VALID") {
                    return { ...item, item, key: item.id, cnbh: "Đã gửi", cndk: "Hợp lệ" }
                } else if (item.listDoc[1].status === "INVALID") {
                    return { ...item, item, key: item.id, cnbh: "Đã gửi", cndk: "Không Hợp lệ" }
                }
            } else if (item.listDoc[0].status === "VALID") {
                if (item.listDoc[1].status === "SENDED") {
                    return { ...item, item, key: item.id, cnbh: "Hợp lệ", cndk: "Đã gửi" }
                } else if (item.listDoc[1].status === "VALID") {
                    return { ...item, item, key: item.id, cnbh: "Hợp lệ", cndk: "Hợp lệ" }
                } else if (item.listDoc[1].status === "INVALID") {
                    return { ...item, item, key: item.id, cnbh: "Hợp lệ", cndk: "Không Hợp lệ" }
                }
            } else if (item.listDoc[0].status === "INVALID") {
                if (item.listDoc[1].status === "SENDED") {
                    return { ...item, item, key: item.id, cnbh: "Không Hợp lệ", cndk: "Đã gửi" }
                } else if (item.listDoc[1].status === "VALID") {
                    return { ...item, item, key: item.id, cnbh: "Không Hợp lệ", cndk: "Hợp lệ" }
                } else if (item.listDoc[1].status === "INVALID") {
                    return { ...item, item, key: item.id, cnbh: "Không Hợp lệ", cndk: "Không Hợp lệ" }
                }
            }
        }
    })
    console.log("vehicles", vehicles);
    const allVehicle = vehicles?.map((item) => {
        if (item.typeId === 1) {
            return { ...item, item, key: item.id, type: "Xe máy" }
        } else if (item.typeId === 2) {
            return { ...item, item, key: item.id, type: "Ô tô" }
        }
    })
    const handleDelete = (key) => {
        console.log(key);
        deleteVehicelByCompany(key, user.email, toast, dispatch);
    };
    const cancel = (e) => {

    };
    useEffect(() => {
        getAllVehico(user.email, dispatch);
    }, [])
    const columns = [
        // {
        //     key: 'index',
        //     title: 'Số',
        //     dataIndex: 'index',
        // },
        {
            key: 'producer',
            title: 'Kiểu phương tiện',
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
            key: 'type',
            title: 'Loại phương tiện',
            dataIndex: 'type'
        },

        {
            title: 'Giấy chứng nhận bảo hiểm',
            dataIndex: 'cnbh',
            key: 'cnbh',
            render: (text, record, index) => {
                if (record.cnbh === "Chưa gửi") {
                    return <div style={{ color: "red" }}>{record.cnbh}</div>
                } else {
                    return <div><span style={{ marginRight: "10px", color: 'red' }}>{record.cnbh}</span>
                        <EyeOutlined style={{ fontSize: "16px" }} onClick={() => {

                        }} />
                    </div>
                }


            },
        },
        {
            title: 'Giấy đăng kiểm',
            dataIndex: 'cndk',
            key: 'cndk',
            render: (text, record, index) => {
                if (record.cndk === "Chưa gửi") {
                    return <div style={{ color: "red" }}>{record.cndk}</div>
                } else {
                    return <div><span style={{ marginRight: "10px", color: 'red' }}>{record.cndk}</span>
                        <EyeOutlined style={{ fontSize: "16px" }} onClick={() => {
                            setOpen(true);
                        }} />
                    </div>
                }


            },
        },
        // {
        //     title: 'Giấy đăng kiểm',
        //     dataIndex: 'gdk',
        //     key: 'cndk',
        //     render: (text, record, index) => {
        //         return <div>
        //             <Button onClick={() =>{
        //                 console.log(record);
        //             }} type='primary'>Xem</Button>
        //         </div>

        //     },
        // },

        {
            key: 'driverEmail',
            title: 'Tài xế sử dụng',
            dataIndex: 'driverEmail',
            // render:(record) =>{
            //     if(record.driverEmail===""){
            //         return <>Chưa có tài xế sử dụng</>
            //     }else{
            //         return <>record.driverEmail</>
            //     }
            // }
        },


        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>
                    <EditVehico state={record} />

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
                        onConfirm={() => handleDelete(record.key)}
                        onCancel={cancel}
                        okText="Yes"
                        cancelText="No"
                    >
                        <DeleteOutlined />
                    </Popconfirm>
                </div>

            },
        },
    ];

    const onFinish = (values) => {
        if (values.plate === undefined) {
            values.plate = "";
        }
        if (values.typeId === undefined) {
            values.typeId = "";
        }
        const vehicle = {
            ...values,
            email: user.email,
            status: ""
        }
        getAllVehicoFilter(vehicle, dispatch);
        console.log(vehicle);
    }
    return (
        <div className='container'>
            <div className='container-infos' style={{
                textAlign: "left",
                marginLeft: "20px"
            }}>
                <h2 style={{ marginBottom: "50px" }}>PHƯƠNG TIỆN</h2>
                <div className='driver-info'>
                    <Form
                        onFinish={onFinish}
                        labelCol={{
                            span: 5,
                        }}
                        wrapperCol={{
                            span: 14,
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
                                {/* <FormItem
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
                                </FormItem> */}
                                <FormItem
                                    name="typeId"
                                    label="Loại phương tiện"

                                >
                                    <Select
                                        allowClear

                                    >
                                        <Option value="1">Xe máy</Option>
                                        <Option value="2">Ô tô</Option>
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
                    <Modal
                        title="Xem tài liệu"
                        centered
                        open={open}
                        onOk={() => setOpen(false)}
                        onCancel={() => setOpen(false)}
                        width={500}
                    >
                        <img src={""} height="220px" />
                    </Modal>
                    {/* <div
                        style={{ float: "right" }}
                    >
                        <p>*IRS: Giấy Đăng Kiểm</p>
                    </div> */}
                </div>
                <div style={{ marginLeft: "50px", float: "left" }}>
                    <AddVehico />
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={allVehicle} size="middle" />
                </div>
            </div>
        </div >
    )
}
export default VehicoManagement