import React from 'react';
import 'antd/dist/antd.css';
import '../layout.css';
import {Link, Navigate, useLocation, useNavigate} from "react-router-dom";
import {
  MenuFoldOutlined,
  MenuUnfoldOutlined,
  UserOutlined,
  LaptopOutlined,
  SearchOutlined,
  HistoryOutlined,
  LogoutOutlined,
} from '@ant-design/icons';
import { Layout,Menu } from 'antd';
import Footers from '../../commons/footer/index';
import { Footer } from 'antd/lib/layout/layout';
import Headers from '../../commons/header/index';
import { useState } from 'react';
import { logoutUser } from '../../../redux/apiRequest';
import { useDispatch, useSelector } from 'react-redux';
const { Sider } = Layout;


// import Menu from '../../commons/menu/index'

const { Header, Content } = Layout;
const menuItem=[
  {
    key: '/khachhang/info',
    icon: <UserOutlined />,
    label: 'HỒ SƠ',
  },
  // {
  //   key: '2',
  //   icon: <LaptopOutlined rotate={180}/>,
  //   label: 'CHUYẾN ĐI MIỄN PHÍ',
  // },
  {
    key: '/khachhang/search-freeTrip',
    icon: <SearchOutlined rotate={90}/>,
    label: 'TÌM CHUYẾN ĐI MIỄN PHÍ',
  },
  {
    key: '/khachhang/trip-history',
    icon: <HistoryOutlined />,
    label: 'LỊCH SỬ CHUYẾN ĐI',
  },
  {
    key: 'signOut',
    icon: <LogoutOutlined />,
    label: 'ĐĂNG XUẤT',
    
  },
]


const LayoutPassenger = (props) => {
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
export default LayoutPassenger;