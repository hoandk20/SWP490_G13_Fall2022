
import { Tabs } from 'antd';
import React from 'react';
import { useLocation } from 'react-router';
import TabCompanyInfo from './tab-congty-info';
import DriverOfCompanyByAdmin from './tab-taixe';
import VehicleOfCompany from './tab-vehicle';
const CompanyDetailAdmin = () => {
    const location = useLocation();
    const companys = location.state?.record;

    return (
        <>
            <Tabs defaultActiveKey="1">
                <Tabs.TabPane tab="Thông tin công ty" key="1">
                    <TabCompanyInfo companys={companys}/>
                </Tabs.TabPane>
                <Tabs.TabPane tab="Tài xế" key="2">
                    <DriverOfCompanyByAdmin companys={companys}/>
                </Tabs.TabPane>
                <Tabs.TabPane tab="Phương tiện" key="3">
                    <VehicleOfCompany companys={companys}/>
                </Tabs.TabPane>
            </Tabs>
        </>
    )
}
  
export default CompanyDetailAdmin;