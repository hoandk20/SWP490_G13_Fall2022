package com.G13.api;

import com.G13.domain.Trip;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.master.RegisterStatus;
import com.G13.repo.TripRepository;
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


    @PostMapping("/updateRegisterStatus")
    public ResponseEntity<?> ChangeStatusRegisterTrip(@RequestBody ChangeStatus changeStatus){
        String id = changeStatus.id;
        String status = changeStatus.status;
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        RegisterStatus registerStatus = new RegisterStatus();
    try{
        Trip detail = tripRepository.findTripByIdOrderByCreatedDateDesc(id);
        if(detail.getId().equals("")) {
            throw  new Exception();
        }
        switch (status){
            case "1":
                detail.setStatus(registerStatus.REJECT);
                break;
            case "2":
                detail.setStatus(registerStatus.APPROVE);
                break;
            case "3":
                detail.setStatus(registerStatus.PENDING);
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

        Instant timeStamp= rp.timeStart.toInstant();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        float nofloat =0;
        short noShort = (short)0;
        Date date = new Date();
        long time = date.getTime();

        try {
            MasterTripStatus m = new MasterTripStatus();
            Trip t = new Trip();
            t.setRiderID(rp.getPassengerEmail());
            t.setId(time+"");
            t.setNote(rp.getNote());
            t.setTripCode(rp.tripID);
            t.setToAddress(rp.to);
            t.setOpenPrice(rp.price);
            t.setFromAddress(rp.from);
            t.setTimeStart(timeStamp);
            t.setDriverID(rp.driverEmail);
            t.setDriverWaitingTime((short)rp.waitingTime);
            t.setDuration((short)rp.seatRegister);
            t.setStatus(masterTripStatus.TRIP_PENDING);
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

    @GetMapping("/listTrip")
    public ResponseEntity<?> listTrip(String passengerEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
            List<Trip> list = tripRepository.findAllByRiderIDOrderByCreatedDateDesc(passengerEmail);
            List<TripPassenger> tripPassengers = new ArrayList<>();
            for (Trip detail:list
                 ) {
                TripPassenger tripPassenger = new TripPassenger();
                tripPassenger.driverEmail = detail.getDriverID();
                tripPassenger.from = detail.getFromAddress();
                tripPassenger.to = detail.getToAddress();
                tripPassenger.note = detail.getNote();
                tripPassenger.seatRegister = detail.getDuration();
                tripPassenger.status = detail.getStatus();
                tripPassenger.timeStart = Date.from(detail.getTimeStart());
                tripPassenger.setWaitingTime(detail.getDriverWaitingTime());
                tripPassenger.price = detail.getOpenPrice();
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
    @GetMapping("/listTripHistory")
    public ResponseEntity<?> listTripHistory(String passengerEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();

        try{
            List<Trip> list = tripRepository.findAllByRiderIDOrderByCreatedDateDesc(passengerEmail);
            List<TripPassenger> listTripHistory = new ArrayList<>();
            for (Trip detail:list
            ) {
                if(detail.getStatus().equals(masterTripStatus.TRIP_CLOSE)){
                    TripPassenger tripPassenger = new TripPassenger();
                    tripPassenger.note = detail.getNote();
                    tripPassenger.from = detail.getFromAddress();
                    tripPassenger.to = detail.getToAddress();
                    tripPassenger.seatRegister = detail.getDuration();
                    tripPassenger.status = detail.getStatus();
                    tripPassenger.driverEmail = detail.getDriverID();
                    tripPassenger.timeStart = Date.from(detail.getTimeStart());
                    tripPassenger.setWaitingTime(detail.getDriverWaitingTime());
                    tripPassenger.price = detail.getOpenPrice();
                    listTripHistory.add(tripPassenger);
                }
            }

            response.object=listTripHistory;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/detail")
    public ResponseEntity<?> CreateTrip (String id){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
        Trip detail = tripRepository.findTripByIdOrderByCreatedDateDesc(id);
            TripPassenger tripPassenger = new TripPassenger();
            tripPassenger.seatRegister = detail.getDuration();
            tripPassenger.status = detail.getStatus();
            tripPassenger.driverEmail = detail.getDriverID();
            tripPassenger.from = detail.getFromAddress();
            tripPassenger.to = detail.getToAddress();
            tripPassenger.passengerEmail = detail.getRiderID();
            tripPassenger.timeStart = Date.from(detail.getTimeStart());
            tripPassenger.setWaitingTime(detail.getDriverWaitingTime());
            tripPassenger.price = detail.getOpenPrice();
        response.object=tripPassenger;
        response.status = masterStatus.SUCCESSFULL;
        return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
}
@Data
class  TripPassenger{

    String id;
    String note;
    String passengerEmail;
    String tripID;
    String driverEmail ;
    String from;
    String to;
    int seatRegister;
    Date timeStart;
    int waitingTime;
    float price;
    String status;
}

@Data
class ChangeStatus{
    String id;
    String status;
}
