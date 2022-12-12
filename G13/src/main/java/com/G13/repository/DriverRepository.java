package com.G13.repository;

import com.G13.domain.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, String> {
    Driver findByEmailOrderByCreatedDateDesc (String email);
    List<Driver> findDriversByCompanyID(int CompanyID);
    List<Driver> findDriversByCompanyIDAndCurrentVehicle(int CompanyID,int CurrVehicle);
    Driver findByEmail(String email);

    Driver findDriverById(String DriverID);

    Driver findDriverByCurrentVehicle(int vehicleId);

    List<Driver> findDriverByMobileNo(String mobile);


}