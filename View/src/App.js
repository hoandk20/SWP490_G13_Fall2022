import logo from './logo.svg';
import './App.css';
import 'antd/dist/antd.css'
import Taixe from './components/layout/index'
import { Route, Routes } from 'react-router';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import routers from './components/router';
import PrivateRoute from './components/router/private-router';

function App() {
  return (
    <div className="App">
      <div className="container">

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
