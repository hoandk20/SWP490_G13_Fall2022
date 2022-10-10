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

const { Option } = Select;

// const onChangeCheck = (e) => {
//     console.log('radio checked', e.target.value);
//     setValue(e.target.value);
// };

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

    return (
        <div className='container'>

            <div className='container-info'>
                <Row>
                    <Col sm={24} md={12} >
                        <div className='container-left'>
                            {/* <img src={} alt="abc" /> */}
                        </div>
                    </Col>
                    <Col sm={24} md={12}>
                        <div className='container-right'>

                            <div className='right-info'>
                                <h2>KIẾM TIỀN VỚI T.NET</h2>
                                <p>Là thời điểm tốt nhất để lái xe với T.NET. Đăng ký thật đơn giản, và bạn sẽ kiếm được thêm thu nhập với thời gian linh hoạt.</p>

                                <Form
                                    initialValues={{
                                        prefix: '+84'
                                    }}
                                >
                                    <h3>Bạn đang ở...</h3>
                                    <FormItem
                                        name="country"
                                    >
                                        <Select
                                            placeholder="*Lựa chọn quốc gia"
                                        >
                                            <Option value="Việt Nam"></Option>

                                        </Select>

                                    </FormItem>
                                    <FormItem
                                        name="city"
                                    >
                                        <Select
                                            placeholder="*Thành phố"
                                        >
                                            <Option value="Hà Nội"></Option>
                                            <Option value="Đà nẵng"></Option>
                                            <Option value="Hồ Chí Minh"></Option>

                                        </Select>

                                    </FormItem>
                                    <Form.Item
                                        name="phone"
                                        rules={[
                                            {
                                                required: true,
                                                message: 'Please input your phone number!',
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
                                    <FormItem>
                                    <Radio.Group  >
                                        <Space direction="vertical">
                                            <Radio value={1}>Là tài xế chuyên nghiệp có giấy phép lái xe. Bạn sở hữu phương tiện hoặc có kế hoạch sở hữu phương tiện, nhưng không có giấy phép hoạt động vận tải bằng ô tô?</Radio>
                                            <Radio value={2}>Công ty Taxi hoặc vận tải có giấy phép hoạt động, giấy phép kinh doanh vận tải bằng ô tô?</Radio>
                                            <Radio value={3}>Là một tài xế với giấy phép điều khiển phương tiện theo luật định, không có phương tiện và tìm kiếm một công ty hoặc phương tiện trong hệ thống T.NET để lái xe?</Radio>
                                          
                                        </Space>
                                    </Radio.Group>
                                </FormItem>
                                <ReCAPTCHA
                                        sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"
                                    />,
                                <FormItem
                                >
                                    <Button className='btn-register' type="primary" htmlType="submit">
                                        Submit
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