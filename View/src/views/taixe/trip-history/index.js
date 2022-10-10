import { Layout } from 'antd';
import TripHistoryDrivers from '../../../components/contents/content-taixe/trip-history/index'
import LayoutDriver from '../../../components/layout';

const { Header, Content } = Layout;

const TripHistoryDriver = () => {

  return (
    <LayoutDriver content={<TripHistoryDrivers/>}/>
  );
};

export default TripHistoryDriver;