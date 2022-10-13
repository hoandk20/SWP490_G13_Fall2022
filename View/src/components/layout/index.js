import React from 'react';
import 'antd/dist/antd.css';
import './layout.css';

import { Layout } from 'antd';
import Footers from '../commons/footer/index';
import { Footer } from 'antd/lib/layout/layout';
import Headers from '../commons/header/index';
import Menu from '../commons/menu/index'
const menuItem=[
  {
    key: '1',
    // icon: <UserOutlined />,
    label: 'nav 1',
  },
  {
    key: '2',
    // icon: <VideoCameraOutlined />,
    label: 'nav 2',
  },
  {
    key: '3',
    // icon: <UploadOutlined />,
    label: 'nav 3',
  },
];


const { Header, Content } = Layout;

const Layouts = (props) => {
  const {content}=props

  return (
    <Layout>
      <Menu />
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
            // minHeight: 560,
          }}
        >
          <div className='content'>{content}</div>
        </Content>
        <Footer>
            <Footers/>
        </Footer>
      </Layout>
    </Layout>
  );
};

export default Layouts;