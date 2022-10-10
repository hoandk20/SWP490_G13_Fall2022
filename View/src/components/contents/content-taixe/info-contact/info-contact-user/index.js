import {
    Button,
    Checkbox,
    Col,
    Form,
    Input,
    Row,
    Select,
} from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { SaveOutlined } from '@ant-design/icons';
const { Option } = Select;

const InfoContactUsers = () => {
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
                                    <Input style={{ width: "35%", marginRight: "5%" }} />
                                    <Input style={{ width: "60%" }} />
                                </Input.Group>
                            </FormItem>

                            <FormItem
                                label="Email *"
                            >
                                <Input />
                            </FormItem>
                            <Form.Item
                                name="phone"
                                label="Số di động *"
                            >
                                <Input
                                    addonBefore={prefixSelector}
                                />
                            </Form.Item>
                            <FormItem
                                label="Mã bưu điện *"
                            >
                                <Input />
                            </FormItem>
                            <FormItem
                                style={{float:"right", }}
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
                                    allowClear
                                >
                                    <Option value="Tất cả"></Option>
                                    <Option value="Việt Nam"></Option>
                                </Select>
                            </FormItem>
                        </Col>
                        <Col sm={16} md={8}>
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