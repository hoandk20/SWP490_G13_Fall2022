import {
    Button,
    Checkbox,
    Upload,
    Col,
    Form,
    Input,
    Image,
    Row,
    Select,
} from 'antd';
import './infor.css';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { SaveOutlined, UploadOutlined } from '@ant-design/icons';
import { useDispatch, useSelector } from 'react-redux';
import ModalRePassword from '../../../commons/modals/modal-re-password';
import { editInforPassenger, getUser, UploadFile } from '../../../../redux/apiRequest';
import { useState } from 'react';
import { toast } from 'react-toastify';
import jwtDecode from 'jwt-decode';
import { useEffect } from 'react';
const { Option } = Select;


const InfoContactUsers = () => {


    // const currentUser = useSelector((state) => state.auth.login?.currentUser);
    // const decodedTocken = jwtDecode(currentUser.access_token);
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [firstName, setFirstName] = useState(user.firstname);
    const [lastName, setLastName] = useState(user.lastname);
    const [email, setEmail] = useState(user.email);
    const [phone, setPhone] = useState(user.phone);
    const [address, setAddress] = useState(user.address);
    const [city, setCity] = useState(user.cityId);
    const [avatar, setAvatar] = useState(user.avatarBase64);
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
            firstName: firstName,
            lastName: lastName,
            avatarBase64: '',
            phone: phone,
            address: address,
            country: 'vi',
            cityId: city,
        }
        editInforPassenger(object, toast, dispatch);

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
        setCity(e.key)
    }
    return (

        <div className='container-edit'>
            <h2>H??? s??</h2>
            <h3>Th??ng tin chung</h3>
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
                            {/* <FormItem
                                name='name'
                                label="T??n "
                                // rules={[
                                //     {
                                //         required: true,
                                //         message: 'T??n kh??ng ???????c ????? tr???ng',
                                //     },
                                // ]}
                            >
                                <Input.Group>
                                    <Input value={firstName} onChange={handleChangeFirstName} style={{ width: "35%", marginRight: "5%" }} />
                                    <Input value={lastName} onChange={handleChangeLastName} style={{ width: "60%" }} />
                                </Input.Group>
                            </FormItem> */}
                            <Form.Item
                                style={{
                                    display: 'inline-block',
                                    width: '50%',

                                }}
                                labelCol={{
                                    span: 16,
                                }}
                                name="fn"
                                initialValue={firstName}
                                label="T??n"
                                rules={[
                                    {
                                        required: true,
                                        message: 'T??n kh??ng ???????c ????? tr???ng',
                                    },
                                ]}
                            >
                                <Input onChange={handleChangeFirstName} />
                            </Form.Item>
                            <Form.Item
                                initialValue={lastName}
                                style={{
                                    display: 'inline-block',
                                    width: '50%',
                                }}
                                name="ln"
                                rules={[
                                    {
                                        required: true,
                                        message: 'T??n kh??ng ???????c ????? tr???ng',
                                    },
                                ]}
                            >
                                <Input onChange={handleChangeLastName} />
                            </Form.Item>
                            <FormItem
                                label="Email "
                                initialValue={email}
                                name='email'

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
                            </FormItem>
                            <Form.Item
                                label="S??? di ?????ng "
                                name='phone'
                                initialValue={phone}
                                rules={[
                                    {
                                        required: true,
                                        message: 'S??? ??i???n tho???i kh??ng ???????c ????? tr???ng',
                                    },
                                    {

                                        message: 'S??? ??i???n tho???i kh??ng h???p l???',
                                        pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                    },
                                ]}
                            >
                                <Input onChange={handleChangePhone}
                                    addonBefore={prefixSelector}
                                />
                            </Form.Item>
                            <Form.Item
                                label="?????a ch??? "
                            >
                                <Input value={address} onChange={handleChangeAddress}
                                />
                            </Form.Item>
                            {/* <FormItem
                                label="M?? b??u ??i???n *"
                            >
                                <Input />
                            </FormItem> */}

                        </Col>
                        <Col sm={16} md={8}  >

                            <FormItem
                                name="country"
                                label="Qu???c gia "
                                initialValue={user.country}
                                labelCol={{
                                    span: 12,
                                }}
                            >
                                <Select
                                >
                                    <Option value="vi">Vi???t Nam</Option>
                                </Select>
                            </FormItem>
                            <Form.Item
                                name="city"
                                initialValue={city}
                                label="Th??nh ph???"
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
                        </Col>
                        <Col sm={16} md={8}>
                            <div >
                                <Image
                                    id='avatarImage'
                                    src={avatar}
                                    className='avatar'
                                />

                                {/* <Upload><Button icon={<UploadOutlined />}>Click to Upload</Button></Upload> */}
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
                    <Row>
                        <Col sm={16} md={8}  >
                            <FormItem
                                wrapperCol={{
                                    span: 22,
                                }}
                            >
                                <Button className='btn' type="primary" htmlType="submit" style={{ float: "right" }}>
                                    <SaveOutlined /> Thay ?????i th??ng tin
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
        </div>

    )

}
export default InfoContactUsers