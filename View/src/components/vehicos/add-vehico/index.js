import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { RollbackOutlined, SaveOutlined } from '@ant-design/icons';
import './add-vehico.css'
import { useLocation } from 'react-router';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddVehicoByCompany, AddVehicoByDriver } from '../../../redux/apiRequest';


const { Option } = Select;


const AddVehico = () => {
    const dispatch = useDispatch();
    const location = useLocation();
    const newUser = location.state.newUser;
    const onfinish = (values) => {
        if (newUser.role == "ROLE_DRIVER") {
            console.log(values);
            const vehico = {
                ...values,
                driverEmail: newUser.email,
            }
            AddVehicoByDriver(vehico,toast);
        }
        else {
            console.log(values);
            const vehico = {
                ...values,
                companyEmail: newUser.email,
            }
            AddVehicoByCompany(vehico, toast, dispatch);
        }
    };

    return (
        <div className='container'>
            <div className='form-add' >
                <div className='form-header'
                >
                    Thông tin phương tiện
                </div>
                <div className='form-contents'>
                    <Form
                        onFinish={onfinish}
                        labelCol={{
                            span: 8,
                        }}
                        wrapperCol={{
                            span: 12,
                        }}
                    >
                        <Row>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="producer"
                                    label="Nhà sản xuất *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="honda"></Option>
                                        <Option value="honda1"></Option>
                                        <Option value="honda2"></Option>
                                        <Option value="honda3"></Option>
                                    </Select>
                                </FormItem>
                                <Form.Item
                                    name="produceYear"
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
                                <FormItem
                                    name="interiorColor"
                                    label="Màu nội thất *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="black">Đen</Option>
                                        <Option value="white">Trắng</Option>
                                        <Option value="red">Đỏ</Option>
                                        <Option value="bule">xanh</Option>
                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="exteriorColor"
                                    label="Màu sơn *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="black">Đen</Option>
                                        <Option value="white">Trắng</Option>
                                        <Option value="red">Đỏ</Option>
                                        <Option value="bule">xanh</Option>
                                    </Select>
                                </FormItem>
                            </Col>
                            <Col sm={24} md={12} >
                                <Form.Item
                                    name="plate"
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

                                <FormItem
                                    name="plateCountry"
                                    label="Quốc gia đăng ký *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="vn">Việt nam</Option>
                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="platState"
                                    label="Tỉnh thành đăng ký *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="hanoi">Hà Nội</Option>
                                        <Option value="danang">Đà Nẵng</Option>
                                        <Option value="hcm">Hồ Chí Minh</Option>
                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="typeId"
                                    label="Loại xe *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="1">A3</Option>
                                    </Select>
                                </FormItem>

                            </Col>
                        </Row>

                        <FormItem
                        >
                            <Button type="primary" htmlType="submit">
                                <SaveOutlined /> Lưu
                            </Button>
                        </FormItem>

                    </Form>
                </div>
            </div>
        </div>
    )
}
export default AddVehico