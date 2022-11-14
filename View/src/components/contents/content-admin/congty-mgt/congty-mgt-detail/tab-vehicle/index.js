import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';
import AddVehico from '../../../../../commons/drawers/drawer-vehico-mgt/drawer-add--vehico';
import { useDispatch, useSelector } from 'react-redux';
import { deleteVehicelByCompany, getAllVehico } from '../../../../../../redux/apiRequest';
import EditVehico from '../../../../../commons/drawers/drawer-vehico-mgt/drawer-edit-vehico';
import { toast } from 'react-toastify';


const { Option } = Select;
const VehicleOfCompany = (props) => {

    const dispatch = useDispatch();
    const [companys,setCompanys]=useState(props.companys);
    const user = useSelector((state) => state.user.userInfo?.currentUser);

    const all = useSelector((state) => state.vehico.vehicos?.all);
    const vehicos = all?.map((row) => ({ ...row, key: row.id }))


    const handleDelete = (key) => {
        console.log(key);
         deleteVehicelByCompany(key,companys.email,toast,dispatch);
    };
    const cancel = (e) => {

    };
    useEffect(() => {
        getAllVehico(companys.email, dispatch);
    }, [])
    const columns = [
        // {
        //     key: 'index',
        //     title: 'Số',
        //     dataIndex: 'index',
        // },
        {
            key: 'producer',
            title: 'Kiểu phương tiện',
            dataIndex: 'producer',
        },
        {
            key: 'plate',
            title: 'Biển số',
            dataIndex: 'plate',
        },
        {
            key: 'produceYear',
            title: 'Năm sản xuất',
            dataIndex: 'produceYear',
        },
        {
            key: 'price',
            title: 'Giấy chứng nhận bảo hiểm',
            dataIndex: 'price',
        },
        {
            key: 'irs',
            title: 'Giấy đăng kiểm',
            dataIndex: 'irs',
        },
        {
            key: 'status',
            title: 'Trạng thái',
            dataIndex: 'status',
        },


        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>
                    <EditVehico state={record} />

                </div>

            },
        },

        {
            title: '',
            dataIndex: '',
            key: 'y',
            render: (text, record, index) => {
                return <div>
                    <Popconfirm
                        title="Bạn có muốn xóa phương tiện này?"
                        onConfirm={() => handleDelete(record.key)}
                        onCancel={cancel}
                        okText="Yes"
                        cancelText="No"
                    >
                        <DeleteOutlined />
                    </Popconfirm>
                </div>

            },
        },
    ];

    return (
        <div className='container'>
            <div className='container-infos' >
                <h2>PHƯƠNG TIỆN</h2>
                <div className='driver-info'>
                    <Form labelCol={{
                        span: 4,
                    }}
                        wrapperCol={{
                            span: 16,
                        }}
                    >
                        <Row>
                            <Col md={12} sm={24}>
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
                            </Col>
                            <Col md={12} sm={24}>
                                <FormItem
                                >
                                    <Button className='btn' type="primary" htmlType="submit">
                                        <FilterOutlined />  Lọc phương tiện
                                    </Button>
                                </FormItem>
                            </Col>
                        </Row>
                    </Form>
                    {/* <div
                        style={{ float: "right" }}
                    >
                        <p>*IRS: Giấy Đăng Kiểm</p>
                    </div> */}
                </div>
                <div style={{ marginLeft: "50px", float: "left" }}>
                    <AddVehico />
                </div>
                <div className='table-info' style={{ marginTop: "5%" }}>
                    <Table columns={columns} dataSource={vehicos} size="middle" />
                </div>
            </div>
        </div >
    )
}
export default VehicleOfCompany