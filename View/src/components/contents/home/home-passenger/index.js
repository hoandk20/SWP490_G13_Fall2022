
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { FilterOutlined } from '@ant-design/icons';
import "./home-passenger.css"
import { Button } from 'react-bootstrap';



// const user=useSelector((state)=>state.user.userInfo.currentUser);

const HomePassenger = () => {

    return (
        <>
            <div className='container-home'>
                <div className='home-content-ac'>
                    <div className='home-btn'>
                    <Button className='btn-home-a' >
                        Số chuyến đi đang chờ
                    </Button>
                    </div>
                    <div className='home-btn'>
                    <Button className='btn-home-a' >
                        Số chuyến đi đã đi
                    </Button>
                    </div>


                </div>
            </div>
        </>

    )
}
export default HomePassenger