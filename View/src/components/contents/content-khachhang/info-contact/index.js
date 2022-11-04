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
import { editInforPassenger, getUser } from '../../../../redux/apiRequest';
import { useState } from 'react';
import { toast } from 'react-toastify';
import jwtDecode from 'jwt-decode';
import { useEffect } from 'react';
const { Option } = Select;


const InfoContactUsers = () => {
    
    
    const currentUser = useSelector((state)=>state.auth.login?.currentUser);
    const decodedTocken=jwtDecode(currentUser.access_token);
    const username=decodedTocken.sub;
    const dispatch = useDispatch();
    const [user,setUser]= useState(useSelector((state) => state.user.userInfo.currentUser));
    const [firstName,setFirstName]= useState(user.firstname);
    const [lastName,setLastName]= useState(user.lastname);
    const [email,setEmail]= useState(user.email);
    const [phone,setPhone]= useState(user.phone);
    const [address,setAddress]= useState(user.address);
    useEffect(()=>{
        getUser(username,dispatch);     
      },[user])
      
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
    
    const onFinish = (values) =>{
        const object ={
            email:email,
            firstName:firstName,
            lastName:lastName,
            avatarBase64:'',
            phone:phone,
            address:address,
            country:'vi',
        }
        console.log(object);
        editInforPassenger(object,toast);
        setUser([]);
    }
    const handleChangeFirstName = (e) =>{
        setFirstName(e.target.value)
    }

    const handleChangeLastName = (e) =>{
        setLastName(e.target.value)
    }
    
    const handleChangeEmail = (e) =>{
        setEmail(e.target.value)
    }
    const handleChangePhone = (e) =>{
        setPhone(e.target.value)
    }
    const handleChangeAddress = (e) =>{
        setAddress(e.target.value)
    }
    return (
        
        <div className='container'>
            <h2>Hồ sơ</h2>
            <div className='container-infos'>
                <h3>Thông tin chung</h3>
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
                                label="Tên *"
                            >
                                <Input.Group>
                                    <Input value={firstName} onChange={handleChangeFirstName}  style={{ width: "35%", marginRight: "5%" }} />
                                    <Input value={lastName} onChange={handleChangeLastName} style={{ width: "60%" }} />
                                </Input.Group>
                            </FormItem>

                            <FormItem
                                label="Email *"
                                name='email'
                                initialValue={email}
                                rules={[
                                    {
                                        required:true,
                                        type: 'email',
                                        message: 'The input is not valid E-mail!',
                                    },
                                ]}
                            >
                                <Input onChange={handleChangeEmail} defaultValue={email}/>
                            </FormItem>
                            <Form.Item
                                label="Số di động *"
                                name='phone'
                                initialValue={phone}
                                rules={[
                                    {
                                        required:true,
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
                                label="Địa chỉ *"
                            >
                                <Input value={address} onChange={handleChangeAddress}
                                />
                            </Form.Item>
                            <FormItem
                                label="Mã bưu điện *"
                            >
                                <Input />
                            </FormItem>
                            <FormItem style={{ float: "right", }}>
                                <Button className='btn' type="primary" htmlType="submit" style={{ float: "right", }}>
                                    <SaveOutlined /> Lưu
                                </Button>
                                <ModalRePassword/>
                            </FormItem>
                        </Col>
                        <Col sm={16} md={8}  >

                            <FormItem
                                name="country"
                                label="Quốc gia *"
                                labelCol={{
                                    span: 12,
                                }}
                            >
                                <Select

                                    defaultValue={user.country}
                                >
                                    <Option value="vi">Việt Nam</Option>
                                </Select>
                            </FormItem>
                        </Col>
                        <Col sm={16} md={8}>
                            <div style={{position: 'absolute',right: '50px'}}>
                                <Image 
                                    id='avatarImage'
                                    width={148}
                                    src={user.avatarBase64}
                                />
                                <br/>
                                <Upload><Button icon={<UploadOutlined />}>Click to Upload</Button></Upload>
                            </div>
                        </Col>
                    </Row>
                </Form>
                <div>
                    <h3>Địa chỉ thường dùng</h3>
                </div>
            </div>
        </div>
        
    )
    
}
export default InfoContactUsers