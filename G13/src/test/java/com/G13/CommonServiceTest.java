package com.G13;

import com.G13.domain.Company;
import com.G13.repo.CompanyRepository;
import com.G13.repo.DriverRepository;
import com.G13.repo.RiderRepository;
import com.G13.service.CommonService;
import com.G13.service.CompanyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CommonServiceTest {
    @Mock
    CompanyRepository companyRepository;
    @Mock
    RiderRepository riderRepository;
    @Mock
    DriverRepository driverRepository;

    @InjectMocks
     CommonService commonService;

    @BeforeEach
    void addData(){
        Company company = new Company();
        company.setId(1);
        List<Company> companyList = new ArrayList<>();
        companyList.add(company);
        when(companyRepository.findCompanyByPhoneNo("012345678")).thenReturn(companyList);
    }

    //test check phone existed
    @Test
    void testCheckphoneExistedFound(){
        boolean ExpectStatus = true;
        boolean ActualStatus = commonService.IsPhoneExisted("012345678");
        assertThat(ActualStatus).isEqualTo(ExpectStatus);
    }
    @Test
    void testCheckphoneExistedNotFound(){
        boolean ExpectStatus = false;
        boolean ActualStatus = commonService.IsPhoneExisted("011111111");
        assertThat(ActualStatus).isEqualTo(ExpectStatus);
    }
    //test parse int with default number

    @Test
    void checkParseIntWithDefaultNumberParseChar(){
        int ExpectNumber = 10;
        int ActualNumber = commonService.parseIntWithDefault("e",10);
        assertThat(ActualNumber).isEqualTo(ExpectNumber);
    }
    @Test
    void checkParseIntWithDefaultNumberParseNumber(){
        int ExpectNumber = 20;
        int ActualNumber = commonService.parseIntWithDefault("20",10);
        assertThat(ActualNumber).isEqualTo(ExpectNumber);
    }
    @Test
    void checkParseIntWithDefaultNumberParseZero(){
        int ExpectNumber = 0;
        int ActualNumber = commonService.parseIntWithDefault("0",10);
        assertThat(ActualNumber).isEqualTo(ExpectNumber);
    }
    @Test
    void checkParseIntWithDefaultNumberParseBlank(){
        int ExpectNumber = 20;
        int ActualNumber = commonService.parseIntWithDefault("",20);
        assertThat(ActualNumber).isEqualTo(ExpectNumber);
    }
}
