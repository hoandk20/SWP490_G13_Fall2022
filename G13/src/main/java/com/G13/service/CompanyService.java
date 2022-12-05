package com.G13.service;

import com.G13.domain.Company;
import com.G13.repo.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CompanyService {
    private final CompanyRepository companyRepository;
    public Company getCompanyByEmail(String email){
        return companyRepository.findByNote(email);
    }
}
