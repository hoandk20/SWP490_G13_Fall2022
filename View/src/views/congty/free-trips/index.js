import { Layout } from 'antd';
import TripsCompany from '../../../components/contents/content-congty/free-trip';
import LayoutCompany from '../../../components/layout/congty';
const { Header, Content } = Layout;

const AllTripCompany = () => {

  return (
    <LayoutCompany content={<TripsCompany/>}/>
  );
};

export default AllTripCompany;