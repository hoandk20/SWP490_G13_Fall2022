package com.G13.repo;

import com.G13.domain.Driveronlinetime;
import com.G13.domain.DriveronlinetimeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveronlinetimeRepository extends JpaRepository<Driveronlinetime, DriveronlinetimeId> {
}