import { Layout } from 'antd';
import LayoutDriver from '../../../components/layout/taixe';
import DocumentDrivers from '../../../components/contents/content-taixe/document';
const { Header, Content } = Layout;

const DocumentDriver = () => {

  return (
    <LayoutDriver content={<DocumentDrivers/>}/>
  );
};

export default DocumentDriver;