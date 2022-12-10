import { Button, Col, Dropdown, Form, Row, Select, } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { FilterOutlined } from '@ant-design/icons';
import "../home-congty/home-congty.css"
import { useSelector } from 'react-redux';
import axios from 'axios';

const HomeAdmin = (props) => {

    // const data = props.data;
    const [data, setData] = useState('');
    const newUser = useSelector((state) => state.user.userInfo?.currentUser);
    const AllInfoAdmin = async () => {
        try {
            const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/admin/reportAdmin`, {
                headers: { 'Content-Type': 'application/json' }
            })
            setData(res.data.object);
        } catch (error) {

        }
    }
    console.log(data);
    // const SearchAllData = async () =>{
    //     try {
    //         const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/company/reportCompany?companyId=${newUser.companyId}&month=${12}&year=${2022}`, {
    //           headers: { 'Content-Type': 'application/json' }
    //         })
    //         setData(res.data.object);
    //       } catch (error) {

    //       }
    // }

    const onFinish = () => {

    }

    const onClick = () => {


    }
    console.log(data);
    useEffect(() => {
        AllInfoAdmin();

    }, [])
    const itemsMonth = [
        {
            value: '1',
            label: "Tháng 1"
        },
        {
            value: '2',
            label: "Tháng 2"
        },
        {
            value: '3',
            label: "Tháng 3"
        },
        {
            value: '4',
            label: "Tháng 4"
        },
        {
            value: '5',
            label: "Tháng 5"
        },
        {
            value: '6',
            label: "Tháng 6"
        },
        {
            value: '7',
            label: "Tháng 7"
        },
        {
            value: '8',
            label: "Tháng 8"
        },
        {
            value: '9',
            label: "Tháng 9"
        },
        {
            value: '10',
            label: "Tháng 10"
        },
        {
            value: '11',
            label: "Tháng 11"
        },
        {
            value: '12',
            label: "Tháng 12"
        },
    ]

    const itemsYear = [
        {
            value: '2022',
            label: "2022"
        },
        {
            value: '2021',
            label: "2021"
        },
        {
            value: '2020',
            label: "2020"
        },
    ]

    return (
        <>
            <div className='container-home'>
                {/* <div style={{ marginTop: "4%" }}>
                    <Form
                        labelCol={{
                            span: 8,
                        }}
                        wrapperCol={{
                            span: 18,
                        }}
                        onFinish={onFinish}
                    >
                        <Row>
                            <Col span={5}>
                                <Form.Item
                                    name="year"
                                    label="Năm:"
                                    initialValue={2022}
                                // rules={[
                                //     {
                                //         required: true,
                                //         message: 'Vui lòng chọn thành phố',
                                //     },
                                // ]}
                                >
                                    <Select
                                        labelInValue
                                        options={itemsYear}
                                    />
                                </Form.Item>

                            </Col>
                            <Col span={5}>
                                <Form.Item
                                    name="month"
                                    label="Tháng:"
                                    initialValue={12}
                                // rules={[
                                //     {
                                //         required: true,
                                //         message: 'Vui lòng chọn thành phố',
                                //     },
                                // ]}
                                >
                                    <Select
                                        labelInValue
                                        options={itemsMonth}
                                    />
                                </Form.Item>

                            </Col>
                            <Col span={5}>
                                <Button style={{ marginLeft: "5%" }} type="primary" htmlType="submit">Tìm kiếm</Button>
                                <Button style={{ marginLeft: "5%" }} type="primary" onClick={onClick} >Xem tất cả</Button>
                            </Col>
                        </Row>
                    </Form>
                </div> */}

                <div className='home-content-b'>

                    <Row>
                        <Col span={12}>

                            <div className='card-home-a' >
                                <div className='header-card-home'>
                                    <h2>Tổng số công ty</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{data.companyNo}</span>
                                </div>
                            </div>

                        </Col>
                        <Col span={12}>
                            <div className='card-home-a' >
                                <div className='header-card-home'>
                                    <h2>Tổng số chuyến đi</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{data.tripNo}</span>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col span={12}>

                            <div className='card-home-a' >
                                <div className='header-card-home'>
                                    <h2>Tổng số tài xế</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{data.driveNo}</span>
                                </div>
                            </div>

                        </Col>
                        <Col span={12}>
                            <div className='card-home-a' >

                                <div className='header-card-home'>
                                    <h2>Tổng số khách hàng</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{data.passengerNo}</span>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col span={12}>
                            <div className='card-home-a' >

                                <div className='header-card-home'>
                                    <h2>Tổng số phương tiện</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{data.vehicleNo}</span>
                                </div>
                            </div>
                        </Col>
                    </Row>



                </div>
            </div>
        </>

    )
}
export default HomeAdmin