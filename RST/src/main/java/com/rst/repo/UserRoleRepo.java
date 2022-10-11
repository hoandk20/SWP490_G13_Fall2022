package com.rst.repo;

import com.rst.domain.UserRole;
import com.rst.domain.UserRoleId;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepo extends JpaRepository<UserRoleId,Long> {


    List<UserRoleId> findAllByUserId(Long userid);

}
