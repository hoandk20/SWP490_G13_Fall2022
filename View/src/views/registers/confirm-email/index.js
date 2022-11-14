import React from 'react';
import LayoutSignup from '../../../components/layout/register';
import RegisterConfirmEmails from '../../../components/registers/confirm-email'
const RegisterConfirmEmail = () => {
  return (
    <LayoutSignup content={<RegisterConfirmEmails/>}/>

  );
};
export default RegisterConfirmEmail
