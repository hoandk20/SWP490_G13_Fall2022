import { Layout } from 'antd';
import VehicoManagements from '../../../components/contents/vehico-mgt';
import LayoutDriver from '../../../components/layout';

const { Header, Content } = Layout;

const VehicoManagement = () => {

  return (
    <LayoutDriver content={<VehicoManagements/>}/>
  );
};

export default VehicoManagement;