import axios from 'axios'
import { loginFailed, loginStart, loginSuccess, registerFailed, registerSuccess } from './authSlice'


export const loginUser = async(user,dispatch,navigate) =>{
    dispatch(loginStart)
    try {
        const res=axios.post("http://localhost:8080/api/login",user);
        console.log(res.data)
        dispatch(loginSuccess(res.data))
        // navigate("/")
    } catch (error) {
        dispatch(loginFailed());
    }
}



export const registerPassenger =async(user,dispatch,navigate) =>{
    dispatch(registerPassenger)
    try {
        const res=axios.post("",user);
        dispatch(registerSuccess(res.data))
        navigate("/")
    } catch (error) {
        dispatch(registerFailed())
    }
}