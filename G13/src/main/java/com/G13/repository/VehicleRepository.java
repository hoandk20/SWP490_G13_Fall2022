package com.G13.repository;

import com.G13.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByCompanyIDOrderByCreatedDateDesc(int CompanyID);
    List<Vehicle> findByCompanyIDAndStatus(int CompanyId, String Status);
    Vehicle findById(int Id);
    Vehicle findVehicleById(int Id);
    Vehicle findFirstByCompanyIDOrderByCreatedDateDesc(int companyId);
    List<Vehicle> findVehiclesByPlate(String plate);
}