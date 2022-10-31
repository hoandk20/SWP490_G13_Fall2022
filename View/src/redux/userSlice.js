import { createSlice } from "@reduxjs/toolkit";

const userSlice=createSlice({
    name:'user',
    initialState:{
        userInfo:{
            currentUser :null,
            isFetching:false,
            error:false
        },
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
        deleteUser:(state)=>{
            state.userInfo.currentUser=null;
        }
    }

})

export const{
    getUserStart,
    getUserSuccess,
    getUserFailed,
    deleteUser,
}=userSlice.actions;

export default userSlice.reducer;