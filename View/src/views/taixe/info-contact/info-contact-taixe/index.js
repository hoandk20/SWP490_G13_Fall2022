import { Layout } from 'antd';
import InfoContactTaixes from '../../../../components/contents/content-taixe/info';
import LayoutDriver from '../../../../components/layout/taixe';

const { Header, Content } = Layout;

const InfoContactTaixe = () => {

  return (
    <LayoutDriver content={<InfoContactTaixes/>}/>
  );
};

export default InfoContactTaixe;