package com.G13.repo;

import com.G13.domain.Ridercity;
import com.G13.domain.RidercityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RidercityRepository extends JpaRepository<Ridercity, RidercityId> {
}