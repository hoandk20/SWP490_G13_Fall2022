package com.G13.repo;

import com.G13.domain.Verifyaccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerifyaccountRepository extends JpaRepository<Verifyaccount, Integer> {
    Verifyaccount findVerifyaccountByUseridOrderByExpiredateDesc(int userid);
}