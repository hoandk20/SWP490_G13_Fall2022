
import { Table } from 'antd';
import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router';
import CarouselHome from '../../../commons/carousel';
import { EyeOutlined } from '@ant-design/icons';
import "./homeAll.css"
import axios from 'axios';

const URL = "http://26.36.110.116";


const HomeAll = () => {
    const navigate=useNavigate();

    const [allTrip,setAllTrip] = useState();
    const getTop10Trips= async() =>{
        try {

            const res = await axios.get(`${URL}:8080/api/GetTop10Trip`, {
              headers: { 'Content-Type': 'application/json' }
            })
            setAllTrip(res.data.object);
          } catch (error) {
        
          }
    }
    console.log(allTrip);
    const dateFormat = (date) =>{
        const date_str = date,
        options = { year: 'numeric', month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' },
        formatted = (new Date(date_str)).toLocaleDateString('en-US', options),
        date_parts = formatted.substring(0, formatted.indexOf(",")).split(" ").reverse().join(" ");      
        return date_parts + formatted.substr(formatted.indexOf(",") + 1);
    }

  const trips =allTrip?.map((item)=>{
    if(item.status==="OPEN"){
        return {...item,item,dateStart:dateFormat(item.timeStart),key:item.tripID,status:"Đang mở"}
    }
    else if(item.status==="CLOS"){
        return {...item,item,key:item.tripID,dateStart:dateFormat(item.timeStart),status:"Đã đóng"}
    }
    else if(item.status==="CANC"){
        return {...item,item,key:item.tripID,dateStart:dateFormat(item.timeStart),status:"Đã bị hủy"}
    }

  })


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
            key: 'status',
            title: 'Trạng thái',
            dataIndex: 'status',
        },


        {
            title: 'Đăng ký',
            dataIndex: '',
            key: 'x',
            render: (text, record, index) => {
                return <div>

                    <EyeOutlined onClick={() => {
                        // navigate('/khachhang/freeTrip/detail-of-taixe', { state: { record } })

                    }} />

                </div>
            },
        }
    ];

    useEffect(() => {
        getTop10Trips();
    }, [])
    return (
        <>
            <div cotainer-home>
                <div className='home'>
                    <div className='home-content'>
                            <div className='home-content-a'>
                                <CarouselHome/>
                            </div>
                            <div className='home-content-table'>
                                <Table columns={columns} dataSource={trips} size="middle" />
                            </div>
                    </div>
                </div>
            </div>
        </>

    )
}
export default HomeAll