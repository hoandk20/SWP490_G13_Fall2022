package com.G13.service;

import com.G13.domain.Driver;
import com.G13.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.YearMonth;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j

public class DriverService {
    private final DriverRepository driverRepository;

    public Driver getDriverByID(String driverId) {
        return driverRepository.findDriverById(driverId);
    }

    public Driver getDriverByEmail(String email) {
        return driverRepository.findByEmailOrderByCreatedDateDesc(email);
    }

    public List<Driver> getDriverByCompanyId(int companyId) {
        return driverRepository.findDriversByCompanyID(companyId);
    }

    public List<Driver> getDriverByCompanyId(int companyId, int month, int year) {
        List<Driver> list = driverRepository.findDriversByCompanyID(companyId);
        int lastDay = YearMonth.of(year,month).lengthOfMonth();
        Date from = new Date(year-1900, month-1, 1);
        Date to = new Date(year-1900, month-1, lastDay);
        List<Driver> listResult = new ArrayList<>();
        for (Driver d : list
        ) {

            if (from.toInstant().compareTo(d.getCreatedDate()) > 0) {
                continue;
            }
            if (to.toInstant().compareTo(d.getCreatedDate()) < 0) {
                continue;
            }

            listResult.add(d);
        }
        return listResult;
    }

    public List<Driver> getListDriverNoVehicleByCompanyId(int companyId) {
        return driverRepository.findDriversByCompanyIDAndCurrentVehicle(companyId, 0);
    }

    public boolean SaveDriver(Driver driver) {
        if (driver.getEmail() == null || driver.getEmail().equals("")) {
            return false;
        }
        if (driver.getFirstName() == null || driver.getFirstName().equals("")) {
            return false;
        }
        if (driver.getLastName() == null || driver.getLastName().equals("")) {
            return false;
        }
        if (driver.getMobileNo() == null || driver.getMobileNo().equals("")) {
            return false;
        }
        driverRepository.save(driver);
        return true;
    }

    public Driver getDriverByVehicleId(int VehicleId) {
        return driverRepository.findDriverByCurrentVehicle(VehicleId);
    }

    public boolean DeleteDriver(Driver driver) {
        if (driver.getId() == null) {
            return false;
        }
        driverRepository.delete(driver);
        return true;
    }

    public List<Driver> getAllDriver() {
        return driverRepository.findAll();
    }
}
