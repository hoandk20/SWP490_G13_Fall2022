package com.G13.repository;

import com.G13.domain.PersistentLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersistentLoginRepository extends JpaRepository<PersistentLogin, String> {
}