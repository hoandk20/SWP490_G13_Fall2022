package com.G13.repo;

import com.G13.domain.Citylocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitylocationRepository extends JpaRepository<Citylocation, Integer> {
}