import React from 'react';
import Layouts from '../../../../../components/layout';
import LayoutSignup from '../../../../../components/layout/register';
import RegisterAddVehicles from '../../../../../components/registers/congty/register-congty-doccuments/register-congty-doc2';
const RegisterAddVehicle = () =>{
    return(
      <LayoutSignup content={<RegisterAddVehicles/>}/>
    );
};
export default RegisterAddVehicle
