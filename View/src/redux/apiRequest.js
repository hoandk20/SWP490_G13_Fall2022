import axios from 'axios'
import { toast } from 'react-toastify';

import { loginFailed, loginStart, loginSuccess, logOutFailed, logOutStart, logOutSuccess, registerFailed, registerStart, registerSuccess } from './authSlice'
import { getAllCityInVi } from './dataSlice';
import { createTripFailed, createTripStart, createTripSuccess, getListFreeTripFailed, getListFreeTripStart, getListFreeTripSuccess, getTripDetailDriverFailed, getTripDetailDriverStart, getTripDetailDriverSuccess, passengerRegisterTripSuccess } from './freeTripSlice';
import { getTripHistoryFailed, getTripHistoryOfDriverFailed, getTripHistoryOfDriverStart, getTripHistoryOfDriverSuccess, getTripHistoryStart, getTripHistorySuccess } from './tripHistorySlice';
import { getUserStart, getUserSuccess, deleteUser, getUserFailed, getALlDriverForCompany, getAllDriverForCompany, getAllDrivers, getAllCompanyForAdmin, getDriverByDriverEmail, getCompanyByCompanyEmail } from './userSlice';
import { getAllVehicos } from './vehicoSlice';
const BASE_URL = "http://localhost"
const URL = "http://26.36.110.116";



