import { CheckOutlined, CloseOutlined, EyeOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Collapse, DatePicker, Drawer, Form, Input, Row, Select, Space, Image, } from 'antd';
import axios from 'axios';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation } from 'react-router';
import { toast } from 'react-toastify';

import { AddDriverByCompany, ChaangeStatusDoc, EditCompany, EditDriverByCompany, getCompanyDetail, getDriversForCompany, UploadFile} from '../../../../../../redux/apiRequest'

// import '../taixe-detail.css'
const { Option } = Select;
const prefixSelector = (
    <Form.Item name="prefix" noStyle>
        <Select
            style={{
                width: 70,
            }}
        >
            <Option value="84">+84</Option>
        </Select>
    </Form.Item>
);
const TabCompanyInfo = (props) => {
    const { Panel } = Collapse;
    const location = useLocation();
    const dispatch = useDispatch();
    // const [companys, setCompanys] = useState(props.companys);
    const companys = useSelector((state) => state.user.company?.info);
    const listDoc = companys.listDoc;
    console.log(companys);
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const Bang_lai_xe = companys.blx;
    const Chung_Nhan_Kinh_nghiem = companys.cnkn;
    const GP_Kinh_Doanh = companys.gpkd;
    const GP_Hoat_Dong = companys.gphd;

    const user = useSelector((state) => state.user.userInfo?.currentUser);
    const [open, setOpen] = useState(false);
    const [form] = Form.useForm();
    const URL = "http://26.36.110.116";
    // if(check1!="SEND")
    const [baseImageAvatar, setBaseImageAvatar] = useState("");
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const [baseImage6, setBaseImage6] = useState("");
    const [baseImage7, setBaseImage7] = useState("");

    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();
    const [date6, setDate6] = useState();
    const [date7, setDate7] = useState();
    const [checkdoc1, setCheckdoc1] = useState(false);
    const [checkdoc2, setCheckdoc2] = useState(false);
    const [checkdoc6, setCheckdoc6] = useState(false);
    const [checkdoc7, setCheckdoc7] = useState(false);
// =======

//     const getFileAvatar = async () => {
//         const file_name = "Avatar";
//         const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
//             , {
//                 headers: { 'Content-Type': 'application/json' }
//             });
//         setBaseImageAvatar(res.data.object.base64)
//     }
// >>>>>>> main
    const getFile1 = async () => {
        const file_name = "Bang_lai_xe";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage1(res.data.object.base64)
    }
    const getFile2 = async () => {
        const file_name = "Chung_Nhan_Kinh_nghiem";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage2(res.data.object.base64)
    }
    const getFile6 = async () => {
        const file_name = "GP_Kinh_Doanh";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage6(res.data.object.base64)
    }
    const getFile7 = async () => {
        const file_name = "GP_Hoat_Dong";
        const res = await axios.get(`${URL}:8080/api/Upload/GetDocument?file_name=${file_name}&createBy=${companys.email}`
            , {
                headers: { 'Content-Type': 'application/json' }
            });
        // console.log(res.data.object.base64);
        setBaseImage7(res.data.object.base64)
    }

    const changeStatusValid1 = () => {
        ChaangeStatusDoc(Bang_lai_xe.id, "VALID",companys?.email, toast, dispatch);
    }
    const changeStatusInValid1 = () => {

        ChaangeStatusDoc(Bang_lai_xe.id, "INVALID",companys?.email, toast, dispatch);
    }
    const changeStatusValid2 = () => {
        ChaangeStatusDoc(Chung_Nhan_Kinh_nghiem.id, "VALID", companys?.email,toast, dispatch);
    }
    const changeStatusInValid2 = () => {
        ChaangeStatusDoc(Chung_Nhan_Kinh_nghiem.id, "INVALID",companys?.email, toast, dispatch);
    }
    const changeStatusValid6 = () => {
        ChaangeStatusDoc(GP_Kinh_Doanh.id, "VALID",companys?.email, toast, dispatch);
    }
    const changeStatusInValid6 = () => {
        ChaangeStatusDoc(GP_Kinh_Doanh.id, "INVALID",companys?.email, toast, dispatch);
    }
    const changeStatusValid7 = () => {
        ChaangeStatusDoc(GP_Hoat_Dong.id, "VALID",companys?.email, toast, dispatch);
    }
    const changeStatusInValid7 = () => {
        ChaangeStatusDoc(GP_Hoat_Dong.id, "INVALID",companys?.email, toast, dispatch);
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

    const onfinish = (values) => {
        // console.log(values);
        // const image= {
        //     base64:baseImageAvatar,
        //     createBy:companys.email,
        //     fileName:"Avatar",
        //     year:'',
        //     month:''
        // }
        // UploadFile(image,toast,dispatch);
        const company = {
            ...values,
            companyEmail: user.email,
        }

        setOpen(false);
    };

    const editDocument1 = () => {
        setCheckdoc1(true);
    }
    const editDocument2 = () => {
        setCheckdoc2(true);
    }
    const editDocument6 = () => {
        setCheckdoc6(true);
    }
    const editDocument7 = () => {
        setCheckdoc7(true);
    }

    const onfinishUploadVehicle = (values) => {

    }
    // const convertBase64 = (file) => {
    //     return new Promise((resolve, reject) => {
    //         const fileReader = new FileReader();
    //         fileReader.readAsDataURL(file);

    //         fileReader.onload = () => {
    //             resolve(fileReader.result);
    //         };

    //         fileReader.onerror = (error) => {
    //             reject(error);
    //         };
    //     });
    // };
    const uploadImage1 = async (e) => {
        const file = e.target.files[0];
        console.log(file);
        const base64 = await convertBase64(file);
        setBaseImage1(base64);
    };
    const uploadImage2 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage2(base64);
    };
    const uploadImage6 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage6(base64);
    };
    const uploadImage7 = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertBase64(file);
        setBaseImage7(base64);
    };
    function getTime1(date, dateString) {
        setDate1(dateString);
    }
    function getTime2(date, dateString) {
        setDate2(dateString);
    }
    function getTime6(date, dateString) {
        setDate6(dateString);
    }
    function getTime7(date, dateString) {
        setDate7(dateString);
    }
    const uploadfile1 = async() => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: companys.email,
            fileName: "Bang_lai_xe",
            year: year,
            month: month
        }
        try {
            const res = await axios.post(`${URL}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            getCompanyDetail(companys?.email, dispatch);
            setCheckdoc1(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }

    };

    const uploadfile2 = async() => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: companys.email,
            fileName: "Chung_Nhan_Kinh_nghiem",
            year: year,
            month: month,
        }
        try {
            const res = await axios.post(`${URL}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            getCompanyDetail(companys?.email, dispatch);
            setCheckdoc2(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }
    };

    const uploadfile6 = async() => {
        const arr = date6.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage6,
            createBy: companys.email,
            fileName: "GP_Kinh_Doanh",
            year: year,
            month: month,
        }
        try {
            const res = await axios.post(`${URL}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            getCompanyDetail(companys?.email, dispatch);
            setCheckdoc6(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }
    };
    const uploadfile7 = async() => {
        const arr = date7.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage7,
            createBy: companys.email,
            fileName: "GP_Hoat_Dong",
            year: year,
            month: month,
        }
        try {
            const res = await axios.post(`${URL}:8080/api/Upload/Document`,
                {
                    base64: object.base64,
                    expired_month: object.month,
                    expired_year: object.year,
                    file_name: object.fileName,
                    createBy: object.createBy
                }
                , {
                    headers: { 'Content-Type': 'application/json' }
                });
            getCompanyDetail(companys?.email, dispatch);
            setCheckdoc7(false)
            toast.success("Upload file thành công")
        } catch (error) {
            toast.error("Upload file thất bại")
        }
    };

    return (
        <>
            <Form onFinish={onfinish} layout="vertical" hideRequiredMark name="basic" form={form}
                              initialValues={{
                                prefix: '+84'
                            }}
                labelCol={{
                    span: 8,
                }}
                wrapperCol={{
                    span: 18,
                }}
            >
                <p>Thông tin công ty</p>
                <Row>
                    <Col span={8}>
                        <Form.Item
                            name="companyName"
                            initialValue={companys.companyName}
                            label="Tên công ty"
                        >
                            <Input disabled />
                        </Form.Item>
                        <Form.Item
                            name="email"
                            initialValue={companys.email}
                            label="Email"
                        >
                            <Input disabled />
                        </Form.Item>

                        <Form.Item
                            name="status"
                            initialValue={companys.companyStatus}
                            label="Trạng thái"
                        >
                            <Input disabled />
                        </Form.Item>
                    </Col>
                    <Col span={8}>
                        <Form.Item
                            name="companyAddress"
                            initialValue={companys.companyAddress}
                            label="Địa chỉ"
                            rules={[
                                {
                                    required: true,
                                    message: 'Địa chỉ không được để trống',
                                },
                            ]}
                        >
                            <Input />
                        </Form.Item>
                        <Form.Item
                            name="phone"
                            initialValue={companys.phone}
                            label="Số điện thoại"
                            rules={[
                                {
                                    required: true,
                                    message: 'Số điện thoại không được để trống',
                                },
                                {

                                    message: 'Số điện thoại không hợp lệ',
                                    pattern: new RegExp(/(0[3|5|7|8|9])+([0-9]{8})\b/g),
                                },
                            ]}
                        >
                            <Input addonBefore={prefixSelector} />
                        </Form.Item>
                        <Form.Item
                                name="city"
                                initialValue={companys.cityId}
                                label="Thành phố"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn thành phố',
                                    },
                                ]}
                            >
                                <Select
                                    labelInValue
                                    options={citys}
                                />
                            </Form.Item>

                    </Col>
                    <Col span={8}>
                        <div >
                            <Image
                                id='avatarImage'
                                src={companys.avatarBase64}
                                className='avatar'
                            />
                            {/* <div className='inputFile'>
                                    <input
                                        type="file"
                                        style={{ color: "#fff" }}
                                        onChange={(e) => {
                                            uploadAvatar(e);
                                        }}
                                    />
                                </div> */}
                        </div>
                    </Col>
                </Row>

                <Button type="primary" htmlType="submit">Thay đổi thông tin</Button>

            </Form>
            <div className='doc-taixe'>
                <p>Các tài liệu</p>

                {
                checkdoc1 === true ? (
                    <div className='card-doc'>
                        <div className='form-header'>
                            <span>
                                Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                {/* <div className='status'>Chưa gửi</div> */}
                            </span>

                        </div>
                        <div className='form-content'>
                            <div className='form-image' style={{ height: "230px" }}>
                                <img src={baseImage1} height="220px" />
                            </div>
                            <div className='content-bottom'>
                                <span style={{ marginRight: "20px" }}>
                                    Ngày hết hạn <DatePicker onChange={getTime1} picker='month' />
                                </span>
                                <input
                                    type="file"
                                    style={{ color: "#fff" }}
                                    onChange={(e) => {
                                        uploadImage1(e);
                                    }}
                                />
                                <Button className='btn-submit' onClick={uploadfile1} type='primary'>Gửi <CheckOutlined /></Button>
                            </div>
                        </div>
                    </div>
                ) : (
                    <div className='doc-taixe'>

                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                    Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                    {
                                        Bang_lai_xe === null ? (
                                            <>
                                              <div className='status-ad'>Chưa gửi</div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    Bang_lai_xe?.status === "SENDED" ? (
                                                        <>
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </>
                                                    ) : (
                                                        <>
                                                            {
                                                                Bang_lai_xe?.status === "VALID" ? (
                                                                    <>
                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }


                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage1} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        {
                                            Bang_lai_xe === null ? (
                                                <></>
                                            ) : (
                                                <>
                                                    {
                                                        baseImage1 !== "" ? (
                                                            <></>
                                                        ) : (
                                                            <>
                                                                <Button onClick={getFile1} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                            </>
                                                        )
                                                    }
                                                </>
                                            )
                                        }

                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {Bang_lai_xe?.expired_month}-{Bang_lai_xe?.expired_year}</span>
                                        <Button onClick={editDocument1} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                {
                                    Bang_lai_xe?.status === "SENDED" ? (
                                        <div className='form-bottom-ad' >
                                            <Button onClick={changeStatusValid1} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                            <Button onClick={changeStatusInValid1} type="primary"> <CloseOutlined /> Từ chối</Button>
                                        </div>
                                    ) : (
                                        <></>
                                    )
                                }
                            </div>
                        </div>

                    </div>
                )
            }

            {
                checkdoc2 === true ? (

                    <div className='card-doc'>
                        <div className='form-header'>
                            <span>
                                Bằng Lái Xe (Hạng B2 hoặc cao hơn nếu bạn là tài xế xe ô tô)
                                <div className='status'></div>
                            </span>

                        </div>
                        <div className='form-content'>
                            <div className='form-image' style={{ height: "230px" }}>
                                <img src={baseImage2} height="220px" />
                            </div>
                            <div className='content-bottom'>
                                <span style={{ marginRight: "20px" }}>
                                    Ngày hết hạn <DatePicker onChange={getTime2} picker='month' />
                                </span>
                                <input
                                    type="file"
                                    style={{ color: "#fff" }}
                                    onChange={(e) => {
                                        uploadImage2(e);
                                    }}
                                />
                                <Button className='btn-submit' onClick={uploadfile2} type='primary'>Gửi <CheckOutlined /></Button>
                            </div>
                        </div>
                    </div>
                ) : (
                    <div className='doc-taixe'>
                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                    Giấy Chứng Nhận Kinh Nghiệm (3 năm kinh nghiệm trở lên)
                                    hoặc lý lịch tư pháp
                                    {
                                        Chung_Nhan_Kinh_nghiem === null ? (
                                            <>
                                                <div className='status-ad'>Chưa gửi</div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    Chung_Nhan_Kinh_nghiem?.status === "SENDED" ? (
                                                        <>
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </>
                                                    ) : (
                                                        <>
                                                            {
                                                                Chung_Nhan_Kinh_nghiem?.status === "VALID" ? (
                                                                    <>
                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage2} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        {
                                            Chung_Nhan_Kinh_nghiem === null ? (
                                                <></>
                                            ) : (
                                                <>
                                                    {
                                                        baseImage2 !== "" ? (
                                                            <></>
                                                        ) : (
                                                            <>
                                                                <Button onClick={getFile2} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                            </>
                                                        )
                                                    }
                                                </>
                                            )
                                        }

                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {Chung_Nhan_Kinh_nghiem?.expired_month}-{Chung_Nhan_Kinh_nghiem?.expired_year}</span>
                                        <Button onClick={editDocument2} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                {
                                    Chung_Nhan_Kinh_nghiem?.status === "SENDED" ? (
                                        <div className='form-bottom-ad' >
                                            <Button onClick={changeStatusValid2} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                            <Button onClick={changeStatusInValid2} type="primary"> <CloseOutlined /> Từ chối</Button>
                                        </div>
                                    ) : (
                                        <></>
                                    )
                                }
                            </div>
                        </div>
                    </div>
                )
            }
  {
                checkdoc6 === true ? (
                    <div className='card-doc'>
                        <div className='form-header'>
                            <span>
                            Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                            </span>

                        </div>
                        <div className='form-content'>
                            <div className='form-image' style={{ height: "230px" }}>
                                <img src={baseImage6} height="220px" />
                            </div>
                            <div className='content-bottom'>
                                <span style={{ marginRight: "20px" }}>
                                    Ngày hết hạn <DatePicker onChange={getTime6} picker='month' />
                                </span>
                                <input
                                    type="file"
                                    style={{ color: "#fff" }}
                                    onChange={(e) => {
                                        uploadImage6(e);
                                    }}
                                />
                                <Button className='btn-submit' onClick={uploadfile6} type='primary'>Gửi <CheckOutlined /></Button>
                            </div>
                        </div>
                    </div>
                ) : (
                    <div className='doc-taixe'>

                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                Giấy Phép Kinh Doanh vận tải hành khách bằng ô tô.
                                    {
                                        GP_Kinh_Doanh === null ? (
                                            <>
                                              <div className='status-ad'>Chưa gửi</div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    GP_Kinh_Doanh?.status === "SENDED" ? (
                                                        <>
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </>
                                                    ) : (
                                                        <>
                                                            {
                                                                GP_Kinh_Doanh?.status === "VALID" ? (
                                                                    <>
                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }


                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage1} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        {
                                            GP_Kinh_Doanh === null ? (
                                                <></>
                                            ) : (
                                                <>
                                                    {
                                                        baseImage6 !== "" ? (
                                                            <></>
                                                        ) : (
                                                            <>
                                                                <Button onClick={getFile6} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                            </>
                                                        )
                                                    }
                                                </>
                                            )
                                        }

                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {GP_Kinh_Doanh?.expired_month}-{GP_Kinh_Doanh?.expired_year}</span>
                                        <Button onClick={editDocument6} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                {
                                    GP_Kinh_Doanh?.status === "SENDED" ? (
                                        <div className='form-bottom-ad' >
                                            <Button onClick={changeStatusValid6} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                            <Button onClick={changeStatusInValid6} type="primary"> <CloseOutlined /> Từ chối</Button>
                                        </div>
                                    ) : (
                                        <></>
                                    )
                                }
                            </div>
                        </div>

                    </div>
                )
            }

            {
                checkdoc7 === true ? (

                    <div className='card-doc'>
                        <div className='form-header'>
                            <span>
                            Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                <div className='status'></div>
                            </span>

                        </div>
                        <div className='form-content'>
                            <div className='form-image' style={{ height: "230px" }}>
                                <img src={baseImage7} height="220px" />
                            </div>
                            <div className='content-bottom'>
                                <span style={{ marginRight: "20px" }}>
                                    Ngày hết hạn <DatePicker onChange={getTime7} picker='month' />
                                </span>
                                <input
                                    type="file"
                                    style={{ color: "#fff" }}
                                    onChange={(e) => {
                                        uploadImage7(e);
                                    }}
                                />
                                <Button className='btn-submit' onClick={uploadfile7} type='primary'>Gửi <CheckOutlined /></Button>
                            </div>
                        </div>
                    </div>
                ) : (
                    <div className='doc-taixe'>
                        <div className='card-doc-ad'>
                            <div className='form-header-ad' style={{ height: "40px" }}>
                                <span>
                                Giấy Phép Hoạt Động trong lĩnh vực vận tải khách bằng ô tô
                                    {
                                        GP_Hoat_Dong === null ? (
                                            <>
                                                <div className='status-ad'>Chưa gửi</div>
                                            </>
                                        ) : (
                                            <>
                                                {
                                                    GP_Hoat_Dong?.status === "SENDED" ? (
                                                        <>
                                                            <div className='status-ad'>Đã gửi</div>
                                                        </>
                                                    ) : (
                                                        <>
                                                            {
                                                                GP_Hoat_Dong?.status === "VALID" ? (
                                                                    <>
                                                                        <div className='status-ad'>Hợp lệ</div>
                                                                    </>
                                                                ) : (
                                                                    <>
                                                                        <div className='status-ad'>Không hợp lệ</div>
                                                                    </>
                                                                )
                                                            }
                                                        </>
                                                    )
                                                }
                                            </>
                                        )
                                    }

                                </span>

                            </div>
                            <div className='form-content-ad' style={{ minHeight: "100px" }}>
                                <div className='form-image-ad' style={{ minHeight: "50px" }} >
                                    <img src={baseImage2} height="150px" />
                                </div>
                                <div className='upload-doc'>
                                    <span>
                                        {
                                            GP_Hoat_Dong === null ? (
                                                <></>
                                            ) : (
                                                <>
                                                    {
                                                        baseImage7 !== "" ? (
                                                            <></>
                                                        ) : (
                                                            <>
                                                                <Button onClick={getFile7} style={{ marginRight: "10px" }} type="primary"> Tải lên</Button>
                                                            </>
                                                        )
                                                    }
                                                </>
                                            )
                                        }

                                        <span style={{ fontSize: "20px" }}>Ngày hết hạn : {GP_Hoat_Dong?.expired_month}-{GP_Hoat_Dong?.expired_year}</span>
                                        <Button onClick={editDocument7} style={{ float: "right" }} type="primary"> Thay đổi</Button>
                                    </span>


                                </div>
                                {
                                    GP_Hoat_Dong?.status === "SENDED" ? (
                                        <div className='form-bottom-ad' >
                                            <Button onClick={changeStatusValid7} style={{ marginRight: "20px" }} type="primary"><CheckOutlined /> Kiểm tra</Button >
                                            <Button onClick={changeStatusInValid7} type="primary"> <CloseOutlined /> Từ chối</Button>
                                        </div>
                                    ) : (
                                        <></>
                                    )
                                }
                            </div>
                        </div>
                    </div>
                )
            }
            </div>
        </>

    );
};
export default TabCompanyInfo;