package com.G13.repo;

import com.G13.domain.Riderstatussummary;
import com.G13.domain.RiderstatussummaryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderstatussummaryRepository extends JpaRepository<Riderstatussummary, RiderstatussummaryId> {
}