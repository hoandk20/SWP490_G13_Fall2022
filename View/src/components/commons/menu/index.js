import React, { useState } from 'react';
import 'antd/dist/antd.css';
import './menu.css';
import {
  MenuFoldOutlined,
  MenuUnfoldOutlined,
  UploadOutlined,
  UserOutlined,
  VideoCameraOutlined,
} from '@ant-design/icons';
import { Menu,Layout } from 'antd';
import './menu.css'
const { Sider } = Layout;

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

const Menu1= () =>{
    const [collapsed, setCollapsed] = useState(false);

    return(
        <Sider width={250} trigger={null} collapsible collapsed={collapsed}>
        {/* <div className="logo">T.NET</div> */}
        <div className='menu'>
          <div></div>
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
    );
};
export default Menu1