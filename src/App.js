import logo from './logo.svg';
import './App.css';
import  Taixe from './components/layout/taixe/index'
import { Route, Routes } from 'react-router';
import RegisterDriver from './views/registers/register-khachhang';

function App() {
  return (
    <div className="App">
      <div className="container">
        <Routes>
          <Route path="/taixe" element={<Taixe />} />
          <Route path="/register-driver" element={<RegisterDriver />}/>
        </Routes>
      </div>
    </div>
  );
}

export default App;
