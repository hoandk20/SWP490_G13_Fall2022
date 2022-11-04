import { Col, button, DatePicker, Form, Input, Row, Select, TimePicker, Button, Descriptions, List, Avatar, Badge } from 'antd';
import React from 'react';
import { useState } from 'react';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { getTripDetailDriver } from '../../../../../redux/apiRequest';
import PassengerCard from '../../../../commons/passenger-card';
import './free-trip-detail.css'
const { Option } = Select;

const FreeTripDetail = () => {
    const dispatch =useDispatch();
    const freeTrip=useSelector((state)=>state.freeTrip);
    const createTrip=useSelector((state)=>state.freeTrip.createTrip?.detail);
    const tripDriverDetail=useSelector((state)=>state.freeTrip.tripDriverDetail?.detail);
    const listPassengerRegister=tripDriverDetail?.listPassenger;
    // console.log(listPassengerRegister);
    // console.log("freeTrip: ", freeTrip);
    // console.log("createTrip: ", createTrip);
    // console.log("tripDriverDetail: ", tripDriverDetail);
  //  const [detailTrip,setDetailTrip]=useState();
    useEffect(()=>{
        getTripDetailDriver(createTrip.id,dispatch);
        
      },[])  
    return (
        <div className='container'>
            <div className='container-info'>s
                <h2>CHI TIẾT CHUYẾN ĐI</h2>
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={16} md={8}>
                            <div className='tripDriverDetail-detail'>

                                <Descriptions size='middle' bordered title="Thông tin chi tiết chuyến đi">
                                    <Descriptions.Item span={3} label="Từ">{tripDriverDetail?.from}</Descriptions.Item>
                                    <Descriptions.Item span={3} label="Đến">{tripDriverDetail?.to}</Descriptions.Item>
                                    <Descriptions.Item span={3} label="Thời gian xuất phát">{tripDriverDetail?.timeStart}</Descriptions.Item>
                                    <Descriptions.Item label="Trống">{tripDriverDetail?.seatRemind}</Descriptions.Item>
                                    <Descriptions.Item span={2} label="Cước">{tripDriverDetail?.price}</Descriptions.Item >
                                    <Descriptions.Item label="Tài xế">{tripDriverDetail?.driverEmail}</Descriptions.Item>

                                </Descriptions>
                                <br />
                                <h3>Thông tin hành khách đã đăng ký</h3>
                                <>
                                {
                                    listPassengerRegister && listPassengerRegister.length>0 &&
                                    listPassengerRegister.map((obj)=>{
                                        return(
                                            <>
                                                <div key={obj.id}>
                                                    <PassengerCard id={obj.id} from={obj.from} to={obj.to} passengerEmail={obj.passengerEmail} seatRegister={obj.seatRegister} status={obj.status} note={obj.note} waitingTime={obj.waitingTime} timeStart={obj.timeStart}/>
                                                </div>
                                            </>
                                        )
                                    })
                                }
                                </>                              
                                <div className='submit' style={{marginTop:"20px"}}>
                                    <Button type="primary" danger style={{ marginLeft: "27%" }}>
                                        Hủy chuyến
                                    </Button>
                                </div>
                            </div>
                        </Col>
                        <Col sm={16} md={8}>

                        </Col>
                    </Row>
                </div>
            </div>
        </div>
    )
}
export default FreeTripDetail