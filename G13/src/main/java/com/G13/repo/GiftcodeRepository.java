package com.G13.repo;

import com.G13.domain.Giftcode;
import com.G13.domain.GiftcodeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftcodeRepository extends JpaRepository<Giftcode, GiftcodeId> {
}