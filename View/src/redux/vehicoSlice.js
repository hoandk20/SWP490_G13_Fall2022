import { createSlice } from "@reduxjs/toolkit";

const vehicoSlice=createSlice({
    name:'vehico',
    initialState:{
        vehicos:{
            all :null,
            isFetching:false,
            error:false
        },
    },
    reducers:{
        getAllVehicos:(state,action)=>{
            state.vehicos.all=action.payload;
        },

    }

})

export const{
    getAllVehicos,
}=vehicoSlice.actions;

export default vehicoSlice.reducer;