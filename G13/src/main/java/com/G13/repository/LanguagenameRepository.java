package com.G13.repository;

import com.G13.domain.Languagename;
import com.G13.domain.LanguagenameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagenameRepository extends JpaRepository<Languagename, LanguagenameId> {
}