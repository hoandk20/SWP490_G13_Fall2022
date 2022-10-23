import { Layout } from 'antd';
import CreateFreeTripForDrivers from '../../../../components/contents/content-taixe/free-trip/create-free-trip';
import LayoutDriver from '../../../../components/layout/taixe';

const { Header, Content } = Layout;

const CreateFreeTripForDriver = () => {

  return (
    <LayoutDriver content={<CreateFreeTripForDrivers/>}/>
  );
};

export default CreateFreeTripForDriver;