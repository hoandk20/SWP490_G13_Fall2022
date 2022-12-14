package com.G13.repository;

import com.G13.domain.TnTrigger;
import com.G13.domain.TnTriggerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnTriggerRepository extends JpaRepository<TnTrigger, TnTriggerId> {
}