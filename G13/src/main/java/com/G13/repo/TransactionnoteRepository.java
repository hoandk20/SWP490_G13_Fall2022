package com.G13.repo;

import com.G13.domain.Transactionnote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionnoteRepository extends JpaRepository<Transactionnote, Integer> {
}