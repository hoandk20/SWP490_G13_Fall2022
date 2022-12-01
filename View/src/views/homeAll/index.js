import React from 'react';
import LayoutHome from '../../components/layout/home';
import HomeAlls from '../../components/contents/home/homeAll';

const HomeAll = () =>{
    return <LayoutHome content={<HomeAlls/>}/>
}
export default HomeAll;