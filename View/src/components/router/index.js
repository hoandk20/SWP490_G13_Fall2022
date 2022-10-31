import DriverManagement from "../../views/congty/driver-mgt";
import AddDriver from "../../views/congty/driver-mgt/add-driver";
import DriverDetail from "../../views/congty/driver-mgt/driver-detail";
import DriverManagementInfo from "../../views/congty/driver-mgt/driver-mgt-info";
import VehicoManagement from "../../views/congty/vehico-mgt";
import Home from "../../views/home";
import InfoContactUser from "../../views/khachhang/info-contact";
import RegisterCompanyDoc1 from "../../views/registers/register-congty/register-congty-document/register-congty-document1";
import RegisterCompanyDoc2 from "../../views/registers/register-congty/register-congty-document/register-congty-document2";
import RegisterPassenger from "../../views/registers/register-khachhang";
import RegisterDriver from "../../views/registers/register-taixe";
import RegisterDriverInfo from "../../views/registers/register-taixe/register-taixe-info";
import RegisterDriverInfoVehico from "../../views/registers/register-taixe/tx-cty-infoVehico";
import FreeTripDriver from "../../views/taixe/free-trip";
import CreateFreeTripForDriver from "../../views/taixe/free-trip/create-free-trip";
import InfoContactTaixe from "../../views/taixe/info-contact/info-contact-taixe";
import TripHistoryDriver from "../../views/taixe/trip-history";
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
        path: '/congty/driver-mgt',
        roleTarget: "ROLE_COMPANY",
        element: DriverManagement
    },

    {
        path: '/congty/driver-mgt/info',
        roleTarget: "ROLE_COMPANY",
        element: DriverManagementInfo
    },
    {
        path: '/congty/driver-mgt/add',
        roleTarget: "ROLE_COMPANY",
        element: AddDriver
    },

    {
        path: '/taixe/free-trip',
        roleTarget: "ROLE_DRIVER",
        element: FreeTripDriver
    },
    {
        path: '/taixe/trip-history',
        roleTarget: "ROLE_DRIVER",
        element: TripHistoryDriver
    },
    {
        path: '/congty/vehico-mgt',
        roleTarget: "ROLE_COMPANY",
        element: VehicoManagement
    },
    // {
    //     path: '/taixe/vehico-mgt/add',
    //    roleTarget:"ALL",
    //     element: FreeTripDriver
    // },
    {
        path: '/taixe/info',
        roleTarget: "ROLE_DRIVER",
        element: InfoContactTaixe
    },
    {
        path: '/taixe/createTrip',
        roleTarget: "ALL",
        element: CreateFreeTripForDriver
    },
    {
        path: '/khachhang/info',
        roleTarget: "ALL",
        element: InfoContactUser
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
    }

]
export default routers