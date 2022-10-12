package com.G13.repo;

import com.G13.domain.Countryname;
import com.G13.domain.CountrynameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrynameRepository extends JpaRepository<Countryname, CountrynameId> {
}