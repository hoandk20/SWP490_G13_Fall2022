import React from 'react';
import 'antd/dist/antd.css';
import '../layout.css';
import {
  MenuFoldOutlined,
  MenuUnfoldOutlined,
  UploadOutlined,
  UserOutlined,
  VideoCameraOutlined,
} from '@ant-design/icons';
import { Layout,Menu } from 'antd';
import Footers from '../../commons/footer/index';
import { Footer } from 'antd/lib/layout/layout';
import Headers from '../../commons/header/index';
import { useState } from 'react';
const { Sider } = Layout;

// import Menu from '../../commons/menu/index'

const { Header, Content } = Layout;
const menuItem=[
  {
    key: '1',
    icon: <UserOutlined />,
    label: 'nav 1',
  },
  {
    key: '2',
    icon: <VideoCameraOutlined />,
    label: 'nav 2',
  },
  {
    key: '3',
    icon: <UploadOutlined />,
    label: 'nav 3',
  },
]

const LayoutPassenger = (props) => {
  const {content}=props
  const [collapsed, setCollapsed] = useState(false);

  return (
    <Layout>
      {/* <Menu/> */}
      <Sider width={250} trigger={null} collapsible collapsed={collapsed}>
        {/* <div className="logo">T.NET</div> */}
        <div className='menu'>
        {React.createElement(collapsed ? MenuUnfoldOutlined : MenuFoldOutlined, {
            className: 'trigger',
            onClick: () => setCollapsed(!collapsed),
          })}
        </div>
        <Menu
          theme='dark'
          mode="inline"
          defaultSelectedKeys={['1']}
          items={menuItem}
        />
      </Sider>
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

export default LayoutPassenger;