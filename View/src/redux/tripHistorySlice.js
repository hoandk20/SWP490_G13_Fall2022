import { createSlice } from "@reduxjs/toolkit";

const tripHistorySlice=createSlice({
    name:'tripHistory',
    initialState:{
        tripHistory:{
            trips :null,
            isFetching:false,
            error:false
        },

    },
    reducers:{
        getTripHistoryStart:(state)=>{
            state.tripHistory.isFetching=true;
        },
        getTripHistorySuccess:(state,action)=>{
            state.tripHistory.trips=action.payload;
            // state.tripHistory.isFetching=false;  
        },
        getTripHistoryFailed:(state)=>{
            state.tripHistory.error=true;
            state.tripHistory.isFetching=false;
        },
    }

})

export const{
    getTripHistoryStart,
    getTripHistorySuccess,
    getTripHistoryFailed,
}=tripHistorySlice.actions;

export default tripHistorySlice.reducer;