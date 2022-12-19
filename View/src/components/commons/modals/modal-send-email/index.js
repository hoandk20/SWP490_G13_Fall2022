import { SaveOutlined, SendOutlined } from '@ant-design/icons';
import { Button, Modal, Form, Input } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import { toast } from 'react-toastify';
import React, { useState } from 'react';
import { useSelector } from 'react-redux';
import { changePassword, SendEmail } from '../../../../redux/apiRequest';
import TextArea from 'antd/lib/input/TextArea';


const ModalSendEmail = (props) => {

    const email =props.email;
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [form] = Form.useForm();
    const showModal = () => {
        setIsModalOpen(true);
    };

    const handleCancel = () => {
        setIsModalOpen(false);
        form.resetFields();
    };

    const onFinish = (values) => {
        
        const object = {
            ...values,
            email: email,
        }


        SendEmail(object,toast);
        setIsModalOpen(false);
        form.resetFields();
    }

    return (
        <div>
            <Button type="primary" onClick={showModal}>
                Gửi Email
            </Button>
            <Modal title="Gửi Email" open={isModalOpen} onCancel={handleCancel} width={1000}>
                <Form
                    onFinish={onFinish}
                    form={form}
                    labelCol={{
                        span: 2,
                    }}
                    wrapperCol={{
                        span: 21,
                    }}
                >
                    <FormItem
                        name="subject"
                        label="Tiêu đề"
                        rules={[
                            {
                                required: true,
                                message: 'Please input your title!',
                            },
                        ]}
                        hasFeedback
                    >
                        <Input />
                    </FormItem>
                    <Form.Item
                        name="body"
                        label="Nội dung"
                        rules={[
                            {
                                required: true,
                                message: 'Please input your content!',
                            },
                        ]}
                        hasFeedback
                    >
                        <TextArea style={{
                            height: 120,
                        }} />
                    </Form.Item>


                    <Form.Item>
                        <Button className='btn' type="primary" htmlType="submit" style={{marginLeft:"50%"}} >
                            Gửi <SendOutlined />
                        </Button>
                    </Form.Item>
                </Form>
            </Modal>
        </div>
    )
}
export default ModalSendEmail