import { Layout } from 'antd';
import DocumentCompanys from '../../../components/contents/content-congty/document';
import LayoutCompany from '../../../components/layout/congty';
const { Header, Content } = Layout;

const DocumentCompany = () => {

  return (
    <LayoutCompany content={<DocumentCompanys/>}/>
  );
};

export default DocumentCompany;