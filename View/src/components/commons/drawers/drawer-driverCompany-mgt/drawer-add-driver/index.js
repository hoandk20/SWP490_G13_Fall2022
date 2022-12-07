import { PlusOutlined } from '@ant-design/icons';
import { Button, Col, DatePicker, Drawer, Form, Input, Row, Select, Space } from 'antd';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { AddDriverByCompany, getDriversForCompany } from '../../../../../redux/apiRequest';
import ModalUploadDocument from '../../../modals/modal-upload-document';
const { Option } = Select;
const AddDriverForCompany = () => {
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys=allCity?.map((row)=> ({value:row.id.cityID,label:row.cityName}));

    const [open, setOpen] = useState(false);
    const [city, setCity] = useState("");
    const [form] = Form.useForm();

    const showDrawer = () => {
        setOpen(true);
    };
    const onClose = () => {
        setOpen(false);
    };
    const handleChange = (a) => {
        setCity(a.value);
      };
    const onfinish = (values) => {
        console.log(values);
        const driver = {
            ...values,
            companyEmail: user.email,
            city:city
        }
        AddDriverByCompany(driver, toast, dispatch);
        // getDriversForCompany(user.email,dispatch);
        setOpen(false);
    };


    return (
        <>
            <Button type="primary" onClick={showDrawer} icon={<PlusOutlined />}>
                Tạo tài xế
            </Button>
            <Drawer
                title="Tạo tài xế"
                width={720}
                onClose={onClose}
                open={open}
                bodyStyle={{
                    paddingBottom: 80,
                }}
            >
                <Form onFinish={onfinish} layout="vertical" hideRequiredMark name="basic" form={form}>
                    <Row gutter={16}>
                        <Col span={24}>
                            <Form.Item
                                name="email"
                                label="Tài khoản Email"
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
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={12}>

                            <Form.Item
                                name="password"
                                label="Mật khẩu"
                                rules={[
                                    {
                                        min: 6,
                                        max: 32,
                                        message: 'Mật khẩu phải lớn hơn 6 ký tự'
                                    },
                                    {
                                        required: true,
                                        message: 'Mật khẩu không được để trống',
                                    }
                                ]}
                                hasFeedback
                            >
                                <Input.Password placeholder='*Mật khẩu: có tối thiểu 6 ký tự' />
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item
                                name="confirm"
                                label="Nhập lại mật khẩu"
                                dependencies={['password']}
                                hasFeedback
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng xác nhận lại mật khẩu',
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
                                <Input.Password />
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="firstName"
                                label="Họ và tên đệm"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Tên không được để trống',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>

                        <Col span={12}>
                            <Form.Item
                                name="lastName"
                                label="Tên"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Tên không được để trống',
                                    },
                                ]}
                            >
                                <Input />
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={12}>
                            <Form.Item
                                name="phoneNumber"
                                label="Số điện thoại"
                                rules={[
                                    {
                                        message: 'Số điện thoại không hợp lệ',
                                        pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                    },
                                    {
                                        required: true,
                                        message: 'Số điện thoại không được để trống',
                                    },
                                ]}

                            >
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={24}>
                            <Form.Item
                                name="country"
                                label="Quốc gia"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn quốc gia',
                                    },
                                ]}
                            >
                                <Select>
                                    <Option value="vi">Việt Nam</Option>
                                </Select>
                            </Form.Item>
                        </Col>
                    </Row>
                    <Row gutter={16}>
                        <Col span={24}>
                            <Form.Item
                                name="citys"
                                label="Thành phố"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn thành phố',
                                    },
                                ]}
                            >
                                <Select
                                    labelInValue
                                    // defaultValue={{
                                    //     value: 'lucy',
                                    //     label: 'Lucy (101)',
                                    // }}
                                    // style={{
                                    //     width: 120,
                                    // }}
                                    onChange={handleChange}
                                    options={citys}
                                />
                            </Form.Item>
                            {/* <Form.Item>
                                <ModalUploadDocument />
                            </Form.Item> */}
                            <Form.Item>
                                <Button className='btn-register' type="primary" htmlType="submit">
                                    Tạo tài xế
                                </Button>
                            </Form.Item>
                        </Col>
                    </Row>
                </Form>
            </Drawer>
        </>
    );
};
export default AddDriverForCompany;