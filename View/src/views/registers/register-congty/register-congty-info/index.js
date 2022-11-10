import React from 'react';
import Headers from '../../../../components/commons/header'
import Footers from '../../../../components/commons/footer';
import Register from '../../../../components/registers/congty/congty-info';
import { Layout } from 'antd';
const { Header, Footer, Content } = Layout;


const RegisterCompanyInfo = () =>{
    return(
      <Layout>
      <Layout  style={{ minHeight: "100vh" }} className="site-layout">
        <Header  style={{backgroundColor:"#fff"}}>
            <Headers/>
        </Header>
        <Content
          className="site-layout-background"
          style={{
            borderTopStyle:'solid',
            borderTopColor:' rgb(187, 187, 187)',
            padding: 24,
            minHeight: 560,
          }}
        >
          <Register/>
        </Content>
        <Footer>
            <Footers/>
        </Footer>
      </Layout>
    </Layout>
    );
};
export default RegisterCompanyInfo
