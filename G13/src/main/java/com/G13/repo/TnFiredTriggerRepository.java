package com.G13.repo;

import com.G13.domain.TnFiredTrigger;
import com.G13.domain.TnFiredTriggerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnFiredTriggerRepository extends JpaRepository<TnFiredTrigger, TnFiredTriggerId> {
}