package com.G13.repository;

import com.G13.domain.Ridercity;
import com.G13.domain.RidercityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RidercityRepository extends JpaRepository<Ridercity, RidercityId> {
}