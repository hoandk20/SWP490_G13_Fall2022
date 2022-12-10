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
import { getAllCity, getUser, resendCode } from '../../redux/apiRequest';
import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router';
import axios from 'axios';
import { useState } from 'react';
import SerachFreeTripForPassenger from '../khachhang/free-trips/search-free-trip';
import CreateFreeTripForDriver from '../taixe/free-trip/create-free-trip'
import DriverManagementAdmin  from '../admin/taixe-mgt/index.js'
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

  const [data,setData]=useState("");


  const getDataPassenger = async() =>{
    if(role==="ROLE_DRIVER"){
      try {
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/driver/reportDriver?driverEmail=${userName}`, {
          headers: { 'Content-Type': 'application/json' }
        })
        setData(res.data.object);
      } catch (error) {
    
      }
    }else if(role==="ROLE_PASSENGER"){
      try {
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/passenger/reportPassenger?passengerEmail=${userName}`, {
          headers: { 'Content-Type': 'application/json' }
        })
        setData(res.data.object);
      } catch (error) {
    
      }
    }else if(role==="ROLE_COMPANY"){
      try {
        const res = await axios.get(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/company/reportCompany?companyId=${newUser.companyId}&month=${12}&year=${2022}`, {
          headers: { 'Content-Type': 'application/json' }
        })
        setData(res.data.object);
      } catch (error) {
    
      }
    }

  }

  
  useEffect(()=>{
    getUser(userName,dispatch);
    getAllCity(dispatch);
    // getDataPassenger();
   
  },[])

  if(!role){
    return <Forbidden/>
  }else{
    if(role==='ROLE_PASSENGER'){
      if(newUser.statusVerify==0 ){
        navigate('/signup/confirm-email', { state: { newUser } })
      }else
      return <SerachFreeTripForPassenger/>
    }else if(role==='ROLE_DRIVER'){
      if(newUser.statusVerify==0 ){
        navigate('/signup/confirm-email', { state: { newUser } })
      }else if(newUser.statusVerify==1){
        navigate('/signup/driver-doc', { state: { newUser } })
      }else if(newUser.statusVerify==2){
        navigate('/signup/add-vehico', { state: { newUser } })
      }else if(newUser.statusVerify==3){
        navigate('/signup/vehico-info', { state: { newUser } })
      }else
      return <CreateFreeTripForDriver/>
    }else if(role==='ROLE_COMPANY'){
      if(newUser.statusVerify==0 ){
        navigate('/signup/confirm-email', { state: { newUser } })
      }else if(newUser.statusVerify==1){
        navigate('/signup/company-doc1', { state: { newUser } })
      }else if(newUser.statusVerify==2){
        navigate('/signup/add-vehico', { state: { newUser } })
      }else if(newUser.statusVerify==3){
        navigate('/signup/vehico-info', { state: { newUser } })
      }else 
      return <LayoutCompany content={<HomeCompany/>}/>
    }else if(role==="ROLE_ADMIN"){
      return <DriverManagementAdmin/>
    }
  }
};

export default Home;