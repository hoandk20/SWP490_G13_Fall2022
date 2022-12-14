
import React, { useState } from 'react';
import { Button, Col, DatePicker, Form, Modal, Row, Select } from 'antd';
import { RightOutlined, CheckOutlined } from '@ant-design/icons';
import { useSelector } from 'react-redux';
import { toast } from 'react-toastify';
import { UploadFile } from '../../../../redux/apiRequest';
import './modal-upload-document.css'
const ModalUploadDocument = (props) => {
    const [open, setOpen] = useState(false);
    const user = useSelector((state) => state.user.userInfo?.currentUser)
    const [baseImage1, setBaseImage1] = useState("");
    const [baseImage2, setBaseImage2] = useState("");
    const driver = props.driver;
 
    const [date1, setDate1] = useState();
    const [date2, setDate2] = useState();

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
  

    const uploadfile1 = () => {
        const arr = date1.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage1,
            createBy: driver.email,
            fileName: "Bang_lai_xe",
            year: year,
            month: month
        }
        UploadFile(object, toast);
    };



    const uploadfile2 = () => {
        const arr = date2.split("-");
        const year = arr[0];
        const month = arr[1];
        const object = {
            base64: baseImage2,
            createBy: driver.email,
            fileName: "Chung_Nhan_Kinh_nghiem",
            year: year,
            month: month,
        }
        UploadFile(object, toast);
    };

  

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

    return (
        <>
            <Button type="primary" onClick={() => setOpen(true)}>
                Upload t??i li???u
            </Button>
            <Modal
                title="Upload t??i li???u"
                centered
                open={open}
                onOk={() => setOpen(false)}
                onCancel={() => setOpen(false)}
                width={1200}
            >
                <div className='contents'>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc' >
                                <div className='form-header'>
                                    <span>
                                        ???nh
                                        {/* <div className='status'>Ch??a g???i</div> */}
                                    </span>

                                </div>
                                <div className='form-content' style={{height:"300px"}}>
                                    <Row>
                                        <Col sm={12} md={6} style={{ textAlign: "center" }}>
                                            {/* <ImageAvatar/> */}
                                        </Col>
                                        <Col sm={34} md={18} >
                                            Ghi Ch??: ???nh ch???p ki???u ch??n dung, m???i nh???t, th???ng m???t v?? r?? n??t.
                                            K??ch th?????c ???nh t???i ??a l?? 256 kil?? byte (256 KB)
                                        </Col>
                                    </Row>
                                </div>
                            </div>
                        </Col>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    Ghi ch??
                                </div>
                                <div className='form-content' >
                                    <p>1. ?????i v???i t??i x??? xe m?? t?? l?? sinh vi??n th?? h??? s?? t?? ph??p c?? th??? thay th??? b???ng th??? sinh vi??n, s?? y???u l?? l???ch c?? ch???ng nh???n c???a ?????a ph????ng</p>
                                    <p> 2. C??c gi???y t??? ch???p ph???i r?? n??t, kh??ng t???y x??a. C??c t??i li???u c?? th??? b??? coi l?? kh??ng h???p l??? n???u:</p>
                                    <p> . T??i li???u kh??ng r?? r??ng ho???c b??? m???</p>
                                    <p> . Ng??y h???t h???n kh??ng ????ng.</p>
                                    <p> . T??i Li???u kh??ng h???p l??? ho???c ???? h???t h???n.</p>
                                    <p> 3. K??ch th?????c t???p c??c t??i li???u t???i ??a l?? 1 mega byte (1MB)</p>
                                </div>
                            </div>
                        </Col>
                    </Row>
                    <Row>
                        <Col sm={24} md={12}>
                            <div className='card-doc'>
                                <div className='form-header'>
                                    <span>
                                        B???ng L??i Xe (H???ng B2 ho???c cao h??n n???u b???n l?? t??i x??? xe ?? t??)
                                        {/* <div className='status'>Ch??a g???i</div> */}
                                    </span>

                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "200px" }}>
                                        <img src={baseImage1} height="170px" />
                                    </div>
                                    <div className='content-bottom'>
                                        <div  style={{marginBottom:"10px"}}>                                     
                                            Ng??y h???t h???n <DatePicker onChange={getTime1} picker='month' />
                                        </div>
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


                                    </span>
                                    <Row>
                                        <Col sm={40} md={20}>
                                            Gi???y Ch???ng Nh???n Kinh Nghi???m (3 n??m kinh nghi???m tr??? l??n)
                                            ho???c l?? l???ch t?? ph??p
                                        </Col>
                                        <Col sm={8} md={4}>
                                            {/* <div className='status'>Ch??a g???i</div> */}
                                        </Col>
                                    </Row>
                                </div>
                                <div className='form-content'>
                                    <div className='form-image' style={{ height: "200px" }}>
                                        <img src={baseImage2} height="170px" />
                                    </div>

                                    <div className='content-bottom'>
                                        <div style={{marginBottom:"10px"}}>
                                            Ng??y h???t h???n <DatePicker onChange={getTime2} picker='month' />
                                        </div>
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
            </Modal>
        </>
    );
};
export default ModalUploadDocument;