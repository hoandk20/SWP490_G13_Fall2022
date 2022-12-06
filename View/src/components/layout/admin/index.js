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

} from '@ant-design/icons';
import { Layout,Menu } from 'antd';
import Footers from '../../commons/footer/index';
import { Footer } from 'antd/lib/layout/layout';
import Headers from '../../commons/header/index';
import { useState } from 'react';
import { useNavigate } from 'react-router';
import { useDispatch } from 'react-redux';
import { logoutUser } from '../../../redux/apiRequest';
const { Sider } = Layout;

// import Menu from '../../commons/menu/index'

const { Header, Content } = Layout;
const menuItem=[
  {
    key: '1',
    icon: <InfoCircleOutlined />,
    label: 'TÀI XẾ',
  },
  {
    key: '2',
    icon: <CarOutlined />,
    label: 'HÀNH KHÁCH',
  },
  {
    key: '3',
    icon: <IdcardOutlined />,
    label: 'ĐỐI TÁC',
  },
  {
    key: '4',
    icon: <HistoryOutlined />,
    label: 'CHUYẾN ĐI MIỄN PHÍ',
  },
  {
    key: 'signOut',
    icon: <LogoutOutlined />,
    label: 'ĐĂNG XUẤT',
  },
]

const LayoutAdmin = (props) => {
  const {content}=props
  const [collapsed, setCollapsed] = useState(false);
  const navigate=useNavigate();
  const dispatch = useDispatch();
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
                navigate('/admin/taixe-mgt')
              }
              if(key==2){
                navigate('/admin/passenger-mgt')
              }
              if(key==3){
                navigate('/admin/company-mgt')
              }
              if(key==4){
                navigate('/admin/free-trip-mgt')
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

export default LayoutAdmin;