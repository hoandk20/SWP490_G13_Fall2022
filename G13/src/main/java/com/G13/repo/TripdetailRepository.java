package com.G13.repo;

import com.G13.domain.Tripdetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripdetailRepository extends JpaRepository<Tripdetail, String> {
}