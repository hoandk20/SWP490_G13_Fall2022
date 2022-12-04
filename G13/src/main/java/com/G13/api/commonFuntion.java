package com.G13.api;

import com.G13.domain.Company;
import com.G13.domain.Driver;
import com.G13.domain.Rider;
import com.G13.repo.CompanyRepository;
import com.G13.repo.DriverRepository;
import com.G13.repo.RiderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor
public class commonFuntion {

    public boolean IsPhoneExisted(String phone,RiderRepository riderRepository,DriverRepository driverRepository, CompanyRepository companyRepository){
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
}
