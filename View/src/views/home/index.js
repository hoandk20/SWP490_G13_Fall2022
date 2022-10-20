import { Layout } from 'antd';
import HomePassenger from '../../components/contents/home/home-passenger';
// import HomeDriver from '../../components/contents/home/home-driver';
// import HomeCompany from '../../components/contents/home/home-company';
import LayoutPassenger from '../../components/layout/khachhang';
import LayoutDriver from '../../components/layout/taixe';
import LayoutCompany from '../../components/layout/congty';

const { Header, Content } = Layout;

const Home = () => {

  return (
    <LayoutDriver content={<HomePassenger/>}/>
  );
};

export default Home;