import { Layout } from 'antd';
import FreeTripDetail from '../../../../components/contents/content-congty/free-trip/free-trip-detail'
import LayoutCompany from '../../../../components/layout/congty/index'

const { Header, Content } = Layout;

const FreeTripDetailCompany = () => {

  return (
    <LayoutCompany content={<FreeTripDetail/>}/>
  );
};

export default FreeTripDetailCompany;