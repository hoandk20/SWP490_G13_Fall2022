import CompanyManagementAdmin from "../../views/admin/congty-mgt";
import CompanyDetailAdmin from "../../views/admin/congty-mgt/congty-mgt-detail";
import FreeTripManagementAdmin from "../../views/admin/free-trips-mgt";
import TripDetailAdmin from "../../views/admin/free-trips-mgt/free-trips-mgt-detail";
import PassengerManagementAdmin from "../../views/admin/khachhang-mgt";
import PassengerDetailAdmin from "../../views/admin/khachhang-mgt/khachhang-mgt-detail";
import DriverManagementAdmin from "../../views/admin/taixe-mgt";
import DriverDetailAdmin from "../../views/admin/taixe-mgt/taixe-detail";
import DocumentCompany from "../../views/congty/document";
import DriverManagement from "../../views/congty/driver-mgt";
import AddDriver from "../../views/congty/driver-mgt/add-driver";
import DriverDetail from "../../views/congty/driver-mgt/driver-detail";
import DriverManagementInfo from "../../views/congty/driver-mgt/driver-mgt-info";
import AllTripCompany from "../../views/congty/free-trips";
import FreeTripDetailCompany from "../../views/congty/free-trips/free-trip-detail";
import InfoCompany from "../../views/congty/info";
import VehicoManagement from "../../views/congty/vehico-mgt";
import Home from "../../views/home";
import HomeAll from "../../views/homeAll";
import FreeTripDetailOfDriver from "../../views/khachhang/free-trips/free-trip-detail-taixe";
import SerachFreeTripForPassenger from "../../views/khachhang/free-trips/search-free-trip";
import InfoContactUser from "../../views/khachhang/info-contact";
import TripHistoryPassenger from "../../views/khachhang/trip-history";
import RegisterConfirmEmail from "../../views/registers/confirm-email";
import RegisterCompanyDoc1 from "../../views/registers/register-congty/register-congty-document/register-congty-document1";
import RegisterAddVehicle from "../../views/registers/register-congty/register-congty-document/register-congty-document2";
import RegisterCompanyDoc2 from "../../views/registers/register-congty/register-congty-document/register-congty-document2";
import RegisterCompanyInfo from "../../views/registers/register-congty/register-congty-info";
import RegisterPassenger from "../../views/registers/register-khachhang";
import RegisterDriver from "../../views/registers/register-taixe";
import RegisterDriverDocument from "../../views/registers/register-taixe/register-taixe-document";
import RegisterDriverInfo from "../../views/registers/register-taixe/register-taixe-info";
import RegisterDriverInfoVehico from "../../views/registers/register-taixe/tx-cty-infoVehico";
import DocumentDriver from "../../views/taixe/document";
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
        path: '/signup/driver&company',
        roleTarget: "ALL",
        element: RegisterDriver
    },
    {
        path: '/signup/driver-info',
        roleTarget: "ALL",
        element: RegisterDriverInfo
    },
    {
        path: '/signup/company-info',
        roleTarget: "ALL",
        element: RegisterCompanyInfo
    },
    {
        path: '/signup/passenger',
        roleTarget: "ALL",
        element: RegisterPassenger
    },
    {
        path: '/signup/driver-doc',
        roleTarget: "ALL",
        element: RegisterDriverDocument
    },
    {
        path: '/signup/company-doc1',
        roleTarget: "ALL",
        element: RegisterCompanyDoc1
    },
    {
        path: '/signup/add-vehico',
        roleTarget: "ALL",
        element: RegisterAddVehicle
    },
    {
        path: '/signup/vehico-info',
        roleTarget: "ALL",
        element: RegisterDriverInfoVehico
    },
    {
        path: '/signup/confirm-email',
        roleTarget: "ALL",
        element: RegisterConfirmEmail
    },
    //tai xe
    {
        path: '/taixe/document',
        roleTarget: "ROLE_DRIVER",
        element: DocumentDriver
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
        path: '/congty/trips',
        roleTarget: "ROLE_COMPANY",
        element: AllTripCompany
    },
    {
        path: '/congty/trips/detail',
        roleTarget: "ROLE_COMPANY",
        element: FreeTripDetailCompany
    },
    {
        path: '/congty/document',
        roleTarget: "ROLE_COMPANY",
        element: DocumentCompany
    },
    {
        path: '/congty/info',
        roleTarget: "ROLE_COMPANY",
        element: InfoCompany
    },
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
    //home
    {
        path: '/home',
        roleTarget: "ALL",
        element: Home
    },
    {
        path: '/',
        roleTarget: "ALL",
        element: HomeAll
    },
    {
        path: '/uploadImage',
        roleTarget: "ALL",
        element: UploadAndDisplayImage
    },

    //admin
    {
        path: '/admin/taixe-mgt',
        roleTarget: "ALL",
        element: DriverManagementAdmin
    },
    {
        path: '/admin/taixe-mgt/detail',
        roleTarget: "ROLE_ADMIN",
        element: DriverDetailAdmin
    },
    {
        path: '/admin/company-mgt',
        roleTarget: "ALL",
        element: CompanyManagementAdmin
    },
    {
        path: '/admin/company-mgt/detail',
        roleTarget: "ROLE_ADMIN",
        element: CompanyDetailAdmin
    },
    {
        path: '/admin/free-trip-mgt',
        roleTarget: "ALL",
        element: FreeTripManagementAdmin
    },
    {
        path: '/admin/free-trip-mgt/detail',
        roleTarget: "ROLE_ADMIN",
        element: TripDetailAdmin
    },
    {
        path: '/admin/passenger-mgt',
        roleTarget: "ROLE_ADMIN",
        element: PassengerManagementAdmin
    },
    {
        path: '/admin/passenger-mgt/detail',
        roleTarget: "ROLE_ADMIN",
        element: PassengerDetailAdmin
    },


    

]
export default routers