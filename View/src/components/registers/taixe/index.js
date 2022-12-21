import {
    Button,
    Checkbox,
    Col,
    Form,
    Input,
    Row,
    Select,
    Radio,
    Space,
} from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import './register-driver.css'
import ReCAPTCHA from "react-google-recaptcha";
import { useNavigate } from 'react-router';

import {  toast } from 'react-toastify';
import { useSelector } from 'react-redux';
import ImageRegister from '../../../assets/image-app/registertx.jpg'

const { Option } = Select;



const prefixSelector = (
    <Form.Item name="prefix" noStyle>
        <Select
            style={{
                width: 150,
            }}
        >
            <Option value="84">+84</Option>
        </Select>
    </Form.Item>
);

const RegisterDriver = () => {

    const navigate= useNavigate();
    const allCity = useSelector((state) => state.data.citys?.all);
    const citys = allCity?.map((row) => ({ value: row.id.cityID, label: row.cityName }));
    const onFinish = (values) => {
        const newUser={
            country:values.country,
            city:values.city.value,
            phoneNumber:values.phoneNumber,
            role:values.role
        }
        console.log(newUser);
        if (newUser.role == "ROLE_DRIVER") {
            navigate('/signup/driver-info',{state:{newUser}});
        }
        else {
            navigate('/signup/company-info',{state:{newUser}});
        }
    };

    return (
        <div className='container'>

            <div className='container-info'>
                <Row>
                    <Col sm={28} md={14} >
                        <div className='container-left'>
                            <img width="95%" height="600vh" src={ImageRegister} alt="abc" />
                        </div>
                    </Col>
                    <Col sm={20} md={10}>
                        <div className='container-right'>

                            <div className='right-info'>
                                <h2>KIẾM TIỀN VỚI T.NET</h2>
                                <p>Là thời điểm tốt nhất để lái xe với T.NET. Đăng ký thật đơn giản, và bạn sẽ kiếm được thêm thu nhập với thời gian linh hoạt.</p>

                                <Form
                                    onFinish={onFinish}
                                    initialValues={{
                                        prefix: '+84'
                                    }}
                                >
                                    <h3>Bạn đang ở...</h3>
                                    <FormItem
                                        name="country"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Vui lòng chọn quốc gia của bạn',
                                            },
                                        ]}
                                    >
                                        <Select
                                            placeholder="*Lựa chọn quốc gia"
                                        >
                                            <Option value="vi">Việt Nam</Option>

                                        </Select>

                                    </FormItem>
                                   
                        <Form.Item
                                name="city"
                                rules={[
                                    {
                                        required: true,
                                        message: 'Vui lòng chọn thành phố',
                                    },
                                ]}
                            >
                                <Select
                                   placeholder="*Lựa chọn thành phố"
                                    labelInValue
                                    options={citys}
                                />
                            </Form.Item>

                                  
                                    <Form.Item
                                        name="phoneNumber"
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
                                        <Input
                                            addonBefore={prefixSelector}
                                            style={{
                                                width: '100%',
                                            }}
                                        />
                                    </Form.Item>
                                    <h3>Bạn là...</h3>
                                    <FormItem
                                     name="role"
                                    >
                                    <Radio.Group  >
                                        <Space direction="vertical">
                                            <Radio value={"ROLE_DRIVER"}>Là tài xế chuyên nghiệp có giấy phép lái xe. Bạn sở hữu phương tiện hoặc có kế hoạch sở hữu phương tiện, nhưng không có giấy phép hoạt động vận tải bằng ô tô?</Radio>
                                            <Radio value={"ROLE_COMPANY"}>Công ty Taxi hoặc vận tải có giấy phép hoạt động, giấy phép kinh doanh vận tải bằng ô tô?</Radio>
                                            {/* <Radio value={"ROLE_DRIVER"}>Là một tài xế với giấy phép điều khiển phương tiện theo luật định, không có phương tiện và tìm kiếm một công ty hoặc phương tiện trong hệ thống T.NET để lái xe?</Radio> */}
                                          
                                        </Space>
                                    </Radio.Group>
                                </FormItem>
                                <ReCAPTCHA
                                        sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"
                                    />,
                                <FormItem
                                >
                                    <Button className='btn-register' type="primary" htmlType="submit">
                                        Gửi
                                    </Button>
                                </FormItem>
                            </Form>

                        </div>
                    </div>
                </Col>
            </Row>
        </div>
        </div >
    )
}
export default RegisterDriver