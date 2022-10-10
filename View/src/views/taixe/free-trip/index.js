import { Layout } from 'antd';
import FreeTripDrivers from '../../../components/contents/content-taixe/free-trip';
import LayoutDriver from '../../../components/layout';

const { Header, Content } = Layout;

const FreeTripDriver = () => {

  return (
    <LayoutDriver content={<FreeTripDrivers/>}/>
  );
};

export default FreeTripDriver;