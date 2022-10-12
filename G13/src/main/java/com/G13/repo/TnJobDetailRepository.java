package com.G13.repo;

import com.G13.domain.TnJobDetail;
import com.G13.domain.TnJobDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnJobDetailRepository extends JpaRepository<TnJobDetail, TnJobDetailId> {
}