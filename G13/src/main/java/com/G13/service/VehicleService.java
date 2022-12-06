package com.G13.service;

import com.G13.domain.Vehicle;
import com.G13.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    public Vehicle getVehicleByID(int id){
        return vehicleRepository.findVehicleById(id);
    }
    public Vehicle getFistVehicleByCompanyId(int id){
        return vehicleRepository.findFirstByCompanyIDOrderByCreatedDateDesc(id);
    }
}
