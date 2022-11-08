import { EyeOutlined } from '@ant-design/icons';
import { Col, DatePicker, Form, Input, Row, Select, TimePicker, Button, Table, Descriptions, Modal } from 'antd';
import TextArea from 'antd/lib/input/TextArea';
import React from 'react';
import { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useLocation, useNavigate } from 'react-router';
import ModalViewDetail from '../../../../commons/modals/modal-view-detail';
import { toast } from 'react-toastify';
import { CreateFreeTrip, getListFreeTripIsOpen, RegisterTripForPassenger } from '../../../../../redux/apiRequest';
const { Option } = Select;


const FreeTripDetailOfDriver = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const user = useSelector((state) => state.user.userInfo?.currentUser);
    console.log(user);
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [seat, setSeat] = useState();
    const [note, setNote] = useState();
    // const [tripInfo,setTripInfo]=useState()
    const location = useLocation();
    const tripInfo = location.state?.record;
    console.log(tripInfo)

    const handleOk = () => {
        if (seat < tripInfo.seatRemind) {
            const trip = {
                tripID: tripInfo.key,
                driverEmail: tripInfo.driverEmail,
                passengerEmail: user.email,
                from: tripInfo.from,
                to: tripInfo.to,
                seatRegister: seat,
                timeStart: tripInfo.timeStart,
                waitingTime: tripInfo.waitingTime,
                price: tripInfo.price,
                note: note,
            }

            RegisterTripForPassenger(trip, dispatch, navigate, toast);
            getListFreeTripIsOpen(dispatch);
        }else{
            toast.error('Không đủ số ghế để đăng ký')
        }

        setIsModalOpen(false);
    };

    const handleCancel = () => {
        setIsModalOpen(false);
    };
    const onChangeTextArea = (e) => {
        setNote(e.target.value);
    };
    const handleOnChangeSelect = (selectedValue) => {
        setSeat(selectedValue);
    }

    const showModal = () => {
        setIsModalOpen(true);
    };
    return (
        <div className='container'>
            <div className='container-info'>
                {/* <h2>CHUYẾN ĐI MIỄN PHÍ</h2> */}
                <div className='contents' style={{ marginTop: "50px" }}>
                    <Row>
                        <Col sm={16} md={8}>
                            <Descriptions size='middle' bordered title="Thông tin chi tiết chuyến đi">
                                <Descriptions.Item span={3} label="Từ">{tripInfo.from}</Descriptions.Item>
                                <Descriptions.Item span={3} label="Đến">{tripInfo.to}</Descriptions.Item>
                                <Descriptions.Item span={3} label="Thời gian xuất phát">{tripInfo.timeStart}</Descriptions.Item>
                                <Descriptions.Item label="Trống">{tripInfo.seatRemind}</Descriptions.Item>
                                <Descriptions.Item span={2} label="Cước">{tripInfo.price}</Descriptions.Item >
                                <Descriptions.Item label="Tài xế">{tripInfo.driverEmail}</Descriptions.Item>

                            </Descriptions>
                            <div style={{ marginTop: '30px', display: 'inline-block' }}>
                                <div>

                                    <Select
                                        style={{ width: "100px" }}
                                        onChange={handleOnChangeSelect}
                                    >
                                        <Option value='1'>1 chỗ</Option>
                                        <Option value='2'>2 chỗ</Option>
                                        <Option value='3'>3 chỗ</Option>
                                        <Option value='4'>4 chỗ</Option>
                                    </Select>

                                </div>
                                <div>
                                    <Button type="primary" danger style={{ marginLeft: "37%", display: 'inline-block' }}>
                                        Hủy
                                    </Button>
                                    <Button type="primary" style={{ display: 'inline-block' }} onClick={showModal}   >Xác nhận</Button>
                                    <Modal title="Đăng ký chuyến đi" width={700} open={isModalOpen} onOk={handleOk} onCancel={handleCancel}
                                        footer={[
                                            <Button key="back" onClick={handleCancel}>
                                                Hủy
                                            </Button>,
                                            <Button key="submit" type="primary" onClick={handleOk}>
                                                Xác nhận
                                            </Button>,

                                        ]}
                                    >
                                        <br />
                                        <Descriptions size='middle' bordered title="Thông tin Phương tiện">
                                            <Descriptions.Item span={3} label="Hạng phương tiện">Ô tô 4 chỗ</Descriptions.Item>
                                            <Descriptions.Item span={1} label="Loại xe">Mẹc</Descriptions.Item>
                                            <Descriptions.Item span={2} label="Biển số">29A1-113.29</Descriptions.Item>
                                        </Descriptions>
                                        <br />
                                        <h3>Ghi chú với tài xế</h3>
                                        <TextArea onChange={onChangeTextArea} style={{
                                            height: 120,
                                        }} />
                                    </Modal>
                                </div>
                            </div>
                        </Col>
                    </Row>
                </div>
            </div>
        </div>
    )
}
export default FreeTripDetailOfDriver;