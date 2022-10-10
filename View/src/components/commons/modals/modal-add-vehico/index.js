import { Button, Modal, Form, Input,Table } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import { formatCountdown } from 'antd/lib/statistic/utils';
import { SaveOutlined,CloseOutlined } from '@ant-design/icons';
import React, { useState } from 'react';
import './modal-add-vehico.css'

const ModalAddVehico = () => {

    const [isModalOpen, setIsModalOpen] = useState(false);
    const [form] = Form.useForm();
    const showModal = () => {
        setIsModalOpen(true);
    };

    const handleOk = () => {
        setIsModalOpen(false);
   
    };

    const handleCancel = () => {
        setIsModalOpen(false);
      
    };

    const columns = [
        {
            title: 'Số',
            dataIndex: 'index',
        },
        {
            title: 'Kiểu phương tiện',
            dataIndex: 'vehico',
        },
        {
            title: 'Biển số',
            dataIndex: 'name',
        },
        {
            title: 'Hạng phương tiện',
            dataIndex: 'email',
        },
        {
            title: 'Số di động',
            dataIndex: 'phoneNumber',
        },
        {
            title: 'Trạng thái',
            dataIndex: 'status',
        },

        {
            title: '',
            dataIndex: 'action',
        },
    ];
    const data = [

    ];
    return (
        <div style={{marginTop:"20px",float:"right"}}>
            <Button type="primary" onClick={showModal}>
                Phân phương tiện
            </Button>
            <Modal title="Thông tin phương tiện"   width={1000} open={isModalOpen} >
                <div className='form'>
                    <div className='form-info'>

                        <div className='form-table'>
                            <Table columns={columns} dataSource={data} size="middle" />
                            <div className='save-form'>
                                <Input style={{ width: "250px", marginTop: "20px", display: "inline", marginLeft: "33%" }} />
                                <Button type="primary" style={{ marginLeft: "20px" }} >+ Thêm</Button>
                                <div style={{ marginTop: "20px", marginLeft: "33%" }}>
                                    <Button type="primary" style={{ marginRight: "50px", width: "100px" }} onClick={handleOk}><SaveOutlined />Lưu</Button>
                                    <Button type="primary" style={{ width: "100px" }} onClick={handleCancel}><CloseOutlined />Đóng</Button>
                                </div>

                            </div>
                        </div>

                    </div>

                </div>
            </Modal>
        </div>
    )
}
export default ModalAddVehico