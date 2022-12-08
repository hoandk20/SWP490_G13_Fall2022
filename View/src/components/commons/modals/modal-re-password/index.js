import { SaveOutlined } from '@ant-design/icons';
import { Button, Modal, Form, Input } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import { toast } from 'react-toastify';
import React, { useState } from 'react';
import { useSelector } from 'react-redux';
import { changePassword } from '../../../../redux/apiRequest';
import './re-password.css'

const ModalRePassword = () => {

    const user = useSelector((state) => state.user.userInfo.currentUser)
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [oldPassword, setOldPassword] = useState("");
    const [newPassword, setNewPassword] = useState("");
    const [form] = Form.useForm();
    const showModal = () => {
        setIsModalOpen(true);
    };

    const handleCancel = () => {
        setIsModalOpen(false);
        form.resetFields();
    };

    const handleOk = () =>{
        const object = {
            email: user.email,
            oldPassword: oldPassword,
            newPassword: newPassword
        }
        console.log("object",object);
        changePassword(object,toast);
        setIsModalOpen(false);
        form.resetFields();
    }


    return (
        <div>
            <Button type="primary" onClick={showModal}>
                Thay đổi mật khẩu
            </Button>
            <Modal title="Thay đổi mật khẩu" open={isModalOpen} onCancel={handleCancel} onOk={handleOk} >
                <Form
                    form={form}
                    labelCol={{
                        span: 7,
                    }}
                    wrapperCol={{
                        span: 14,
                    }}
                >
                    <FormItem
                        name="oldPassword"
                        label="Mật khẩu cũ"
                        rules={[
                            {
                                required: true,
                                message: 'Vui lòng nhập mật khẩu cũ',
                            },
                        ]}
                        hasFeedback
                    >
                        <Input.Password  onChange={(e) =>{setOldPassword(e.target.value)}} />
                    </FormItem>
                    <Form.Item
                        name="password"
                        label="Mật khẩu mới"
                        rules={[
                            {
                                required: true,
                                message: 'Vui lòng nhập mật khẩu mới',
                                min: 6,
                                max: 32
                            },
                        ]}
                        hasFeedback
                    >
                        <Input.Password placeholder='*Mật khẩu: có tối thiểu 6 ký tự'  onChange={(e) =>{setNewPassword(e.target.value)}}/>
                    </Form.Item>

                    <Form.Item
                        name="confirm"
                        label="Xác nhận mật khẩu"
                        dependencies={['password']}
                        hasFeedback
                        rules={[
                            {
                                required: true,
                                message: 'Vui lòng nhập lại mật khẩu ',
                            },
                            ({ getFieldValue }) => ({
                                validator(_, value) {
                                    if (!value || getFieldValue('password') === value) {
                                        return Promise.resolve();
                                    }

                                    return Promise.reject(new Error('Không khớp với mật khẩu vừa tạo'));
                                },
                            }),
                        ]}
                    >
                        <Input.Password placeholder='*Nhập lại mật khẩu'  />
                    </Form.Item>
                </Form>
            </Modal>
        </div>
    )
}
export default ModalRePassword