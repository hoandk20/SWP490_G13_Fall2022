import React from 'react';
import 'antd/dist/antd.css';


import { Layout } from 'antd';
import DriverManagements from '../../../components/contents/content-taixe/driver-mgt';
import LayoutDriver from '../../../components/layout';

const { Header, Content } = Layout;

const DriverManagement = () => {

  return (
    <LayoutDriver content={<DriverManagements/>}/>
  );
};

export default DriverManagement;