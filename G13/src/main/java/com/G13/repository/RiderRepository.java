package com.G13.repository;

import com.G13.domain.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface RiderRepository extends JpaRepository<Rider, String> {
    Rider findByEmail(String email);
    List<Rider> findByMobileNo(String phone);
}