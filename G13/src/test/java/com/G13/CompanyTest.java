package com.G13;

import com.G13.domain.Company;
import com.G13.domain.Driver;
import com.G13.repo.CompanyRepository;
import com.G13.repo.DriverRepository;
import com.G13.service.CompanyService;
import com.G13.service.DriverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CompanyTest {
    @Mock
    CompanyRepository companyRepository;
    @InjectMocks
    CompanyService companyService;
    //get company by email

    @BeforeEach
    void addData(){
        Company company = new Company();
        company.setId(1);
        company.setNote("congty1@gmail.com");
        when(companyRepository.findByNote("congty1@gmail.com")).thenReturn(company);
        when(companyRepository.findCompanyById(1)).thenReturn(company);
    }

   //test get company by email
    @Test
    void testGetCompanyByEmailFound(){
        String Expectmail = "congty1@gmail.com";
        Company ActuaCompany = companyService.getCompanyByEmail(Expectmail);
        assertThat(ActuaCompany.getNote()).isEqualTo(Expectmail);
    }
    @Test
    void testGetCompanyByEmailNotFound(){
        Company Expect = null;
        Company ActuaCompany = companyService.getCompanyByEmail("congty2@gmail.com");
        assertThat(ActuaCompany).isEqualTo(Expect);
    }
    @Test
    void testGetCompanyByInvalidEmailNotFound(){
        Company Expect = null;
        Company ActuaCompany = companyService.getCompanyByEmail("");
        assertThat(ActuaCompany).isEqualTo(Expect);
    }
    //test get company by company id
    @Test
    void testGetCompanyByIdFound(){
        int companyId = 1;
        Company ActuaCompany = companyService.getCompanyByID(companyId);
        assertThat(ActuaCompany.getId()).isEqualTo(companyId);
    }
    @Test
    void testGetCompanyByIdNotFound(){
        int companyId = 99;
        Company ActuaCompany = companyService.getCompanyByID(companyId);
        assertThat(ActuaCompany).isEqualTo(null);
    }
}
