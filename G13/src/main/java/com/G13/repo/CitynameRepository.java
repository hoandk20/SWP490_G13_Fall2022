package com.G13.repo;

import com.G13.domain.Cityname;
import com.G13.domain.CitynameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitynameRepository extends JpaRepository<Cityname, CitynameId> {
}