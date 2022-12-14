import { Badge, Button } from 'antd';
import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { changeStatusPassengerRegister } from '../../../redux/apiRequest';

const PassengerCard = (props) => {

    const dispatch = useDispatch();
    const tripDriverDetail = useSelector((state) => state.freeTrip.tripDriverDetail?.detail);
    const listPassengerRegister = tripDriverDetail?.listPassenger;
    console.log(tripDriverDetail); 
    // const handleAccept = () => {
    //     changeStatusPassengerRegister(obj?.id, 2);
    // }

    // const handleReject = () => {
    //     changeStatusPassengerRegister(obj?.id, 1);
    // }
    console.log(tripDriverDetail);
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
                                                            <div className='status'>{obj?.status}</div>

                                                        </span>
                                                        <div className='content-list'>
                                                            <div> <Badge color="hsl(102, 53%, 61%)" text={obj?.from} /></div>
                                                            <div><Badge color="#f50" text={obj?.to} /></div>
                                                            <p>Số ghế:{obj?.seatRegister}</p>
                                                            {
                                                                obj?.status === 'PEND' ? (
                                                                    <span >
                                                                        <Button type="primary" onClick={() => {
                                                                            changeStatusPassengerRegister(obj?.id, 1,toast,dispatch,tripDriverDetail.id);
                                                                        }} danger style={{ marginLeft: "27%" }}>
                                                                            Hủy
                                                                        </Button>
                                                                        <Button type="primary" onClick={() => {
                                                                             changeStatusPassengerRegister(obj?.id, 2,toast,dispatch,tripDriverDetail.id);
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