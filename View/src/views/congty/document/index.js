import { Layout } from 'antd';
import DocumentDrivers from '../../../components/contents/content-taixe/document';
import LayoutCompany from '../../../components/layout/congty';
const { Header, Content } = Layout;

const DocumentCompany = () => {

  return (
    <LayoutCompany content={<DocumentDrivers/>}/>
  );
};

export default DocumentCompany;