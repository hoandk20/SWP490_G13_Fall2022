package com.G13.service;

import com.G13.domain.Promotiontrip;
import com.G13.master.MasterTripStatus;
import com.G13.repo.PromotiontripRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class PromotionTripService {
    private final PromotiontripRepository promotiontripRepository;
    private final DriverService driverService;

    public List<Promotiontrip> getTop10TripOpen() {
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        return  promotiontripRepository.findTop10ByStatusOrderByCreatedDateDesc(masterTripStatus.TRIP_OPEN);
    }
}