export const loginUser = async (user, dispatch, navigate) => {
  dispatch(loginStart())
  try {

    const res = await axios({
      method: "post",
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




export const registerPassenger = async (newUser, dispatch, navigate, toast) => {
  dispatch(registerStart())
    const res = await axios
      .post(`${URL}:8080/api/RegisterPassenger`,
        {
          email: newUser.email,
          password: newUser.password,
          firstName: newUser.firstName,
          lastName: newUser.lastName,
          phoneNumber: newUser.phoneNumber,
          language: "vi"
        },
        {
          headers: { 'Content-Type': 'application/json' }
        })
      .then(function (response) {
        dispatch(registerSuccess(response.data))
        navigate("/signup/confirm-email", { state: { newUser } });
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email đã tồn tại");
        }else{
          toast.error("Đăng ký không thành công");
        }
        dispatch(registerFailed())
      });

}

export const registerDriver = async (newUser, dispatch, navigate, toast) => {
  dispatch(registerStart())

    const rest = await axios
      .post(`${URL}:8080/api/RegisterDriver`, {
        email: newUser.email,
        password: newUser.password,
        firstName: newUser.firstName,
        lastName: newUser.lastName,
        phoneNumber: newUser.phoneNumber,
        language: "vi",
        country: newUser.country,
        city: newUser.city
      },
        {
          headers: { 'Content-Type': 'application/json' }
        })
      .then(function (response) {
        console.log(response)
        dispatch(registerSuccess(response.data))
        navigate('/signup/confirm-email', { state: { newUser } });
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email đã tồn tại");
        }else{
          toast.error("Đăng ký không thành công");
        }
        dispatch(registerFailed())
      });



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
        navigate('/signup/confirm-email', { state: { user } });
      })
      .catch(function (error) {
        if (error.response.data.object.IsExistedEmail) {
          toast.error("Email đã tồn tại");
        }else{
          toast.error("Đăng ký không thành công");
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
        listPolyline: trip.listPolyline
      },
        {
          headers: { 'Content-Type': 'application/json' }
        });

    console.log("res:", res);
    dispatch(createTripSuccess(res.data.object));
    const record = res.data.object;
    navigate('/taixe/freeTrip/detail/', { state: { record } });

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

export const getListFreeTrip = async (trip, dispatch) => {
  try {
    dispatch(getListFreeTripStart())
    const res = await axios.post(`${URL}:8080/api/tripdriver/search`, {
      listPolyline: trip.listPolyline,
      status: "OPEN",
      registerSeat: trip.registerSeat,
      dateStart: trip.dateStart,
      timeStart: trip.timeStart
    },
      {
        headers: { 'Content-Type': 'application/json' }
      })
    dispatch(getListFreeTripSuccess(res.data))
  } catch (error) {
    getListFreeTripFailed();
  }
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

export const changeStatusPassengerRegister = async (id, status, toast, dispatch, tripId) => {
  try {
    const res = await axios.post(`${URL}:8080/api/tripPassenger/updateRegisterStatus`, {
      id: id,
      status: status
    }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    // if(status==="APPR"){
    //   toast.success("Không thể duyệt hành khách này")
    // }
    toast.success("Duyệt thành công")
    getTripDetailDriver(tripId, dispatch)
  } catch (error) {
    toast.error("Không thể duyệt hành khách này")
  }
}

export const changeStatusTripDriver = async (id, status, dispatch, navigate) => {
  try {
    const res = await axios.post(`${URL}:8080/api/tripdriver/ChangeStatus`, {
      id: id,
      status: status
    }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    if (status === "CANC") {
      navigate("/taixe/trip-history")
    }
    getTripDetailDriver(id, dispatch)
  } catch (error) {

  }
}


export const getTripHistoryDriver = async (trip, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/tripdriver/listTrip`, {
      driverEmail: trip.email,
      passengerEmail: trip.passengerEmail,
      dateFrom: trip.dateFrom,
      dateTo: trip.dateTo,
      status: trip.status,
    },
      {
        headers: { 'Content-Type': 'application/json' }
      });
    
    dispatch(getTripHistorySuccess(res.data.object));

  } catch (error) {
    // dispatch(getTripHistoryFailed());
  }
}

export const getTripHistoryPassenger = async (trip, dispatch) => {
  // dispatch(getTripHistoryStart());
  try {
    const res = await axios.post(`${URL}:8080/api/tripPassenger/listTrip`, {
      passengerEmail: trip.email,
      driverEmail: trip.driverEmail,
      dateFrom: trip.dateFrom,
      dateTo: trip.dateTo,
      status: trip.status,
    },
      {
        headers: { 'Content-Type': 'application/json' }
      });
    
    dispatch(getTripHistorySuccess(res.data.object));

  } catch (error) {
    // dispatch(getTripHistoryFailed());
  }
}



export const getAllVehico = async (email, dispatch) => {
  const vehicle={
    email:email,
    status:"",
    plate:"",
    typeId:"",
  }
  try {
    const res = await axios.get(`${URL}:8080/api/company/getVehicle?companyEmail=${vehicle.email}&plate=${vehicle.plate}&status=${vehicle.status}&typeId=${vehicle.typeId}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllVehicos(res.data.object));

  } catch (error) {
  }
}
export const getAllVehicoFilter = async (vehicle, dispatch) => {


  try {
    const res = await axios.get(`${URL}:8080/api/company/getVehicle?companyEmail=${vehicle.email}&plate=${vehicle.plate}&status=${vehicle.status}&typeId=${vehicle.typeId}`, {
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
        typeId: vehicle.typeId
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getAllVehico(vehicle.companyEmail, dispatch);
    getUser(vehicle.companyEmail, dispatch);
    toast.success("Tạo phương tiện thành công")
  } catch (error) {
    toast.error("Tạo phương tiện thất bại")
  }
}

export const AddVehicoByDriver = async (vehicle, toast, dispatch) => {
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
        typeId: vehicle.typeId
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getUser(vehicle.driverEmail, dispatch);
    toast.success("Tạo phương tiện thành công")
  } catch (error) {
    toast.error("Tạo phương tiện thất bại")
  }
}

export const getDriversForCompany = async (companyEmail, dispatch) => { 
  const status="";
  const driverEmail="";
  const name ="";
  const city="";
  try {
    const res = await axios.get(`${URL}:8080/api/company/GetDriver?companyEmail=${companyEmail}&status=${status}&email=${driverEmail}&name=${name}&city=${city}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    
    dispatch(getAllDriverForCompany(res.data.object));
    console.log("object");
  } catch (error) { }
}

export const getDriversForCompanyFilter = async (driver, dispatch) => {
  if(driver.address===undefined){
    driver.address="";
  }
  try {
    const res = await axios.get(`${URL}:8080/api/company/GetDriver?companyEmail=${driver.companyEmail}&status=${driver.status}&email=${driver.driverEmail}&name=${driver.name}&city=${driver.address}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    
    dispatch(getAllDriverForCompany(res.data.object));
    console.log("object");
  } catch (error) { }
}

export const getDriversByAdmin = async (object, dispatch) => {
  try {
    if (object.regFrom === undefined) {
      object.regFrom = "";
    }
    if (object.regTo === undefined) {
      object.regTo = "";
    }
    if (object.phone === undefined) {
      object.phone = "";
    }
    if (object.driverName === undefined) {
      object.driverName = "";
    }
    if (object.email === undefined) {
      object.email = "";
    }
    if (object.status === undefined) {
      object.status = "";
    }
    if (object.city === undefined) {
      object.city = "";
    }
    if (object.plate === undefined) {
      object.plate = "";
    }
    const res = await axios.get(`${URL}:8080/api/admin/GetDrivers?regFrom=${object.regFrom}&regTo=${object.regTo}&phone=${object.phone}&driverName=${object.driverName}&email=${object.email}&Status=${object.status}&city=${object.city}&plate=${object.plate}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllDriverForCompany(res.data.object));
    console.log("ok");
  } catch (error) { }
}

export const getDriversByAdminAll = async (dispatch) => {
  try {
    const object = {
      regFrom: "",
      regTo: "",
      phone: "",
      driverName: "",
      email: "",
      status: "",
      city: "",
      plate: "",
    }

    const res = await axios.get(`${URL}:8080/api/admin/GetDrivers?regFrom=${object.regFrom}&regTo=${object.regTo}&phone=${object.phone}&driverName=${object.driverName}&email=${object.email}&Status=${object.status}&city=${object.city}&plate=${object.plate}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllDriverForCompany(res.data.object));
    console.log("ok");
  } catch (error) { }
}
export const getCompanysByAdmin = async (object, dispatch) => {
  try {
    const res = await axios.get(`${URL}:8080/api/admin/GetCompanies?regFrom=${object.regFrom}&regTo=${object.regTo}&companyName=${object.companyName}&email=${object.email}&Status=${object.status}&city=${object.city}`, {
      headers: { 'Content-Type': 'application/json' }
    });
    dispatch(getAllCompanyForAdmin(res.data.object));
  } catch (error) { }
}

export const getCompanysByAdmiAll = async (dispatch) => {
  try {
    const object = {
      regFrom: "",
      regTo: "",
      phone: "",
      companyName: "",
      email: "",
      status: "",
      city: "",
    }
    const res = await axios.get(`${URL}:8080/api/admin/GetCompanies?regFrom=${object.regFrom}&regTo=${object.regTo}&companyName=${object.companyName}&email=${object.email}&Status=${object.status}&city=${object.city}`, {
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

export const editInforDriver = async (object, toast, dispatch) => {

  try {
    const res = await axios.post(`${URL}:8080/api/user/changeinfoDriver`, {
      username: object.email,
      firstname: object.firstname,
      lastname: object.lastname,
      avatarBase64: object.avatarBase64,
      address: object.address,
      email: object.email,
      phone: object.phone,
      country: object.country
    },
      {
        headers: { 'Content-Type': 'application/json' }
      });

    getDriverDetail(object.email, dispatch);
    getUser(object.email, dispatch);
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
    toast.error("Thay đổi mật khẩu không thành công");

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
        cityId: driver.city,

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
        typeId: vehicle.typeId,
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
    // getDriverDetail(object.createBy,dispatch);
    // getCompanyDetail(object.createBy,dispatch);
    return true;
  } catch (error) {
    toast.error("Upload file thất bại")
    return false;
  }
}
export const UploadDocumentForVehicle = async (object, toast, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/Upload/DocumentVehicle`,
      {
        base64: object.base64,
        expired_month: object.month,
        expired_year: object.year,
        file_name: object.fileName,
        createBy: object.createBy,
        vehicleId: object.vehicleId
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
      getAllVehico(object.companyEmail,dispatch);
    toast.success("Upload file thành công")
  } catch (error) {
    toast.error("Upload file thất bại")

  }
}


export const ChaangeStatusDoc = async (id, status, email, toast, dispatch) => {
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
    if (status == "INVALID") {
      toast.error("Tài liệu không được chấp thuận")
    }

    getDriverDetail(email, dispatch);
    getCompanyDetail(email, dispatch);



  } catch (error) {
    toast.error("Thay đổi thất bại")
  }
}


export const SendEmail = async (object, toast) => {
  try {
    const res = await axios.post(`${URL}:8080/api/admin/sendEmail`,
      {
        subject: object.subject,
        emailTo: object.email,
        body: object.body
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

export const VerifyCodeEmail = async (newUser, code, toast, navigate) => {
  try {
    const res = await axios.post(`${URL}:8080/api/VerifyCode`,
      {
        email: newUser.email,
        code: code,
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    if (newUser.role == "ROLE_DRIVER") {
      navigate('/signup/driver-doc');
    }
    if (newUser.role == "ROLE_COMPANY") {
      navigate('/signup/company-doc1');
    }
    if (newUser.role == "ROLE_PASSENGER") {
      navigate('/home');
    }
  } catch (error) {
    toast.error("Mã xác nhận không hợp lệ hoặc đã hết hạn")
  }
}

export const ChangeStatusSignUp = async (email, status, dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/ChangeStatusVerify`,
      {
        email: email,
        status: status,
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
    getUser(email, dispatch)
  } catch (error) {

  }
}


export const getDriverDetail = async (userName, dispatch) => {
  try {

    const res = await axios.get(`${URL}:8080/api/driver/detail?driverEmail=${userName}`, {
      headers: { 'Content-Type': 'application/json' }
    })
    await dispatch(getDriverByDriverEmail(res.data.object));
    // getDriversByAdminAll(dispatch);
  } catch (error) {

  }
}

export const getCompanyDetail = async (userName, dispatch) => {
  try {

    const res = await axios.get(`${URL}:8080/api/company/detail?companyEmail=${userName}`, {
      headers: { 'Content-Type': 'application/json' }
    })
    await dispatch(getCompanyByCompanyEmail(res.data.object));
  } catch (error) {

  }
}

export const getAllCity = async (dispatch) => {
  try {

    const res = await axios.get(`${URL}:8080/api/city`, {
      headers: { 'Content-Type': 'application/json' }
    })
    // return res.data.object
    dispatch(getAllCityInVi(res.data));
  } catch (error) {

  }
}


export const AddVehicleForDriver = async (object, toast,dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/setDriverVehicle`,
      {
        email: object.driverEmail,
        vehicle: object.vehicle,
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });

        toast.success("Thêm phương tiện thành công cho tài xế")
      getDriversForCompany(object.companyEmail,dispatch);
  } catch (error) {
      toast.error("Thêm phương tiện thất bại cho tài xế")
  }
}


export const DeleteVehicleForDriver = async (object, toast,dispatch) => {
  try {
    const res = await axios.post(`${URL}:8080/api/company/setDriverVehicle`,
      {
        email: object.driverEmail,
        vehicle: object.vehicle,
        removeVehicleId:object.removeVehicleId
      }
      , {
        headers: { 'Content-Type': 'application/json' }
      });
        toast.success("Gỡ phương tiện thành công")    
      getDriversForCompany(object.companyEmail,dispatch);
  } catch (error) {
      toast.error("Gỡ phương tiện thất bại")
  }
}


export const getDocumentVehicle = async (docId) => {
  try {
    const res = await axios.get(`${URL}:8080/api/company/getDocument?docId=${docId}`, {
      headers: { 'Content-Type': 'application/json' }
    })
  } catch (error) {

  }
}


