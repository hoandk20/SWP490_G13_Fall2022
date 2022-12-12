package com.G13.repository;

import com.G13.domain.Referencedatum;
import com.G13.domain.ReferencedatumId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferencedatumRepository extends JpaRepository<Referencedatum, ReferencedatumId> {
}