import { Button, Checkbox, Form, Input, Row, Col, Select, Table, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';
import AddVehico from '../../../commons/drawers/drawer-vehico-mgt/drawer-add--vehico';
import { useDispatch, useSelector } from 'react-redux';
import { deleteDriverByCompany, getDriversForCompany } from '../../../../redux/apiRequest';
import { useEffect } from 'react';
import AddDriverForCompany from '../../../commons/drawers/drawer-driverCompany-mgt/drawer-add-driver'
import EditDriverForCompany from '../../../commons/drawers/drawer-driverCompany-mgt/drawer-edit-driver';
import { toast } from 'react-toastify';

const { Option } = Select;

const data = [

];

const DriverManagement = () => {
    const dispatch = useDispatch();
    const user=useSelector((state)=>state.user.userInfo?.currentUser);
    const all=useSelector((state)=>state.user.drivers?.all);
    console.log(all);
     const drivers=all?.map((row)=> ({ ...row,key:row.driverID,name:row.firstName+" "+row.lastName }));
   
    const handleDelete = (key) => {
        console.log(key);
         deleteDriverByCompany(key,user.email,toast,dispatch);
    };
    const cancel = (e) => {

    };

    useEffect(()=>{
        getDriversForCompany(user.email,dispatch);
         
      },[])
const columns = [
    {
        key: 'index',
        title: 'Số',
        dataIndex: 'index',
    },
    {
        key: 'email',
        title: 'Tài khoản',
        dataIndex: 'email',
    },
    {
        key: 'name',
        title: 'Tên đầy đủ',
        dataIndex: 'name',
    },
    {
        key: 'email',
        title: 'Email',
        dataIndex: 'email',
    },
    {
        key: 'phoneNumber',
        title: 'Số di động',
        dataIndex: 'phoneNumber',
    },
    {
        key: 'vehico',
        title: 'Phương tiện',
        dataIndex: 'vehico',
    },
    {
        key: 'status',
        title: 'Trạng thái',
        dataIndex: 'status',
    },

    
    {
        title: '',
        dataIndex: '',
        key: 'x',
        render: (text, record, index) => {
            return <div>
                     <EditDriverForCompany state={record}/> 

            </div>
        },
    },
    {
        title: '',
        dataIndex: '',
        key: 'y',
        render: (record) => {
            return <div>
                <Popconfirm
                    title="Bạn có muốn xóa tài khoản này?"
                    onConfirm={() => handleDelete(record.key)}
                    onCancel={cancel}
                    okText="Yes"
                    cancelText="No"
                >
                    <DeleteOutlined/>
                </Popconfirm>
            </div>

        },
    },
    

];
    return (
        <div className='container'>
            <div className='container-infos'>
                <h2>TÀI XẾ</h2>
                <div className='driver-info'>

                    <Form
                        labelCol={{
                            span: 4,
                        }}
                        wrapperCol={{
                            span: 16,
                        }}
                    >
                        <Row>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="trangthai"
                                    label="Trạng thái"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="Tất cả"></Option>
                                        <Option value="Chờ xem xét"></Option>
                                        <Option value="Mới"></Option>
                                        <Option value="Hoạt động"></Option>
                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="taikhoan"
                                    label="Tài khoản"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="ten"
                                    label="Tên   "
                                >
                                    <Input />
                                </FormItem>
                            </Col>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="vitri"
                                    label="Vị trí"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="Tất cả"></Option>
                                        <Option value="Chờ xem xét"></Option>
                                        <Option value="Mới"></Option>
                                        <Option value="Hoạt động"></Option>
                                    </Select>
                                </FormItem>
                                <FormItem />
                                <FormItem
                                >
                                    <Button className='btn-register' type="primary" htmlType="submit">
                                        <FilterOutlined />  Lọc tài xế
                                    </Button>
                                </FormItem>
                              
                            </Col>
                        </Row>
                    </Form>
                </div>
                <div style={{marginLeft:"50px",float:"left"}}>
                    <AddDriverForCompany/>
                </div>
                <div className='table-info' style={{marginTop:"5%"}}>
                <Table columns={columns} dataSource={drivers} size="middle" />
                </div>

            </div>
        </div>
    )
}
export default DriverManagement