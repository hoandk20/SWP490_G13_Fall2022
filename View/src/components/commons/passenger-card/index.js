import { Badge, Button } from 'antd';
import React from 'react';
import { changeStatusPassengerRegister } from '../../../redux/apiRequest';

const PassengerCard = (props) =>{
    const passengerDetail=props;
    

    const handleAccept = () =>{
        changeStatusPassengerRegister(passengerDetail.id,2);
    }
    
    const handleReject = () =>{
        changeStatusPassengerRegister(passengerDetail.id,1);
    }

    return(
        <div className='list-passenger'>
        <div className='header-list'>
            <span>
                {passengerDetail.passengerEmail}
                <div className='status'>{passengerDetail.status}</div>

            </span>
            <div className='content-list'>
               <div> <Badge color="hsl(102, 53%, 61%)" text={passengerDetail.from}/></div>
                <div><Badge color="#f50" text={passengerDetail.to} /></div>
                <p>Số ghế:{passengerDetail.seatRegister}</p>
                {
                    passengerDetail.status==='PEND' ?(
                        <span >
                        <Button type="primary" onClick={handleReject} danger style={{ marginLeft: "27%" }}>
                            Hủy
                        </Button>
                        <Button type="primary" onClick={handleAccept} style={{ marginLeft: "20px" }}  >Xác nhận</Button>
                    </span>
                    )
                    :(
                        <></>
                    )
                }

            </div>
        </div>
    </div>
    );
}
export default PassengerCard;