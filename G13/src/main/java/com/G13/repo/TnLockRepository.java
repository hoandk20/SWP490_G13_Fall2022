package com.G13.repo;

import com.G13.domain.TnLock;
import com.G13.domain.TnLockId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnLockRepository extends JpaRepository<TnLock, TnLockId> {
}