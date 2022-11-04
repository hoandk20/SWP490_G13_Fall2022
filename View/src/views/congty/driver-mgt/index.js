import React from 'react';
import 'antd/dist/antd.css';


import { Layout } from 'antd';
import DriverManagements from '../../../components/contents/content-congty/driver-mgt';
import LayoutDriver from '../../../components/layout/taixe';
import LayoutCompany from '../../../components/layout/congty';

const { Header, Content } = Layout;

const DriverManagement = () => {

  return (
    <LayoutCompany content={<DriverManagements/>}/>

  );
};

export default DriverManagement;