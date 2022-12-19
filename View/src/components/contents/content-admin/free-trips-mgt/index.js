import { Button, Form, Input, Row, Col, Select, Table, Popconfirm, DatePicker, Spin } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';

import { useDispatch, useSelector } from 'react-redux';


import { toast } from 'react-toastify';
import { useNavigate } from 'react-router';
import { getCompanyDetail, getCompanysByAdmin, getCompanysByAdmiAll, getTripsByAdmiAll, getTripsByAdmin, getTripDetailDriver } from '../../../../redux/apiRequest';


const { Option } = Select;
const FreeTripManagementAdmin = () => {

    const navigate = useNavigate();
    const [date1, setDate1] = useState('');
    const [date2, setDate2] = useState('');
    const [loading, setLoading] = useState(false);
    const dispatch = useDispatch();

    const all = useSelector((state) => state.freeTrip.trips?.allTrip);

    const dateFormat = (date) => {
        const date_str = date,
            options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
            formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
            date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }
    const trips = all?.map((item) => {
        if (item.status === "OPEN") {
            return { ...item, item, dateStart: dateFormat(item.timeStart), key: item.id, tripStatus: "Đang mở" }
        }
        else if (item.status === "CLOS") {
            return { ...item, item, key: item.id, dateStart: dateFormat(item.timeStart), tripStatus: "Đã đóng" }
        }
        else if (item.status === "CANC") {
            return { ...item, item, key: item.id, dateStart: dateFormat(item.timeStart), tripStatus: "Đã bị hủy" }
        } else if (item.status === "RUN") {
            return { ...item, item, key: item.id, dateStart: dateFormat(item.timeStart), tripStatus: "Đang chạy" }
        }
    })


    function onChangeDateStart(date, dateString) {
        setDate1(date.toISOString());
    }
    function onChangeDateEnd(date, dateString) {
        setDate2(date.toISOString());
    }
    useEffect(() => {
        getTripsByAdmiAll(dispatch);
    }, [])

    const onFinish = (values) => {
        const object = {
            ...values,
            regFrom: date1,
            regTo: date2
        }
        getTripsByAdmin(object, dispatch);
    }


    const columns = [
        {
            key: 'dateStart',
            title: 'Thời gian bắt đầu',
            dataIndex: 'dateStart',
        },
        {
            key: 'from',
            title: 'Từ',
            dataIndex: 'from',
        },
        {
            key: 'to',
            title: 'Đến',
            dataIndex: 'to',
        },
        {
            key: 'regDate',
            title: 'Cước',
            dataIndex: 'regDate',
        },
        {
            key: 'tripStatus',
            title: 'Trạng thái',
            dataIndex: 'tripStatus',
        },

        {
            title: '',
            dataIndex: '',
            key: 'x',
            render: (record) => {
                return <div>
                    <EyeOutlined onClick={() => {
                        getTripDetailDriver(record.tripID, dispatch);
                        setLoading(true);

                        setTimeout(() => {
                            setLoading(false);
                            navigate('/admin/free-trip-mgt/detail', { state: { record } })
                        }, 1000)

                    }} />

                </div>
            },
        },

    ];

    return (
        <Spin spinning={loading} tip="Loading" size="large">
            <div className='container'>
                <div className='container-infos' style={{
                    textAlign: "left",
                    marginLeft: "20px"
                }}>
                    <h2>CHUYẾN ĐI MIỄN PHÍ</h2>
                    <h3>TÌM CHUYẾN ĐI</h3>
                    <div className='driver-info'>
                        <Form labelCol={{
                            span: 6,
                        }}
                            wrapperCol={{
                                span: 16,
                            }}
                            onFinish={onFinish}
                        >
                            <Row>
                                <Col md={8} sm={16}>
                                    <FormItem
                                        name="regFrom1"
                                        label="Đăng ký từ"
                                    >
                                        <DatePicker style={{ width: "100%" }} placeholder='Chọn ngày' onChange={onChangeDateStart} />
                                    </FormItem>
                                    <FormItem
                                        name="phoneDriver"
                                        label="Số di động TX"

                                    >
                                        <Input />
                                    </FormItem>

                                </Col>
                                <Col md={8} sm={16}>
                                    <FormItem
                                        name="regTo1"
                                        label="Đến"
                                    >
                                        <DatePicker style={{ width: "100%" }} placeholder='Chọn ngày' onChange={onChangeDateEnd} />
                                    </FormItem>
                                    <FormItem
                                        name="phonePassenger"
                                        label="Số di động HK"
                                    >
                                        <Input />
                                    </FormItem>

                                </Col>
                                <Col md={8} sm={16}>
                                    <FormItem
                                        name="Status"
                                        label="Trạng thái"
                                    >
                                        <Select>
                                            <Option value="OPEN">Đang mở</Option>
                                            <Option value="CLOS">Đã đóng</Option>
                                            <Option value="CANC">Đã bị hủy"</Option>
                                            <Option value="RUN">Đang chạy</Option>
                                        </Select>
                                    </FormItem>

                                    <FormItem
                                        style={{ marginLeft: "26%" }}
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
                        {/* <AddVehico /> */}
                    </div>
                    <div className='table-info' style={{ marginTop: "5%" }}>
                        <Table columns={columns} dataSource={trips} size="middle" />
                    </div>
                </div>
            </div >
        </Spin>

    )
}
export default FreeTripManagementAdmin