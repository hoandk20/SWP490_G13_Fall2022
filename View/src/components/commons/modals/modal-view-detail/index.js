import { ExclamationCircleOutlined, EyeOutlined } from '@ant-design/icons';
import { Button, Modal, Form, Input, Descriptions } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import TextArea from 'antd/lib/input/TextArea';
import { formatCountdown } from 'antd/lib/statistic/utils';
import React, { useState } from 'react';

const ModalViewDetail = () => {

    const [isModalOpen, setIsModalOpen] = useState(false);
    const [form] = Form.useForm();
    const showModal = () => {
        setIsModalOpen(true);
    };
    const [open, setOpen] = useState(false);
    const [confirmLoading, setConfirmLoading] = useState(false);
    const showPopconfirm = () => {
        setOpen(true);
    };

    const handleOk = () => {
        
   
        setTimeout(() => {
            setIsModalOpen(false);
        
        }, 1000);

    };

    const handleCancel = () => {
        setIsModalOpen(false);
        form.resetFields();
    };
    // const confirm = () => {
    //     Modal.confirm({
    //       title: 'Confirm',
    //       icon: <ExclamationCircleOutlined />,
    //       content: 'Bla bla ...',
    //       okText: 'Xác nhận',
    //       cancelText: 'Hủy',
    //     });
    //   };

    return (
        <>
            <Button type="primary" style={{display:'inline-block'}} onClick={showModal}   >Xác nhận</Button>
            <Modal title="Đăng ký chuyến đi" width={700} open={isModalOpen}  onOk={handleOk}  onCancel={handleCancel}
                footer={[
                    <Button key="back" onClick={handleCancel}>
                        Hủy
                    </Button>,
                    <Button key="submit" type="primary" onClick={handleOk}>
                        Xác nhận
                    </Button>,
                 
                ]}
            >
                {/* <Descriptions size='middle' bordered title="Thông tin chi tiết chuyến đi">
                    <Descriptions.Item span={3} label="Từ">Tân Xã, Thạch Thất, Hà Nội, Việt Nam</Descriptions.Item>
                    <Descriptions.Item span={3} label="Đến">Tân Xã, Thạch Thất, Hà Nội, Việt Nam</Descriptions.Item>
                    <Descriptions.Item span={3} label="Thời gian xuất phát">08:00:00 ngày 22/10/2022</Descriptions.Item>
                    <Descriptions.Item label="Trống">4 chỗ</Descriptions.Item>
                    <Descriptions.Item span={2} label="Cước">20000 vnd</Descriptions.Item >
                    <Descriptions.Item label="Tài xế">Anh</Descriptions.Item>

                </Descriptions> */}
                <br />
                <Descriptions size='middle' bordered title="Thông tin Phương tiện">
                    <Descriptions.Item span={3} label="Hạng phương tiện">Ô tô 4 chỗ</Descriptions.Item>
                    <Descriptions.Item span={1} label="Loại xe">Mẹc</Descriptions.Item>
                    <Descriptions.Item span={2} label="Biển số">29A1-113.29</Descriptions.Item>
                </Descriptions>
                <br />
                <h3>Ghi chú với tài xế</h3>
                <TextArea style={{
                    height: 120,
                }} />
            </Modal>
        </>
    )
}
export default ModalViewDetail