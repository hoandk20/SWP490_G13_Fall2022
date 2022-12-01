package com.G13.api;

import com.G13.domain.*;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.master.RegisterStatus;
import com.G13.model.ChangeStatus;
import com.G13.model.TripPassenger;
import com.G13.repo.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api/tripPassenger")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class PassengerTrip {

    private final TripRepository tripRepository;
    private final RiderRepository riderRepository;
    private final PromotiontripRepository promotiontripRepository;
    private final DriverRepository driverRepository;
    private final VehicleRepository vehicleRepository;


    @PostMapping("/updateRegisterStatus")
    public ResponseEntity<?> ChangeStatusRegisterTrip(@RequestBody ChangeStatus changeStatus){
        String id = changeStatus.getId();
        String status = changeStatus.getStatus();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        RegisterStatus registerStatus = new RegisterStatus();
    try{
        Trip detail = tripRepository.findTripByIdOrderByCreatedDateDesc(id);
        if(detail.getId().equals("")) {
            throw  new Exception();
        }
        Promotiontrip promotiontrip = promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc(detail.getTripCode());
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
                    response.content="do not enough seat";
                    response.status = masterStatus.FAILURE;
                    return ResponseEntity.badRequest().body(response);
                }else{
                        promotiontrip.setNumberCapacityRegistered(promotiontrip.getNumberCapacityRegistered()+detail.getDuration());
                        promotiontripRepository.save(promotiontrip);
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
        response.content= tripRepository.save(detail).toString();
        response.object=detail;
        response.status = masterStatus.SUCCESSFULL;
        return ResponseEntity.ok().body(response);
    }catch (Exception exception){
        response.content=exception.toString();
        response.status = masterStatus.FAILURE;
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
            Rider rider = riderRepository.findByEmail(rp.getPassengerEmail());
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

            Promotiontrip promotiontrip = promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc(t.getTripCode());
            if(promotiontrip.getCapacity()-promotiontrip.getNumberCapacityRegistered()<t.getDuration()){
                response.content="do not enough seat";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }else{
              //  promotiontrip.setNumberCapacityRegistered(promotiontrip.getNumberCapacityRegistered()+t.getDuration());
              //  promotiontripRepository.save(promotiontrip);
            }
            response.content= tripRepository.save(t).toString();
            response.object=t;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/listTrip1")
    public ResponseEntity<?> listTrip(String passengerEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
            List<Trip> list = tripRepository.findAllByRiderIDOrderByCreatedDateDesc(passengerEmail);
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

            response.object=tripPassengers;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("/listTrip")
    public ResponseEntity<?> listTripHistory(@RequestBody filterTripPassenger filterTripPassenger){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        RegisterStatus registerStatus = new RegisterStatus();

        try{
            List<Trip> list = tripRepository.findAllByRiderIDOrderByCreatedDateDesc(filterTripPassenger.getPassengerEmail());
            List<TripPassenger> listTripHistory = new ArrayList<>();
            for (Trip detail:list
            ) {
                if(detail.getStatus().equals(registerStatus.CLOSE)||detail.getStatus().equals(registerStatus.APPROVE)){

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

                    Driver driver = driverRepository.findByEmail(tripPassenger.getDriverEmail());
                    Vehicle vehicle = vehicleRepository.findVehicleById(driver.getCurrentVehicle());
                    if(vehicle!=null){
                        tripPassenger.setVehiclePlate(vehicle.getPlate());
                        tripPassenger.setVehicleColor(vehicle.getExteriorColor());
                        tripPassenger.setVehicleName(vehicle.getCreatedBy());
                    }
                    Promotiontrip promotiontrip = promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc(detail.getTripCode());
                    tripPassenger.setTripStatus(promotiontrip.getStatus());
                    listTripHistory.add(tripPassenger);
                }
            }

            listTripHistory = filterTripPassenger(listTripHistory,filterTripPassenger);
            response.object=listTripHistory;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    List<TripPassenger> filterTripPassenger(List<TripPassenger> tripPassengerList,filterTripPassenger filter){
        List<TripPassenger> listResult = new ArrayList<>();
        for (TripPassenger t:tripPassengerList
             ) {
            if(filter.driverEmail!=null&&!filter.driverEmail.equals("")){
                if(!filter.driverEmail.equals(t.getDriverEmail())){
                    continue;
                }
            }
            if(filter.status!=null&&!filter.status.equals("")){
                if(!filter.status.equals(t.getTripStatus())){
                    continue;
                }
            }
            if(filter.dateFrom!=null){
                if(filter.dateFrom.compareTo(t.getTimeStart())>=0){
                    continue;
                }
            }
            if(filter.dateTo!=null){
                if(filter.dateTo.compareTo(t.getTimeStart())<=0){
                    continue;
                }
            }
            listResult.add(t);
        }

        return  listResult;
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
@Data
class filterTripPassenger{
    int companyID;
    String passengerEmail;
    String driverEmail;
    Date dateFrom;
    Date dateTo;
    String status;
}



