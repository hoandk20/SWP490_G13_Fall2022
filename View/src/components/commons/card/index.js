import React from 'react';
import 'antd/dist/antd.css';
import './index.css';
import { Button, Card } from 'antd';

const { Meta } = Card;
const CardRegister = () => (
  <Card
    hoverable
    style={{
      width: 340,
    }}
    cover={<img alt="example" src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png" />}
  >
    <Meta title="Tài xế" description="Quản lý các hoạt động, tìm thông tin bạn cần để theo dõi thành công trong hành trình." />
    <div>
      <Button type="primary" >Register</Button>
    </div>
  </Card>
);
export default CardRegister;