package com.G13.repository;

import com.G13.domain.TnCronTrigger;
import com.G13.domain.TnCronTriggerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnCronTriggerRepository extends JpaRepository<TnCronTrigger, TnCronTriggerId> {
}