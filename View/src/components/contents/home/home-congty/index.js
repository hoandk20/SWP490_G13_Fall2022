import { Button, Col, Dropdown, Form, Row, Select, } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React, { useEffect, useState } from 'react';
import { FilterOutlined } from '@ant-design/icons';
import "./home-congty.css"
import { useSelector } from 'react-redux';
import axios from 'axios';

const HomeCompany = (props) => {

    const [dataCompay,setDataCompany] = useState();
    const newUser=useSelector((state)=>state.user.userInfo?.currentUser);

    console.log(newUser);
     const SearchInfoCompany = async (object) =>{
         if(newUser==="")return
        try {
          const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/company/reportCompany?companyId=${object.companyId}&month=${object.month}&year=${object.year}`, {
            headers: { 'Content-Type': 'application/json' }
          })
          setDataCompany(res.data.object);
        } catch (error) {
      
        }
      }

    const SearchAllData = async () =>{
        try {
            const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/company/reportCompany?companyId=${newUser.companyId}&month=${12}&year=${2022}`, {
              headers: { 'Content-Type': 'application/json' }
            })
            setDataCompany(res.data.object);
          } catch (error) {
        
          }
    }

    
    const onFinish = (values) => {
    
        const object ={
            month:values.month.value,
            year :values.year.value,
            companyId:newUser.companyId
        }
        console.log(object);
        if(object.year===undefined){
            object.year=2022
        }
        if(object.month===undefined){
            object.month=12
        }
        SearchInfoCompany(object);
    }

    const onClick = () =>{
        const object ={
            month:0,
            year:0,
            companyId:newUser.companyId
        }
        SearchInfoCompany(object);
    }    
  
    useEffect(()=>{
        SearchAllData();
       
      },[])
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
                <div style={{ marginTop: "4%" }}>
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
                </div>

                <div className='home-content-b'>

                    <Row>
                        <Col span={6}>

                            <div className='card-home-a' >
                                <div className='header-card-home'>
                                    <h2>Tổng số tài xế</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.driverNo}</span>
                                </div>
                            </div>

                        </Col>
                        <Col span={6}>
                        <div className='card-home-a' >
                                <div className='header-card-home'>
                                    <h2>Tổng số phương tiện</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.vehicleNo}</span>
                                </div>
                            </div>
                        </Col>
                        <Col span={6}>

                        <div className='card-home-a' >
                                <div className='header-card-home'>
                                    <h2>Tổng số chuyến đi</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.tripNo}</span>
                                </div>
                            </div>

                        </Col>
                        <Col span={6}>
                            <div className='card-home-a' >

                            <div className='header-card-home'>
                                    <h2>Tổng số chuyến đi đang mở</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.tripOpenNo}</span>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col span={6}>

                            <div className='card-home-a' >
                            <div className='header-card-home'>
                                    <h2>Số tài xế không có phương tiện</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.driverNoVehicle}</span>
                                </div>

                            </div>

                        </Col>
                        <Col span={6}>
                            <div className='card-home-a' >
                            <div className='header-card-home'>
                                    <h2>Số phương tiện không có tài xế</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.vehicleNoDriver}</span>
                                </div>

                            </div>
                        </Col>
                        <Col span={6}>

                            <div className='card-home-a' >
                            <div className='header-card-home'>
                                    <h2>Tổng số chuyến đi đã bị hủy </h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.tripCancel}</span>
                                </div>

                            </div>

                        </Col>
                        <Col span={6}>
                            <div className='card-home-a' >
                            <div className='header-card-home'>
                                    <h2>Tổng số chuyến đi đã bị đóng</h2>
                                </div>
                                <div className='content-card-home'>
                                    <span className='number-home'>{dataCompay?.tripClose}</span>
                                </div>

                            </div>
                        </Col>
                    </Row>


                </div>
            </div>
        </>

    )
}
export default HomeCompany