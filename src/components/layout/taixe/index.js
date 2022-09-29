import React from 'react';
import 'antd/dist/antd.css';
import './layout-taixe.css';

import { Layout } from 'antd';
import Footers from '../../commons/footer/index';
import { Footer } from 'antd/lib/layout/layout';
import Headers from '../../commons/header/index';


import Menu from '../../commons/menu/index'

const { Header, Content } = Layout;

const Taixe = () => {

  return (
    <Layout>
      <Menu/>
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
          Content
        </Content>
        <Footer>
            <Footers/>
        </Footer>
      </Layout>
    </Layout>
  );
};

export default Taixe;