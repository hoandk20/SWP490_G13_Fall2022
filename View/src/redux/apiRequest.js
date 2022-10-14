import axios from 'axios'
import { loginFailed, loginStart, loginSuccess, registerFailed, registerSuccess } from './authSlice'


export const loginUser = async (user, dispatch, navigate) => {
    dispatch(loginStart)
    let headers = new Headers();
    headers.append('Access-Control-Allow-Origin', 'http://localhost:3000');
    headers.append('Access-Control-Allow-Credentials', 'true');
    headers.append('GET', 'POST', 'OPTIONS');
    console.log(user)
    try {
        // const res = axios.post("http://localhost:8080/api/login", user);
        // console.log(res.data)
        // dispatch(loginSuccess(res.data))
        const res= await axios({
            method: "post",
            url: "http://localhost:8080/api/login",
            data: user,
            headers: { "Content-Type": "application/x-www-form-urlencoded" },
          })
            .then(function (response) {
              //handle success
              console.log(response);
            })
            .catch(function (response) {
              //handle error
              console.log(response);
            });

    } catch (error) {
        dispatch(loginFailed());
    }
}



export const registerPassenger = async (user, dispatch, navigate) => {
    // dispatch(registerPassenger)
    console.log(user)
    try {
        // const res = axios.post("", user);
        // dispatch(registerSuccess(res.data))
        // navigate("/")
        const rest = axios
            .post(`http://localhost:8080/api/RegisterPassenger`,
                {
                    email: user.email,
                    password: user.password,
                    firstName: user.firstName,
                    lastName: user.lastName,
                    phoneNumber:user.phoneNumber,
                    language: "vi"
                },
                {
                    headers: { 'Content-Type': 'application/json' }
                }
            ).then(res => {
                console.log("res: ok")
            }).catch(error => console.log(error))

    } catch (error) {
        dispatch(registerFailed())
    }
}