package com.G13.repo;

import com.G13.domain.Chatobject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatobjectRepository extends JpaRepository<Chatobject, String> {
}