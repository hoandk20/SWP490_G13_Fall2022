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
import { useSelector } from 'react-redux';
const { Option } = Select;


const InfoContactUsers = () => {
    
    const user = useSelector((state) => state.user.userInfo.currentUser)
    console.log(user)
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
    return (
        
        <div className='container'>
            <h2>Hồ sơ</h2>
            <div className='container-infos'>
                <h3>Thông tin chung</h3>
                <Form
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
                                label="Tên *"
                            >
                                <Input.Group >
                                    <Input defaultValue={user.firstname} style={{ width: "35%", marginRight: "5%" }} />
                                    <Input defaultValue={user.lastname} style={{ width: "60%" }} />
                                </Input.Group>
                            </FormItem>

                            <FormItem
                                label="Email *"
                            >
                                <Input defaultValue={user.email} />
                            </FormItem>
                            <Form.Item
                                name="phone"
                                label="Số di động *"
                            >
                                <Input defaultValue={user.phone}
                                    addonBefore={prefixSelector}
                                />
                            </Form.Item>
                            <FormItem
                                label="Mã bưu điện *"
                            >
                                <Input />
                            </FormItem>
                            <FormItem
                                style={{ float: "right", }}
                            >
                                <Button className='btn' type="primary" htmlType="submit">
                                    <SaveOutlined /> Lưu
                                </Button>
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