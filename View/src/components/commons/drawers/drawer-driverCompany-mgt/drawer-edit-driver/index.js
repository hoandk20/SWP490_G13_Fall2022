import { DeleteOutlined, EditOutlined, EyeOutlined, PlusOutlined, SelectOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Modal, Popconfirm, Row, Select, Space, Table } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddDriverByCompany, AddVehicleForDriver, DeleteVehicleForDriver, EditDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
import ModalAddVehicleForDriver from '../../../modals/modal-vehicle-taixe/modal-add-vehicle-for-taixe';
import ModalUploadDocument from '../../../modals/modal-upload-document';
const { Option } = Select;
const { Panel } = Collapse;
const EditDriverForCompany = (props) => {
    const dispatch = useDispatch();
    const drivers = props.state;
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [openModal, setOpenModal] = useState(false);
    const [form] = Form.useForm();
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));

    const all = useSelector((state) => state.vehico.vehicos?.all);
    const vehicos = all?.map((row) => ({ ...row, key: row.id }))

    const showDrawer = () => {
        setOpen(true);
    };
    const onClose = () => {
        setOpen(false);
    };
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
    const cancel = (e) => {
        
    };
    const handleDelete = () => {
        // AddVehicleForDriver(drivers?.email,key,toast)
        // setOpenModal(false);
        const object={
            driverEmail:drivers.email,
            companyEmail:user.email,
            vehicle:0,
            removeVehicleId:drivers.vehicleInfo.id,
        }
        DeleteVehicleForDriver(object,toast,dispatch);
    };

    const genExtra = () => (
        <Popconfirm
            title="Bạn có muốn gỡ phương tiện của tài xế này này?"
            onConfirm={() => handleDelete()}
            onCancel={cancel}
            okText="Yes"
            cancelText="No"
        >
            <DeleteOutlined style={{ fontSize: "24px" }}
                // onClick={(event) => {
                  
                //     // If you don't want click extra trigger collapse, you can prevent this:
                //     event.stopPropagation();
                // }}

            />
        </Popconfirm>
    );
    // const columns = [
    //     // {
    //     //     key: 'index',
    //     //     title: 'Số',
    //     //     dataIndex: 'index',
    //     // },
    //     {
    //         key: 'producer',
    //         title: 'Kiểu phương tiện',
    //         dataIndex: 'producer',
    //     },
    //     {
    //         key: 'plate',
    //         title: 'Biển số',
    //         dataIndex: 'plate',
    //     },
    //     {
    //         key: 'produceYear',
    //         title: 'Năm sản xuất',
    //         dataIndex: 'produceYear',
    //     },
    //     {
    //         key: 'price',
    //         title: 'Giấy chứng nhận bảo hiểm',
    //         dataIndex: 'price',
    //     },
    //     {
    //         key: 'irs',
    //         title: 'Giấy đăng kiểm',
    //         dataIndex: 'irs',
    //     },
    //     {
    //         key: 'status',
    //         title: 'Trạng thái',
    //         dataIndex: 'status',
    //     },


    //     // {
    //     //     title: '',
    //     //     dataIndex: '',
    //     //     key: 'x',
    //     //     render: (text, record, index) => {
    //     //         return <div>
    //     //             <EditVehico state={record} />

    //     //         </div>

    //     //     },
    //     // },

    //     {
    //         title: 'Phân phương tiện',
    //         dataIndex: '',
    //         key: 'y',
    //         render: (text, record, index) => {
    //             return <div style={{ textAlign: "center" }}>
    //                 <Popconfirm
    //                     title="Bạn có muốn thêm phương tiện này cho tài xế?"
    //                     onConfirm={() => handleAdd(record.key)}
    //                     onCancel={cancel}
    //                     okText="Yes"
    //                     cancelText="No"
    //                 >
    //                     {/* <Button type="primary">Phân phương tiện</Button> */}
    //                     <SelectOutlined style={{ fontSize: '20px', color: '#08c' }} />
    //                 </Popconfirm>
    //             </div>

    //         },
    //     },
    // ];
    return (
        <>
            <EyeOutlined onClick={showDrawer} />
            <Drawer
                title="Thông tin tài xế"
                width={720}
                onClose={onClose}
                open={open}
                bodyStyle={{
                    paddingBottom: 80,
                }}
            >
                <Form onFinish={onfinish} layout="vertical" hideRequiredMark name="basic" form={form}>
                    <Row gutter={16}>
                        <Col span={24}>
                            <Form.Item
                                name="email"
                                initialValue={drivers.email}
                                label="Tài khoản Email"
                                rules={[
                                    {
                                        type: 'email',
                                        message: 'Email không hợp lệ',
                                    },
                                    {
                                        required: true,
                                        message: 'Email không được để trống',
                                    },
                                ]}
                            >
                                <Input disabled/>
                            </Form.Item>
                        </Col>

                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="firstName"
                                initialValue={drivers.firstName}
                                label="Họ và tên đệm"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Tên không được để trống',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>

                        <Col span={12}>
                            <Form.Item
                                name="lastName"
                                initialValue={drivers.lastName}
                                label="Tên"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Tên không được để trống',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="phoneNumber"
                                initialValue={drivers.phoneNumber}
                                label="Số điện thoại"
                                rules={[
                                    {

                                        message: 'Số điện thoại không hợp lệ',
                                        pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                    },
                                    {
                                        required: true,
                                        message: 'Số điện thoại không được để trống',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={24}>
                            <Form.Item
                                name="country"
                                initialValue={drivers.country}
                                label="Quốc gia"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn quốc gia',
                                    },
                                ]}
                            >
                                <Select>
                                    <Option value="vi">Việt Nam</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={24}>
                            <Form.Item
                                name="city"
                                initialValue={drivers.cityId}
                                label="Thành phố"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn thành phố',
                                    },
                                ]}
                            >
                                <Select
                                    labelInValue
                                    // defaultValue={{
                                    //     value: 'lucy',
                                    //     label: 'Lucy (101)',
                                    // }}
                                    // style={{
                                    //     width: 120,
                                    // }}
                                    // onChange={handleChange}
                                    options={citys}
                                />
                            </Form.Item>
                            {
                                drivers.vehicleInfo === null ? (
                                    <>
                                        <Form.Item>
                                            <span style={{ marginRight: "40px" }}><ModalUploadDocument driver={drivers}/></span>
                                            <span><ModalAddVehicleForDriver email={drivers.email} companyEmail={user.email} /></span>
                                        </Form.Item>
                                    </>
                                ) : (
                                    <>
                                        <div style={{ marginBottom: "30px" }}>
                                            <Collapse >
                                                <Panel header="Thông tin phương tiện của tài xế" extra={genExtra()}>
                                                    <div className='form-content'>
                                                        <div className='form-info'>
                                                            <Row>
                                                                <Col sm={12} md={6} >
                                                                    <p>Nhà sản xuất:</p> {drivers.vehicleInfo.producer}
                                                                </Col>
                                                                <Col sm={12} md={6} >
                                                                    <p>Biển số xe:</p> {drivers.vehicleInfo.plate}
                                                                </Col>
                                                                <Col sm={12} md={6} >
                                                                    <p>Loại xe:</p> {drivers.vehicleInfo.typeId}
                                                                </Col>
                                                                <Col sm={12} md={6} >
                                                                    <p>Màu xe:</p> {drivers.vehicleInfo.exteriorColor}
                                                                </Col>
                                                            </Row>

                                                        </div>
                                                    </div>

                                                </Panel>

                                            </Collapse>
                                        </div>
                                        <Form.Item>
                                            <ModalUploadDocument driver={drivers} />
                                        </Form.Item>
                                        {/* <Modal
                                            title="Phân phương tiện"
                                            centered
                                            open={openModal}
                                            onOk={() => setOpenModal(false)}
                                            onCancel={() => setOpenModal(false)}
                                            width={1000}
                                        >
                                            <div className='container'>
                                                <div className='container-infos' style={{
                                                    textAlign: "left",
                                                    marginLeft: "20px"
                                                }}>


                                                    <div className='table-info' style={{ marginTop: "5%" }}>
                                                        <Table columns={columns} dataSource={vehicos} size="middle" />
                                                    </div>
                                                </div>
                                            </div >
                                        </Modal> */}
                                    </>

                                )
                            }


                            <Form.Item
                            >
                                <Button className='btn-register' type="primary" htmlType="submit">
                                    Gửi
                                </Button>
                            </Form.Item>
                        </Col>
                    </Row>
                </Form>
            </Drawer>
        </>
    );
};
export default EditDriverForCompany;