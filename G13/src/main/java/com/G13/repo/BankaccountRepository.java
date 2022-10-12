package com.G13.repo;

import com.G13.domain.Bankaccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankaccountRepository extends JpaRepository<Bankaccount, String> {
}