import React from 'react';
import 'antd/dist/antd.css';
import '../layout.css';
import {Link, Navigate, useNavigate} from "react-router-dom";
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
    key: '1',
    icon: <UserOutlined />,
    label: 'HỒ SƠ',
  },
  // {
  //   key: '2',
  //   icon: <LaptopOutlined rotate={180}/>,
  //   label: 'CHUYẾN ĐI MIỄN PHÍ',
  // },
  {
    key: '3',
    icon: <SearchOutlined rotate={90}/>,
    label: 'TÌM CHUYẾN ĐI MIỄN PHÍ',
  },
  {
    key: '4',
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
  const dispatch = useDispatch();
  const {content}=props
  const [collapsed, setCollapsed] = useState(false);
  const navigate=useNavigate();
  const user = useSelector((state) => state.user.userInfo?.currentUser)
  console.log(user);
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
          onClick={({key})=>{
            if(key==='signOut'){
              logoutUser(dispatch,navigate);
          
            }else{

              if(key==1){
                navigate('/khachhang/info')
              }
              if(key==3){
                navigate('/khachhang/search-freeTrip')
              }
              if(key==4){
                navigate('/khachhang/trip-history')
              }
            }
          }}

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