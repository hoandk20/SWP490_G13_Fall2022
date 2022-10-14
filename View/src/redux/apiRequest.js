import axios from 'axios'
import { loginFailed, loginStart, loginSuccess, registerFailed, registerSuccess } from './authSlice'


export const loginUser = async (user, dispatch, navigate) => {
  dispatch(loginStart)
  try {

    const res = await axios({
      method: "post",
      url: "http://localhost:8080/api/login",
      data: user,
      headers: { "Content-Type": "application/x-www-form-urlencoded" },
    })
      .then(function (response) {

        console.log(response);
      })
      .catch(function (response) {
        //handle error
        console.log(response);
      });
    dispatch(loginSuccess(res.data))
  } catch (error) {
    dispatch(loginFailed());
  }
}




// export const registerPassenger = async (user, dispatch, navigate) => {
//     // dispatch(registerPassenger)
//     console.log(user)
//     try {
//         const res= await axios({
//             method: "post",
//             url: "http://localhost:8080/api/RegisterPassenger",
//             data: user,
//             headers: { "Content-Type": "application/x-www-form-urlencoded" },
//           })
//             .then(function (response) {

//               console.log(response);
//             })
//             .catch(function (response) {
//               //handle error
//               console.log(response);
//             });
//     } catch (error) {
//         dispatch(registerFailed())
//     }
// }



export const registerPassenger = async (user, dispatch, navigate) => {
  dispatch(registerPassenger)
  try {
    const res = axios.post("", user);
    dispatch(registerSuccess(res.data))
    navigate("/")
    const rest = axios
      .post(`http://localhost:8080/api/RegisterPassenger`,
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
        }
      ).then(res => {
        console.log("res: ok")
      }).catch(error => console.log(error))
    dispatch(registerSuccess(rest.data))
    // navigate("/")

  } catch (error) {
    dispatch(registerFailed())
  }
}