package com.G13.repo;

import com.G13.domain.Cartype;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartypeRepository extends JpaRepository<Cartype, Integer> {
}