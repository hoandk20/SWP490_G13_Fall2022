package com.G13.controller;

import com.G13.domain.*;
import com.G13.masterData.MasterStatus;
import com.G13.masterData.MasterTripStatus;
import com.G13.masterData.RegisterStatus;
import com.G13.modelDto.ChangeStatus;
import com.G13.modelDto.ResopnseContent;
import com.G13.modelDto.TripPassenger;
import com.G13.modelDto.filterTripPassenger;
import com.G13.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api/tripPassenger")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class PassengerTripController {

    private final TripService tripService;
    private final RiderService riderService;
    private final DriverService driverService;
    private final VehicleService vehicleService;
    private final PromotionTripService promotionTripService;
    private final PassengerTripService passengerTripService;

    @PostMapping("/updateRegisterStatus")
    public ResponseEntity<?> ChangeStatusRegisterTrip(@RequestBody ChangeStatus changeStatus){
        String id = changeStatus.getId();
        String status = changeStatus.getStatus();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        RegisterStatus registerStatus = new RegisterStatus();
    try{
        Trip detail = tripService.getTripById(id);
        if(detail.getId().equals("")) {
            throw  new Exception();
        }
        Promotiontrip promotiontrip = promotionTripService.getPromotionTripById(detail.getTripCode());
        switch (status){
            case "1":
                detail.setStatus(registerStatus.REJECT);
                break;
            case "2":
                detail.setStatus(registerStatus.APPROVE);
                if(promotiontrip==null){
                    break;
                }
                if(promotiontrip.getCapacity()-promotiontrip.getNumberCapacityRegistered()<detail.getDuration()){
                    response.setContent("do not enough seat");
                    response.setStatus(masterStatus.FAILURE);
                    return ResponseEntity.badRequest().body(response);
                }else{
                        promotiontrip.setNumberCapacityRegistered(promotiontrip.getNumberCapacityRegistered()+detail.getDuration());
                        promotionTripService.SavePromotionTrip(promotiontrip);
                }
                break;
            case "3":
                detail.setStatus(registerStatus.PENDING);
                break;
            case "4":
                detail.setStatus(registerStatus.CLOSE);
                detail.setTimeEnd(Instant.now());
                break;
            default:
        }
        response.setContent(tripService.SaveTrip(detail).toString());
        response.setObject(detail);
        response.setStatus(masterStatus.SUCCESSFULL);
        return ResponseEntity.ok().body(response);
    }catch (Exception exception){
        response.setContent(exception.toString());
        response.setStatus(masterStatus.FAILURE);
        return ResponseEntity.badRequest().body(response);
    }
    }
    @PostMapping("/create")
    public ResponseEntity<?> CreateTrip (@RequestBody TripPassenger rp) {
        Instant timeStamp= rp.getTimeStart().toInstant();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        float nofloat =0;
        short noShort = (short)0;
        Date date = new Date();
        long time = date.getTime();
        try {
            Rider rider = riderService.getRiderByEmail(rp.getPassengerEmail());
            MasterTripStatus m = new MasterTripStatus();
            Trip t = new Trip();
            t.setRiderID(rp.getPassengerEmail());
            t.setId(time+"");
            t.setNote(rp.getNote());
            t.setTripCode(rp.getTripID());
            t.setToAddress(rp.getTo());
            t.setOpenPrice(rp.getPrice());
            t.setFromAddress(rp.getFrom());
            t.setTimeStart(timeStamp);
            t.setDriverID(rp.getDriverEmail());
            t.setDriverWaitingTime((short)rp.getWaitingTime());
            t.setDuration((short)rp.getSeatRegister());
            t.setStatus(masterTripStatus.TRIP_PENDING);
            t.setMobileRelative(rider.getMobileNo());

            if(tripService.IsRegistedTrip(t.getTripCode(),t.getRiderID())){
                Map<String, Boolean> err = new HashMap<>();
                err.put("IsRegisted", true);
                response.setObject(err);
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);
            }
            Promotiontrip promotiontrip = promotionTripService.getPromotionTripById(t.getTripCode());

            if(promotiontrip.getCapacity()-promotiontrip.getNumberCapacityRegistered()<t.getDuration()){
                response.setContent("do not enough seat");
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);
            }else{
              //  promotiontrip.setNumberCapacityRegistered(promotiontrip.getNumberCapacityRegistered()+t.getDuration());
              //  promotiontripRepository.save(promotiontrip);
            }
            response.setContent(tripService.SaveTrip(t).toString());
            response.setObject(t);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/listTrip1")
    public ResponseEntity<?> listTrip(String passengerEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
            List<Trip> list = tripService.getListTripByRiderEmail(passengerEmail);
            List<TripPassenger> tripPassengers = new ArrayList<>();
            for (Trip detail:list
                 ) {
                TripPassenger tripPassenger = new TripPassenger();
                tripPassenger.setId(detail.getDriverID());
                tripPassenger.setFrom(detail.getFromAddress());
                tripPassenger.setTo(detail.getToAddress());
                tripPassenger.setNote(detail.getNote());
                tripPassenger.setSeatRegister(detail.getDuration());
                tripPassenger.setStatus(detail.getStatus());
                tripPassenger.setTimeStart(Date.from(detail.getTimeStart()));
                tripPassenger.setWaitingTime(detail.getDriverWaitingTime());
                tripPassenger.setPrice(detail.getOpenPrice());

                tripPassengers.add(tripPassenger);
            }

            response.setObject(tripPassengers);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/listTrip")
    public ResponseEntity<?> listTripHistory(@RequestBody filterTripPassenger filterTripPassenger){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        RegisterStatus registerStatus = new RegisterStatus();

        try{
            List<Trip> list =
                    tripService.getListTripByRiderEmail(filterTripPassenger.getPassengerEmail());
            List<TripPassenger> listTripHistory = new ArrayList<>();
            for (Trip detail:list
            ) {
                    TripPassenger tripPassenger = new TripPassenger();
                    tripPassenger.setId(detail.getId());
                    tripPassenger.setTripID(detail.getTripCode());
                    tripPassenger.setNote(detail.getNote());
                    tripPassenger.setFrom(detail.getFromAddress());
                    tripPassenger.setTo(detail.getToAddress());
                    tripPassenger.setSeatRegister(detail.getDuration());
                    tripPassenger.setStatus(detail.getStatus());
                    tripPassenger.setDriverEmail(detail.getDriverID());
                    tripPassenger.setTimeStart(Date.from(detail.getTimeStart()));
                    tripPassenger.setWaitingTime(detail.getDriverWaitingTime());
                    tripPassenger.setPrice(detail.getOpenPrice());
                    tripPassenger.setRegisterStatus(detail.getStatus());

                    Driver driver = driverService.getDriverByEmail(tripPassenger.getDriverEmail());
                    Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
                    if(vehicle!=null){
                        tripPassenger.setVehiclePlate(vehicle.getPlate());
                        tripPassenger.setVehicleColor(vehicle.getExteriorColor());
                        tripPassenger.setVehicleName(vehicle.getCreatedBy());
                    }
                    Promotiontrip promotiontrip = promotionTripService.getPromotionTripById(detail.getTripCode());
                    tripPassenger.setTripStatus(promotiontrip.getStatus());
                    listTripHistory.add(tripPassenger);

            }
            listTripHistory = passengerTripService.filterTripPassenger(listTripHistory,filterTripPassenger);
            response.setObject(listTripHistory);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/PassengerCancelTrip")
    public ResponseEntity<?> PassengerCancelTrip (@RequestBody TripPassenger rp) {
            ResopnseContent response = new ResopnseContent();
        try {
            MasterTripStatus m = new MasterTripStatus();
            Trip t = tripService.getTripById(rp.getTripID());
            RegisterStatus registerStatus =new RegisterStatus();
            if(!t.getRiderID().equals(rp.getPassengerEmail())){
                response.setContent("You have no permistion!");
                return ResponseEntity.badRequest().body(response);
            }
            if(t.getStatus().equals(registerStatus.APPROVE)){
                Promotiontrip promotiontrip = promotionTripService.getPromotionTripById(t.getTripCode());
                promotiontrip.setNumberCapacityRegistered(promotiontrip.getNumberCapacityRegistered()-t.getDuration());
                promotionTripService.SavePromotionTrip(promotiontrip);
            }
            t.setStatus(registerStatus.CANCEL);
            response.setContent(tripService.DeleteTrip(t)+"");
            response.setObject(t);
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.setContent(exception.toString());
            return ResponseEntity.badRequest().body(response);
        }

    }

//    @GetMapping("/detail")
//    public ResponseEntity<?> TripDetail (String id){
//
//        ResopnseContent response = new ResopnseContent();
//        MasterStatus masterStatus = new MasterStatus();
//
//        try{
//        Trip detail = tripRepository.findTripByIdOrderByCreatedDateDesc(id);
//            TripPassenger tripPassenger = new TripPassenger();
//            tripPassenger.setSeatRegister(detail.getDuration()) ;
//            tripPassenger.setStatus(detail.getStatus()); ;
//            tripPassenger.setDriverEmail(detail.getDriverID());
//            tripPassenger.setFrom(detail.getFromAddress());
//            tripPassenger.setTo( detail.getToAddress());
//            tripPassenger.setPassengerEmail(detail.getRiderID());
//            tripPassenger.setTimeStart(Date.from(detail.getTimeStart()));
//            tripPassenger.setWaitingTime(detail.getDriverWaitingTime());
//            tripPassenger.setPrice(detail.getOpenPrice());
//        response.object=tripPassenger;
//        response.status = masterStatus.SUCCESSFULL;
//        return ResponseEntity.ok().body(response);
//        }catch (Exception exception) {
//            response.content = exception.toString();
//            response.status = masterStatus.FAILURE;
//            return ResponseEntity.badRequest().body(response);
//        }
//    }

}




