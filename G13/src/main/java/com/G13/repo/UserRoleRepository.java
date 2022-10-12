package com.G13.repo;

import com.G13.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findAllByUserId(Long userid);
    @Transactional
    @Modifying

    @Query(value = "SELECT TOP 1 id FROM UserRole ORDER BY id desc ",nativeQuery = true)
    int findTop();
    List<UserRole> findAll();
}