import { createSlice } from "@reduxjs/toolkit";

const userSlice=createSlice({
    name:'user',
    initialState:{
        userInfo:{
            currentUser :"",
            isFetching:false,
            error:false
        },
        drivers:{
            all:null,
        },
        driver:{
            info:null,
        },
        companys:{
            all:null,
        },
        company:{
            info:null
        },
        passengers:{
            all:null,
        },
        passenger:{
            info:null
        }
    },
    reducers:{
        getUserStart:(state)=>{
            state.userInfo.isFetching=true;
        },
        getUserSuccess:(state,action)=>{
            state.userInfo.currentUser=action.payload;
            state.userInfo.isFetching=false;  
        },
        getUserFailed:(state)=>{
            state.userInfo.error=true;
        },
        getAllDriverForCompany:(state,action)=>{
            state.drivers.all=action.payload;
         
        },
        deleteUser:(state)=>{
            state.userInfo.currentUser="";
        },
        getAllCompanyForAdmin:(state,action)=>{
            state.companys.all=action.payload;        
        },
        getDriverByDriverId(state,action){
            state.driver.info=action.payload
        },
        getDriverByDriverEmail(state,action){
            state.driver.info=action.payload
        },
        getCompanyByCompanyEmail(state,action){
            state.company.info=action.payload
        },
        getAllPassengerForAdmin(state,action){
            state.passengers.all=action.payload
        },
        getPassengerByEmail(state,action){
            state.passenger.info=action.payload
        }
    }

})

export const{
    getUserStart,
    getUserSuccess,
    getUserFailed,
    deleteUser,
    getAllDriverForCompany,
    getAllCompanyForAdmin,
    getDriverByDriverId,
    getDriverByDriverEmail,
    getCompanyByCompanyEmail,
    getAllPassengerForAdmin,
    getPassengerByEmail,
}=userSlice.actions;

export default userSlice.reducer;