import { Button, Checkbox, Form, Input, Row, Col, Select, Table, Popconfirm } from 'antd';
import FormItem from 'antd/es/form/FormItem';
import React from 'react';
import { DeleteOutlined, EyeOutlined, FilterOutlined } from '@ant-design/icons';
// import AddVehico from '../../../../../commons/drawers/drawer-vehico-mgt/drawer-add--vehico';
import { useDispatch, useSelector } from 'react-redux';
import { deleteDriverByCompany, getDriverDetail, getDriversForCompany, getDriversForCompanyFilter } from '../../../../../../redux/apiRequest';
import { useEffect } from 'react';
import AddDriverForCompany from '../../../../../commons/drawers/drawer-driverCompany-mgt/drawer-add-driver';
import EditDriverForCompany from '../../../../../commons/drawers/drawer-admin-mgt/drawer-edit-driver';
import { toast } from 'react-toastify';
import { useState } from 'react';
import { useNavigate } from 'react-router';

const { Option } = Select;

const data = [

];

const DriverOfCompanyByAdmin = (props) => {
    const dispatch = useDispatch();
    const navigate =useNavigate();
    const [companys,setCompanys]=useState(props.companys);
    const all=useSelector((state)=>state.user.drivers?.all);
  
     const drivers=all?.map((row)=> ({ ...row,key:row.driverID,name:row.firstName+" "+row.lastName }));
     const allCity = useSelector((state) => state.data.citys?.all);
     const citys=allCity?.map((row)=> ({value:row.id.cityID,label:row.cityName}));

     const [city, setCity] = useState("");

    const handleDelete = (key) => {
         deleteDriverByCompany(key,companys.email,toast,dispatch);
    };
    const cancel = (e) => {

    };
    const handleChange = (a) => {
        setCity(a);
      };

      const onFinish = (values) =>{
        if(values.name===undefined){
            values.name=""
        }
        if(values.driverEmail===undefined){
            values.driverEmail=""
        }
        if(city===undefined){
            setCity("")
        }
        if(values.status===undefined){
            values.status=""
        }
        const driver = {
            ...values,
            address:city,
            companyEmail:companys.email,
        }

        getDriversForCompanyFilter(driver,dispatch);
    }
    useEffect(()=>{
        getDriversForCompany(companys.email,dispatch);
         
      },[])
const columns = [

    {
        key: 'email',
        title: 'T??i kho???n',
        dataIndex: 'email',
    },
    {
        key: 'name',
        title: 'T??n ?????y ?????',
        dataIndex: 'name',
    },
    {
        key: 'email',
        title: 'Email',
        dataIndex: 'email',
    },
    {
        key: 'phoneNumber',
        title: 'S??? di ?????ng',
        dataIndex: 'phoneNumber',
    },
    {
        key: 'vehico',
        title: 'Ph????ng ti???n',
        dataIndex: 'vehico',
    },
    {
        key: 'status',
        title: 'Tr???ng th??i',
        dataIndex: 'status',
    },

    
    {
        title: '',
        dataIndex: '',
        key: 'x',
        render: (text, record, index) => {
            return <div>
                   <EyeOutlined onClick={() => {

                        getDriverDetail(record.email,dispatch);
                        setTimeout(()=>{
                            navigate('/admin/taixe-mgt/detail', { state: { record } })
                          },1500)   
                         
                    }} />

            </div>
        },
    },
    // {
    //     title: '',
    //     dataIndex: '',
    //     key: 'y',
    //     render: (record) => {
    //         return <div>
    //             <Popconfirm
    //                 title="B???n c?? mu???n x??a t??i kho???n n??y?"
    //                 onConfirm={() => handleDelete(record.key)}
    //                 onCancel={cancel}
    //                 okText="Yes"
    //                 cancelText="No"
    //             >
    //                 <DeleteOutlined/>
    //             </Popconfirm>
    //         </div>

    //     },
    // },
    

];
    return (
        <div className='container'>
            <div className='container-infos'>
                <h2>T??I X???</h2>
                <div className='driver-info'>
                <Form
                        onFinish={onFinish}
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
                                    name="status"
                                    label="Tr???ng th??i"

                                >
                                    <Select
                                        allowClear
                                    >
                                        <Option value="NEW">M???i</Option>
                                        <Option value="ACT">Ho???t ????ng</Option>

                                    </Select>
                                </FormItem>
                                <FormItem
                                    name="driverEmail"
                                    label="T??i kho???n"
                                >
                                    <Input />
                                </FormItem>
                                <FormItem
                                    name="name"
                                    label="T??n   "
                                >
                                    <Input />
                                </FormItem>
                            </Col>
                            <Col sm={24} md={12} >
                                <FormItem
                                    name="city"
                                    label="V??? tr??"

                                >
                                <Select
                                    onChange={handleChange}
                                    allowClear
                                    options={citys}
                                />
                                </FormItem>
                                <FormItem />
                                <FormItem
                                >
                                    <Button className='btn-register' type="primary" htmlType="submit">
                                        <FilterOutlined />  L???c t??i x???
                                    </Button>
                                </FormItem>
                              
                            </Col>
                        </Row>
                    </Form>
                </div>
                {/* <div style={{marginLeft:"50px",float:"left"}}>
                    <AddDriverForCompany/>
                </div> */}
                <div className='table-info' style={{marginTop:"5%"}}>
                <Table columns={columns} dataSource={drivers} size="middle" />
                </div>

            </div>
        </div>
    )
}
export default DriverOfCompanyByAdmin