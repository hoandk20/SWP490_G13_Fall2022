package com.G13.service;

import com.G13.domain.Trip;
import com.G13.modelDto.TripDriver;
import com.G13.modelDto.filterTripPassenger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TripDriverService {
    private final TripService tripService;
    public List<TripDriver> filterTripDriver(List<TripDriver> tripDriver, filterTripPassenger filter){
        List<TripDriver> listResult = new ArrayList<>();
        for (TripDriver t:tripDriver
        ) {
            if(filter.status!=null&&!filter.status.equals("")){
                if(!filter.status.equals(t.getStatus())){
                    continue;
                }
            }
            if(filter.dateFrom!=null){
                if(filter.dateFrom.compareTo(t.getTimeStart())>0){
                    continue;
                }
            }
            if(filter.dateTo!=null){
                if(filter.dateTo.compareTo(t.getTimeStart())<0){
                    continue;
                }
            }
            if(filter.passengerEmail!=null&&!filter.passengerEmail.equals("")){
                List<Trip> listRegister = tripService.getAllByTripCode(t.getTripID());
                boolean isHasPassenger = false;
                for (Trip trip:listRegister) {
                    if(trip.getRiderID().toLowerCase().contains(filter.passengerEmail.toLowerCase())){
                        isHasPassenger = true;
                    }
                }
                if(isHasPassenger==false){
                    continue;
                }
            }
            listResult.add(t);
        }

        return  listResult;
    }
}
