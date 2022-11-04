import { Layout } from 'antd';
import InfoContactUsers from '../../../components/contents/content-khachhang/info-contact/index'
import LayoutPassenger from '../../../components/layout/khachhang';

const InfoContactUser = () => {

  return (
    <LayoutPassenger content={<InfoContactUsers/>}/>
  );
};

export default InfoContactUser;