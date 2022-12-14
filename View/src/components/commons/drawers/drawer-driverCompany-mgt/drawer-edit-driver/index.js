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
        const object = {
            driverEmail: drivers.email,
            companyEmail: user.email,
            vehicle: 0,
            removeVehicleId: drivers.vehicleInfo.id,
        }
        DeleteVehicleForDriver(object, toast, dispatch);
    };

    const genExtra = () => (
        <Popconfirm
            title="B???n c?? mu???n g??? ph????ng ti???n c???a t??i x??? n??y n??y?"
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

    return (
        <>
            <EyeOutlined onClick={showDrawer} />
            <Drawer
                title="Th??ng tin t??i x???"
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
                                label="T??i kho???n Email"
                                rules={[
                                    {
                                        type: 'email',
                                        message: 'Email kh??ng h???p l???',
                                    },
                                    {
                                        required: true,
                                        message: 'Email kh??ng ???????c ????? tr???ng',
                                    },
                                ]}
                            >
                                <Input disabled />
                            </Form.Item>
                        </Col>

                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="firstName"
                                initialValue={drivers.firstName}
                                label="H??? v?? t??n ?????m"
                                rules={[
                                    {
                                        required: true,
                                        message: 'T??n kh??ng ???????c ????? tr???ng',
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
                                label="T??n"
                                rules={[
                                    {
                                        required: true,
                                        message: 'T??n kh??ng ???????c ????? tr???ng',
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
                                label="S??? ??i???n tho???i"
                                rules={[
                                    {

                                        message: 'S??? ??i???n tho???i kh??ng h???p l???',
                                        pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                    },
                                    {
                                        required: true,
                                        message: 'S??? ??i???n tho???i kh??ng ???????c ????? tr???ng',
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
                                label="Qu???c gia"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui l??ng ch???n qu???c gia',
                                    },
                                ]}
                            >
                                <Select>
                                    <Option value="vi">Vi???t Nam</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={24}>
                            <Form.Item
                                name="city"
                                initialValue={drivers.cityId}
                                label="Th??nh ph???"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui l??ng ch???n th??nh ph???',
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
                                            <span style={{ marginRight: "40px" }}><ModalUploadDocument driver={drivers} /></span>
                                            <span><ModalAddVehicleForDriver email={drivers.email} companyEmail={user.email} /></span>
                                        </Form.Item>
                                    </>
                                ) : (
                                    <>
                                        <div style={{ marginBottom: "30px" }}>
                                            <Collapse >
                                                <Panel header="Th??ng tin ph????ng ti???n c???a t??i x???" extra={genExtra()}>
                                                    <div className='form-content'>
                                                        <div className='form-info'>
                                                            <Row>
                                                                <Col sm={12} md={6} >
                                                                    <p>Nh?? s???n xu???t:</p> {drivers.vehicleInfo.producer}
                                                                </Col>
                                                                <Col sm={12} md={6} >
                                                                    <p>Bi???n s??? xe:</p> {drivers.vehicleInfo.plate}
                                                                </Col>
                                                                {
                                                                    drivers.vehicleInfo.typeId === 1 ? (
                                                                        <>
                                                                            <Col sm={12} md={6} >
                                                                                <p>Lo???i xe:</p> Xe m??y
                                                                            </Col>
                                                                        </>
                                                                    ) : (
                                                                        <>
                                                                            <Col sm={12} md={6} >
                                                                                <p>Lo???i xe:</p> ?? t??
                                                                            </Col>
                                                                        </>
                                                                    )
                                                                }

                                                                <Col sm={12} md={6} >
                                                                    <p>M??u xe:</p> {drivers.vehicleInfo.exteriorColor}
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
                                            title="Ph??n ph????ng ti???n"
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
                                    G???i
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