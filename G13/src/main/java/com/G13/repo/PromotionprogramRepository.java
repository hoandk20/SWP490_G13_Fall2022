package com.G13.repo;

import com.G13.domain.Promotionprogram;
import com.G13.domain.PromotionprogramId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionprogramRepository extends JpaRepository<Promotionprogram, PromotionprogramId> {
}