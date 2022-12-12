package com.G13.repository;

import com.G13.domain.Weeknumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeknumberRepository extends JpaRepository<Weeknumber, Long> {
}