import React from 'react';
import { Button, Col, DatePicker, Form, Row, Select } from 'antd';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';
import { useLocation, useNavigate } from 'react-router';
import { useDispatch, useSelector } from 'react-redux';
import { useState } from 'react';
import { toast } from 'react-toastify';
import { ChangeStatusSignUp, getUser, UploadFile } from '../../../../redux/apiRequest';
import { useEffect } from 'react';
import axios from 'axios';
const RegisterDriverInfoVehico = () => {
    const navigate = useNavigate(); 
    const dispatch = useDispatch();
    const location = useLocation();
    const newUser = useSelector((state) => state.user.userInfo?.currentUser);
     const vehicle = newUser?.vehicleRequest;
    const [count, setCount] = useState(0);
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();

    const [Chung_Nhan_Bao_Hiem,serChung_Nhan_Bao_Hiem]=useState(false);
    const [Chung_Nhan_Dang_Kiem,setChung_Nhan_Dang_Kiem]=useState(false);
    const convertBase64 = (file) => {
        return new Promise((resolve, reject) => {
            const fileReader = new FileReader();
            fileReader.readAsDataURL(file);

            fileReader.onload = () => {
                resolve(fileReader.result);
            };

            fileReader.onerror = (error) => {
                reject(error);
            };
        });
    };
    const onClickFinish = () => {
        ChangeStatusSignUp(newUser.email, 4);
        navigate('/home');
    };
    function getTime1(date, dateString) {
        setDate1(dateString);
    }
    function getTime2(date, dateString) {
        setDate2(dateString);
    }
    const uploadImage1 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage1(base64);
    };
    const uploadImage2 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage2(base64);
    };
    const uploadfile1 = async() => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: newUser.email,
            fileName: "Chung_Nhan_Bao_Hiem",
            year: year,
            month: month,
            vehicleId:newUser.vehicleRequest.id
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/DocumentVehicle`,
              {
                base64: object.base64,
                expired_month: object.month,
                expired_year: object.year,
                file_name: object.fileName,
                createBy: object.createBy,
                vehicleId:object.vehicleId
              }
              , {
                headers: { 'Content-Type': 'application/json' }
              });
              serChung_Nhan_Bao_Hiem(true);
              toast.success("Upload t??i li???u th??nh c??ng")
          } catch (error) {
            toast.error("Upload t??i li???u th???t b???i")
          }
   
    };



    const uploadfile2 = async() => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: newUser.email,
            fileName: "Chung_Nhan_Dang_Kiem",
            year: year,
            month: month,
            vehicleId:newUser.vehicleRequest.id,
        }
        try {
            const res = await axios.post(`${process.env.REACT_APP_BACKEND_KEY}:8080/api/Upload/DocumentVehicle`,
              {
                base64: object.base64,
                expired_month: object.month,
                expired_year: object.year,
                file_name: object.fileName,
                createBy: object.createBy,
                vehicleId:object.vehicleId
              }
              , {
                headers: { 'Content-Type': 'application/json' }
              });
              setChung_Nhan_Dang_Kiem(true)
              toast.success("Upload t??i li???u th??nh c??ng")
          } catch (error) {
            toast.error("Upload t??i li???u th???t b???i")
          }
 
    };
    useEffect(()=>{
        getUser(newUser.email,dispatch);
       
      },[])
    return (
        <div className='container'>
            <div className='info-vehico'>
                <h2>T??I LI???U C???N CHO PH????NG TI???N</h2>
                <div className='info-vehico-content'>

                    Xin vui l??ng th??m th??ng tin v?? t???i c??c t??i li???u li??n quan ?????n xe c???a b???n. Xe c???a b???n c???n c?? n??m s???n xu???t
                    t??? n??m 2008 tr??? l??n. ?????i v???i xe 7 ch??? c???n c?? n??m s???n xu???t t??? n??m 2012 tr??? l??n. ?????i v???i xe m?? t??, vui l??ng
                    t???i gi???y ????ng k?? l??n thay cho gi???y ????ng ki???m
                </div>
                <div className='card-doc'>
                    <div className='form-header1'>
                        <span>
                            Th??ng tin ph????ng ti???n :
                         
                        </span>

                    </div>
                    <div className='form-content'>
                        <div className='form-info'>
                            <Row>
                                <Col sm={12} md={6} >
                                    <p>N??m s???n xu???t:</p> {vehicle?.produceYear}
                                </Col>
                                <Col sm={12} md={6} >
                                    <p>M??u s??n:</p> {vehicle?.exteriorColor}
                                </Col>
                                <Col sm={12} md={6} >{
                                    vehicle?.typeId===1?(
                                        <>
                                            <p>Lo???i xe:</p> Xe m??y
                                        </>
                                    ):(
                                        <>
                                            <p>Lo???i xe:</p> ?? t??
                                        </>
                                    )
                                }
                                    
                                </Col>
                                <Col sm={12} md={6} >
                                    <p>N??i ????ng k??:</p> {vehicle?.platState}
                                </Col>
                            </Row>
                        </div>
                    </div>
                </div>
                <div>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        Gi???y ch???ng nh???n b???o hi???m.
                                     
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "170px" }}>
                                        <img src={baseImage1} height="160px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span>
                                            Ng??y h???t h???n <DatePicker onChange={getTime1}  picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage1(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile1} type='primary'>G???i <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        Gi???y ch???ng nh???n ????ng ki???m
                                       
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "170px" }}>
                                        <img src={baseImage2} height="160px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <span>
                                            Ng??y h???t h???n <DatePicker onChange={getTime2} picker='month' />
                                        </span>
                                        <input
                                            type="file"
                                            style={{ color: "#fff" }}
                                            onChange={(e) => {
                                                uploadImage2(e);
                                            }}
                                        />
                                        <Button className='btn-submit' onClick={uploadfile2} type='primary'>G???i <CheckOutlined /></Button>
                                    </div>
                                </div>
                            </div>
                        </Col>
                    </Row>
                </div>
                <div style={{ marginTop: "50px" }}>
                    
                    {Chung_Nhan_Bao_Hiem===true && Chung_Nhan_Dang_Kiem===true? (
                       <Button type='primary' onClick={onClickFinish}>K???t th??c <RightOutlined /> </Button>
                    ) : (
                        <Button type='primary' disabled>K???t th??c <RightOutlined /> </Button>
                    )}
                </div>
            </div>
        </div>
    )
}
export default RegisterDriverInfoVehico