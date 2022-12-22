
import {
    Button,
    Col,
    Form,
    Input,
    Image,
    Row,
    Select,
} from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { SaveOutlined, UploadOutlined } from '@ant-design/icons';
import { useDispatch, useSelector } from 'react-redux';
import ModalRePassword from '../../../commons/modals/modal-re-password';
import { getUser, UploadFile } from '../../../../redux/apiRequest';
import { useState } from 'react';
import { toast } from 'react-toastify';
import jwtDecode from 'jwt-decode';
import { useEffect } from 'react';
import { editInforDriver } from '../../../../redux/apiRequest';
import axios from 'axios';
const { Option } = Select;


const InfoContactTaixe = () => {


    // const currentUser = useSelector((state) => state.auth.login?.currentUser);
    // const decodedTocken = jwtDecode(currentUser.access_token);
    const dispatch = useDispatch();
    const u = useSelector((state) => state.user.userInfo?.currentUser);
    var user
    if (u.statusDriver === "NEW") {
        user = {
            ...u,
            statusDriver: "Chưa hoạt động"
        }
    } else {
        user = {
            ...u,
            statusDriver: "Đang hoạt động"
        }
    }
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    console.log(user);
    const [firstName, setFirstName] = useState(user?.firstname);
    const [lastName, setLastName] = useState(user?.lastname);
    const [email, setEmail] = useState(user?.email);
    const [phone, setPhone] = useState(user?.phone);
    const [address, setAddress] = useState(user?.address);
    const [avatar, setAvatar] = useState(user?.avatarBase64);
    const [city, setCity] = useState(user?.cityId);
    const [city1, setCity1] = useState(user?.vehicleRequest?.platState);
    const [status, setStatus] = useState(user?.statusDriver);
    const prefixSelector = (
        <Form.Item name="prefix" noStyle>
            <Select
                style={{
                    width: 70,
                }}
            >
                <Option value="84">+84</Option>
            </Select>
        </Form.Item>
    );
    const convertBase64 = (file) => {
        return new Promise((resolve, reject) => {
            const fileReader = new FileReader();
            fileReader.readAsDataURL(file);

            fileReader.onload = () => {
                resolve(fileReader.result);
            };

            fileReader.onerror = (error) => {
                reject(error);
            };
        });
    };
    const uploadAvatar = async (e) => {
        const file = await e.target.files[0];
        const base64 = await convertBase64(file);
        await setAvatar(base64);
    };

    const onfinish1 = async(values) => {
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
            getUser(user.email, dispatch);
            toast.success("Thay đổi thông tin phương tiện thành công")
        } catch (error) {
            toast.error("Tạo phương tiện thất bại")
        }
    };
    const onFinish = (values) => {
        const image = {
            base64: avatar,
            createBy: user.email,
            fileName: "Avatar",
            year: '',
            month: ''
        }
        UploadFile(image, toast, dispatch);
        const object = {
            email: email,
            firstname: firstName,
            lastname: lastName,
            avatarBase64: '',
            phone: phone,
            address: address,
            country: 'vi',
            cityId: city,
        }
        console.log(object);
        editInforDriver(object, toast, dispatch);

    }
    const handleChangeFirstName = (e) => {
        setFirstName(e.target.value)
    }

    const handleChangeLastName = (e) => {
        setLastName(e.target.value)
    }

    const handleChangeEmail = (e) => {
        setEmail(e.target.value)
    }
    const handleChangePhone = (e) => {
        setPhone(e.target.value)
    }
    const handleChangeAddress = (e) => {
        setAddress(e.target.value)
    }
    const handleChangeCity = (e) => {
        // console.log(e.key);
        setCity(e.key)
    }
    const handleChangeCity1 = (e) => {
        // console.log(e.key);
        setCity1(e.key)
    }
    return (

        <div className='container-edit'>
            <h2>Hồ sơ</h2>
            <h3>Thông tin chung</h3>
            <div className='container-edit-info'>

                <Form
                    onFinish={onFinish}
                    initialValues={{
                        prefix: '+84'
                    }}
                    // style={{textAlign:"right"}}
                    labelCol={{
                        span: 8,
                    }}
                    wrapperCol={{
                        span: 18,
                    }}
                >
                    <Row>
                        <Col sm={16} md={8}>
                            <FormItem
                                name='name'
                                label="Tên "
                            // rules={[
                            //     {
                            //         required: true,
                            //         message: 'Tên không được để trống',
                            //     },
                            // ]}
                            >
                                <Input.Group>
                                    <Input value={firstName} onChange={handleChangeFirstName} style={{ width: "35%", marginRight: "5%" }} />
                                    <Input value={lastName} onChange={handleChangeLastName} style={{ width: "60%" }} />
                                </Input.Group>
                            </FormItem>

                            <FormItem
                                label="Email "
                                initialValue={email}
                                name='email'

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
                                <Input onChange={handleChangeEmail} defaultValue={email} disabled />
                            </FormItem>
                            <Form.Item
                                label="Số di động "
                                name='phone'
                                initialValue={phone}
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng nhập lại số điện thoại',
                                        pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                    },
                                ]}
                            >
                                <Input onChange={handleChangePhone}
                                    addonBefore={prefixSelector}
                                />
                            </Form.Item>


                        </Col>
                        <Col sm={16} md={8}  >

                            <FormItem
                                name="country"
                                label="Quốc gia "
                                initialValue={user.country}
                                labelCol={{
                                    span: 12,
                                }}
                            >
                                <Select
                                >
                                    <Option value="vi">Việt Nam</Option>
                                </Select>
                            </FormItem>
                            <Form.Item
                                name="city"
                                initialValue={city}
                                label="Thành phố"
                                labelCol={{
                                    span: 12,
                                }}
                            >
                                <Select
                                    onChange={handleChangeCity}
                                    labelInValue
                                    options={citys}
                                />
                            </Form.Item>
                            <Form.Item
                                labelCol={{
                                    span: 12,
                                }}
                                label="Trạng thái "
                            >
                                <Input value={status} disabled
                                />
                            </Form.Item>
                        </Col>
                        <Col sm={16} md={8}>
                            <div >
                                <Image
                                    id='avatarImage'
                                    src={avatar}
                                    className='avatar'
                                />


                                <div className='inputFile'>
                                    <input
                                        type="file"
                                        style={{ color: "#fff" }}
                                        onChange={(e) => {
                                            uploadAvatar(e);
                                        }}
                                    />
                                </div>
                            </div>
                        </Col>
                    </Row>


                    <Row style={{ marginTop: "10px" }}>

                        <Col sm={16} md={8}  >
                            <FormItem
                                wrapperCol={{
                                    span: 22,
                                }}
                            >
                                <Button className='btn' type="primary" htmlType="submit" style={{ float: "right" }}>
                                    <SaveOutlined /> Thay đổi thông tin
                                </Button>

                            </FormItem>
                        </Col>
                        <Col sm={16} md={8}  >
                            <div style={{ float: "left" }}>
                                <ModalRePassword />
                            </div>
                        </Col>

                    </Row>


                </Form>

            </div>
            <h3 style={{ float: "left", marginBottom: "20px" }}>Thông tin phương tiện</h3>
            <div className='form-add' >
                <div className='form-header' style={{ height: "30px" }}
                >
                </div>
                <div className='form-contents' >
                    <div >
                        <Form
                            onFinish={onfinish1}
                            labelCol={{
                                span: 8,
                            }}
                            wrapperCol={{
                                span: 12,
                            }}
                        >
                            <Row>
                                <Col sm={24} md={12} >
                                    {
                                        user?.vehicleRequest.typeId === 1 ? (
                                            <>
                                                <Form.Item
                                                    name="typeId"
                                                    initialValue={"1"}
                                                    label="Loại xe "
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
                                            </>
                                        ) : (
                                            <>
                                                <Form.Item
                                                    name="typeId"
                                                    initialValue={"2"}
                                                    label="Loại xe "
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
                                            </>
                                        )
                                    }

                                    <Form.Item
                                        name="producer"
                                        initialValue={user?.vehicleRequest.producer}
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
                                        initialValue={user?.vehicleRequest.produceYear}
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
                                    {/* <Form.Item
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
                                            <Option value="Đen">Đen</Option>
                                            <Option value="Trắng">Trắng</Option>
                                            <Option value="Đỏ">Đỏ</Option>
                                            <Option value="Xanh">Xanh</Option>
                                        </Select>
                                    </Form.Item> */}
                                    <Form.Item
                                        name="exteriorColor"
                                        initialValue={user?.vehicleRequest.exteriorColor}
                                        label="Màu sơn *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Đen">Đen</Option>
                                            <Option value="Trắng">Trắng</Option>
                                            <Option value="Đỏ">Đỏ</Option>
                                            <Option value="Xanh">Xanh</Option>
                                        </Select>
                                    </Form.Item>
                                </Col>
                                <Col sm={24} md={12} >
                                    <Form.Item
                                        name="plate"
                                        initialValue={user?.vehicleRequest.plate}
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
                                        initialValue={user?.vehicleRequest.plateCountry}
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
                                        name="city"
                                        initialValue={city1}
                                        label="Thành phố đăng ký"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui lòng chọn thành phố',
                                            },
                                        ]}
                                    >
                                        <Select
                                            onChange={handleChangeCity1}
                                            labelInValue
                                            options={citys}
                                        />
                                    </Form.Item>
                                    <Form.Item
                                    >
                                        <Button style={{ marginLeft: "50%" }} type="primary" htmlType="submit">
                                            Thay đổi thông tin phương tiện
                                        </Button>
                                    </Form.Item>

                                </Col>
                            </Row>



                        </Form>
                    </div>

                </div>
            </div>
        </div>

    )

}
export default InfoContactTaixe