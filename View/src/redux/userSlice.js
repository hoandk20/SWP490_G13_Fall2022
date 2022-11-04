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
        }
    }

})

export const{
    getUserStart,
    getUserSuccess,
    getUserFailed,
    deleteUser,
    getAllDriverForCompany,
}=userSlice.actions;

export default userSlice.reducer;