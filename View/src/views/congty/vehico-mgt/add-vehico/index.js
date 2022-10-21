import { Layout } from 'antd';
import AddVehicos from '../../../../components/contents/vehico-mgt/add-vehico';
import LayoutDriver from '../../../../components/layout';

const { Header, Content } = Layout;

const AddVehico = () => {

  return (
    <LayoutDriver content={<AddVehicos/>}/>
  );
};

export default AddVehico;