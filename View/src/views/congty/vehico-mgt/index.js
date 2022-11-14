import { Layout } from 'antd';
import VehicoManagements from '../../../components/contents/vehico-mgt';
import LayoutAdmin from '../../../components/layout/admin';
import LayoutCompany from '../../../components/layout/congty';

const { Header, Content } = Layout;

const VehicoManagement = () => {

  return (
    <LayoutAdmin content={<VehicoManagements/>}/>

  );
};

export default VehicoManagement;