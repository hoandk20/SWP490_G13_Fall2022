package com.G13.repo;

import com.G13.domain.Userconnection;
import com.G13.domain.UserconnectionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserconnectionRepository extends JpaRepository<Userconnection, UserconnectionId> {
}