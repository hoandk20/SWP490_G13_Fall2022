package com.G13.service;

import com.G13.domain.Driver;
import com.G13.repo.DriverRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
    public List<Driver> getDriverByCompanyId (int companyId){
        return  driverRepository.findDriversByCompanyID(companyId);
    }
    public List<Driver> getListDriverNoVehicleByCompanyId (int companyId){
        return  driverRepository.findDriversByCompanyIDAndCurrentVehicle(companyId,0);
    }
    public boolean SaveDriver(Driver driver){
        if(driver.getEmail()==null ||driver.getEmail().equals("")){
            return false;
        }
        if(driver.getFirstName()==null ||driver.getFirstName().equals("")){
            return false;
        }
        if(driver.getLastName()==null ||driver.getLastName().equals("")){
            return false;
        }
        if(driver.getMobileNo()==null ||driver.getMobileNo().equals("")){
            return false;
        }
         driverRepository.save(driver);
         return true;
    }
    public  Driver getDriverByVehicleId(int VehicleId){
        return driverRepository.findDriverByCurrentVehicle(VehicleId);
    }
    public boolean DeleteDriver(Driver driver){
        if(driver.getId()==null){
            return false;
        }
        driverRepository.delete(driver);
        return true;
    }

    public List<Driver> getAllDriver(){
        return driverRepository.findAll();
    }
}
