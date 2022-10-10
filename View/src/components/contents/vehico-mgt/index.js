import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { FilterOutlined } from '@ant-design/icons';


const { Option } = Select;

const columns = [
    {
        title: 'Số',
        dataIndex: 'index',
    },
    {
        title: 'Thời gian bắt đầu',
        dataIndex: 'startDate',
    },
    {
        title: 'Từ',
        dataIndex: 'start',
    },
    {
        title: 'Đến',
        dataIndex: 'end',
    },
    {
        title: 'Cước (đ)',
        dataIndex: 'cuoc',
    },
    {
        title: 'Trạng thái',
        dataIndex: 'status',
    },
    {
        title: '',
        dataIndex: 'action',
    },
];
const data = [

];

const VehicoManagement = () => {

    return (
        <div className='container'>
            <div className='container-infos' style={{
                textAlign: "left",
                marginLeft: "20px"
            }}>
                <h2>TÀI XẾ</h2>
                <h3>Trạng thái</h3>
                <div className='driver-info'>

                    <Form
                        labelCol={{
                            span: 2,
                        }}
                        wrapperCol={{
                            span: 6,
                        }}
                    >

                        <FormItem
                            name="account"
                            label="Biển số"
                        >
                            <Input />
                        </FormItem>
                        <FormItem
                            name="status"
                            label="Trạng thái"

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
                            name="vehicoType"
                            label="Loại xe"

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
                        >
                            <Button className='btn' type="primary" htmlType="submit">
                                <FilterOutlined />  Lọc phương tiện
                            </Button>
                        </FormItem>


                    </Form>
                    <div
                        style={{ float: "right" }}
                    >
                        <p>*IRS: Giấy Đăng Kiểm</p>
                    </div>
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={data} size="middle" />
                </div>
                <div style={{marginTop:"40px"}}>
                    <Button className='btn' type="primary" >
                        + Thêm phương tiện
                    </Button>
                </div>
            </div>
        </div>
    )
}
export default VehicoManagement