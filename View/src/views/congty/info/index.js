import { Layout } from 'antd';
import InfoCompanys from '../../../components/contents/content-congty/info';
import LayoutCompany from '../../../components/layout/congty';
const { Header, Content } = Layout;

const InfoCompany = () => {

  return (
    <LayoutCompany content={<InfoCompanys/>}/>
  );
};

export default InfoCompany;