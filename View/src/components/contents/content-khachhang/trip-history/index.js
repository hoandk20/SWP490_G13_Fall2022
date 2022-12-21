import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker, Spin } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useState } from 'react';
import { FilterOutlined, EyeOutlined } from '@ant-design/icons';
import { useNavigate } from 'react-router';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { getTripDetailDriver, getTripHistoryPassenger } from '../../../../redux/apiRequest';


const { Option } = Select;

const data = [

];

const TripHistoryPassenger = () => {
    const navigate = useNavigate();
    const dispatch = useDispatch();
    const a="history"
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [loading, setLoading] = useState(false);
    const dateFormat = (date) => {
        const date_str = date,
            options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
            formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
            date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }
    const all = useSelector((state) => state.tripHistory.tripHistory?.trips);

    const trips = all?.map((item) => {
        if (item.tripStatus === "OPEN") {
            return { ...item, item, dateStart: dateFormat(item.timeStart), key: item.tripID, tripStatus: "Đang mở" }
        }
        else if (item.tripStatus === "CLOS") {
            return { ...item, item, key: item.tripID, dateStart: dateFormat(item.timeStart), tripStatus: "Đã đóng" }
        }
        else if (item.tripStatus === "CANC") {
            return { ...item, item, key: item.tripID, dateStart: dateFormat(item.timeStart), tripStatus: "Đã bị hủy" }
        }
        else if (item.tripStatus === "RUN") {
            return { ...item, item, key: item.tripID, dateStart: dateFormat(item.timeStart), tripStatus: "Đang chạy" }
        }

    })
    console.log("trips",trips);
    useEffect(() => {
        const trip = {
            email: user?.email
        }
        getTripHistoryPassenger(trip, dispatch);
    }, [])

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
            key: 'price',
            title: 'Cước (đ)',
            dataIndex: 'price',
        },
        {
            key: 'tripStatus',
            title: 'Trạng thái',
            dataIndex: 'tripStatus',
        },


        {
            title: 'Đăng ký',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>

                    <EyeOutlined onClick={() => {
                         getTripDetailDriver(record.tripID,dispatch);
                         setLoading(true);
                        
                         setTimeout(() => {
                             setLoading(false);
                             navigate('/khachhang/freeTrip/detail-of-taixe', { state: { a } })
                         }, 1000)

                    }} />

                </div>
            },
        }
    ];
    const onfinish = (values) => {
        const trip = {
            email: user?.email,
            driverEmail: values.driverEmail,
            dateFrom: values.dateFrom,
            dateTo: values.dateTo,
            status: values.status
        }
        getTripHistoryPassenger(trip, dispatch);
    }


    return (
        <Spin spinning={loading} tip="Loading" size="large">
            <div className='container'>
                <div className='container-infos' style={{
                    textAlign: "left",
                    marginLeft: "20px"
                }}>
                    <h2>LỊCH SỬ CHUYẾN ĐI</h2>
                    <h3>Trạng thái</h3>
                    <div className='driver-info'>

                        <Form
                            onFinish={onfinish}
                            labelCol={{
                                span: 2,
                            }}
                            wrapperCol={{
                                span: 10,
                            }}
                        >


                            <FormItem
                                name="driverEmail"

                                label="Tài khoản"
                            >
                                <Input />
                            </FormItem>
                            <Row>
                                <Col sm={12} md={6} >
                                    <FormItem
                                        name="dateFrom"
                                        label="Từ ngày"
                                        labelCol={{
                                            span: 8,
                                        }}
                                    >
                                        <DatePicker placeholder='Chọn ngày' />
                                    </FormItem>
                                </Col>
                                <Col sm={12} md={6} >
                                    <FormItem
                                        name="dateTo"
                                        label="Đến ngày"
                                        labelCol={{
                                            span: 6,
                                        }}
                                    >
                                        <DatePicker placeholder='Chọn ngày' />
                                    </FormItem>
                                </Col>
                            </Row>

                            <FormItem
                                name="status"

                                label="Trạng thái"
                            >
                                <Select
                                    style={{ width: "200px" }}
                                >
                                    <Option value='OPEN'>Đang mở</Option>
                                    <Option value='CLOS'>Đã đóng</Option>
                                    <Option value='CANC'>Đã bị hủy</Option>
                                </Select>
                            </FormItem>


                            <FormItem
                            >
                                <Button className='btn' type="primary" htmlType="submit">
                                    <FilterOutlined />  Lọc chuyến đi
                                </Button>
                            </FormItem>


                        </Form>
                    </div>
                    <div className='table-info' style={{ marginTop: "5%" }}>
                        <Table columns={columns} dataSource={trips} size="middle" />
                    </div>
                </div>
            </div>
        </Spin>
    )
}
export default TripHistoryPassenger