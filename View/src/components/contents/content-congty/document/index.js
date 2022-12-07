import { CheckOutlined, FileOutlined } from '@ant-design/icons';
import { Button, DatePicker } from 'antd';
import axios from 'axios';
import React from 'react';
import { useEffect } from 'react';
import { useState } from 'react';
import { useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { UploadDocumentForVehicle, UploadFile } from '../../../../redux/apiRequest';
const URL = "http://26.36.110.116";

const DocumentCompany = () => {
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [vehicleId, setVehicleId] = useState("");
    // if (user.vehicleRequest !== null) {
    //     setVehicleId(user.vehicleRequest.id);
    // }
    const [Bang_lai_xe, setBang_lai_xe] = useState("");
    const [Chung_Nhan_Kinh_nghiem, setChung_Nhan_Kinh_nghiem] = useState("");
    const [GP_Kinh_Doanh, setGP_Kinh_Doanh] = useState("");
    const [GP_Hoat_Dong, setGP_Hoat_Dong] = useState("");


    const [baseImageBang_lai_xe, setBaseImageBang_lai_xe] = useState("");
    const [baseImageChung_Nhan_Kinh_nghiem, setBaseImageChung_Nhan_Kinh_nghiem] = useState("");
    const [baseImageGP_Kinh_Doanh, setBaseImageGP_Kinh_Doanh] = useState("");
    const [baseImageGP_Hoat_Dong, setBaseImageGP_Hoat_Dong] = useState("");

    const [dateBang_lai_xe, setDateBang_lai_xe] = useState();
    const [dateChung_Nhan_Kinh_nghiem, setDateChung_Nhan_Kinh_nghiem] = useState();
    const [dateGP_Kinh_Doanh, setDateGP_Kinh_Doanh] = useState();
    const [dateGP_Hoat_Dong, setDateGP_Hoat_Dong] = useState();

    const [checkBang_lai_xe, setcheckBang_lai_xe] = useState(false);
    const [checkChung_Nhan_Kinh_nghiem, setcheckChung_Nhan_Kinh_nghiem] = useState(false);
    const [checkGP_Kinh_Doanh, setcheckGP_Kinh_Doanh] = useState(false);
    const [checkGP_Hoat_Dong, setcheckGP_Hoat_Dong] = useState(false);

    const addDocBang_lai_xe = () => {
        setcheckBang_lai_xe(true);
    }
    const addDocChung_Nhan_Kinh_nghiem = () => {
        setcheckChung_Nhan_Kinh_nghiem(true);
    }
    const addDocGP_Kinh_Doanh = () => {
        checkGP_Kinh_Doanh(true);
    }
    const addDocGP_Hoat_Dong = () => {
        checkGP_Hoat_Dong(true);
    }
    console.log("ac", GP_Hoat_Dong);
    const getDocBang_lai_xe = async () => {
        const file_name = "Bang_lai_xe";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBang_lai_xe(res.data.object);
    }
    const getDocChung_Nhan_Kinh_nghiem = async () => {
        const file_name = "Chung_Nhan_Kinh_nghiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setChung_Nhan_Kinh_nghiem(res.data.object);
    }
    const getDocGP_Kinh_Doanh = async () => {
        const file_name = "GP_Kinh_Doanh";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setGP_Kinh_Doanh(res.data.object);
    }
    const getDocGP_Hoat_Dong = async () => {
        const file_name = "GP_Hoat_Dong";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setGP_Hoat_Dong(res.data.object);
    }

    console.log();


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
    const uploadImageBang_lai_xe = async (e) => {
        const file = e.target.files[0];
        console.log(file);
        const base64 = await convertBase64(file);
        setBaseImageBang_lai_xe(base64);
    };
    const uploadImageChung_Nhan_Kinh_nghiem = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImageChung_Nhan_Kinh_nghiem(base64);
    };
    const uploadImageGP_Kinh_Doanh = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImageGP_Kinh_Doanh(base64);
    };
    const uploadImageGP_Hoat_Dong = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImageGP_Hoat_Dong(base64);
    };
    function getTime1(date, dateString) {
        setDateBang_lai_xe(dateString);
    }
    function getTime2(date, dateString) {
        setDateChung_Nhan_Kinh_nghiem(dateString);
    }
    function getTime6(date, dateString) {
        setDateGP_Kinh_Doanh(dateString);
    }
    function getTime7(date, dateString) {
        setDateGP_Hoat_Dong(dateString);
    }
    const uploadfileBang_lai_xe = async () => {
        const arr = dateBang_lai_xe.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImageBang_lai_xe,
            createBy: user?.email,
            fileName: "Bang_lai_xe",
            year: year,
            month: month
        }
        await UploadFile(object, toast);     
        // await getDocChung_Nhan_Bao_Hiem();
        setcheckBang_lai_xe(false)


    };

    const uploadfileChung_Nhan_Kinh_nghiem = async() => {
        const arr = dateChung_Nhan_Kinh_nghiem.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImageChung_Nhan_Kinh_nghiem,
            createBy: user?.email,
            fileName: "Chung_Nhan_Kinh_nghiem",
            year: year,
            month: month,

        }
        await UploadFile(object, toast);
        await getDocChung_Nhan_Kinh_nghiem();  
        setcheckChung_Nhan_Kinh_nghiem(false)
      

    };

    const uploadfileGP_Kinh_Doanh = async() => {
        const arr = dateGP_Kinh_Doanh.split("-");
        const year = arr[0];
        const month = arr[1];
        if (user.vehicleRequest !== null) {
            setVehicleId(user.vehicleRequest.id);
        }
        const object = {
            base64: baseImageGP_Kinh_Doanh,
            createBy: user?.email,
            fileName: "GP_Kinh_Doanh",
            year: year,
            month: month,
            vehicleId: vehicleId
        }
        
        await UploadDocumentForVehicle(object, toast);
        // await getDocChung_Nhan_Bao_Hiem();
        setcheckGP_Kinh_Doanh(false)
    };
    const uploadfileGP_Hoat_Dong = async() => {
        const arr = dateGP_Hoat_Dong.split("-");
        const year = arr[0];
        const month = arr[1];
        if (user.vehicleRequest !== null) {
            setVehicleId(user.vehicleRequest.id);
        }
        const object = {
            base64: baseImageGP_Hoat_Dong,
            createBy: user?.email,
            fileName: "GP_Hoat_Dong",
            year: year,
            month: month,
            vehicleId: vehicleId
        }
        await UploadDocumentForVehicle(object, toast);
        // await getDocChung_Nhan_Dang_Kiem();
        setcheckGP_Hoat_Dong(false)
     
    };

    console.log("gphd",GP_Hoat_Dong);
    console.log("gpkd",GP_Kinh_Doanh);

    useEffect(() => {
        getDocBang_lai_xe();
        getDocGP_Hoat_Dong()
        getDocChung_Nhan_Kinh_nghiem();
        getDocGP_Kinh_Doanh();
    }, [])
    return (
        <div>
            <h2>CÁC TÀI LIỆU</h2>
            <h3>Trợ giúp</h3>
            <p>
                Nếu tài liệu của bạn chưa được gửi, vui lòng tải tài liệu lên và nhắp chuột vào nút 'Gửi'. Tài Liệu của bạn sẽ được xem xét bởi T.NET.
                Các tài liệu phải có định dạng là PDF, GIF, PNG hoặc JPEG. Các Tài Liệu có thể bị coi là không hợp lệ nếu:
            </p>
            <p>• Tài liệu không rõ ràng hoặc bị mờ</p>
            <p>• Ngày Hết Hạn không đúng.</p>
            <p>• Tài Liệu không hợp lệ hoặc đã hết hạn.</p>
            <div>
                <div className='doc-taixe'>

                    <div>
                        {
                            Bang_lai_xe === "" ? (
                                <>
                                    {
                                        checkBang_lai_xe === true ? (
                                            <>
                                                <div className='card-doc'>
                                                    <div className='form-header'>
                                                        <span>
                                                            Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                                            {/* <div className='status'>Chưa gửi</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageBang_lai_xe} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ngày hết hạn <DatePicker onChange={getTime1} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageBang_lai_xe(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileBang_lai_xe} type='primary'>Gửi <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                                            <div className='status-ad'>Chưa gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> Tài liệu chưa được tải lên
                                                                <Button onClick={addDocBang_lai_xe} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        )
                                    }
                                </>

                            ) : (
                                <>
                                    {
                                        Bang_lai_xe.status === "SENDED" ? (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>Tài liệu đang chờ xử lý</span>
                                                                <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{Bang_lai_xe.expired_month}/{Bang_lai_xe.expired_year}</span>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    Bang_lai_xe.status === "VALID" ? (
                                                        <div className='card-doc-ad'>
                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                <span>
                                                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                                                    <div className='status-ad'>Hợp lệ</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>Tài liệu hợp lệ</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{Bang_lai_xe.expired_month}/{Bang_lai_xe.expired_year}</span>
                                                                    </span>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    ) : (
                                                        <>
                                                            {
                                                                checkBang_lai_xe === true ? (
                                                                    <>
                                                                        <div className='card-doc'>
                                                                            <div className='form-header'>
                                                                                <span>
                                                                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                                                                    {/* <div className='status'>Chưa gửi</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageBang_lai_xe} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ngày hết hạn <DatePicker onChange={getTime1} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageBang_lai_xe(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileBang_lai_xe} type='primary'>Gửi <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                                                                    <div className='status-ad'>Không Hợp lệ</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>Tài liệu không hợp lệ vui lòng gửi lại tài liệu</span>
                                                                                        <span> <Button onClick={addDocBang_lai_xe} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button></span>
                                                                                    </span>
                                                                                </div>
                                                                            </div>

                                                                        </div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </>
                            )
                        }
                    </div>
                    <div>
                        {
                            Chung_Nhan_Kinh_nghiem === "" ? (
                                <>
                                    {
                                        checkChung_Nhan_Kinh_nghiem === true ? (
                                            <>
                                                <div className='card-doc'>
                                                    <div className='form-header'>
                                                        <span>
                                                            Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                                            hoặc lý lịch tư pháp
                                                            {/* <div className='status'>Chưa gửi</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageChung_Nhan_Kinh_nghiem} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ngày hết hạn <DatePicker onChange={getTime2} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageChung_Nhan_Kinh_nghiem(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileChung_Nhan_Kinh_nghiem} type='primary'>Gửi <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                                            hoặc lý lịch tư pháp
                                                            <div className='status-ad'>Chưa gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> Tài liệu chưa được tải lên
                                                                <Button onClick={addDocChung_Nhan_Kinh_nghiem} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        )
                                    }
                                </>

                            ) : (
                                <>
                                    {
                                        Chung_Nhan_Kinh_nghiem.status === "SENDED" ? (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                                            hoặc lý lịch tư pháp
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>Tài liệu đang chờ xử lý</span>
                                                                <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{Chung_Nhan_Kinh_nghiem.expired_month}/{Chung_Nhan_Kinh_nghiem.expired_year}</span>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    Chung_Nhan_Kinh_nghiem.status === "VALID" ? (
                                                        <div className='card-doc-ad'>
                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                <span>
                                                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                                                    hoặc lý lịch tư pháp
                                                                    <div className='status-ad'>Hợp lệ</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>Tài liệu hợp lệ</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{Chung_Nhan_Kinh_nghiem.expired_month}/{Chung_Nhan_Kinh_nghiem.expired_year}</span>
                                                                    </span>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    ) : (
                                                        <>
                                                            {
                                                                checkChung_Nhan_Kinh_nghiem === true ? (
                                                                    <>
                                                                        <div className='card-doc'>
                                                                            <div className='form-header'>
                                                                                <span>
                                                                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                                                                    hoặc lý lịch tư pháp
                                                                                    {/* <div className='status'>Chưa gửi</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageChung_Nhan_Kinh_nghiem} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ngày hết hạn <DatePicker onChange={getTime2} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageChung_Nhan_Kinh_nghiem(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileChung_Nhan_Kinh_nghiem} type='primary'>Gửi <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                                                                    hoặc lý lịch tư pháp
                                                                                    <div className='status-ad'>Không Hợp lệ</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>Tài liệu không hợp lệ vui lòng gửi lại tài liệu</span>
                                                                                        <span> onClick={addDocChung_Nhan_Kinh_nghiem} <Button style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button></span>
                                                                                    </span>
                                                                                </div>
                                                                            </div>

                                                                        </div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </>
                            )
                        }
                    </div>
                    <div>
                        {
                            GP_Kinh_Doanh === "" ? (
                                <>
                                    {
                                        checkGP_Kinh_Doanh === true ? (
                                            <>
                                                <div className='card-doc'>
                                                    <div className='form-header'>
                                                        <span>
                                                        Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                                            {/* <div className='status'>Chưa gửi</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageGP_Kinh_Doanh} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ngày hết hạn <DatePicker onChange={getTime6} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageGP_Kinh_Doanh(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileGP_Kinh_Doanh} type='primary'>Gửi <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                                            <div className='status-ad'>Chưa gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> Tài liệu chưa được tải lên
                                                                <Button onClick={addDocGP_Kinh_Doanh} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        )
                                    }
                                </>

                            ) : (
                                <>
                                    {
                                        GP_Kinh_Doanh.status === "SENDED" ? (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                        Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>Tài liệu đang chờ xử lý</span>
                                                                <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{GP_Kinh_Doanh.expired_month}/{GP_Kinh_Doanh.expired_year}</span>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    GP_Kinh_Doanh.status === "VALID" ? (
                                                        <div className='card-doc-ad'>
                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                <span>
                                                                Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                                                    <div className='status-ad'>Hợp lệ</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>Tài liệu hợp lệ</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{GP_Kinh_Doanh.expired_month}/{GP_Kinh_Doanh.expired_year}</span>
                                                                    </span>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    ) : (
                                                        <>
                                                            {
                                                                checkGP_Kinh_Doanh === true ? (
                                                                    <>
                                                                        <div className='card-doc'>
                                                                            <div className='form-header'>
                                                                                <span>
                                                                                Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                                                                    {/* <div className='status'>Chưa gửi</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageGP_Kinh_Doanh} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ngày hết hạn <DatePicker onChange={getTime6} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageGP_Kinh_Doanh(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileGP_Kinh_Doanh} type='primary'>Gửi <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                                                                    <div className='status-ad'>Không Hợp lệ</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>Tài liệu không hợp lệ vui lòng gửi lại tài liệu</span>
                                                                                        <span> <Button onClick={addDocGP_Kinh_Doanh} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button></span>
                                                                                    </span>
                                                                                </div>
                                                                            </div>

                                                                        </div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </>
                            )
                        }
                    </div>
                    <div>
                        {
                            GP_Hoat_Dong === "" ? (
                                <>
                                    {
                                        checkGP_Hoat_Dong === true ? (
                                            <>
                                                <div className='card-doc'>
                                                    <div className='form-header'>
                                                        <span>
                                                        Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                                            {/* <div className='status'>Chưa gửi</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageGP_Hoat_Dong} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ngày hết hạn <DatePicker onChange={getTime7} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageGP_Hoat_Dong(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileGP_Hoat_Dong} type='primary'>Gửi <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                        Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                                            <div className='status-ad'>Chưa gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> Tài liệu chưa được tải lên
                                                                <Button onClick={addDocGP_Hoat_Dong} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        )
                                    }
                                </>

                            ) : (
                                <>
                                    {
                                        GP_Hoat_Dong.status === "SENDED" ? (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                        Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>Tài liệu đang chờ xử lý</span>
                                                                <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{GP_Hoat_Dong.expired_month}/{GP_Hoat_Dong.expired_year}</span>
                                                            </span>
                                                        </div>
                                                    </div>

                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    GP_Hoat_Dong.status === "VALID" ? (
                                                        <div className='card-doc-ad'>
                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                <span>
                                                                Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                                                    <div className='status-ad'>Hợp lệ</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>Tài liệu hợp lệ</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ngày hết hạn :{GP_Hoat_Dong.expired_month}/{GP_Hoat_Dong.expired_year}</span>
                                                                    </span>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    ) : (
                                                        <>
                                                            {
                                                                checkGP_Hoat_Dong === true ? (
                                                                    <>
                                                                        <div className='card-doc'>
                                                                            <div className='form-header'>
                                                                                <span>
                                                                                Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                                                                    {/* <div className='status'>Chưa gửi</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageGP_Hoat_Dong} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ngày hết hạn <DatePicker onChange={getTime7} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageGP_Hoat_Dong(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileGP_Hoat_Dong} type='primary'>Gửi <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                                                                    <div className='status-ad'>Không Hợp lệ</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>Tài liệu không hợp lệ vui lòng gửi lại tài liệu</span>
                                                                                        <span> <Button onClick={addDocGP_Hoat_Dong} style={{ marginLeft: "10px" }} type="primary"> +Tải lên</Button></span>
                                                                                    </span>
                                                                                </div>
                                                                            </div>

                                                                        </div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </>
                            )
                        }
                    </div>


                </div>
            </div >


        </div >
    )
}
export default DocumentCompany