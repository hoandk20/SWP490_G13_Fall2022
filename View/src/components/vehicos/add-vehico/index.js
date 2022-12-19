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
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const onfinish = (values) => {
        if (newUser.role == "ROLE_DRIVER") {
            const vehico = {
                ...values,
                driverEmail: newUser.email,
            }
            AddVehicoByDriver(vehico,toast);
        }
        else {
            const vehico = {
                ...values,
                companyEmail: newUser.email,
            }
            // AddVehicoByCompany(vehico, toast, dispatch);
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
                                        <Option value="bule">Xanh</Option>
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
                                            message: 'Biển số xe không được để trống',
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
                                    options={citys}
                                />
                            </Form.Item>
                                <FormItem
                                    name="typeId"
                                    label="Loại xe *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="1">Xe máy</Option>
                                        <Option value="2">Ô tô</Option>
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