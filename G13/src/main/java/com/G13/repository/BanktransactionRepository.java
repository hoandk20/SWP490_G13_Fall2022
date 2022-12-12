package com.G13.repository;

import com.G13.domain.Banktransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanktransactionRepository extends JpaRepository<Banktransaction, String> {
}