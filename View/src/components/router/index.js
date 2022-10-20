import RegisterCompanyDoc1 from "../../views/registers/register-congty/register-congty-document/register-congty-document1";
import RegisterCompanyDoc2 from "../../views/registers/register-congty/register-congty-document/register-congty-document2";
import RegisterPassenger from "../../views/registers/register-khachhang";
import RegisterDriver from "../../views/registers/register-taixe";
import RegisterDriverInfo from "../../views/registers/register-taixe/register-taixe-info";

import RegisterDriverInfoVehico from "../../views/registers/register-taixe/tx-cty-infoVehico";
import DriverManagement from "../../views/taixe/driver-mgt";
import AddDriver from "../../views/taixe/driver-mgt/add-driver";
import DriverDetail from "../../views/taixe/driver-mgt/driver-detail";
import DriverManagementInfo from "../../views/taixe/driver-mgt/driver-mgt-info";
import FreeTripDriver from "../../views/taixe/free-trip";
import InfoContactTaixe from "../../views/taixe/info-contact/info-contact-taixe";
import InfoContactUser from "../../views/taixe/info-contact/info-contact-user";
import TripHistoryDriver from "../../views/taixe/trip-history";
import VehicoManagement from "../../views/taixe/vehico-mgt";
import Login from "../login";
import Home from "../../views/home";

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
        path: '/taixe/driver-mgt',
        roleTarget: "ALL",
        element: DriverManagement
    },

    {
        path: '/taixe/driver-mgt/info',
        roleTarget: "ALL",
        element: DriverManagementInfo
    },
    {
        path: '/taixe/driver-mgt/add',
        roleTarget: "ALL",
        element: AddDriver
    },

    {
        path: '/taixe/free-trip',
        roleTarget: "ALL",
        element: FreeTripDriver
    },
    {
        path: '/taixe/trip-history',
        roleTarget: "ALL",
        element: TripHistoryDriver
    },
    {
        path: '/taixe/vehico-mgt',
        roleTarget: "ALL",
        element: VehicoManagement
    },
    // {
    //     path: '/taixe/vehico-mgt/add',
    //    roleTarget:"ALL",
    //     element: FreeTripDriver
    // },
    {
        path: '/taixe/info/driver',
        roleTarget: "ALL",
        element: InfoContactTaixe
    },
    {
        path: '/taixe/info/user',
        roleTarget: "ALL",
        element: InfoContactUser
    },
    {
        path: '/taixe/driver-detail',
        roleTarget: "ALL",
        element: DriverDetail
    },
    {
        path: '/home',
        roleTarget: "ALL",
        element: Home
    }

]
export default routers