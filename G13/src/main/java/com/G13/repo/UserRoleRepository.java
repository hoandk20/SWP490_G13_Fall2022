package com.G13.repo;

import com.G13.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{
        List<UserRole> findAllByUserId(Long userid);
        List<UserRole> findAll();
}