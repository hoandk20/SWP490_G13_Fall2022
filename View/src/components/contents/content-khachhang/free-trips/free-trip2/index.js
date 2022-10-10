import { Col, DatePicker, Form, Input, Row, Select, TimePicker, Button } from 'antd';
import React from 'react';

const { Option } = Select;

const FreeTripPassenger2 = () => {
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>CHUYẾN ĐI MIỄN PHÍ</h2>
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={16} md={8}>
                            <Form
                            >
                                <Form.Item>
                                    <Input placeholder='Từ' />
                                </Form.Item>
                                <Form.Item>
                                    <Input placeholder='Đến' />
                                </Form.Item>
                                <Form.Item
                                    label="Đăng ký"
                                >
                                    <Select
                                        style={{ width: "100px" }}
                                    >
                                        <Option>1 chỗ</Option>
                                        <Option>2 chỗ</Option>
                                        <Option>3 chỗ</Option>
                                        <Option>4 chỗ</Option>
                                    </Select>
                                </Form.Item>
                                <Form.Item
                                    label="Ngày xuất phát"
                                >
                                    <DatePicker />
                                </Form.Item>
                                <Form.Item
                                    label="Giờ"
                                    style={{ display: "inline-block" }}
                                >
                                    <TimePicker /> ±
                                </Form.Item>
                                <Form.Item
                                    style={{ display: "inline-block", width: "60px" }}
                                >
                                    <Input />
                                </Form.Item>
                                <Form.Item>
                                    <Button className='btn-submit' type="primary" htmlType="submit">
                                        Tìm kiếm
                                    </Button>
                                </Form.Item>
                            </Form>
                        </Col>
                    </Row>
                </div>
            </div>
        </div>
    )
}
export default FreeTripPassenger2