package com.G13.service;

import com.G13.model.PassengerInfo;
import com.G13.model.RegisterDriverCompany;
import com.G13.model.TripDriver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AdminService {
    public List<RegisterDriverCompany> filterListDriverCompany(List<RegisterDriverCompany> list, Date regFrom,
                                                               Date regTo, String phone, String driverName, String email
            , String Status, String city, String plate) {


        List<RegisterDriverCompany> listResult = new ArrayList<>();
        for (RegisterDriverCompany r : list
        ) {
            if (email != null && !email.equals("")) {
                if (!r.getEmail().toLowerCase().contains(email.toLowerCase())) {
                    continue;
                }
            }
            if (phone != null && !phone.equals("")) {
                if (!r.getPhoneNumber().contains(phone)) {
                    continue;
                }
            }
            if (driverName != null && !driverName.equals("")) {
                if (!(driverName.toLowerCase()).contains(r.getFirstName().toLowerCase())
                        && !driverName.contains((r.getLastName()))) {
                    continue;
                }
            }
            if (Status != null && !Status.equals("")) {
                if (!r.getStatus().contains(Status)) {
                    continue;
                }
            }
            if (city != null && !city.equals("")) {
                if (!r.getAddress().contains(city)) {
                    continue;
                }
            }
            if ((plate != null && !plate.equals(""))) {
                if (!r.getVehicleInfo().getPlate().contains(plate) || r.getVehicleInfo() == null) {
                    continue;
                }
            }
            if (regFrom != null) {
                Instant instantFrom = regFrom.toInstant();
                if (instantFrom.compareTo(r.getCreateDate()) > 0) {
                    continue;
                }
            }
            if (regTo != null) {
                Instant instantTo = regTo.toInstant();
                if (instantTo.compareTo(r.getCreateDate()) < 0) {
                    continue;
                }
            }
            listResult.add(r);
        }

        return listResult;
    }
    public List<PassengerInfo> filterlistRider(List<PassengerInfo> list, String phone, String name, String email) {
        List<PassengerInfo> listResult = new ArrayList<>();
        for (PassengerInfo passengerInfo : list
        ) {
            if(phone!=null&&!phone.equals("")){
                if(!passengerInfo.getPhone().contains(phone)){continue;}
            }
            if(name!=null&&!name.equals("")){
                if(!name.contains(passengerInfo.getLassName())&&!name.contains(passengerInfo.getFirstName())){continue;}
            }
            if(email!=null&&!email.equals("")){
                if(!passengerInfo.getEmail().contains(email)){continue;}
            }
            listResult.add(passengerInfo);
        }

        return listResult;
    }
    public List<TripDriver> filterlistTrips(List<TripDriver> list, Date regFrom, Date regTo, String phoneDriver,
                                      String phonePassenger, String Status) {
        List<TripDriver> listResult = new ArrayList<>();

        for (TripDriver t:list) {
            if(phoneDriver!=null&&!phoneDriver.equals("")){
                if(!t.getPhoneDriver().contains(phoneDriver)){continue;}
            }
            if(phonePassenger!=null&&!phonePassenger.equals("")){
                if(!t.getPhonePassenger().contains(phonePassenger)){continue;}
            }
            if(Status!=null&&!Status.equals("")){
                if(!t.getStatus().contains(Status)){continue;}
            }
            if (regFrom != null) {
                Instant instantFrom = regFrom.toInstant();
                if (instantFrom.compareTo(t.getInstantTimeStart()) > 0) {
                    continue;
                }
            }
            if (regTo != null) {
                Instant instantTo = regTo.toInstant();
                if (instantTo.compareTo(t.getInstantTimeStart()) < 0) {
                    continue;
                }
            }

            listResult.add(t);
        }

        return listResult;
    }
}
