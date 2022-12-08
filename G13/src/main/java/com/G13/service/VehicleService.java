package com.G13.service;

import com.G13.domain.Vehicle;
import com.G13.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
    public Vehicle SaveVehicle(Vehicle vehicle){
        if(vehicle.getPlate()==null||vehicle.getPlate().equals("")){
            return null;
        }
        return vehicleRepository.saveAndFlush(vehicle);
    }
    public List<Vehicle> getVehicleByCompanyId(int id){
        return vehicleRepository.findByCompanyIDOrderByCreatedDateDesc(id);
    }

    public List<Vehicle> getVehicleByCompanyIdAndStatus(int id,String status){
        return vehicleRepository.findByCompanyIDAndStatus(id,status);
    }
    public boolean DeleteVehicle(Vehicle vehicle){
        if(vehicle.getId()==null||vehicle.getId()==0){
            return false;
        }
         vehicleRepository.delete(vehicle);return true;
    }
}
