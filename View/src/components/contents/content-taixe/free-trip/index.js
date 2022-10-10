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

const FreeTripDriver = () => {

    return (
        <div className='container'>
            <div className='container-infos' style={{
                textAlign:"left",
                marginLeft:"20px"
            }}>
                <h2>TÀI XẾ</h2>
                <h3>Trạng thái</h3>
                <div className='driver-info'>

                    <Form
                        labelCol={{
                            span: 2,
                        }}
                        wrapperCol={{
                            span: 9,
                        }}
                    >

                        <FormItem
                            name="trangthai"
                            label="Trạng thái"

                        >
                            <Select
                                allowClear
                                style={{ width: "60%" }}
                            >
                                <Option value="Tất cả"></Option>
                                <Option value="Chờ xem xét"></Option>
                                <Option value="Mới"></Option>
                                <Option value="Hoạt động"></Option>
                            </Select>
                        </FormItem>
                        <FormItem
                            name="taikhoan"
                            label="Tài khoản"
                        >
                            <Input />
                        </FormItem>
                        <Row>
                            <Col sm={12} md={6} >
                                <FormItem
                                    label="Từ ngày"
                                    labelCol={{
                                        span: 8,
                                    }}
                                >
                                    <DatePicker />
                                </FormItem>
                            </Col>
                            <Col sm={12} md={6} >
                                <FormItem
                                    label="Đến ngày"
                                    labelCol={{
                                        span: 6,
                                    }}
                                >
                                    <DatePicker />
                                </FormItem>
                            </Col>
                        </Row>



                        <FormItem
                            style={{
                                display: 'inline-block',
                       

                            }}
                        >
                            <Button className='btn' type="primary" htmlType="submit">
                                <FilterOutlined />  Lọc tài xế
                            </Button>
                        </FormItem>
                        <FormItem
                            style={{
                                display: 'inline-block',
                                float:"right",
                            }}
                        >
                            <Button className='btn' type="primary" htmlType="submit">
                                 Bắt đầu
                            </Button>
                        </FormItem>


                    </Form>
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={data} size="middle" />
                </div>
            </div>
        </div>
    )
}
export default FreeTripDriver