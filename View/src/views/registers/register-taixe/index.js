import React from 'react';
import Headers from '../../../components/commons/header/index.js'
import Footers from '../../../components/commons/footer/index.js';
import { Layout } from 'antd';

import Register from '../../../components/registers/taixe/index.js';
const { Header, Footer, Content } = Layout;


const RegisterDriver = () =>{
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
            minHeight: 800,
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
export default RegisterDriver
