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
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const [firstName, setFirstName] = useState(user.firstname);
    const [lastName, setLastName] = useState(user.lastname);
    const [email, setEmail] = useState(user.email);
    const [phone, setPhone] = useState(user.phone);
    const [address, setAddress] = useState(user.address);
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
        const file = await  e.target.files[0];
        const base64 = await convertBase64(file);        
        await setAvatar(base64);
    };


    const onFinish = (values) => {
        const image= {
            base64:avatar,
            createBy:user.email,
            fileName:"Avatar",
            year:'',
            month:''
        }
        UploadFile(image,toast,dispatch);

        const object = {
            email: email,
            firstName: firstName,
            lastName: lastName,
            avatarBase64: '',
            phone: phone,
            address: address,
            country: 'vi',
        }
        console.log(object);
        editInforPassenger(object, user.email, toast, dispatch);

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
                                rules={[
                                    {
                                        required: true,
                                        message: 'Tên không được để trống',
                                    },
                                ]}
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
                                        required: true,
                                        type: 'email',
                                        message: 'The input is not valid E-mail!',
                                    },
                                ]}
                            >
                                <Input onChange={handleChangeEmail} defaultValue={email} disabled/>
                            </FormItem>
                            <Form.Item
                                label="Số di động "
                                name='phone'
                                initialValue={phone}
                                rules={[
                                    {
                                        required: true,
                                        message: 'Please input your phone number!',
                                        pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                    },
                                ]}
                            >
                                <Input onChange={handleChangePhone}
                                    addonBefore={prefixSelector}
                                />
                            </Form.Item>
                            <Form.Item
                                label="Địa chỉ "
                            >
                                <Input value={address} onChange={handleChangeAddress}
                                />
                            </Form.Item>
                            {/* <FormItem
                                label="Mã bưu điện *"
                            >
                                <Input />
                            </FormItem> */}

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
                                <Button className='btn' type="primary" htmlType="submit" style={{float:"right"}}>
                                    <SaveOutlined /> Lưu
                                </Button>

                            </FormItem>
                        </Col>
                        <Col sm={16} md={8}  >
                            <div style={{float:"left"}}>
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