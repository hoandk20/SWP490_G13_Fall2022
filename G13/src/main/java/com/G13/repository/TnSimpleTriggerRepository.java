package com.G13.repository;

import com.G13.domain.TnSimpleTrigger;
import com.G13.domain.TnSimpleTriggerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnSimpleTriggerRepository extends JpaRepository<TnSimpleTrigger, TnSimpleTriggerId> {
}