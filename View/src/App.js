import logo from './logo.svg';
import './App.css';
import 'antd/dist/antd.css'
import Taixe from './components/layout/index'
import { Route, Routes } from 'react-router';
import RegisterPassenger from './views/registers/register-khachhang';
import RegisterDriver from './views/registers/register-taixe';
import RegisterDriverInfo from './views/registers/register-taixe/register-taixe-info';
import DriverManagement from './views/taixe/driver-mgt';
import DriverManagementInfo from './views/taixe/driver-mgt/driver-mgt-info';
import AddDriver from './views/taixe/driver-mgt/add-driver';
import FreeTripDriver from './views/taixe/free-trip';
import TripHistoryDriver from './views/taixe/trip-history';
import VehicoManagement from './views/taixe/vehico-mgt';
import AddVehico from './views/taixe/vehico-mgt/add-vehico';
import InfoContactTaixe from './views/taixe/info-contact/info-contact-taixe';
import InfoContactUser from './views/taixe/info-contact/info-contact-user';
import ModalAddVehico from './components/commons/modals/modal-add-vehico';
import DriverDetail from './views/taixe/driver-mgt/driver-detail';
import FreeTripPassenger2 from './views/khachhang/free-trips/free-trip2';
import RegisterCompanyDoc1 from './views/registers/register-congty/register-congty-document/register-congty-document1';
import RegisterCompanyDoc2 from './views/registers/register-congty/register-congty-document/register-congty-document2';
import Login from './components/login';
import { BrowserRouter } from 'react-router-dom';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import routers from './components/router';
import PrivateRoute from './components/router/private-router';

function App() {
  return (
    <div className="App">
      <div className="container">

        {/* <Routes>
          <Route path="/taixe" element={<Taixe />} />
          <Route path="/register-passenger" element={<RegisterPassenger />}/>
          <Route path="/register-driver" element={<RegisterDriver />}/>
          <Route path="/login" element={<Login />}/>
          <Route path="/register-driver-info" element={<RegisterDriverInfo />}/>
          <Route path="/register-company-doc1" element={<RegisterCompanyDoc1 />}/>
          <Route path="/register-company-doc2" element={ <RegisterCompanyDoc2/>}/>
          <Route path="/taixe-driver-mgt" element={<DriverManagement />}/>
          <Route path="/taixe-driver-mgt-info" element={<DriverManagementInfo />}/>
          <Route path="/taixe-driver-mgt-add" element={<AddDriver />}/>
          <Route path="/taixe-table-add" element={<ModalAddVehico />}/>
          <Route path="/taixe-free-trip" element={<FreeTripDriver />}/>
          <Route path="/taixe-trip-history" element={<TripHistoryDriver />}/>
          <Route path="/taixe-vehico-mgt" element={<VehicoManagement />}/>
          <Route path="/taixe-vehico-add" element={<AddVehico />}/>
          <Route path="/taixe-info-tx" element={<InfoContactTaixe />}/>
          <Route path="/taixe-info-user" element={<InfoContactUser />}/>
          <Route path="/taixe-driver-detail" element={<DriverDetail />}/>

          <Route path="/khachhang-free-trip-2" element={<FreeTripPassenger2 />}/>

        </Routes> */}

        <Routes>
          {routers.map((route, index) => {
            const Element = route.element;
            const roleTarget = route.roleTarget;
            return (
              <Route
                key={index}
                path={route.path}
                element={
                  <PrivateRoute roleTarget={roleTarget}>
                  <Element />
                    </PrivateRoute>
               
                }
              />
            );
          })}
        </Routes>
        <ToastContainer
          position="top-right"
          autoClose={5000}
          hideProgressBar={false}
          newestOnTop={false}
          closeOnClick
          rtl={false}
          pauseOnFocusLoss
          draggable
          pauseOnHover
          theme="light"
        />
        {/* Same as */}
        <ToastContainer />
      </div>
    </div>
  );
}

export default App;
