import { Layout } from 'antd';
import HomePassenger from '../../components/contents/home/home-passenger';
import HomeDriver from '../../components/contents/home/home-taixe/index';
import HomeCompany from '../../components/contents/home/home-congty/index';
import LayoutPassenger from '../../components/layout/khachhang';
import LayoutDriver from '../../components/layout/taixe';
import LayoutCompany from '../../components/layout/congty';
import jwtDecode from 'jwt-decode';
import { useSelector } from 'react-redux';
import Forbidden from '../forbiden';
import { useEffect } from 'react';
import { getUser } from '../../redux/apiRequest';
import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router';
const { Header, Content } = Layout;
// const role="ROLE_PASSENGER"


const Home = () => {
  const dispatch = useDispatch();
  const navigate =useNavigate();
  const currentUser = useSelector((state)=>state.auth.login?.currentUser);
  const decodedTocken=jwtDecode(currentUser.access_token);
  const userName=decodedTocken.sub; 
  const newUser=useSelector((state)=>state.user.userInfo?.currentUser);
  console.log(newUser);
  const role=decodedTocken.roles[0];
  
  useEffect(()=>{
    getUser(userName,dispatch);
   
  },[])

  if(!role){
    return <Forbidden/>
  }else{
    if(role==='ROLE_PASSENGER'){
      return <LayoutPassenger  content={<HomePassenger/>}/>
    }else if(role==='ROLE_DRIVER'){
      if(newUser.statusVerify==0 ){
        navigate('/signup/confirm-email', { state: { newUser } })
      }else if(newUser.statusVerify==1){
        navigate('/signup/driver-doc', { state: { newUser } })
      }else if(newUser.statusVerify==2){
        navigate('/signup/add-vehico', { state: { newUser } })
      }else if(newUser.statusVerify==3){
        navigate('signup/vehico-info', { state: { newUser } })
      }else
      return <LayoutDriver content={<HomeDriver/>}/>
    }else if(role==='ROLE_COMPANY'){
      return <LayoutCompany content={<HomeCompany/>}/>
    }
  }
};

export default Home;