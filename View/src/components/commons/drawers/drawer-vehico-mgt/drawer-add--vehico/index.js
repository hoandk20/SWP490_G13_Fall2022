import { PlusOutlined } from '@ant-design/icons';
import { Button, Col, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddVehicoByCompany, getAllVehico, getDriversForCompany } from '../../../../../redux/apiRequest';
// import ModalUploadDocumentVehicle from '../../../modals/modal-upload-document-vehicle';
const { Option } = Select;
const AddVehico = () => {
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const [city, setCity] = useState("");
    const showDrawer = () => {
        setOpen(true);
    };
    const onClose = () => {
        setOpen(false);
    };
    const handleChange = (a) => {
        setCity(a.value);
    };
    const onfinish = (values) => {

        const vehico = {
            ...values,
            companyEmail: user.email,
            platState:city.label
        }

        AddVehicoByCompany(vehico, toast, dispatch);
        // getAllVehico(user.email,dispatch);
        setOpen(false);
        // window.location.reload();
    };
    return (
        <>
            <Button type="primary" onClick={showDrawer} icon={<PlusOutlined />}>
                Thêm phương tiện
            </Button>
            <Drawer
                title="Thêm phương tiện"
                width={720}
                onClose={onClose}
                open={open}
                bodyStyle={{
                    paddingBottom: 80,
                }}
            >
                <Form onFinish={onfinish} layout="vertical" hideRequiredMark>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="producer"
                                label="Nhà sản xuất"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vùi lòng chọn nhà sản xuất',
                                    },
                                ]}
                            >
                                <Select
                                    allowClear
                                >
                                    <Option value="Toyota"></Option>
                                    <Option value="Honda"></Option>
                                    <Option value="Hyundai"></Option>
                                    <Option value="Ford"></Option>
                                    <Option value="Suzuki"></Option>
                                    <Option value="Mercedes-Benz"></Option>
                                </Select>
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="produceYear"
                                label="Năm sản xuất"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn năm sản xuất',
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
                                name="interiorColor"
                                label="Màu nội thất"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn năm sản xuất',
                                    },
                                ]}
                            >
                                <Select
                                    allowClear
                                >
                                    <Option value="black">Đen</Option>
                                    <Option value="white">Trắng</Option>
                                    <Option value="red">Đỏ</Option>
                                    <Option value="bule">xanh</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="exteriorColor"
                                label="Màu sơn"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn màu sơn',
                                    },
                                ]}
                            >
                                <Select
                                    allowClear
                                >
                                    <Option value="black">Đen</Option>
                                    <Option value="white">Trắng</Option>
                                    <Option value="red">Đỏ</Option>
                                    <Option value="bule">xanh</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="plate"
                                label="Biển số"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Biển số xe không được để trống',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="typeId"
                                label="Loại phương tiện "                               
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn loại xe',
                                    },
                                ]}
                            >
                                <Select
                                    allowClear
                                >
                                    <Option value="1">Xe máy</Option>
                                    <Option value="2">Ô tô</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                        <Col span={24}>
                            <Form.Item
                                name="plateCountry"
                                label="Quốc gia đăng ký"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn quốc gia đăng ký',
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
                                name="platState"
                                label="Thành phố đăng ký"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn tỉnh thành đăng ký',
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
                                    onChange={handleChange}
                                    options={citys}
                                />
                            </Form.Item>
                            {/* <Form.Item>
                                <ModalUploadDocumentVehicle />
                            </Form.Item> */}
                            <Form.Item
                            >
                                <Button className='btn-register' type="primary" htmlType="submit">
                                    Submit
                                </Button>
                            </Form.Item>
                        </Col>
                    </Row>
                </Form>
            </Drawer>
        </>
    );
};
export default AddVehico;