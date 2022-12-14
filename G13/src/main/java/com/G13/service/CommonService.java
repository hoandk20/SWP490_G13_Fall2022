package com.G13.service;

import com.G13.domain.Company;
import com.G13.domain.Driver;
import com.G13.domain.Rider;
import com.G13.repository.CompanyRepository;
import com.G13.repository.DriverRepository;
import com.G13.repository.RiderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

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
    private  final String[] charCategories = new String[] {
            "abcdefghijklmnopqrstuvwxyz",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "0123456789"
    };
    public  String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < length; i++) {
            String charCategory = charCategories[random.nextInt(charCategories.length)];
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        return new String(password);
    }
}
