import { RightOutlined, SaveOutlined } from '@ant-design/icons';
import { Button, Col, Form, Input, Row, Select } from 'antd';
import { Option } from 'antd/lib/mentions';
import axios from 'axios';
import React from 'react';
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation, useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { AddVehicoByCompany, AddVehicoByDriver, ChangeStatusSignUp, getAllVehico, getUser } from '../../../../../redux/apiRequest';
import AddVehico from '../../../../vehicos/add-vehico';
const URL = "http://26.36.110.116";
const RegisterAddVehicle = () => {
    

    const navigate =useNavigate();
    const dispatch = useDispatch();
    const location = useLocation();
    const [count, setCount] = useState(0);
    // const newUser = location.state.newUser;
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    const [vehicle,setVehicle]=useState("");

    const onfinish = async(values) => {
        if (user.role == "ROLE_DRIVER") {
            console.log(values);
            // const vehico = await{
            //     ...values,
            //     driverEmail: user.email,
            // }
            // setVehicle(vehico)
            // console.log(vehicle);
            try {
                const res = await axios.post(`${URL}:8080/api/driver/addVehicle`,
                  {
                    driverEmail: user.email,
                    producer: values.producer,
                    produceYear: values.produceYear,
                    interiorColor: values.interiorColor,
                    exteriorColor: values.exteriorColor,
                    plate: values.plate,
                    platState: values.platState,
                    plateCountry: values.plateCountry,
                    typeId: vehicle.typeId
                  }
                  , {
                    headers: { 'Content-Type': 'application/json' }
                  });
                  setCount(count+1);
                  getUser(user.email,dispatch);
                toast.success("Tạo phương tiện thành công")
              } catch (error) {
                toast.error("Tạo phương tiện thất bại")
              }
            // AddVehicoByDriver(vehico,toast,dispatch);
            // setCount(count+1);
        }
        else {

            try {
                const res = await axios.post(`${URL}:8080/api/company/addVehicle`,
                  {
                    companyEmail: user.email,
                    producer: values.producer,
                    produceYear: values.produceYear,
                    interiorColor: values.interiorColor,
                    exteriorColor: values.exteriorColor,
                    plate: values.plate,
                    platState: values.platState,
                    plateCountry: values.plateCountry,
                    typeId: vehicle.typeId
                  }
                  , {
                    headers: { 'Content-Type': 'application/json' }
                  });
                  setCount(count+1);
                getAllVehico(vehicle.companyEmail, dispatch);
                getUser(vehicle.companyEmail,dispatch);
                toast.success("Tạo phương tiện thành công")
              } catch (error) {
                toast.error("Tạo phương tiện thất bại")
              }
            // AddVehicoByCompany(vehico, toast, dispatch);
            // setCount(count+1);
        }
    };
    console.log(count);
    const onClickNext = () => {
        ChangeStatusSignUp(user.email,3);
        navigate('/signup/vehico-info');      
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
                                            message: 'Vui lòng chọn năm sản xuất',
                                        },
                                    ]}
                                >
                                    <Input />
                                </Form.Item>
                                <Form.Item
                                    name="interiorColor"
                                    label="Màu nội thất *"
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
                                            message: 'Biển số xe không được để trống',
                                        },
                                    ]}
                                >
                                    <Input />
                                </Form.Item>

                                <Form.Item
                                    name="plateCountry"
                                    label="Quốc gia đăng ký *"
                                    rules={[
                                        {
                                            required: true,
                                            message: 'Vui lòng chọn quốc gia đăng ký',
                                        },
                                    ]}
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
                                    rules={[
                                        {
                                            required: true,
                                            message: 'Vui lòng chọn tỉnh thành đăng ký',
                                        },
                                    ]}
                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="Hà nội">Hà Nội</Option>
                                        <Option value="Đà nẵng">Đà Nẵng</Option>
                                        <Option value="Thành phố Hồ Chí Minh">Hồ Chí Minh</Option>
                                    </Select>
                                </Form.Item>
                                <Form.Item
                                    name="typeId"
                                    label="Loại xe "

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