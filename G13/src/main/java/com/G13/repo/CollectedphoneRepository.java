package com.G13.repo;

import com.G13.domain.Collectedphone;
import com.G13.domain.CollectedphoneId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectedphoneRepository extends JpaRepository<Collectedphone, CollectedphoneId> {
}