import axios from 'axios'
import { toast } from 'react-toastify';

import { loginFailed, loginStart, loginSuccess, logOutFailed, logOutStart, logOutSuccess, registerFailed, registerStart, registerSuccess } from './authSlice'
import { createTripFailed, createTripStart, createTripSuccess, getListFreeTripFailed, getListFreeTripStart, getListFreeTripSuccess, getTripDetailDriverFailed, getTripDetailDriverStart, getTripDetailDriverSuccess, passengerRegisterTripSuccess } from './freeTripSlice';
import { getTripHistoryFailed, getTripHistoryOfDriverFailed, getTripHistoryOfDriverStart, getTripHistoryOfDriverSuccess, getTripHistoryStart, getTripHistorySuccess } from './tripHistorySlice';
import { getUserStart, getUserSuccess, deleteUser, getUserFailed, getALlDriverForCompany, getAllDriverForCompany, getAllDrivers, getAllCompanyForAdmin } from './userSlice';
import { getAllVehicos } from './vehicoSlice';
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
        name: user.name,
        address: user.address + ', ' + user.city,
        phoneNumber: user.phoneNumber,
        language: "vi",
      },
        {
          headers: { 'Content-Type': 'application/json' }
        })
      .then(function (response) {
        console.log(response)
        dispatch(registerSuccess(response.data))
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
  try {
    dispatch(getUserStart())
    const res = await axios.get(`${URL}:8080/api/user/info?username=${userName}`, {
      headers: { 'Content-Type': 'application/json' }
    })
    console.log(res.data);
    dispatch(getUserSuccess(res.data))

  } catch (error) {
    dispatch(getUserFailed())
  }
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



export const getAllVehico = async (email, dispatch) => {
  try {
    const res = await axios.get(`${URL}:8080/api/company/getVehicle?companyEmail=${email}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllVehicos(res.data.object));

  } catch (error) {
  }
}

export const AddVehicoByCompany = async (vehicle, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/addVehicle`,
      {
        companyEmail: vehicle.companyEmail,
        producer: vehicle.producer,
        produceYear: vehicle.produceYear,
        interiorColor: vehicle.interiorColor,
        exteriorColor: vehicle.exteriorColor,
        plate: vehicle.plate,
        platState: vehicle.platState,
        plateCountry: vehicle.plateCountry,
        typeId: 1
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getAllVehico(vehicle.companyEmail, dispatch);
    toast.success("Tạo phương tiện thành công")
  } catch (error) {
    toast.error("Tạo phương tiện thất bại")
  }
}

export const AddVehicoByDriver = async (vehicle, toast) => {
  try {
    const res = await axios.post(`${URL}:8080/api/driver/addVehicle`,
      {
        driverEmail: vehicle.driverEmail,
        producer: vehicle.producer,
        produceYear: vehicle.produceYear,
        interiorColor: vehicle.interiorColor,
        exteriorColor: vehicle.exteriorColor,
        plate: vehicle.plate,
        platState: vehicle.platState,
        plateCountry: vehicle.plateCountry,
        typeId: 1
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    toast.success("Tạo phương tiện thành công")
  } catch (error) {
    toast.error("Tạo phương tiện thất bại")
  }
}

export const getDriversForCompany = async (email, dispatch) => {
  try {
    const res = await axios.get(`${URL}:8080/api/company/GetDriver?companyEmail=${email}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    console.log(res);
    dispatch(getAllDriverForCompany(res.data.object));
    console.log("object");
  } catch (error) { }
}

export const getDriversByAdmin = async (dispatch) => {
  try {
    const res = await axios.get(`${URL}:8080/api/admin/GetDrivers`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllDriverForCompany(res.data.object));
    console.log("ok");
  } catch (error) { }
}

export const getCompanysByAdmin = async (dispatch) => {
  try {
    const res = await axios.get(`${URL}:8080/api/admin/GetCompanies`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllCompanyForAdmin(res.data.object));
  } catch (error) { }
}


export const editInforPassenger = async (object, email, toast, dispatch) => {

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
    getUser(email, dispatch);
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


export const AddDriverByCompany = async (driver, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/RegisterDriver`,
      {
        companyEmail: driver.companyEmail,
        email: driver.email,
        password: driver.password,
        firstName: driver.firstName,
        lastName: driver.lastName,
        phoneNumber: driver.phoneNumber,
        language: "vi",
        country: driver.country,
        city: driver.city,

      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getDriversForCompany(driver.companyEmail, dispatch);
    toast.success("Tạo tài khoản tài xế thành công")
  } catch (error) {
    toast.error("Tạo tài khoản tài xế thất bại")
  }
}
export const EditVehicoByCompany = async (vehicle, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/editVehicle`,
      {
        producer: vehicle.producer,
        produceYear: vehicle.produceYear,
        interiorColor: vehicle.interiorColor,
        exteriorColor: vehicle.exteriorColor,
        plate: vehicle.plate,
        platState: vehicle.platState,
        plateCountry: vehicle.plateCountry,
        typeId: 1,
        id: vehicle.id
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getAllVehico(vehicle.companyEmail, dispatch);
    toast.success("Thay đổi thông tin phương tiện thành công")
  } catch (error) {
    toast.error("Thay đổi thông tin phương tiện thất bại")
  }
}



export const EditDriverByCompany = async (driver, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/editDriver`,
      {
        email: driver.email,
        firstName: driver.firstName,
        lastName: driver.lastName,
        phoneNumber: driver.phoneNumber,
        language: "vi",
        country: driver.country,
        city: driver.city,

      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getDriversForCompany(driver.companyEmail, dispatch);
    toast.success("Thay đổi thông tin tài khoản tài xế thành công")
  } catch (error) {
    toast.error("Thay đổi thông tin tài khoản tài xế thất bại")
  }
}



export const deleteDriverByCompany = async (id, companyEmail, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/deleteDriver`, {
      driverID: id,
    }, {
      headers: { 'Content-Type': 'application/json' }
    });
    getDriversForCompany(companyEmail, dispatch);
    toast.success("Xóa tài khoản tài xế thành công")
  } catch (error) {
    toast.error("Xóa tài khoản tài xế thất bại")
  }
}

export const deleteVehicelByCompany = async (driverID, companyEmail, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/deleteVehicle`,
      {
        id: driverID
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getAllVehico(companyEmail, dispatch);
    toast.success("Xóa tài khoản tài xế thành công")
  } catch (error) {
    toast.error("Xóa tài khoản tài xế thất bại")
  }
}



export const UploadFile = async (object, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/Upload/Document`,
      {
        base64: object.base64,
        expired_month: object.month,
        expired_year: object.year,
        file_name: object.fileName,
        createBy: object.createBy
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    if (object.fileName === 'Avatar') {
      getUser(object.createBy, dispatch)
    } else {
      toast.success("Upload file thành công")
    }

  } catch (error) {
    toast.error("Upload file thất bại")
  }
}


export const ChaangeStatusDoc = async (id, status, toast,dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/admin/DocumentChangeStatus`,
      {
        id: id,
        status: status
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    if (status == "VALID") {
      toast.success("Tài liệu được chấp thuận")
    }
    if (status == "INVALID"){
      toast.error("Tài liệu không được chấp thuận")
    }
      getDriversByAdmin(dispatch); 
      console.log("object");
  } catch (error) {
    toast.error("Thay đổi thất bại")
  }
}


export const SendEmail = async (object, toast) => {
  try {
    const res = await axios.post(`${URL}:8080/api/admin/sendEmail`,
      {
        subject:object.subject,
        emailTo:object.email,
        body:object.body
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
      toast.success("Gửi Email thành công")
  } catch (error) {
      toast.error("Gửi Email thất bại")
  }
}


export const resendCode = async (email) => {
  try {
    const res = await axios.get(`${URL}:8080/api/getResendCode?email=${email}`, {
      headers: { 'Content-Type': 'application/json' }
    });
  } catch (error) { }
}

export const VerifyCodeEmail = async (newUser,code,toast,navigate) => {
  try {
    const res = await axios.post(`${URL}:8080/api/VerifyCode`,
      {
        email:newUser.email,
        code:code,
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
      navigate('/signup/driver-doc', { state: { newUser } });
  } catch (error) {
      toast.error("Vui lòng nhập lại mã xác nhận")
  }
}

export const ChangeStatusSignUp = async (email,status,dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/ChangeStatusVerify`,
      {
        email:email,
        status:status,
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
      getUser(email,dispatch)
  } catch (error) {

  }
}

