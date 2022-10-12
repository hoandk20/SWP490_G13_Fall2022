package com.G13.repo;

import com.G13.domain.Promotioncode;
import com.G13.domain.PromotioncodeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotioncodeRepository extends JpaRepository<Promotioncode, PromotioncodeId> {
}