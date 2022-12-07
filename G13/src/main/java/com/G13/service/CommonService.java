package com.G13.service;

import com.G13.domain.Company;
import com.G13.domain.Driver;
import com.G13.domain.Rider;
import com.G13.repo.CompanyRepository;
import com.G13.repo.DriverRepository;
import com.G13.repo.RiderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CommonService {

    private final RiderRepository riderRepository;
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    public boolean IsPhoneExisted(String phone){
        try{
            List<Rider> rider = riderRepository.findByMobileNo(phone);
            if(rider.size()>0){return true;}
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            List<Driver> driver = driverRepository.findDriverByMobileNo(phone);
            if(driver.size()>0){return true;}
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            List<Company> company = companyRepository.findCompanyByPhoneNo(phone);
            if(company.size()>0){return true;}
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return false;
    }

    public  int parseIntWithDefault(String str, int defaultInt) {
        try{
            return str.matches("-?\\d+") ? Integer.parseInt(str) : defaultInt;
        }catch (Exception e){
            return 0;
        }

    }
}
