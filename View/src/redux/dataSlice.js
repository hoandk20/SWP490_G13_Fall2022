import { createSlice } from "@reduxjs/toolkit";

const dataSlice=createSlice({
    name:'data',
    initialState:{
        citys:{
            all :null,
        },
    },
    reducers:{
        getAllCityInVi:(state,action)=>{
            state.citys.all=action.payload;
        },

    }

})
export const{
    getAllCityInVi,
}=dataSlice.actions;

export default dataSlice.reducer;