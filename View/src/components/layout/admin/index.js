import React from 'react';
import 'antd/dist/antd.css';
import '../layout.css';
import {
  MenuFoldOutlined,
  MenuUnfoldOutlined,
  InfoCircleOutlined,
  LaptopOutlined,
  CarOutlined,
  IdcardOutlined,
  HistoryOutlined,
  LogoutOutlined,
  HomeOutlined,

} from '@ant-design/icons';
import { Layout, Menu } from 'antd';
import Footers from '../../commons/footer/index';
import { Footer } from 'antd/lib/layout/layout';
import Headers from '../../commons/header/index';
import { useState } from 'react';
import { useLocation, useNavigate } from 'react-router';
import { useDispatch } from 'react-redux';
import { logoutUser } from '../../../redux/apiRequest';
import { NavLink } from 'react-router-dom';
const { Sider } = Layout;

// import Menu from '../../commons/menu/index'

const { Header, Content } = Layout;
const menuItem = [
  {
    icon: <HomeOutlined />,
    label: 'TRANG CHỦ',
    key: '/home'
  },
  {
    icon: <InfoCircleOutlined />,
    label: 'TÀI XẾ',
    key: '/admin/taixe-mgt'
  },
  {
    key: '/admin/passenger-mgt',
    icon: <CarOutlined />,
    label: 'HÀNH KHÁCH',
  },
  {
    icon: <IdcardOutlined />,
    label: 'ĐỐI TÁC',
    key: '/admin/company-mgt'
  },
  {
    icon: <HistoryOutlined />,
    label: 'CHUYẾN ĐI MIỄN PHÍ',
    key: '/admin/free-trip-mgt'
  },
  {
    key: 'signOut',
    icon: <LogoutOutlined />,
    label: 'ĐĂNG XUẤT',
  },
]

const LayoutAdmin = (props) => {
  const { content } = props
  const [collapsed, setCollapsed] = useState(false);
  const navigate = useNavigate();
  const dispatch = useDispatch();
  const history = useNavigate();
  const { pathname } = useLocation();

  console.log("pathname: ", pathname);

  return (
    <div style={{ display: 'flex' }}>
      <Sider width={250} collapsible collapsed={collapsed} >
        <div className='menu' style={{ height: 60, textAlign: 'center' }}>
        {React.createElement(collapsed ? MenuUnfoldOutlined : MenuFoldOutlined, {
            className: 'trigger',
            onClick: () => setCollapsed(!collapsed),
          })}
        </div>
        <Menu
          mode="inline"
          theme='dark'
          defaultSelectedKeys={menuItem[0].key}
          selectedKeys={pathname}
          items={menuItem}
          onClick={({ key }) => {
            if(key==='signOut'){
              logoutUser(dispatch,navigate);
          
            }else{
               navigate(key)
            }
          }}
        />
      </Sider>
      <Layout className="site-layout">
        <Header style={{ padding: 0, background: 'white', height: 100 }}>
          <Headers/>
        </Header>
        <Content
          style={{
            margin: '24px 16px',
            padding: 24,
            minHeight: 280,
            background: 'white',
          }}
        >
      <div  style={{minHeight:"80vh"}} className='content'>{content}</div>
        </Content>
        <Footer>
            <Footers/>
        </Footer>
      </Layout>
    </div>
  );
};

export default LayoutAdmin;