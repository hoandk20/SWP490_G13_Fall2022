import axios from 'axios'
import { toast } from 'react-toastify';

import { loginFailed, loginStart, loginSuccess, logOutFailed, logOutStart, logOutSuccess, registerFailed, registerStart, registerSuccess } from './authSlice'
import { createTripFailed, createTripStart, createTripSuccess, getListFreeTripFailed, getListFreeTripStart, getListFreeTripSuccess, getTripDetailDriverFailed, getTripDetailDriverStart, getTripDetailDriverSuccess, passengerRegisterTripSuccess } from './freeTripSlice';
import { getTripHistoryFailed, getTripHistoryOfDriverFailed, getTripHistoryOfDriverStart, getTripHistoryOfDriverSuccess, getTripHistoryStart, getTripHistorySuccess } from './tripHistorySlice';
import { getUserStart, getUserSuccess, deleteUser, getUserFailed } from './userSlice';
const BASE_URL = "http://localhost"
const URL = "http://26.36.110.116";



export const loginUser = async (user, dispatch, navigate) => {
  dispatch(loginStart())
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
        navigate('/home')
      })
      .catch(function (error) {
        if (error.response.status == 401) {
          toast.error("Tài khoản hoặc mật khẩu không chính xác")
        }
        dispatch(loginFailed());
      });

  } catch (error) {

  }
}


export const logoutUser = async (dispatch, navigate) => {
  // dispatch(logOutStart())
  try {
    dispatch(deleteUser());
    dispatch(logOutSuccess());
    navigate('/signin')

  } catch (error) {
    // dispatch(logOutFailed());
    console.log(error)
  }
}




export const registerPassenger = async (user, dispatch, navigate, toast) => {
  dispatch(registerStart())
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
        dispatch(registerSuccess(response.data))
        navigate('/signin')
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email is exists");
        }
      });
  } catch (error) {
    dispatch(registerFailed())
  }
}

export const registerDriver = async (user, dispatch, navigate, toast) => {
  dispatch(registerStart())
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
        dispatch(registerSuccess(response.data))
        navigate("/signin")
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email is exists");
        }
      });


  } catch (error) {
    dispatch(registerFailed())
  }
}

export const registerCompany = async (user, dispatch, navigate, toast) => {
  dispatch(registerStart())
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
        dispatch(registerSuccess(response.data))
        navigate("/signin")
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email is exists");
        }
      });


  } catch (error) {
    dispatch(registerFailed())
  }
}

export const getUser = async (userName, dispatch) => {
  dispatch(getUserStart())
  const res = await axios.get(`${URL}:8080/api/user/info?username=${userName}`, {
    headers: { 'Content-Type': 'application/json' }
  })
    .then(function (response) {
      console.log(response)
      dispatch(getUserSuccess(response.data))
      //  navigate("/signin")
    })
    .catch(function (error) {
      dispatch(getUserFailed())
    });
}

export const CreateFreeTrip = async (trip, dispatch, navigate, toast) => {
  dispatch(createTripStart())
  try {
    const res = await axios
      .post(`${URL}:8080/api/tripdriver/create`, {
        driverEmail: trip.driverEmail,
        from: trip.from,
        to: trip.to,
        seat: trip.seat,
        timeStart: trip.timeStart,
        waitingTime: trip.waitingTime,
        price: trip.price,
      },
        {
          headers: { 'Content-Type': 'application/json' }
        });

    console.log("res:", res);
    dispatch(createTripSuccess(res.data.object));
    navigate('/taixe/freeTrip/detail/');

  } catch (error) {
    toast.error(error);
  }

}

export const getListFreeTripIsOpen = async (dispatch) => {
  dispatch(getListFreeTripStart())
  const res = await axios.get(`${URL}:8080/api/tripdriver/listOpen`, {
    headers: { 'Content-Type': 'application/json' }
  })
    .then(function (response) {
      console.log(response)
      dispatch(getListFreeTripSuccess(response.data))
      //  navigate("/signin")
    })
    .catch(function (error) {
      console.log(error);
      getListFreeTripFailed();
    });
}


export const RegisterTripForPassenger = async (trip, dispatch, navigate, toast) => {
  //  dispatch(getTripDriverStart);
  try {
    const res = await axios
      .post(`${URL}:8080/api/tripPassenger/create`, {
        tripID: trip.tripID,
        driverEmail: trip.driverEmail,
        passengerEmail: trip.passengerEmail,
        from: trip.from,
        to: trip.to,
        seatRegister: trip.seatRegister,
        timeStart: trip.timeStart,
        waitingTime: trip.waitingTime,
        price: trip.price,
        note: trip.note,
      },
        {
          headers: { 'Content-Type': 'application/json' }
        })
    dispatch(passengerRegisterTripSuccess(res.data));
    // navigate('/taixe/freeTrip/detail')
  } catch (error) {
    toast.error(error);
  }


}


export const getTripDetailDriver = async (id, dispatch) => {
  dispatch(getTripDetailDriverStart());
  try {
    const res = await axios.get(`${URL}:8080/api/tripdriver/detail?id=${id}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getTripDetailDriverSuccess(res.data.object));
  } catch (error) {
    dispatch(getTripDetailDriverFailed());
  }

}

export const changeStatusPassengerRegister = async (id, status) => {
  try {
    const res = await axios.post(`${URL}:8080/api/tripPassenger/updateRegisterStatus`, {
      id: id,
      status: status
    }
      , {
        headers: { 'Content-Type': 'application/json' }
      });

  } catch (error) {

  }
}

export const getTripHistoryDriver = async (email, dispatch) => {
  // dispatch(getTripHistoryStart());
  try {
    const res = await axios.get(`${URL}:8080/api/tripdriver/listTrip?driverEmail=${email}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    console.log(res);
    dispatch(getTripHistorySuccess(res.data.object));

  } catch (error) {
    // dispatch(getTripHistoryFailed());
  }
}

export const getTripHistoryPassenger = async (email, dispatch) => {
  // dispatch(getTripHistoryStart());
  try {
    const res = await axios.get(`${URL}:8080/api/tripPassenger/listTrip?passengerEmail${email}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    console.log(res);
    dispatch(getTripHistorySuccess(res.data));

  } catch (error) {
    // dispatch(getTripHistoryFailed());
  }
}

export const editInforPassenger = async (object,toast) => {

  try {
    const res = await axios.post(`${URL}:8080/api/user/changeinfoPassenger`, {
      username: object.email,
      firstname: object.firstName,
      lastname: object.lastName,
      avatarBase64: object.avatarBase64,
      address: object.address,
      email: object.email,
      phone: object.phone,
      country: object.country
    },
      {
        headers: { 'Content-Type': 'application/json' }
      });
      toast.success("Thay đổi thông tin thành công.");
  } catch (error) {
    toast.error(error);
  }
}

export const changePassword = async (object, toast) => {

  try {
    const res = await axios.post(`${URL}:8080/api/user/changePassword`,
      {
        email: object.email,
        oldPassword: object.oldPassword,
        newPassword: object.newPassword,
      },
      {
        headers: { 'Content-Type': 'application/json' }
      });
    toast.success("Đổi mật khẩu thành công.");
  } catch (error) {
    toast.error(error);
  }
}


