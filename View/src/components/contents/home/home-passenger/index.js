import { Button, } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { FilterOutlined } from '@ant-design/icons';


const HomePassenger = () => {

    return (
        <>
            <Button type="default" size='large' shape="round">
                Số chuyến đi đang chờ
            </Button>
            <Button type="default" size='large' shape="round">
                Số chuyến đi đã đi
            </Button>
        </>

    )
}
export default HomePassenger