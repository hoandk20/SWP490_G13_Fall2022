package com.G13.repository;

import com.G13.domain.Countrybankfee;
import com.G13.domain.CountrybankfeeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrybankfeeRepository extends JpaRepository<Countrybankfee, CountrybankfeeId> {
}