package com.G13.repo;

import com.G13.domain.Driverstatussummary;
import com.G13.domain.DriverstatussummaryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverstatussummaryRepository extends JpaRepository<Driverstatussummary, DriverstatussummaryId> {
}