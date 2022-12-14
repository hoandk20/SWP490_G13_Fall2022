import React, { useState } from 'react';
import { Button, Form, Input, Modal } from 'antd';
import { forgotPasswordApi } from '../../../../redux/apiRequest';
import { toast } from 'react-toastify';
const ForgotPassword = () => {
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [email,setEmail] =useState("");
    const showModal = () => {
        setIsModalOpen(true);
    };
    const handleOk = () => {
        forgotPasswordApi(email,toast);
        setIsModalOpen(false);
    };
    const handleCancel = () => {
        setIsModalOpen(false);
    };

    const onFinish = () =>{} 
    return (
        <>
            <a onClick={showModal}>Quên mật khẩu</a>
            <Modal title="Quên mật khẩu" open={isModalOpen} onOk={handleOk} onCancel={handleCancel} width={700} >

                <Form
                onFinish={onFinish}
                    labelCol={{
                        span: 4,
                    }}
                    wrapperCol={{
                        span: 16,
                    }}
                >
                    <Form.Item
                        label="Email"
                        rules={[
                            {
                                type: 'email',
                                message: 'Email không hợp lệ',
                            },
                            {
                                required: true,
                                message: 'Email không được để trống',
                            },
                        ]}
                    >
                        <Input onChange={(e)=>{setEmail(e.target.value)}}/>
                    </Form.Item>
                </Form>

            </Modal>
        </>
    );
};
export default ForgotPassword;