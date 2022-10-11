package com.rst.repo;

import com.rst.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
    Role findAllById(Long id);

    Role getById(Long id);
}
