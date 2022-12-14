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

const RegisterAddVehicle = () => {


    const navigate = useNavigate();
    const dispatch = useDispatch();
    const location = useLocation();
    const [count, setCount] = useState(0);
    // const newUser = location.state.newUser;
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    const [vehicle, setVehicle] = useState("");
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const onfinish = async (values) => {
        if (user.role == "ROLE_DRIVER") {
            try {
                const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/driver/addVehicle`,
                    {
                        driverEmail: user.email,
                        producer: values.producer,
                        produceYear: values.produceYear,
                        interiorColor: "",
                        exteriorColor: values.exteriorColor,
                        plate: values.plate,
                        platState: values.city.label,
                        plateCountry: values.plateCountry,
                        typeId: values.typeId
                    }
                    , {
                        headers: { 'Content-Type': 'application/json' }
                    });
                setCount(count + 1);
                getUser(user.email, dispatch);
                toast.success("T???o ph????ng ti???n th??nh c??ng")
            } catch (error) {
                toast.error("T???o ph????ng ti???n th???t b???i")
            }
        }
        else {

            try {
                const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/company/addVehicle`,
                    {
                        companyEmail: user.email,
                        producer: values.producer,
                        produceYear: values.produceYear,
                        interiorColor: "",
                        exteriorColor: values.exteriorColor,
                        plate: values.plate,
                        platState: values.city.label,
                        plateCountry: values.plateCountry,
                        typeId: values.typeId
                    }
                    , {
                        headers: { 'Content-Type': 'application/json' }
                    });
                setCount(count + 1);
                getAllVehico(vehicle.companyEmail, dispatch);
                getUser(vehicle.companyEmail, dispatch);
                toast.success("T???o ph????ng ti???n th??nh c??ng")
            } catch (error) {
                toast.error("T???o ph????ng ti???n th???t b???i")
            }
            // AddVehicoByCompany(vehico, toast, dispatch);
            // setCount(count+1);
        }
    };
    const onClickNext = () => {
        ChangeStatusSignUp(user.email, 3);
        navigate('/signup/vehico-info');
    };
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>T??I LI???U C???N CHO PH????NG TI???N</h2>
                <p>Xin vui l??ng th??m th??ng tin v?? t???i c??c t??i li???u li??n quan ?????n xe c???a b???n. Xe c???a b???n c???n c?? n??m s???n xu???t
                    t??? n??m 2008 tr??? l??n. ?????i v???i xe 7 ch??? c???n c?? n??m s???n xu???t t??? n??m 2012 tr??? l??n. ?????i v???i xe m?? t??, vui l??ng
                    t???i gi???y ????ng k?? l??n thay cho gi???y ????ng ki???m
                </p>
                {/* <AddVehico/> */}
                <div className='form-add' style={{ width: "100%" }}>
                    <div className='form-header'
                    >
                        Th??ng tin ph????ng ti???n
                    </div>
                    <div className='form-contents' style={{height:"40vh"}}>
                        <div style={{marginTop:"5vh"}}>
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
                                        name="typeId"
                                        label="Lo???i xe "
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui l??ng ch???n lo???i xe',
                                            },
                                        ]}
                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="1">Xe m??y</Option>
                                            <Option value="2">?? t??</Option>
                                        </Select>
                                    </Form.Item>
                                    <Form.Item
                                        name="producer"
                                        label="Nh?? s???n xu???t *"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'V??i l??ng ch???n nh?? s???n xu???t',
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
                                        label="N??m s???n xu???t"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui l??ng ch???n n??m s???n xu???t',
                                            },
                                        ]}
                                    >
                                        <Input />
                                    </Form.Item>
                                    {/* <Form.Item
                                        name="interiorColor"
                                        label="M??u n???i th???t *"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui l??ng ch???n m??u s??n',
                                            },
                                        ]}
                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="??en">??en</Option>
                                            <Option value="Tr???ng">Tr???ng</Option>
                                            <Option value="?????">?????</Option>
                                            <Option value="Xanh">Xanh</Option>
                                        </Select>
                                    </Form.Item> */}
                                    <Form.Item
                                        name="exteriorColor"
                                        label="M??u s??n *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="??en">??en</Option>
                                            <Option value="Tr???ng">Tr???ng</Option>
                                            <Option value="?????">?????</Option>
                                            <Option value="Xanh">Xanh</Option>
                                        </Select>
                                    </Form.Item>
                                </Col>
                                <Col sm={24} md={12} >
                                    <Form.Item
                                        name="plate"
                                        label="Bi???n s???"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Bi???n s??? xe kh??ng ???????c ????? tr???ng',
                                            },
                                        ]}
                                    >
                                        <Input />
                                    </Form.Item>

                                    <Form.Item
                                        name="plateCountry"
                                        label="Qu???c gia ????ng k?? *"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui l??ng ch???n qu???c gia ????ng k??',
                                            },
                                        ]}
                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="vn">Vi???t nam</Option>
                                        </Select>
                                    </Form.Item>
                                    <Form.Item
                                        name="city"
                                        label="Th??nh ph??? ????ng k??"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui l??ng ch???n th??nh ph???',
                                            },
                                        ]}
                                    >
                                        <Select
                                         
                                            labelInValue
                                            options={citys}
                                        />
                                    </Form.Item>
                                    <Form.Item
                                    >
                                        <Button style={{marginLeft:"100%"}} type="primary" htmlType="submit">
                                            <SaveOutlined /> L??u
                                        </Button>
                                    </Form.Item>

                                </Col>
                            </Row>

 

                        </Form>
                        </div>

                    </div>
                </div>
            </div>
            <div style={{ marginTop: "50px" }}>
                {/* <Button type='primary' onClick={onClickNext}>Ti???p t???c <RightOutlined/> </Button> */}
                {count == 1 ? (
                    <Button type='primary' onClick={onClickNext}>Ti???p t???c <RightOutlined /> </Button>
                ) : (
                    <Button type='primary' disabled >Ti???p t???c <RightOutlined /> </Button>
                )}
            </div>
        </div>
    )
}
export default RegisterAddVehicle