package com.G13.repository;

import com.G13.domain.TnSchedulerState;
import com.G13.domain.TnSchedulerStateId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnSchedulerStateRepository extends JpaRepository<TnSchedulerState, TnSchedulerStateId> {
}