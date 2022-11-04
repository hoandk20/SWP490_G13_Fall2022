import { EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddVehicoByCompany, EditVehicoByCompany, getAllVehico, getDriversForCompany } from '../../../../../redux/apiRequest';
const { Option } = Select;
const EditVehico = (props) => {
    const dispatch= useDispatch();
    const user=useSelector((state)=>state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const vehico=props.state;
    const showDrawer = () => {
        setOpen(true);
    };
    const onClose = () => {
        setOpen(false);
    };
    const onfinish = (values) => {
        console.log(values);
        const vehicoUpdate={
            ...values,
            companyEmail:user.email,
            id:vehico.id
        }
        console.log(vehicoUpdate);
        EditVehicoByCompany(vehicoUpdate,toast,dispatch);
        // getAllVehico(user.email,dispatch);
        setOpen(false);
        // window.location.reload();
    };
    return (
        <>
            
            <EyeOutlined onClick={showDrawer} />

            <Drawer
                title="Edit vehico"
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
                                initialValue={vehico.producer}
                                label="Nhà sản xuất"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please enter user name',
                                    },
                                ]}
                            >
                                <Input value='abc'/>
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="produceYear"
                                initialValue={vehico.produceYear}
                                label="Năm sản xuất"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please enter url',
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
                                initialValue={vehico.interiorColor}
                                label="Màu nội thất"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please select an owner',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="exteriorColor"
                                initialValue={vehico.exteriorColor}
                                label="Màu sơn"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please choose the type',
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
                                name="plate"
                                initialValue={vehico.plate}
                                label="Biển số"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please enter plate',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={24}>
                            <Form.Item
                                name="plateCountry"
                                initialValue={vehico.plateCountry}
                                label="Quốc gia đăng ký"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please choose country',
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
                                initialValue={vehico.platState}
                                label="Thành phố đăng ký"
                                rules={[
                                    {
                                        required: true,
                                        message: 'please enter  description',
                                    },
                                ]}
                            >
                                <Select>
                                    <Option value="Hà nội">Hà nội</Option>
                                    <Option value="Đà nẵng">Đà nẵng </Option>
                                    <Option value="Thành phố Hồ Chí Minh">Thành phố Hồ Chí Minh </Option>
                                </Select>
                            </Form.Item>
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
export default EditVehico;