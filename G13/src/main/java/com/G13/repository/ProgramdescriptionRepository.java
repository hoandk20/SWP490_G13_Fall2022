package com.G13.repository;

import com.G13.domain.Programdescription;
import com.G13.domain.ProgramdescriptionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramdescriptionRepository extends JpaRepository<Programdescription, ProgramdescriptionId> {
}