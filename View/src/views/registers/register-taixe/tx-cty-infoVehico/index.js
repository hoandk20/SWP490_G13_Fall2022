import React from 'react';
import Layouts from '../../../../components/layout';
import LayoutSignup from '../../../../components/layout/register';
import RegisterDriverInfoVehicos from '../../../../components/registers/taixe/tx-cty-infoVehico/index'

const RegisterDriverInfoVehico = () =>{
    return(
      <LayoutSignup content={<RegisterDriverInfoVehicos/>}/>
    );
};
export default RegisterDriverInfoVehico
