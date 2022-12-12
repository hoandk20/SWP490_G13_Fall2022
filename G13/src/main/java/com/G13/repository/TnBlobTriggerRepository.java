package com.G13.repository;

import com.G13.domain.TnBlobTrigger;
import com.G13.domain.TnBlobTriggerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnBlobTriggerRepository extends JpaRepository<TnBlobTrigger, TnBlobTriggerId> {
}