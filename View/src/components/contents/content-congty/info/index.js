import React from 'react';
import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space, Image, Avatar, } from 'antd';
import { useDispatch, useSelector } from 'react-redux';
import ModalRePassword from '../../../commons/modals/modal-re-password';
import { useEffect } from 'react';
import { EditCompany, getUser } from '../../../../redux/apiRequest';
import { toast } from 'react-toastify';


const { Option } = Select;
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
const InfoCompany = () => {
    const dispatch =useDispatch();
    const companys = useSelector((state) => state.user.userInfo?.currentUser);
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    console.log("company", companys);

    const onfinish = (values) => {
        const object ={
            ...values,
            companyId:companys.companyId
        }
        console.log(object);
        EditCompany(object,dispatch,toast)
    }

    return (
        <>
            <Form onFinish={onfinish} layout="vertical" hideRequiredMark name="basic"
                labelCol={{
                    span: 8,
                }}
                wrapperCol={{
                    span: 18,
                }}
                initialValues={{
                    prefix: '+84'
                }}
            >
                <p>Thông tin công ty</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="companyName"
                            initialValue={companys.firstname}
                            label="Tên công ty"
                        >
                            <Input disabled />
                        </Form.Item>
                        <Form.Item
                            name="email"
                            initialValue={companys.email}
                            label="Email"
                        >
                            <Input disabled />
                        </Form.Item>

                        <Form.Item
                            name="status"
                            initialValue={companys.status}
                            label="Trạng thái"
                        >
                            <Input disabled />
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                        <Form.Item
                            name="companyAddress"
                            initialValue={companys.address}
                            label="Địa chỉ"
                            rules={[
                                {
                                    required: true,
                                    message: 'Địa chỉ không được để trống',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name="phone"
                            initialValue={companys.phone}
                            label="Số điện thoại"
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
                            <Input addonBefore={prefixSelector} />
                        </Form.Item>
                        <Form.Item
                                name="city"
                                // initialValue={companys.cityId}
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
                                    options={citys}
                                />
                            </Form.Item>

                    </Col>
                    <Col span={8}>
                        <div >
                            <Image
                                id='avatarImage'
                                src={companys.avatarBase64}
                                className='avatar'
                            />
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

                <div style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={16} md={8}  >
                            <div style={{ float: "right" ,marginRight:"50px"}}>
                                <Button type="primary" htmlType="submit">Thay đổi thông tin</Button>
                            </div>


                        </Col>
                        <Col sm={16} md={8}  >
                            <ModalRePassword />


                        </Col>
                    </Row>
                </div>

            </Form>
        </>
    )
}
export default InfoCompany