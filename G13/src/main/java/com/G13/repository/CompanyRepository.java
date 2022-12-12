package com.G13.repository;

import com.G13.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Company findByNote(String note);
    Company findCompanyById(int Id);

    List<Company> findCompanyByPhoneNo(String phone);
}