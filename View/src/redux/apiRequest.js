import axios from 'axios'
import { loginFailed, loginStart, loginSuccess, registerFailed, registerSuccess } from './authSlice'



export const loginUser = async(user,dispatch,navigate) =>{
    dispatch(loginStart)
    try {
        const res=axios.post("http://localhost:8080/api/login",user);
        console.log(res.data)
        dispatch(loginSuccess(res.data))
        // navigate("/")

export const loginUser = async (user, dispatch, navigate) => {
    dispatch(loginStart)
    let headers = new Headers();
    headers.append('Access-Control-Allow-Origin', 'http://localhost:3000');
    headers.append('Access-Control-Allow-Credentials', 'true');
    headers.append('GET', 'POST', 'OPTIONS');
    console.log(user)
    try {
        const res = axios.post("http://localhost:8080/api/login", user);
        console.log(res.data)
        dispatch(loginSuccess(res.data))
        // const rest=axios
        // .post(`http://localhost:8080/api/login`, JSON.stringify(user),
        //     { headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        //     }
        // ).then(res => {
        //     console.log(res)
        // }).catch(error => console.log(error))



    } catch (error) {
        dispatch(loginFailed());
    }
}



<<<<<<< HEAD
export const registerPassenger =async(user,dispatch,navigate) =>{
    dispatch(registerPassenger)
    try {
        const res=axios.post("",user);
=======
export const registerPassenger = async (user, dispatch, navigate) => {
    dispatch(registerPassenger)
    try {
        const res = axios.post("", user);
>>>>>>> main
        dispatch(registerSuccess(res.data))
        navigate("/")
    } catch (error) {
        dispatch(registerFailed())
    }
}