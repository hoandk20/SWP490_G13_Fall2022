package com.G13.service;

import com.G13.domain.Company;
import com.G13.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CompanyService {
    private final CompanyRepository companyRepository;
    public Company getCompanyByEmail(String email){
        return companyRepository.findByNote(email);
    }
    public boolean SaveCompany(Company company){
        if(company.getNote()==null||company.getNote().equals("")){
            return false;
        }
        if(company.getName()==null||company.getName().equals("")){
            return false;
        }
        if(company.getPhoneNo()==null||company.getPhoneNo().equals("")){
            return false;
        }
        companyRepository.save(company);
        return true;
    }

    public Company getCompanyByID(int id){
        return companyRepository.findCompanyById(id);
    }
    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }
}
