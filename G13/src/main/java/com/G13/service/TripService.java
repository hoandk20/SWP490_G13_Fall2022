package com.G13.service;

import com.G13.domain.Trip;
import com.G13.master.RegisterStatus;
import com.G13.repository.TripRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TripService {
    private final TripRepository tripRepository;
    public List<Trip> getListTripByRiderEmail(String RiderEmail){
       return  tripRepository.findAllByRiderIDOrderByCreatedDateDesc(RiderEmail);
    }
    public List<Trip> getAllByTripCode(String tripCode){
        return  tripRepository.findAllByTripCodeOrderByCreatedDateDesc(tripCode);
    }
    public Trip getTripById(String id){
        if(id==null||id.equals("")){
            return null;
        }
        return tripRepository.findTripByIdOrderByCreatedDateDesc(id);
    }
    public Trip SaveTrip(Trip trip){
        if(trip.getRiderID()==null||trip.getRiderID().equals("")){
            return null;
        }
        if(trip.getDriverID()==null||trip.getDriverID().equals("")){
            return null;
        }
        if(trip.getFromAddress()==null||trip.getFromAddress().equals("")){
            return null;
        }
        if(trip.getToAddress()==null||trip.getToAddress().equals("")){
            return null;
        }
        return tripRepository.saveAndFlush(trip);
    }

    public boolean IsRegistedTrip(String TripCode,String PassengerEmail){
        RegisterStatus registerStatus = new RegisterStatus();
        return tripRepository.findAllByTripCodeAndRiderID(TripCode,PassengerEmail).size()>0;
    }
    public boolean DeleteTrip(Trip trip){
        tripRepository.delete(trip);
        return true;
    }

}
