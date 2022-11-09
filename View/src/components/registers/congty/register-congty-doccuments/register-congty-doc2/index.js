import { RightOutlined } from '@ant-design/icons';
import { Button } from 'antd';
import React from 'react';
import { useNavigate } from 'react-router';
import AddVehico from '../../../../vehicos/add-vehico';

const RegisterCompanyDoc2 = () => {
    const navigate =useNavigate();
    const onClickNext = () => {
        navigate('/signup/vehico-info')       
    };
    return (
        <div className='container'>
            <div className='container-info'>
                <h2>TÀI LIỆU CẦN CHO PHƯƠNG TIỆN</h2>
                <p>Xin vui lòng thêm thông tin và tải các tài liệu liên quan đến xe của bạn. Xe của bạn cần có năm sản xuất
                    từ năm 2008 trở lên. Đối với xe 7 chỗ cần có năm sản xuất từ năm 2012 trở lên. Đối với xe mô tô, vui lòng
                    tải giấy đăng ký lên thay cho giấy đăng kiểm
                </p>
                <AddVehico/>
            </div>
            <div style={{ marginTop: "50px" }}>
                    <Button type='primary' onClick={onClickNext}>Tiếp tục <RightOutlined/> </Button>
                </div>
        </div>
    )
}
export default RegisterCompanyDoc2