package com.G13.service;

import com.G13.modelDto.TripPassenger;
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
public class PassengerTripService {
   public  List<TripPassenger> filterTripPassenger(List<TripPassenger> tripPassengerList, filterTripPassenger filter){
        List<TripPassenger> listResult = new ArrayList<>();
        for (TripPassenger t:tripPassengerList
        ) {
            if(filter.driverEmail!=null&&!filter.driverEmail.equals("")){
                if(!t.getDriverEmail().toLowerCase().contains(filter.driverEmail.toLowerCase())){
                    continue;
                }
            }
            if(filter.status!=null&&!filter.status.equals("")){
                if(!filter.status.equals(t.getTripStatus())){
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
            listResult.add(t);
        }

        return  listResult;
    }
}
