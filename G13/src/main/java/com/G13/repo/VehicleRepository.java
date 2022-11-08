package com.G13.repo;

import com.G13.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByCompanyIDOrderByCreatedDateDesc(int CompanyID);
    Vehicle findById(int Id);
}