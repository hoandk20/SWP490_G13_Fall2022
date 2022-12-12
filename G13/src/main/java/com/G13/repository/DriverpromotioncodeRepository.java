package com.G13.repository;

import com.G13.domain.Driverpromotioncode;
import com.G13.domain.DriverpromotioncodeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverpromotioncodeRepository extends JpaRepository<Driverpromotioncode, DriverpromotioncodeId> {
}