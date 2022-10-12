package com.G13.repo;

import com.G13.domain.Servicerating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceratingRepository extends JpaRepository<Servicerating, String> {
}