import { createSlice } from "@reduxjs/toolkit";

const freeTripSlice = createSlice({
    name: 'freeTrip',
    initialState: {
        trips: {
            allTrip: null,
            isFetching: false,
            error: false
        },
        createTrip: {
            detail: null,
            isFetching: false,
            error: false
        },
        tripDriverDetail: {
            detail: null,
            isFetching: false,
            error: false
        },
        passengerRegisterTrip: {
            detail: null,
            isFetching: false,
            error: false
        },
    },
    reducers: {
        getListFreeTripStart: (state) => {
            state.trips.isFetching = true;
        },
        getListFreeTripSuccess: (state, action) => {
            state.trips.allTrip = action.payload;
            state.trips.isFetching = false;
        },
        getListFreeTripFailed: (state) => {
            state.trips.isFetching = false;
            state.trips.error = true;
        },
        createTripStart: (state) => {
            state.trips.isFetching = false;
            state.createTrip.isFetching = true;
        },
        createTripSuccess: (state, action) => {
            state.createTrip.detail = action.payload;
            state.createTrip.isFetching=false;  
        },
        createTripFailed: (state) => {
            state.trips.isFetching = false;
            state.createTrip.error = true;
            
        },
        getTripDetailDriverStart: (state) => {
            state.tripDriverDetail.isFetching = true;
        },
        getTripDetailDriverSuccess: (state, action) => {
            state.tripDriverDetail.detail = action.payload;
            state.tripDriverDetail.isFetching = false;
        },
        getTripDetailDriverFailed: (state) => {
            state.tripDriverDetail.error = true;
        },
        passengerRegisterTripStart: (state)=>{
            state.passengerRegisterTrip.isFetching=true;
        },
        passengerRegisterTripSuccess: (state,action)=>{
            state.passengerRegisterTrip.detail=action.payload;
            state.passengerRegisterTrip.isFetching=false;
        },
        passengerRegisterTripFailed: (state)=>{
            state.passengerRegisterTrip.isFetching=false;
            state.passengerRegisterTrip.error=true;
        }

    }

})

export const {
    getListFreeTripStart,
    getListFreeTripSuccess,
    getListFreeTripFailed,
    createTripStart,
    createTripSuccess,
    createTripFailed,
    getTripDetailDriverStart,
    getTripDetailDriverSuccess,
    getTripDetailDriverFailed,
    passengerRegisterTripSuccess
} = freeTripSlice.actions;

export default freeTripSlice.reducer;