import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Popconfirm, Modal } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';
import AddVehico from '../../../../../commons/drawers/drawer-vehico-mgt/drawer-add--vehico';
import { useDispatch, useSelector } from 'react-redux';
import { deleteVehicelByCompany, getAllVehico, getAllVehicoFilter } from '../../../../../../redux/apiRequest';
import EditVehico from '../../../../../commons/drawers/drawer-vehico-mgt/drawer-edit-vehico';
import { toast } from 'react-toastify';
import axios from 'axios';


const { Option } = Select;
const VehicleOfCompany = (props) => {

    const [companys,setCompanys]=useState(props.companys);
    const [openModal, setOpenModal] = useState(false);
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [image, setImage] = useState("");



    const all = useSelector((state) => state.vehico.vehicos?.all);
    const vehicos = all?.map((row) => ({ ...row, key: row.id }))
 const getDocumentVehicleId = async (docId) => {
        try {
            const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/company/getDocument?docId=${docId}`, {
                headers: { 'Content-Type': 'application/json' }

            })
            setImage(res.data.object.base64);
        } catch (error) {

        }
    }
    const vehicles = all?.map((item) => {
        if (item.cnbh === null && item.cndk === null) {
            return { ...item, item, key: item.id, cnbhStatus: "Chưa gửi", cndkStatus: "Chưa gửi" }
        } else if (item.cndk === null || item.cnbh === null) {
            if (item.cnbh === null) {
                return { ...item, item, key: item.id, cnbhStatus: "Chưa gửi", cndkStatus: "Đã gửi" }
            } else if (item.cndk === null) {
                return { ...item, item, key: item.id, cnbhStatus: "Đã gửi", cndkStatus: "Chưa gửi" }
            }

        }else{
            if(item.cnbh.status==="SENDED"){
                if(item.cndk.status==="SENDED"){
                    return { ...item, item, key: item.id, cnbhStatus: "Đã gửi", cndkStatus: "Đã gửi" }
                }else if(item.cndk.status==="VALID"){
                    return { ...item, item, key: item.id, cnbhStatus: "Đã gửi", cndkStatus: "Hợp lệ" }
                }else if(item.cndk.status==="INVALID"){
                    return { ...item, item, key: item.id, cnbhStatus: "Đã gửi", cndkStatus: "Không Hợp lệ" }
                }

            }else if(item.cnbh.status==="VALID"){
                if(item.cndk.status==="SENDED"){
                    return { ...item, item, key: item.id, cnbhStatus: "Hợp lệ", cndkStatus: "Đã gửi" }
                }else if(item.cndk.status==="VALID"){
                    return { ...item, item, key: item.id, cnbhStatus: "Hợp lệ", cndkStatus: "Hợp lệ" }
                }else if(item.cndk.status==="INVALID"){
                    return { ...item, item, key: item.id, cnbhStatus: "Hợp lệ", cndkStatus: "Không Hợp lệ" }
                }
            }else if(item.cnbh.status==="INVALID"){
                if(item.cndk.status==="SENDED"){
                    return { ...item, item, key: item.id, cnbhStatus: "Không Hợp lệ", cndkStatus: "Đã gửi" }
                }else if(item.cndk.status==="VALID"){
                    return { ...item, item, key: item.id, cnbhStatus: "Không Hợp lệ", cndkStatus: "Hợp lệ" }
                }else if(item.cndk.status==="INVALID"){
                    return { ...item, item, key: item.id, cnbhStatus: "Không Hợp lệ", cndkStatus: "Không Hợp lệ" }
                }
            }
        }
            
        



    })


    const allVehicle = vehicles?.map((item) => {
        if (item.typeId === 1) {
            return { ...item, item, key: item.id, type: "Xe máy" }
        } else if (item.typeId === 2) {
            return { ...item, item, key: item.id, type: "Ô tô" }
        }
    })

    const handleDelete = (key) => {
      
    
         deleteVehicelByCompany(key,companys.email,toast,dispatch);
    };
    const cancel = (e) => {

    };
    useEffect(() => {
        getAllVehico(companys.email, dispatch);
    }, [])

    const onFinish = (values) => {
        if (values.plate === undefined) {
            values.plate = "";
        }
        if (values.typeId === undefined) {
            values.typeId = "";
        }
        const vehicle = {
            ...values,
            email: companys.email,
            status: ""
        }

        getAllVehicoFilter(vehicle, dispatch);
  
    }
    const columns = [

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
            dataIndex: 'cnbhStatus',
            key: 'cnbhStatus',
            render: (text, record, index) => {
                if (record.cnbhStatus === "Chưa gửi") {
                    return <div style={{ color: "red" }}>{record.cnbhStatus}</div>
                } else {
                    return <div><span style={{ marginRight: "10px", color: 'red' }}>{record.cnbhStatus}</span>
                        <EyeOutlined style={{ fontSize: "16px" }} onClick={() => {
                            setOpenModal(true);
                            getDocumentVehicleId(record.cnbh.id);
                        }} />
                    </div>
                }


            },
        },
        {
            title: 'Giấy đăng kiểm',
            dataIndex: 'cndkStatus',
            key: 'cndkStatus',
            render: (text, record, index) => {
                if (record.cndkStatus === "Chưa gửi") {
                    return <div style={{ color: "red" }}>{record.cndkStatus}</div>
                } else {
                    return <div><span style={{ marginRight: "10px", color: 'red' }}>{record.cndkStatus}</span>
                        <EyeOutlined style={{ fontSize: "16px" }} onClick={() => {
                            setOpenModal(true);

                            getDocumentVehicleId(record.cndk.id);

                        }} />

                    </div>
                }


            },
        },

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

        // {
        //     title: '',
        //     dataIndex: '',
        //     key: 'y',
        //     render: (text, record, index) => {
        //         return <div>
        //             <Popconfirm
        //                 title="Bạn có muốn xóa phương tiện này?"
        //                 onConfirm={() => handleDelete(record.key)}
        //                 onCancel={cancel}
        //                 okText="Yes"
        //                 cancelText="No"
        //             >
        //                 <DeleteOutlined />
        //             </Popconfirm>
        //         </div>

        //     },
        // },
    ];

    return (
        <div className='container'>
        <div className='container-infos'>
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
                                name="plate"
                                label="Biển số"
                            >
                                <Input />
                            </FormItem>

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

            </div>
            <Modal
                style={{ textAlign: "center" }}
                title="Xem tài liệu"
                centered
                open={openModal}
                onOk={() => setOpenModal(false)}
                onCancel={() => setOpenModal(false)}
                width={1000}
            >
                <img src={image} height="500px" />
            </Modal>
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
export default VehicleOfCompany