package com.G13.repo;

import com.G13.domain.Promotiontrip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromotiontripRepository extends JpaRepository<Promotiontrip, String> {
    List<Promotiontrip> findAllByDriverIDOrderByCreatedDateDesc(String DriverId);
    Promotiontrip findPromotiontripByIdOrderByCreatedDateDesc(String id);

    List<Promotiontrip> findAllByStatus(String status);
}