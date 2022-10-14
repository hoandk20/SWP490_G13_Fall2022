import axios from 'axios'
import { loginFailed, loginStart, loginSuccess, registerFailed, registerSuccess } from './authSlice'


export const loginUser = async (username, password, dispatch, navigate) => {
    dispatch(loginStart)
    const user = { username, password }
    let headers = new Headers();
    headers.append('Access-Control-Allow-Origin', 'http://localhost:3000');
    headers.append('Access-Control-Allow-Credentials', 'true');
    headers.append('GET', 'POST', 'OPTIONS');
    console.log(user)
    try {
        const res = axios.post("http://localhost:8080/api/login", user, {
            headers: {
                Accept: "multipart/form-data",
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
        console.log(res.data)
        dispatch(loginSuccess(res.data))


    } catch (error) {
        dispatch(loginFailed());
    }
}



export const registerPassenger = async (passenger, dispatch, navigate) => {
    dispatch(registerPassenger)
    console.log(passenger)
    try {
        const res = axios.post("http://localhost:8080/api/RegisterPassenger", passenger, {
            headers: {
                'Content-Type': 'application/json; charset=utf-8'
            }
        }).catch(error => {
            console.log('response: ', error.response.data);
        });
        dispatch(registerSuccess(res.data))
    } catch (error) {
        dispatch(registerFailed())
    }
}