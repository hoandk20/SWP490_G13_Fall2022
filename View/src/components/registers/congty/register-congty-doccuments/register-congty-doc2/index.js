import { RightOutlined, SaveOutlined } from '@ant-design/icons';
import { Button, Col, Form, Input, Row, Select } from 'antd';
import { Option } from 'antd/lib/mentions';
import React from 'react';
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation, useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { AddVehicoByCompany, AddVehicoByDriver, ChangeStatusSignUp } from '../../../../../redux/apiRequest';
import AddVehico from '../../../../vehicos/add-vehico';

const RegisterAddVehicle = () => {

    const navigate =useNavigate();
    const dispatch = useDispatch();
    const location = useLocation();
    const [count, setCount] = useState(0);
    const newUser = location.state.newUser;
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    console.log(newUser);
    const [vehicle,setVehicle]=useState("");

    const onfinish = (values) => {
        if (newUser.role == "ROLE_DRIVER") {
            console.log(values);
            const vehico = {
                ...values,
                driverEmail: newUser.email,
            }
            setVehicle(vehico)
           
            AddVehicoByDriver(vehico,toast);
            setCount(count+1);
        }
        else {
            console.log(values);
            const vehico = {
                ...values,
                companyEmail: newUser.email,
            }
            setVehicle(vehico)
            AddVehicoByCompany(vehico, toast, dispatch);
            setCount(count+1);
        }
    };
    console.log(count);
    const onClickNext = () => {
        ChangeStatusSignUp(newUser.email,3);
        navigate('/signup/vehico-info',{state:{newUser,vehicle}});      
    };
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>TÀI LIỆU CẦN CHO PHƯƠNG TIỆN</h2>
                <p>Xin vui lòng thêm thông tin và tải các tài liệu liên quan đến xe của bạn. Xe của bạn cần có năm sản xuất
                    từ năm 2008 trở lên. Đối với xe 7 chỗ cần có năm sản xuất từ năm 2012 trở lên. Đối với xe mô tô, vui lòng
                    tải giấy đăng ký lên thay cho giấy đăng kiểm
                </p>
                {/* <AddVehico/> */}
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
                                <Form.Item
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
                                </Form.Item>
                                <Form.Item
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
                                </Form.Item>
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

                                <Form.Item
                                    name="plateCountry"
                                    label="Quốc gia đăng ký *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="vn">Việt nam</Option>
                                    </Select>
                                </Form.Item>
                                <Form.Item
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
                                </Form.Item>
                                <Form.Item
                                    name="typeId"
                                    label="Loại xe *"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="1">A3</Option>
                                    </Select>
                                </Form.Item>

                            </Col>
                        </Row>

                        <Form.Item
                        >
                            <Button type="primary" htmlType="submit">
                                <SaveOutlined /> Lưu
                            </Button>
                        </Form.Item>

                    </Form>
                </div>
            </div>
            </div>
            <div style={{ marginTop: "50px" }}>
                    {/* <Button type='primary' onClick={onClickNext}>Tiếp tục <RightOutlined/> </Button> */}
                    {count == 1 ? (
                        <Button type='primary' onClick={onClickNext}>Tiếp tục <RightOutlined /> </Button>
                    ) : (
                        <Button type='primary' disabled >Tiếp tục <RightOutlined /> </Button>
                    )}
                </div>
        </div>
    )
}
export default RegisterAddVehicle