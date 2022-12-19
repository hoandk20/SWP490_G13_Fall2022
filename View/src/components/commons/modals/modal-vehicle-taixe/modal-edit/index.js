import React, { useState } from 'react';

import { Button, Checkbox, Form, Input, Row, Col, Select, Table, DatePicker,Modal, Popconfirm } from 'antd';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import FormItem from 'antd/es/form/FormItem';
import { AddVehicleForDriver, getAllVehico } from '../../../../../redux/apiRequest';
import { FilterOutlined, SelectOutlined } from '@ant-design/icons';
import { toast } from 'react-toastify';
const { Option } = Select;
const ModalEditVehicleForDriver = (props) => {
    const [open, setOpen] = useState(false);
    const email=props.email;
    const dispatch = useDispatch();
    const user = useSelector((state) => state.user.userInfo?.currentUser);

    const all = useSelector((state) => state.vehico.vehicos?.all);
    const vehicos = all?.map((row) => ({ ...row, key: row.id }))

    const handleAdd = (key) => {
        AddVehicleForDriver(email,key,toast)
        setOpen(false)
    };
    const cancel = (e) => {

    };
    useEffect(() => {
        getAllVehico(user.email, dispatch);
    }, [])
    const columns = [
        // {
        //     key: 'index',
        //     title: 'Số',
        //     dataIndex: 'index',
        // },
        {
            key: 'producer',
            title: 'Kiểu phương tiện',
            dataIndex: 'producer',
        },
        {
            key: 'plate',
            title: 'Biển số',
            dataIndex: 'plate',
        },
        {
            key: 'produceYear',
            title: 'Năm sản xuất',
            dataIndex: 'produceYear',
        },
        {
            key: 'price',
            title: 'Giấy chứng nhận bảo hiểm',
            dataIndex: 'price',
        },
        {
            key: 'irs',
            title: 'Giấy đăng kiểm',
            dataIndex: 'irs',
        },
        {
            key: 'status',
            title: 'Trạng thái',
            dataIndex: 'status',
        },


        // {
        //     title: '',
        //     dataIndex: '',
        //     key: 'x',
        //     render: (text, record, index) => {
        //         return <div>
        //             <EditVehico state={record} />

        //         </div>

        //     },
        // },

        {
            title: 'Phân phương tiện',
            dataIndex: '',
            key: 'y',
            render: (text, record, index) => {
                return <div style={{textAlign:"center"}}>
                    <Popconfirm
                        title="Bạn có muốn thêm phương tiện này cho tài xế?"
                        onConfirm={() => handleAdd(record.key)}
                        onCancel={cancel}
                        okText="Yes"
                        cancelText="No"
                    >
                        {/* <Button type="primary">Phân phương tiện</Button> */}
                        <SelectOutlined style={{ fontSize: '20px', color: '#08c' }} />
                    </Popconfirm>
                </div>

            },
        },
    ];
    return (
        <>
            <Button type="primary" onClick={() => setOpen(true)}>
                Phân phương tiện
            </Button>
            <Modal
                title="Phân phương tiện"
                centered
                open={open}
                onOk={() => setOpen(false)}
                onCancel={() => setOpen(false)}
                width={1000}
            >
                <div className='container'>
                    <div className='container-infos' style={{
                        textAlign: "left",
                        marginLeft: "20px"
                    }}>
                   

                        <div className='table-info' style={{ marginTop: "5%" }}>
                            <Table columns={columns} dataSource={vehicos} size="middle" />
                        </div>
                    </div>
                </div >
            </Modal>
        </>
    );
};
export default ModalEditVehicleForDriver;