import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { FilterOutlined, EyeOutlined } from '@ant-design/icons';
import { useNavigate } from 'react-router';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { getTripHistoryPassenger } from '../../../../redux/apiRequest';


const { Option } = Select;

const data = [

];

const TripHistoryPassenger = () => {
    const navigate=useNavigate();
    const dispatch=useDispatch();
    const user=useSelector((state)=>state.user.userInfo?.currentUser);

    const trips=useSelector((state)=>state.tripHistory.tripHistory?.trips);
    console.log(trips);
    useEffect(()=>{
        getTripHistoryPassenger(user?.email,dispatch);
       },[]) 

    const columns = [
        {
            key: 'index',
            title: 'Số',
            dataIndex: 'index',
        },
        {
            key: 'timeStart',
            title: 'Thời gian bắt đầu',
            dataIndex: 'timeStart',
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
            key: 'seatRemind',
            title: 'Số chỗ còn trống',
            dataIndex: 'seatRemind',
        },


        {
            title: 'Đăng ký',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>

                    <EyeOutlined onClick={() => {
                        navigate('/khachhang/freeTrip/detail-of-taixe', { state: { record } })

                    }} />

                </div>
            },
        }
    ];



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
                            span: 10,
                        }}
                    >


                        <FormItem
                            name="account"
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
                        >
                            <Button className='btn' type="primary" htmlType="submit">
                                <FilterOutlined />  Lọc chuyến đi
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
export default TripHistoryPassenger