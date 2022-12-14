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

    const getDocBang_lai_xe = async () => {
        const file_name = "Bang_lai_xe";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
   
        setBang_lai_xe(res.data.object);
    }
    const getDocChung_Nhan_Kinh_nghiem = async () => {
        const file_name = "Chung_Nhan_Kinh_nghiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });

        setChung_Nhan_Kinh_nghiem(res.data.object);
    }
    const getDocGP_Kinh_Doanh = async () => {
        const file_name = "GP_Kinh_Doanh";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
      
        setGP_Kinh_Doanh(res.data.object);
    }
    const getDocGP_Hoat_Dong = async () => {
        const file_name = "GP_Hoat_Dong";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${user?.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
     
        setGP_Hoat_Dong(res.data.object);
    }


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

    useEffect(() => {
        getDocBang_lai_xe();
        getDocGP_Hoat_Dong()
        getDocChung_Nhan_Kinh_nghiem();
        getDocGP_Kinh_Doanh();
    }, [])
    return (
        <div>
            <h2>C??C T??I LI???U</h2>
            <h3>Tr??? gi??p</h3>
            <p>
                N???u t??i li???u c???a b???n ch??a ???????c g???i, vui l??ng t???i t??i li???u l??n v?? nh???p chu???t v??o n??t 'G???i'. T??i Li???u c???a b???n s??? ???????c xem x??t b???i T.NET.
                C??c t??i li???u ph???i c?? ?????nh d???ng l?? PDF, GIF, PNG ho???c JPEG. C??c T??i Li???u c?? th??? b??? coi l?? kh??ng h???p l??? n???u:
            </p>
            <p>??? T??i li???u kh??ng r?? r??ng ho???c b??? m???</p>
            <p>??? Ng??y H???t H???n kh??ng ????ng.</p>
            <p>??? T??i Li???u kh??ng h???p l??? ho???c ???? h???t h???n.</p>
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
                                                            B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                                            {/* <div className='status'>Ch??a g???i</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageBang_lai_xe} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ng??y h???t h???n <DatePicker onChange={getTime1} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageBang_lai_xe(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileBang_lai_xe} type='primary'>G???i <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                                            <div className='status-ad'>Ch??a g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> T??i li???u ch??a ???????c t???i l??n
                                                                <Button onClick={addDocBang_lai_xe} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button>
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
                                                            B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                                            <div className='status-ad'>???? g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>T??i li???u ??ang ch??? x??? l??</span>
                                                                <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{Bang_lai_xe.expired_month}/{Bang_lai_xe.expired_year}</span>
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
                                                                    B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                                                    <div className='status-ad'>H???p l???</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>T??i li???u h???p l???</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{Bang_lai_xe.expired_month}/{Bang_lai_xe.expired_year}</span>
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
                                                                                    B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                                                                    {/* <div className='status'>Ch??a g???i</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageBang_lai_xe} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ng??y h???t h???n <DatePicker onChange={getTime1} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageBang_lai_xe(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileBang_lai_xe} type='primary'>G???i <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                    B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                                                                    <div className='status-ad'>Kh??ng H???p l???</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>T??i li???u kh??ng h???p l??? vui l??ng g???i l???i t??i li???u</span>
                                                                                        <span> <Button onClick={addDocBang_lai_xe} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button></span>
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
                                                            Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                                            ho???c l?? l???ch t?? ph??p
                                                            {/* <div className='status'>Ch??a g???i</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageChung_Nhan_Kinh_nghiem} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ng??y h???t h???n <DatePicker onChange={getTime2} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageChung_Nhan_Kinh_nghiem(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileChung_Nhan_Kinh_nghiem} type='primary'>G???i <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                                            ho???c l?? l???ch t?? ph??p
                                                            <div className='status-ad'>Ch??a g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> T??i li???u ch??a ???????c t???i l??n
                                                                <Button onClick={addDocChung_Nhan_Kinh_nghiem} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button>
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
                                                            Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                                            ho???c l?? l???ch t?? ph??p
                                                            <div className='status-ad'>???? g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>T??i li???u ??ang ch??? x??? l??</span>
                                                                <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{Chung_Nhan_Kinh_nghiem.expired_month}/{Chung_Nhan_Kinh_nghiem.expired_year}</span>
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
                                                                    Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                                                    ho???c l?? l???ch t?? ph??p
                                                                    <div className='status-ad'>H???p l???</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>T??i li???u h???p l???</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{Chung_Nhan_Kinh_nghiem.expired_month}/{Chung_Nhan_Kinh_nghiem.expired_year}</span>
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
                                                                                    Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                                                                    ho???c l?? l???ch t?? ph??p
                                                                                    {/* <div className='status'>Ch??a g???i</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageChung_Nhan_Kinh_nghiem} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ng??y h???t h???n <DatePicker onChange={getTime2} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageChung_Nhan_Kinh_nghiem(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileChung_Nhan_Kinh_nghiem} type='primary'>G???i <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                    Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                                                                    ho???c l?? l???ch t?? ph??p
                                                                                    <div className='status-ad'>Kh??ng H???p l???</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>T??i li???u kh??ng h???p l??? vui l??ng g???i l???i t??i li???u</span>
                                                                                        <span>  <Button onClick={addDocChung_Nhan_Kinh_nghiem} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button></span>
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
                                                        Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                                            {/* <div className='status'>Ch??a g???i</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageGP_Kinh_Doanh} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ng??y h???t h???n <DatePicker onChange={getTime6} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageGP_Kinh_Doanh(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileGP_Kinh_Doanh} type='primary'>G???i <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                            Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                                            <div className='status-ad'>Ch??a g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> T??i li???u ch??a ???????c t???i l??n
                                                                <Button onClick={addDocGP_Kinh_Doanh} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button>
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
                                                        Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                                            <div className='status-ad'>???? g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>T??i li???u ??ang ch??? x??? l??</span>
                                                                <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{GP_Kinh_Doanh.expired_month}/{GP_Kinh_Doanh.expired_year}</span>
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
                                                                Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                                                    <div className='status-ad'>H???p l???</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>T??i li???u h???p l???</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{GP_Kinh_Doanh.expired_month}/{GP_Kinh_Doanh.expired_year}</span>
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
                                                                                Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                                                                    {/* <div className='status'>Ch??a g???i</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageGP_Kinh_Doanh} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ng??y h???t h???n <DatePicker onChange={getTime6} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageGP_Kinh_Doanh(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileGP_Kinh_Doanh} type='primary'>G???i <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                Gi???y Ph??p Kinh Doanh v???n t???i h??nh kh??ch b???ng ?? t??.
                                                                                    <div className='status-ad'>Kh??ng H???p l???</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>T??i li???u kh??ng h???p l??? vui l??ng g???i l???i t??i li???u</span>
                                                                                        <span> <Button onClick={addDocGP_Kinh_Doanh} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button></span>
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
                                                        Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                                            {/* <div className='status'>Ch??a g???i</div> */}
                                                        </span>

                                                    </div>
                                                    <div className='form-content'>
                                                        <div className='form-image' style={{ height: "230px" }}>
                                                            <img src={baseImageGP_Hoat_Dong} height="220px" />
                                                        </div>
                                                        <div className='content-bottom'>
                                                            <span style={{ marginRight: "20px" }}>
                                                                Ng??y h???t h???n <DatePicker onChange={getTime7} picker='month' />
                                                            </span>
                                                            <input
                                                                type="file"
                                                                style={{ color: "#fff" }}
                                                                onChange={(e) => {
                                                                    uploadImageGP_Hoat_Dong(e);
                                                                }}
                                                            />
                                                            <Button className='btn-submit' onClick={uploadfileGP_Hoat_Dong} type='primary'>G???i <CheckOutlined /></Button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </>
                                        ) : (
                                            <>
                                                <div className='card-doc-ad'>
                                                    <div className='form-header-ad' style={{ height: "40px" }}>
                                                        <span>
                                                        Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                                            <div className='status-ad'>Ch??a g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> T??i li???u ch??a ???????c t???i l??n
                                                                <Button onClick={addDocGP_Hoat_Dong} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button>
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
                                                        Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                                            <div className='status-ad'>???? g???i</div>
                                                        </span>

                                                    </div>
                                                    <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                        <div className='upload-doc'>
                                                            <span>
                                                                <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                <span>T??i li???u ??ang ch??? x??? l??</span>
                                                                <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{GP_Hoat_Dong.expired_month}/{GP_Hoat_Dong.expired_year}</span>
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
                                                                Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                                                    <div className='status-ad'>H???p l???</div>
                                                                </span>

                                                            </div>
                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                <div className='form-image-ad' >
                                                                    {/* <img src={baseImage1} height="150px" /> */}
                                                                </div>
                                                                <div className='upload-doc'>
                                                                    <span>
                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                        <span>T??i li???u h???p l???</span>
                                                                        <span style={{ marginLeft: "20%" }}> Ng??y h???t h???n :{GP_Hoat_Dong.expired_month}/{GP_Hoat_Dong.expired_year}</span>
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
                                                                                Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                                                                    {/* <div className='status'>Ch??a g???i</div> */}
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content'>
                                                                                <div className='form-image' style={{ height: "230px" }}>
                                                                                    <img src={baseImageGP_Hoat_Dong} height="220px" />
                                                                                </div>
                                                                                <div className='content-bottom'>
                                                                                    <span style={{ marginRight: "20px" }}>
                                                                                        Ng??y h???t h???n <DatePicker onChange={getTime7} picker='month' />
                                                                                    </span>
                                                                                    <input
                                                                                        type="file"
                                                                                        style={{ color: "#fff" }}
                                                                                        onChange={(e) => {
                                                                                            uploadImageGP_Hoat_Dong(e);
                                                                                        }}
                                                                                    />
                                                                                    <Button className='btn-submit' onClick={uploadfileGP_Hoat_Dong} type='primary'>G???i <CheckOutlined /></Button>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='card-doc-ad'>
                                                                            <div className='form-header-ad' style={{ height: "40px" }}>
                                                                                <span>
                                                                                Gi???y Ph??p Ho???t ?????ng trong l??nh v???c v???n t???i kh??ch b???ng ?? t??
                                                                                    <div className='status-ad'>Kh??ng H???p l???</div>
                                                                                </span>

                                                                            </div>
                                                                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                                                                <div className='upload-doc'>
                                                                                    <span>
                                                                                        <span><FileOutlined style={{ fontSize: "40px", margin: "10px" }} /> </span>
                                                                                        <span>T??i li???u kh??ng h???p l??? vui l??ng g???i l???i t??i li???u</span>
                                                                                        <span> <Button onClick={addDocGP_Hoat_Dong} style={{ marginLeft: "10px" }} type="primary"> +T???i l??n</Button></span>
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