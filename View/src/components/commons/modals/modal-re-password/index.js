import { Button, Modal,Form,Input } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import { formatCountdown } from 'antd/lib/statistic/utils';
import React, { useState } from 'react';

const ModalRePassword = () =>{

    const [isModalOpen, setIsModalOpen] = useState(false);
    const [form] = Form.useForm();
    const showModal = () => {
        setIsModalOpen(true);
    };

    const handleOk = () => {
        setIsModalOpen(false);
        form.resetFields();
    };

    const handleCancel = () => {
        setIsModalOpen(false);
        form.resetFields();
    };

    return(
        <div>
            <Button type="primary" onClick={showModal}>
                                    Thay đổi mật khẩu
                                </Button>
                                <Modal title="Thay đổi mật khẩu" open={isModalOpen} onOk={handleOk} onCancel={handleCancel}>
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
                                                message: 'Please input your password!',
                                            },
                                        ]}
                                        hasFeedback
                                        >
                                            <Input.Password/>
                                        </FormItem>
                                        <Form.Item
                                        name="password"
                                        label="Mật khẩu mới"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your password!',
                                            },
                                        ]}
                                        hasFeedback
                                    >
                                        <Input.Password placeholder='*Mật khẩu: có tối thiểu 6 ký tự' />
                                    </Form.Item>

                                    <Form.Item
                                        name="confirm"
                                        label="Xác nhận mật khẩu"
                                        dependencies={['password']}
                                        hasFeedback
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please confirm your password!',
                                            },
                                            ({ getFieldValue }) => ({
                                                validator(_, value) {
                                                    if (!value || getFieldValue('password') === value) {
                                                        return Promise.resolve();
                                                    }

                                                    return Promise.reject(new Error('The two passwords that you entered do not match!'));
                                                },
                                            }),
                                        ]}
                                    >
                                        <Input.Password placeholder='*Nhập lại mật khẩu' />
                                    </Form.Item>
                                    </Form>
                                </Modal>
        </div>
    )
}
export default ModalRePassword