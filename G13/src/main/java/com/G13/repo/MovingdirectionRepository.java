package com.G13.repo;

import com.G13.domain.Movingdirection;
import com.G13.domain.MovingdirectionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovingdirectionRepository extends JpaRepository<Movingdirection, MovingdirectionId> {
}