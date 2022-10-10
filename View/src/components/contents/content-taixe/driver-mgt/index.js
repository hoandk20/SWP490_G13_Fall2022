import { Button, Checkbox, Form, Input, Row, Col, Select, Table } from 'antd';
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
        title: 'Tài khoản',
        dataIndex: 'account',
    },
    {
        title: 'Tên đầy đủ',
        dataIndex: 'name',
    },
    {
        title: 'Email',
        dataIndex: 'email',
    },
    {
        title: 'Số di động',
        dataIndex: 'phoneNumber',
    },
    {
        title: 'Phương tiện',
        dataIndex: 'vehico',
      },
      {
        title: 'Trạng thái',
        dataIndex: 'status',
      },
      {
        title: 'View detail',
        dataIndex: 'view',
      },
];
const data = [

];

const DriverManagement = () => {

    return (
        <div className='container'>
            <div className='container-infos'>
                <h2>TÀI XẾ</h2>
                <h3>Trạng thái</h3>
                <div className='driver-info'>

                    <Form
                        labelCol={{
                            span: 4,
                        }}
                        wrapperCol={{
                            span: 16,
                        }}
                    >
                        <Row>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="trangthai"
                                    label="Trạng thái"

                                >
                                    <Select
                                        allowClear
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
                                <FormItem
                                    name="ten"
                                    label="Tên   "
                                >
                                    <Input />
                                </FormItem>
                            </Col>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="vitri"
                                    label="Vị trí"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="Tất cả"></Option>
                                        <Option value="Chờ xem xét"></Option>
                                        <Option value="Mới"></Option>
                                        <Option value="Hoạt động"></Option>
                                    </Select>
                                </FormItem>
                                <FormItem />
                                <FormItem
                                >
                                    <Button className='btn-register' type="primary" htmlType="submit">
                                        <FilterOutlined />  Lọc tài xế
                                    </Button>
                                </FormItem>
                            </Col>
                        </Row>
                    </Form>
                </div>
                <div className='table-info' style={{marginTop:"5%"}}>
                <Table columns={columns} dataSource={data} size="middle" />
                </div>
            </div>
        </div>
    )
}
export default DriverManagement