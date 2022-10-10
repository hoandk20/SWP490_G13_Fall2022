import { Layout } from 'antd';
import InfoContactUsers from '../../../../components/contents/content-taixe/info-contact/info-contact-user';
import LayoutDriver from '../../../../components/layout';

const { Header, Content } = Layout;

const InfoContactUser = () => {

  return (
    <LayoutDriver content={<InfoContactUsers/>}/>
  );
};

export default InfoContactUser;