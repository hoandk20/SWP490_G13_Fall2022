package com.G13.service;

import com.G13.domain.Driver;
import com.G13.domain.Promotiontrip;
import com.G13.master.MasterTripStatus;
import com.G13.repo.PromotiontripRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class PromotionTripService {
    private final PromotiontripRepository promotiontripRepository;

    public List<Promotiontrip> getTop10TripOpen() {
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        return promotiontripRepository.findTop10ByStatusOrderByCreatedDateDesc(masterTripStatus.TRIP_OPEN);
    }

    public List<Promotiontrip> getAllTrip() {
        return promotiontripRepository.findAll();
    }

    public Promotiontrip getPromotionTripById(String id) {
        return promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc(id);
    }

    public Promotiontrip SavePromotionTrip(Promotiontrip promotiontrip) {
        return promotiontripRepository.saveAndFlush(promotiontrip);
    }

    public List<Promotiontrip> getAllTripByDriverId(String driverID) {
        return promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc(driverID);
    }

    public List<Promotiontrip> getAllTripByDriverId(String driverID, int month, int year) {
        List<Promotiontrip> promotiontripList =
                promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc(driverID);
        List<Promotiontrip> listResult = new ArrayList<>();
        if(promotiontripList.size()==0){return listResult;}

        int lastDay = YearMonth.of(year, month).lengthOfMonth();
        Date from = new Date(year-1900, month-1, 1);
        Date to = new Date(year-1900, month-1, lastDay);


        for (Promotiontrip p : promotiontripList
        ) {
            Date dateStart = Date.from(p.getTimeStart());
            if (from.compareTo(dateStart) > 0) {
                continue;
            }
            if (to.compareTo(dateStart) < 0) {
                continue;
            }
            listResult.add(p);
        }
        return listResult;
    }

    public List<Promotiontrip> getAllByStatus(String Status) {
        return promotiontripRepository.findAllByStatus(Status);
    }
}
