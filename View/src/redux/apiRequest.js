import axios from 'axios'
import { toast } from 'react-toastify';

import { loginFailed, loginStart, loginSuccess, registerFailed, registerSuccess } from './authSlice'
const BASE_URL = "http://localhost"
const URL = "http://26.36.110.116";



export const loginUser = async (user, dispatch, navigate) => {
  dispatch(loginStart)
  try {

    const res = await axios({
      method: "post",
      // url: "http://localhost:8080/api/login",
      url: `${URL}:8080/api/login`,
      data: user,
      headers: { "Content-Type": "application/x-www-form-urlencoded" },
    })
    .then(function (response) {
      dispatch(loginSuccess(response.data));
      navigate('/taixe/driver-detail')
    })
    .catch(function (error) {
      if(error.response.status==401){
          toast.error("Tài khoản hoặc mật khẩu không chính xác")
      }
      dispatch(loginFailed());
    });
    
  } catch (error) {
    
  }
}




export const registerPassenger = async (user, dispatch, navigate, toast) => {

  try {
    const res = await axios
      .post(`${URL}:8080/api/RegisterPassenger`,
        {
          email: user.email,
          password: user.password,
          firstName: user.firstName,
          lastName: user.lastName,
          phoneNumber: user.phoneNumber,
          language: "vi"
        },
        {
          headers: { 'Content-Type': 'application/json' }
        })
      .then(function (response) {
        console.log(response)
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email is exists");
        }
      });

    dispatch(registerSuccess(res.data))
    // navigate("/")

  } catch (error) {
    dispatch(registerFailed())
  }
}

export const registerDriver = async (user, dispatch, navigate, toast) => {

  try {
    const rest = await axios
      .post(`${URL}:8080/api/RegisterDriver`, {
        email: user.email,
        password: user.password,
        firstName: user.firstName,
        lastName: user.lastName,
        phoneNumber: user.phoneNumber,
        language: "vi",
        country: user.country,
        city: user.city
      },
        {
          headers: { 'Content-Type': 'application/json' }
        })
      .then(function (response) {
        console.log(response)
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email is exists");
        }
      });
    dispatch(registerSuccess(rest.data))
    // navigate("/")

  } catch (error) {
    dispatch(registerFailed())
  }
}

export const registerCompany = async (user, dispatch, navigate,toast) => {

  try {
    const rest = await axios
      .post(`${URL}:8080/api/RegisterCompany`, {
        email: user.email,
        password: user.password,
        firstName: user.firstName,
        lastName: user.lastName,
        phoneNumber: user.phoneNumber,
        language: "vi",
        country: user.country,
        city: user.city
      },
        {
          headers: { 'Content-Type': 'application/json' }
        })
      .then(function (response) {
        console.log(response)
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email is exists");
        }
      });
    dispatch(registerSuccess(rest.data))
    // navigate("/")

  } catch (error) {
    dispatch(registerFailed())
  }
}