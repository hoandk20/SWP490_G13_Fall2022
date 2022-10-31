import { Layout } from 'antd';
import FreeTripDrivers from '../../../../components/contents/content-taixe/free-trip/free-trip-detail';

import LayoutDriver from '../../../../components/layout/taixe';

const { Header, Content } = Layout;

const FreeTripDetail = () => {
  return (
    <LayoutDriver content={<FreeTripDrivers/>}/>
  );
};

export default FreeTripDetail;