package com.G13.repository;

import com.G13.domain.Citypromotionprogram;
import com.G13.domain.CitypromotionprogramId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitypromotionprogramRepository extends JpaRepository<Citypromotionprogram, CitypromotionprogramId> {
}