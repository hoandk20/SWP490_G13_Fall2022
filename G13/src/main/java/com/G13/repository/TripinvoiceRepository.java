package com.G13.repository;

import com.G13.domain.Tripinvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripinvoiceRepository extends JpaRepository<Tripinvoice, String> {
}