package com.G13.api;

import com.G13.domain.Promotiontrip;
import com.G13.domain.Promotiontriprider;
import com.G13.domain.Trip;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.repo.PromotiontripRepository;
import com.G13.repo.PromotiontripriderRepository;
import com.G13.repo.TripRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/tripdriver")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor

public class DriverTrip {

    private final PromotiontripRepository promotiontripRepository;
    private final TripRepository tripRepository;
    @PostMapping("/create")
    public ResponseEntity<?> CreateTrip (@RequestBody TripDriver rp) {
        Date date = new Date();
        Instant timeStamp= rp.timeStart.toInstant();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        float nofloat =0;
        short noShort = (short)0;
        long timeMilli = date.getTime();

        try {
            MasterTripStatus m = new MasterTripStatus();
            Promotiontrip t = new Promotiontrip();
            t.setId(timeMilli+"");
            t.setFromAddress(rp.from);
            t.setToAddress(rp.to);
            t.setFee(rp.price);
            t.setTimeStart(timeStamp);
            t.setDriverID(rp.driverEmail);
            t.setDuration(rp.WaitingTime);
            t.setCapacity(rp.getSeat());
            t.setStatus(masterTripStatus.TRIP_OPEN);
            response.content= promotiontripRepository.save(t).toString();
            response.object=t;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/listOpen")
    public ResponseEntity<?> listTripOpen(){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();

        try{
            List<Promotiontrip> list = promotiontripRepository.findAll();
            List<TripDriver> driverTripHistory = new ArrayList<>();
            for (Promotiontrip detail:list
            ) {
                if(detail.getStatus().equals(masterTripStatus.TRIP_OPEN)){
                    TripDriver tripDriver = new TripDriver();
                    tripDriver.id = detail.getId();
                    tripDriver.driverEmail = detail.getDriverID();
                    tripDriver.from = detail.getFromAddress();
                    tripDriver.to = detail.getToAddress();
                    tripDriver.setSeat(detail.getCapacity());
                    tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                    tripDriver.status = detail.getStatus();
                    tripDriver.timeStart = Date.from(detail.getTimeStart());
                    tripDriver.setWaitingTime(detail.getDuration());
                    tripDriver.price = detail.getFee();
                    driverTripHistory.add(tripDriver);
                }
            }

            response.object=driverTripHistory;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }


    @GetMapping("/listTrip")
    public ResponseEntity<?> listTrip(String driverEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
            List<Promotiontrip> list = promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc(driverEmail);
            List<TripDriver> driverTrips = new ArrayList<>();
            for (Promotiontrip detail:list
            ) {
                TripDriver tripDriver = new TripDriver();
                tripDriver.driverEmail = detail.getDriverID();
                tripDriver.from = detail.getFromAddress();
                tripDriver.to = detail.getToAddress();
                tripDriver.setSeat(detail.getCapacity());
                tripDriver.id = detail.getId();
                tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                tripDriver.status = detail.getStatus();
                tripDriver.timeStart = Date.from(detail.getTimeStart());
                tripDriver.setWaitingTime(detail.getDuration());
                tripDriver.price = detail.getFee();
                driverTrips.add(tripDriver);
            }

            response.object=driverTrips;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @GetMapping("/listTripHistory")
    public ResponseEntity<?> listTripHistory(String driverEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();

        try{
            List<Promotiontrip> list = promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc(driverEmail);
            List<TripDriver> driverTripHistory = new ArrayList<>();
            for (Promotiontrip detail:list
            ) {
                if(detail.getStatus().equals(masterTripStatus.TRIP_CLOSE)){
                    TripDriver tripDriver = new TripDriver();
                    tripDriver.id = detail.getId();
                    tripDriver.driverEmail = detail.getDriverID();
                    tripDriver.from = detail.getFromAddress();
                    tripDriver.to = detail.getToAddress();
                    tripDriver.setSeat(detail.getCapacity());
                    tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                    tripDriver.status = detail.getStatus();
                    tripDriver.timeStart = Date.from(detail.getTimeStart());
                    tripDriver.setWaitingTime(detail.getDuration());
                    tripDriver.price = detail.getFee();
                    driverTripHistory.add(tripDriver);
                }
            }

            response.object=driverTripHistory;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/detail")
    public ResponseEntity<?> tripDetail (String id){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
            Promotiontrip detail = promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc(id);
            TripDriver tripDriver = new TripDriver();
            tripDriver.setSeat(detail.getCapacity());

            tripDriver.status = detail.getStatus();
            tripDriver.driverEmail = detail.getDriverID();
            tripDriver.from = detail.getFromAddress();
            tripDriver.to = detail.getToAddress();
            tripDriver.setTripID(detail.getId());
            tripDriver.id = detail.getId();

            tripDriver.timeStart = Date.from(detail.getTimeStart());
            tripDriver.setWaitingTime(detail.getDuration());
            tripDriver.price = detail.getFee();
            List<Trip> listPassengers = tripRepository.findAllByTripCodeOrderByCreatedDateDesc(id);
            List<TripPassenger> tripPassengers = new ArrayList<>();
            for (Trip t:listPassengers) {
                TripPassenger tripPassenger = new TripPassenger();
                tripPassenger.seatRegister = t.getDuration();
                tripPassenger.id = t.getId();
                tripPassenger.tripID = t.getTripCode();
                tripPassenger.passengerEmail = t.getRiderID();
                tripPassenger.status = t.getStatus();
                tripPassenger.driverEmail = t.getDriverID();
                tripPassenger.from = t.getFromAddress();
                tripPassenger.to = t.getToAddress();
                tripPassenger.note = t.getNote();
                tripPassenger.timeStart = Date.from(t.getTimeStart());
                tripPassenger.setWaitingTime(t.getDriverWaitingTime());
                tripPassenger.price = t.getOpenPrice();
                tripPassengers.add(tripPassenger);
            }
            tripDriver.setListPassenger(tripPassengers);
            tripDriver.setSeatRegistered(detail.getCapacity()-listPassengers.size());

            response.object=tripDriver;
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
class  TripDriver{
    String id;

    String TripID;
    String driverEmail ;
    String from;
    String to;
    int seatRegistered;
    int seat;
    Date timeStart;
    int WaitingTime;
    double price;
    String status;
    List<TripPassenger> listPassenger;
}
