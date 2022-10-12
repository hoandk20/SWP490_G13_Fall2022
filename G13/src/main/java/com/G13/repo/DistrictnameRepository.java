package com.G13.repo;

import com.G13.domain.Districtname;
import com.G13.domain.DistrictnameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictnameRepository extends JpaRepository<Districtname, DistrictnameId> {
}