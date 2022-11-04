import DriverManagement from "../../views/congty/driver-mgt";
import AddDriver from "../../views/congty/driver-mgt/add-driver";
import DriverDetail from "../../views/congty/driver-mgt/driver-detail";
import DriverManagementInfo from "../../views/congty/driver-mgt/driver-mgt-info";
import VehicoManagement from "../../views/congty/vehico-mgt";
import Home from "../../views/home";
import FreeTripDetailOfDriver from "../../views/khachhang/free-trips/free-trip-detail-taixe";
import SerachFreeTripForPassenger from "../../views/khachhang/free-trips/search-free-trip";
import InfoContactUser from "../../views/khachhang/info-contact";
import TripHistoryPassenger from "../../views/khachhang/trip-history";
import RegisterCompanyDoc1 from "../../views/registers/register-congty/register-congty-document/register-congty-document1";
import RegisterCompanyDoc2 from "../../views/registers/register-congty/register-congty-document/register-congty-document2";
import RegisterPassenger from "../../views/registers/register-khachhang";
import RegisterDriver from "../../views/registers/register-taixe";
import RegisterDriverInfo from "../../views/registers/register-taixe/register-taixe-info";
import RegisterDriverInfoVehico from "../../views/registers/register-taixe/tx-cty-infoVehico";
import FreeTripDriver from "../../views/taixe/free-trip";
import CreateFreeTripForDriver from "../../views/taixe/free-trip/create-free-trip";
import FreeTripDetail from "../../views/taixe/free-trip/free-trip-detail";
import InfoContactTaixe from "../../views/taixe/info-contact/info-contact-taixe";
import TripHistoryDriver from "../../views/taixe/trip-history";
import UploadAndDisplayImage from "../commons/uploadImage";
import Login from "../login";
import RegisterHome from "../registers/home";

const routers = [
    {
        path: '/signin',
        roleTarget: "ALL",
        element: Login
    },
    {
        path: '/signup/driver',
        roleTarget: "ALL",
        element: RegisterDriver
    },
    {
        path: '/signup/driver-info',
        roleTarget: "ALL",
        element: RegisterDriverInfo
    },
    {
        path: '/signup/passenger',
        roleTarget: "ALL",
        element: RegisterPassenger
    },

    {
        path: '/signup/company-doc1',
        roleTarget: "ALL",
        element: RegisterCompanyDoc1
    },
    {
        path: '/signup/company-doc2',
        roleTarget: "ALL",
        element: RegisterCompanyDoc2
    },
    {
        path: '/signup/vehico-info',
        roleTarget: "ALL",
        element: RegisterDriverInfoVehico
    },


    {
        path: '/taixe/free-trip',
        roleTarget: "ROLE_DRIVER",
        element: FreeTripDriver
    },
    {
        path: '/taixe/trip-history',
        roleTarget: "ALL",
        element: TripHistoryDriver
    },


    {
        path: '/taixe/info',
        roleTarget: "ROLE_DRIVER",
        element: InfoContactTaixe
    },
    {
        path: '/taixe/freeTrip/create',
        roleTarget: "ALL",
        element: CreateFreeTripForDriver
    },
    {
        path: '/taixe/freeTrip/detail',
        roleTarget: "ALL",
        element: FreeTripDetail
    },
    //khach hang
    {
        path: '/khachhang/info',
        roleTarget: "ALL",
        element: InfoContactUser
    },
    {
        path: '/khachhang/search-freeTrip',
        roleTarget: "ALL",
        element: SerachFreeTripForPassenger
    },
    {
        path: '/khachhang/freeTrip/detail-of-taixe',
        roleTarget: "ALL",
        element: FreeTripDetailOfDriver
    },
    {
        path: '/khachhang/trip-history',
        roleTarget: "ALL",
        element: TripHistoryPassenger
    },
    //cong ty
    {
        path: '/congty/vehico-mgt',
        roleTarget: "ALL",
        element: VehicoManagement
    },
    {
        path: '/congty/driver-mgt',
        roleTarget: "ALL",
        element: DriverManagement
    },

    {
        path: '/congty/driver-mgt/info',
        roleTarget: "ROLE_COMPANY",
        element: DriverManagementInfo
    },
    {
        path: '/congty/driver-mgt/add',
        roleTarget: "ALL",
        element: AddDriver
    },
    {
        path: '/congty/driver-detail',
        roleTarget: "ROLE_COMPANY",
        element: DriverDetail
    },
    {
        path: '/signup/home',
        roleTarget: "ALL",
        element: RegisterHome
    },
    {
        path: '/home',
        roleTarget: "ALL",
        element: Home
    },
    {
        path: '/uploadImage',
        roleTarget: "ALL",
        element: UploadAndDisplayImage
    }
]
export default routers