package com.G13.api;

import com.G13.domain.Promotiontrip;
import com.G13.domain.Promotiontriprider;
import com.G13.domain.Trip;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.model.TripDriver;
import com.G13.model.TripPassenger;
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
        Instant timeStamp= rp.getTimeStart().toInstant();
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
            t.setFromAddress(rp.getFrom());
            t.setToAddress(rp.getTo());
            t.setFee(rp.getPrice());
            t.setTimeStart(timeStamp);
            t.setDriverID(rp.getDriverEmail());
            t.setDuration(rp.getWaitingTime());
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
                    tripDriver.setId(detail.getId());
                    tripDriver.setDriverEmail(detail.getDriverID());
                    tripDriver.setFrom(detail.getFromAddress());
                    tripDriver.setTo(detail.getToAddress());
                    tripDriver.setSeat(detail.getCapacity());
                    tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                    tripDriver.setStatus(detail.getStatus());
                    tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                    tripDriver.setWaitingTime(detail.getDuration());
                    tripDriver.setPrice(detail.getFee());
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
                tripDriver.setDriverEmail(detail.getDriverID());
                tripDriver.setFrom(detail.getFromAddress());
                tripDriver.setTo(detail.getToAddress());
                tripDriver.setSeat(detail.getCapacity());
                tripDriver.setId(detail.getId());
                tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                tripDriver.setStatus(detail.getStatus());
                tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                tripDriver.setWaitingTime(detail.getDuration());
                tripDriver.setPrice(detail.getFee());
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
                    tripDriver.setId(detail.getId());
                    tripDriver.setDriverEmail(detail.getDriverID());
                    tripDriver.setFrom(detail.getFromAddress());
                    tripDriver.setTo(detail.getToAddress());
                    tripDriver.setSeat(detail.getCapacity());
                    tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                    tripDriver.setStatus(detail.getStatus());
                    tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                    tripDriver.setWaitingTime(detail.getDuration());
                    tripDriver.setPrice(detail.getFee());
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

            tripDriver.setStatus(detail.getStatus());
            tripDriver.setDriverEmail(detail.getDriverID());
            tripDriver.setFrom(detail.getFromAddress());
            tripDriver.setTo(detail.getToAddress());
            tripDriver.setTripID(detail.getId());
            tripDriver.setId(detail.getId());

            tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
            tripDriver.setWaitingTime(detail.getDuration());
            tripDriver.setPrice(detail.getFee());
            List<Trip> listPassengers = tripRepository.findAllByTripCodeOrderByCreatedDateDesc(id);
            List<TripPassenger> tripPassengers = new ArrayList<>();
            for (Trip t:listPassengers) {
                TripPassenger tripPassenger = new TripPassenger();
                tripPassenger.setSeatRegister(t.getDuration());
                tripPassenger.setId(t.getId());
                tripPassenger.setTripID(t.getTripCode());
                tripPassenger.setPassengerEmail(t.getRiderID());
                tripPassenger.setStatus( t.getStatus());
                tripPassenger.setDriverEmail(t.getDriverID());
                tripPassenger.setFrom(t.getFromAddress());
                tripPassenger.setTo(t.getToAddress());
                tripPassenger.setNote(t.getNote());
                tripPassenger.setTimeStart(Date.from(t.getTimeStart()));
                tripPassenger.setWaitingTime(t.getDriverWaitingTime());
                tripPassenger.setPrice(t.getOpenPrice());
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

