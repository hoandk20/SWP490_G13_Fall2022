import { color } from '@chakra-ui/react';
import { Badge, Button } from 'antd';
import TextArea from 'antd/lib/input/TextArea';
import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { changeStatusPassengerRegister } from '../../../redux/apiRequest';

const PassengerCard = (props) => {

    const dispatch = useDispatch();
    const tripDriverDetail = useSelector((state) => state.freeTrip.tripDriverDetail?.detail);
    const listPassengerRegister = tripDriverDetail?.listPassenger;


    return (
        <div className='scroll-bg'>
            <div className='scroll-div'>
                <div className='scroll-object'>
                    {
                        listPassengerRegister && listPassengerRegister.length > 0 &&
                        listPassengerRegister.map((obj) => {
                            return (
                                <>
                                    <div key={obj.id}>
                                        {
                                            obj?.status !== 'REJE' ? (
                                                <div className='list-passenger'>
                                                    <div className='header-list'>
                                                        <span>
                                                            {obj?.passengerEmail}
                                                            {
                                                                obj?.status === "PEND" ? (
                                                                    <>
                                                                        <div className='status'>Đang chờ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status'>Chấp nhận</div>
                                                                    </>
                                                                )
                                                            }


                                                        </span>
                                                        <div className='content-list'>
                                                            <div> <Badge color="hsl(102, 53%, 61%)" text={obj?.from} /></div>
                                                            <div><Badge color="#f50" text={obj?.to} /></div>
                                                            <div>Số điện thoại: {obj?.phone}</div>
                                                            <div>
                                                                <span style={{ marginRight: "40px", color: "black" }}>Số ghế: {obj?.seatRegister}</span>
                                                                <span style={{ color: "black" }}>Giá tiền: {obj?.price} VNĐ</span>
                                                            </div>
                                                            <div style={{margin:"10px 0px"}}>
                                                                <TextArea rows={3} value={obj?.note} disabled/>
                                                            </div>
                                                            
                                                            <div >
                                                            {
                                                                obj?.status === 'PEND' ? (
                                                                    <span >
                                                                        <Button type="primary" onClick={() => {
                                                                            changeStatusPassengerRegister(obj?.id, 1, toast, dispatch, tripDriverDetail.id);
                                                                        }} danger style={{ marginLeft: "27%" }}>
                                                                            Hủy
                                                                        </Button>
                                                                        <Button type="primary" onClick={() => {
                                                                            changeStatusPassengerRegister(obj?.id, 2, toast, dispatch, tripDriverDetail.id);
                                                                        }} style={{ marginLeft: "20px" }}  >Xác nhận</Button>
                                                                    </span>
                                                                )
                                                                    : (
                                                                        <></>
                                                                    )
                                                            }
                                                            </div>

                                                        </div>
                                                    </div>
                                                </div>
                                            ) : (
                                                <></>
                                            )
                                        }

                                    </div>
                                </>
                            )
                        })
                    }
                </div>
            </div>
        </div>

    );
}
export default PassengerCard;