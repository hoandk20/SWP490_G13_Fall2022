import {
    Col,
    Form,
    Input,
    Row,
    Select,
    Checkbox,
    Button,
} from 'antd';
import React, { useState } from 'react';
import FormItem from 'antd/es/form/FormItem';
import './driver-mgt-info.css'
import UploadImage from '../../../../commons/uploadAvatar';


const { Option } = Select;

const prefixSelector = (
    <Form.Item name="prefix" noStyle>
        <Select
            style={{
                width: 80,
            }}
        >
            <Option value="84">+84</Option>
        </Select>
    </Form.Item>
);

const DriverManagementInfo = () => {
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>THÔNG TIN TÀI XẾ</h2>
                <div className='Table-info'>
                    <Row>
                        <Col sm={24} md={16}>
                            <div className='info-left'>
                                <div className='info-left-header'>
                                    Thông tin cá nhân
                                </div>
                                <Form
                                    labelCol={{
                                        span: 4,
                                    }}
                                    wrapperCol={{
                                        span: 16,
                                    }}
                                    initialValues={{
                                        prefix: '+84'
                                    }}
                                >
                                    <div className='info-left-form'>

                                        <div className='form1'>
                                            <FormItem
                                                name="lastName"
                                                label="Tên *"
                                            >
                                                <Input />
                                            </FormItem>
                                            <FormItem
                                                name="firstName"
                                                label="Họ và tên đệm *"
                                            >
                                                <Input />
                                            </FormItem>
                                            <FormItem
                                                name="email"
                                                label="Email *"
                                            >
                                                <Input />
                                            </FormItem>
                                            <FormItem
                                                name="country"
                                                label="Quốc gia"
                                            >
                                                <Select
                                                    allowClear
                                                >
                                                    <Option value="Việt Nam"></Option>
                                                    <Option value="Lào"></Option>
                                                </Select>
                                            </FormItem>
                                            <Form.Item
                                                name="phone"
                                                label="Số di động"
                                            // rules={[
                                            //     {
                                            //         required: true,
                                            //         message: 'Please input your phone number!',
                                            //     },
                                            // ]}
                                            >
                                                <Input
                                                    addonBefore={prefixSelector}
                                                />
                                            </Form.Item>
                                        </div>
                                        <div className='form2'>
                                            <FormItem
                                                name="account"
                                                label="Tài khoản *"
                                            >
                                                <Input />
                                            </FormItem>
                                            <Form.Item
                                                name="password"
                                                label="Mật khẩu *"
                                                rules={[
                                                    {
                                                        required: true,
                                                        message: 'Please input your password!',
                                                    },
                                                ]}
                                                hasFeedback
                                            >
                                                <Input.Password placeholder='*Mật khẩu: có tối thiểu 6 ký tự' />
                                            </Form.Item>

                                            <Form.Item
                                                name="confirm"
                                                label="Xác nhận mật khẩu"
                                                dependencies={['password']}
                                                hasFeedback
                                                rules={[
                                                    {
                                                        required: true,
                                                        message: 'Please confirm your password!',
                                                    },
                                                    ({ getFieldValue }) => ({
                                                        validator(_, value) {
                                                            if (!value || getFieldValue('password') === value) {
                                                                return Promise.resolve();
                                                            }

                                                            return Promise.reject(new Error('The two passwords that you entered do not match!'));
                                                        },
                                                    }),
                                                ]}
                                            >
                                                <Input.Password placeholder='*Nhập lại mật khẩu' />
                                            </Form.Item>
                                        </div>


                                    </div>
                                    <div className='form3'>
                                        <Form.Item
                                            name="remember"
                                            valuePropName="checked"
                                        // wrapperCol={{
                                        //     offset: 8,
                                        //     span: 16,
                                        // }}
                                        >
                                            <Checkbox>Bằng việc đăng ký, Bạn đồng ý với Bảo Mật và hiểu rằng T.NET là một công cụ yêu cầu xe, không phải là nhà vận chuyển.</Checkbox>
                                        </Form.Item>
                                        <Form.Item
                                            style={{
                                                display: 'inline-block',
                                                // width: '50%',

                                            }}
                                        >
                                            <Button  type="primary" htmlType="submit">
                                                Danh sách tài xế
                                            </Button>
                                        </Form.Item>
                                        <Form.Item
                                            style={{
                                                display: 'inline-block',
                                                marginLeft:"50px",

                                            }}
                                        >
                                            <Button  type="primary" htmlType="submit">
                                                Gửi
                                            </Button>
                                        </Form.Item>
                                    </div>
                                </Form>
                            </div>

                        </Col>
                        <Col sm={24} md={12}>
                            <div className='info-right'>
                                {/* <UploadImage/> */}
                            </div>
                        </Col>
                    </Row>
                </div>
            </div>
        </div>
    )
}
export default DriverManagementInfo