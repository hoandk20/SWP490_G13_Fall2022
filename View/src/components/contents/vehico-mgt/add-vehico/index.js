import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { RollbackOutlined ,SaveOutlined} from '@ant-design/icons';
import './add-vehico.css'


const { Option } = Select;


const AddVehico = () => {

    return (
        <div className='container'>
            <div className='container-infos' style={{
                textAlign: "left",

            }}>
                <h2>Thêm loại phương tiện</h2>
                <h3>Trợ giúp</h3>
                <div className='driver-sp' style={{ marginLeft: "30px" }}>
                    <p>
                        Thêm phương tiện ở đây và vào trang Thông Tin Phương Tiện để gửi tài liệu cho phương tiện. Bạn cần mang xe đến để T.NET kiểm tra
                        trước khi bắt đầu lái xe. Nếu phương tiện không có trong danh mục, vui lòng gửi email cho chúng tôi. Thông tin liên hệ ở phía menu bên trái.
                    </p>
                    <br />
                    <p>
                        Vui lòng chỉ thêm các phương tiện bạn sở hữu và có tất cả cả các tài liệu đầy đủ cho các phương tiện đó.
                    </p>
                    <br />
                    <p>
                        • Giấy Chứng Nhận Bảo Hiểm
                    </p>
                    <br />
                    <p>• Giấy Chứng Nhận Đăng Kiểm</p>
                </div>
                <div className='form-add' >
                    <div className='form-header'
                    >
                        Thông tin phương tiện
                    </div>
                    <div className='form-contents'>
                        <Form
                            labelCol={{
                                span: 8,
                            }}
                            wrapperCol={{
                                span: 12,
                            }}
                        >
                            <Row>
                                <Col sm={24} md={12} >
                                    <FormItem
                                        name="status"
                                        label="Nhà sản xuất *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="Đã gửi lại tài liệu"></Option>
                                            <Option value="Hoạt động"></Option>
                                            <Option value="Đã gửi tài liệu"></Option>
                                            <Option value="Không hoạt động"></Option>
                                            <Option value="Đang chờ xem xét"></Option>
                                            <Option value="Chưa gửi tài liệu"></Option>
                                        </Select>
                                    </FormItem>
                                    <FormItem
                                        name="year"
                                        label="Năm sản xuất *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="A3"></Option>
                                            <Option value="A6"></Option>
                                            <Option value="FF"></Option>
                                        </Select>
                                    </FormItem>
                                    <FormItem
                                        name="color"
                                        label="Màu nội thất *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="A3"></Option>
                                            <Option value="A6"></Option>
                                            <Option value="FF"></Option>
                                        </Select>
                                    </FormItem>
                                    <FormItem
                                        name="vehicoType"
                                        label="Màu sơn *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="A3"></Option>
                                            <Option value="A6"></Option>
                                            <Option value="FF"></Option>
                                        </Select>
                                    </FormItem>
                                </Col>
                                <Col sm={24} md={12} >
                                    <FormItem
                                        name="licensePlate"
                                        label="Biển số *"
                                    >
                                        <Input />
                                    </FormItem>

                                    <FormItem
                                        name="vehicoType"
                                        label="Quốc gia đăng ký *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="A3"></Option>
                                            <Option value="A6"></Option>
                                            <Option value="FF"></Option>
                                        </Select>
                                    </FormItem>
                                    <FormItem
                                        name="vehicoType"
                                        label="Tỉnh thành đăng ký *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="A3"></Option>
                                            <Option value="A6"></Option>
                                            <Option value="FF"></Option>
                                        </Select>
                                    </FormItem>
                                    <FormItem
                                        name="vehicoType"
                                        label="Loại xe *"

                                    >
                                        <Select
                                            allowClear
                                        >
                                            <Option value="Tất cả"></Option>
                                            <Option value="A3"></Option>
                                            <Option value="A6"></Option>
                                            <Option value="FF"></Option>
                                        </Select>
                                    </FormItem>

                                </Col>
                            </Row>
                            <div>
                                
                            <FormItem
                                style={{
                                    display: "inline-block",
                                    marginLeft:"50px",
                                    marginTop:"30px"
                                }}
                            >
                                <Button className='btn' type="primary" htmlType="submit">
                                <RollbackOutlined />  Danh sách phương tiện
                                </Button>
                            </FormItem>
                            <FormItem
                                style={{ display: "inline-block",marginLeft:"50px", marginTop:"30px" }}
                            >
                                <Button className='btn' type="primary" htmlType="submit">
                                <SaveOutlined /> Lưu
                                </Button>
                            </FormItem>

                                </div>    
                        </Form>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default AddVehico