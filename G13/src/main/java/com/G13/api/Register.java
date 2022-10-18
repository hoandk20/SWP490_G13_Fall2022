package com.G13.api;

import com.G13.domain.*;
import com.G13.master.MasterStatus;
import com.G13.repo.DriverRepository;
import com.G13.repo.RiderRepository;
import com.G13.repo.UserRepository;
import com.G13.repo.UserRoleRepository;
import com.G13.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class Register {

    UserRepository userRepository;
    UserRoleRepository userRoleRepository;

        private final DriverRepository driverRepository;
        private final UserService userService;
        private  final RiderRepository riderRepository;

    @PostMapping("/RegisterCompany")
    public  ResponseEntity<?> RegisterCompany(@RequestBody RegisterDriver rd){
        Date date = new Date();
        Instant timeStamp= Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat =0;
        short noShort = (short)0;
        try {
            Driver driver = new Driver();
            driver.setId(rd.getEmail());
            driver.setDriverCode(rd.getEmail());
            driver.setEmail(rd.getEmail());
            driver.setFirstName(rd.getFirstName());
            driver.setLastName(rd.getLastName());
            driver.setMobileNo(rd.phoneNumber);
            driver.setLanguageCode("vi");
            driver.setCountryCode(rd.getCountry());
            driver.setLanguageCode(rd.getLanguage());
            driverRepository.save(driver);
            User u = new User();
            u.setEmail(rd.email);
            u.setPassword(rd.password);
            userService.saveUser(u);

            response.setStatus(masterStatus.SUCCESSFULL);

            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("/RegisterDriver")
        public  ResponseEntity<?> RegisterDriver(@RequestBody RegisterDriver rd){
            Date date = new Date();
            Instant timeStamp= Instant.now();
            ResopnseContent response = new ResopnseContent();
            MasterStatus masterStatus = new MasterStatus();
            float nofloat =0;
            short noShort = (short)0;
            try {
                Driver driver = new Driver();
                driver.setId(rd.getEmail());
                driver.setDriverCode("DR");
                driver.setEmail(rd.getEmail());
                driver.setFirstName(rd.getFirstName());
                driver.setLastName(rd.getLastName());
                driver.setMobileNo(rd.phoneNumber);
                driver.setLanguageCode("vi");
                driver.setCountryCode(rd.getCountry());
                driver.setLanguageCode(rd.getLanguage());
                driverRepository.save(driver);
                User u = new User();
                u.setEmail(rd.email);
                u.setPassword(rd.password);
                User usersave = userService.saveUser(u);
                UserRole userRole = new UserRole();
                userRole.setUserId(new Long(usersave.getId()));
                userRole.setRoleId(new Long(1));

                response.setStatus(masterStatus.SUCCESSFULL);

                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content=exception.toString();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
        }
//    @PostMapping("/abc")
//        public String abc(String username,String password){
//            return (username+""+password);
//        }
        @PostMapping("/RegisterPassenger")
        public ResponseEntity<?> RegisterPassenger(@RequestBody RegisterPassenger rp) {
            Date date = new Date();
            Instant timeStamp= Instant.now();
            ResopnseContent response = new ResopnseContent();
            MasterStatus masterStatus = new MasterStatus();
            float nofloat =0;
            short noShort = (short)0;
            try {
                Rider rider = new Rider();
                rider.setCountryCode("vi");
                rider.setEmail(rp.email);
                rider.setFirstName(rp.firstName);
                rider.setLastName(rp.LastName);
                rider.setMobileNo(rp.PhoneNumber);
                rider.setLanguageCode(rp.Language);
                rider.setId(rp.email);
                rider.setBalance(nofloat);
                rider.setCancelRate(nofloat);
                rider.setStatus("at");
                rider.setTotalTrips(noShort);
                rider.setTotalPoint(0);
                rider.setTotalRequests(noShort);
                rider.setTotalCanelledTrips(noShort);
                rider.setCreatedBy(rp.getFirstName()+rp.getLastName());
                rider.setResentCount("0".getBytes()[0]);
                rider.setPromoStatus("0".getBytes()[0]);
                rider.setRewardedTrips(noShort);
                rider.setTotalPoint(0);
                rider.setCreatedDate(timeStamp);
                rider.setLastModifiedBy(rp.firstName+rp.getLastName());
                rider.setLastModifiedDate(timeStamp);
                rider.setRate(nofloat);
                rider.setFullName(rp.firstName+rp.getLastName());
                rider.setPromotionBalance(nofloat);
                rider.setTotalTripAdjustment(0.0);
                riderRepository.save(rider);
                User u = new User();
                u.setEmail(rp.email);
                u.setPassword(rp.password);
                User usersave = userService.saveUser(u);
                UserRole userRole = new UserRole();
                userRole.setUserId(new Long(usersave.getId()));
                userRole.setRoleId(new Long(2));

                response.setStatus(masterStatus.SUCCESSFULL);

                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content=exception.toString();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }




}

class RegisterDriver{

    String email;
    String password;

    String firstName;
    String lastName;
    String phoneNumber;
    String language;
    String country;
    String city;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class RegisterPassenger{
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getLanguage() {
        return Language;
    }

    String email;
    String password;
    String firstName;
    String LastName;
    String PhoneNumber;
    String Language;
}
