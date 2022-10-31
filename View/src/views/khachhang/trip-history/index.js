import { Layout } from 'antd';

import TripHistoryPassengers from '../../../components/contents/content-khachhang/trip-history';
import LayoutPassenger from '../../../components/layout/khachhang';

const TripHistoryPassenger = () => {

  return (
    <LayoutPassenger content={<TripHistoryPassengers/>}/>
  );
};

export default TripHistoryPassenger;