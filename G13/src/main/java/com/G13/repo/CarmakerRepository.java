package com.G13.repo;

import com.G13.domain.Carmaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarmakerRepository extends JpaRepository<Carmaker, Integer> {
}