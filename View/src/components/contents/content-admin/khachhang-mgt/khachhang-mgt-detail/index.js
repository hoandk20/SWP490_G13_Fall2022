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
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { SaveOutlined, UploadOutlined } from '@ant-design/icons';
import { useDispatch, useSelector } from 'react-redux';
// import { editInforPassenger, getUser, UploadFile } from '../../../../redux/apiRequest';
import { useState } from 'react';
import { toast } from 'react-toastify';
import jwtDecode from 'jwt-decode';
import { useEffect } from 'react';
import { editInforPassengerAdmin } from '../../../../../redux/apiRequest';
const { Option } = Select;


const PassengerDetailAdmin = () => {


    // const currentUser = useSelector((state) => state.auth.login?.currentUser);
    // const decodedTocken = jwtDecode(currentUser.access_token);
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const dispatch = useDispatch();

    const passenger = useSelector((state) => state.user.passenger?.info);
    console.log(passenger);
    const [firstName, setFirstName] = useState(passenger.firstName);
    const [lastName, setLastName] = useState(passenger.lassName);
    const [email, setEmail] = useState(passenger.email);
    const [phone, setPhone] = useState(passenger.phone);
    const [address, setAddress] = useState(passenger.address);
    const [city, setCity] = useState(passenger.cityId);
    const [avatar, setAvatar] = useState(passenger.avatarBase64);
    console.log("ln",lastName);
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
        // const image= {
        //     base64:avatar,
        //     createBy:user.email,
        //     fileName:"Avatar",
        //     year:'',
        //     month:''
        // }
        // UploadFile(image,toast,dispatch);
        //
        const object = {
            email: email,
            firstName: firstName,
            lastName: lastName,
            phone: phone,
            address: address,
            cityId:city,
        }
        console.log(object);
        editInforPassengerAdmin(object, toast, dispatch);

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
                        span: 7,
                    }}
                    wrapperCol={{
                        span: 18,
                    }}
                >
                    <Row>
                        <Col sm={16} md={8}>
                            {/* <FormItem
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
                            </FormItem> */}
                                    <Form.Item
                                        style={{
                                            display: 'inline-block',
                                            width: '50%',

                                        }}
                                        labelCol={{
                                            span: 14,
                                        }}
                                        name="fn"
                                        initialValue={firstName}
                                        label="Tên"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Tên không được để trống',
                                            }, 
                                        ]}
                                    >
                                        <Input  onChange={handleChangeFirstName}  />
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
                                                message: 'Tên không được để trống',
                                            },
                                        ]}
                                    >
                                        <Input  onChange={handleChangeLastName} />
                                    </Form.Item>
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
                                <Input disabled/>
                            </FormItem>
                            <Form.Item
                                label="Số di động "
                                name='phone'
                                initialValue={phone}
                                rules={[
                                    {
                                        required: true,
                                        message: 'Số điện thoại không được để trống',
                                    },
                                    {

                                        message: 'Số điện thoại không hợp lệ',
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
                                initialValue={"vi"}
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
                        </Col>
                        <Col sm={16} md={8}>
                            <div >
                                <Image
                                    id='avatarImage'
                                    src={avatar}
                                    className='avatar'
                                />

                                {/* <Upload><Button icon={<UploadOutlined />}>Click to Upload</Button></Upload> */}
                                {/* <div className='inputFile'>
                                    <input
                                        type="file"
                                        style={{ color: "#fff" }}
                                        onChange={(e) => {
                                            uploadAvatar(e);
                                        }}
                                    />
                                </div> */}
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
                                    <SaveOutlined /> Thay đổi thông tin
                                </Button>

                            </FormItem>
                        </Col>

                    </Row>


                </Form>

            </div>
        </div>

    )

}
export default PassengerDetailAdmin