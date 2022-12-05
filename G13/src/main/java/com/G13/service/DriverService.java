package com.G13.service;

import com.G13.domain.Driver;
import com.G13.repo.DriverRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DriverService {
    private final DriverRepository driverRepository;

    public  Driver getDriverByID(String driverId){
        return driverRepository.findDriverById(driverId);
    }

    public Driver getDriverByEmail (String email){
      return  driverRepository.findByEmailOrderByCreatedDateDesc(email);
    }
}
