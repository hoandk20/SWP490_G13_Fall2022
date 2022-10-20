package com.G13.api;

import com.G13.File.FileManage;
import com.G13.domain.*;
import com.G13.master.MasterStatus;
import com.G13.repo.*;
import com.G13.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class Register {

        private final UserRepository userRepository;
        private final UserRoleRepository userRoleRepository;

        private final DriverRepository driverRepository;
        private final UserService userService;
        private  final RiderRepository riderRepository;
        private final CompanyRepository companyRepository;
        private final DocumentRepository documentRepository;
    @PostMapping("/RegisterCompany")
    public  ResponseEntity<?> RegisterCompany(@RequestBody RegisterCompany rc){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        if(IsEmailExisted(rc.email)){

            Map<String,Boolean> err = new HashMap<>();
            err.put("IsExistedEmail",true);
            response.object = err;
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

        Date date = new Date();
        Instant timeStamp= Instant.now();

        float nofloat =0;
        short noShort = (short)0;
        Company company = new Company();
        company.setNote(rc.getEmail());
        company.setName(rc.getName());
        company.setPhoneNo(rc.PhoneNumber);
        company.setName(" ");
        companyRepository.save(company);
        User u = new User();
        u.setEmail(rc.email);
        u.setPassword(rc.password);
        User usersave = userService.saveUser(u);
        UserRole userRole = new UserRole();
        userRole.setUserId(new Long(usersave.getId()));
        userRole.setRoleId(new Long(3));
        userRoleRepository.save(userRole);

        response.setStatus(masterStatus.SUCCESSFULL);
        try {


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

        if(IsEmailExisted(rd.email)){

            Map<String,Boolean> err = new HashMap<>();
            err.put("IsExistedEmail",true);
            response.object = err;
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
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
                userRoleRepository.save(userRole);
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

            if(IsEmailExisted(rp.email)){

                Map<String,Boolean> err = new HashMap<>();
                err.put("IsExistedEmail",true);
                response.object = err;
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
            try {

                User u = new User();
                u.setEmail(rp.email);
                u.setPassword(rp.password);
                User usersave = userService.saveUser(u);
                UserRole userRole = new UserRole();
                userRole.setUserId(new Long(usersave.getId()));
                userRole.setRoleId(new Long(2));
                userRoleRepository.save(userRole);
                response.setStatus(masterStatus.SUCCESSFULL);

                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content=exception.toString();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }


        @PostMapping("/Upload/Document")
        public ResponseEntity<?> UploadDocument(@RequestBody DocumentRequest doc){

            ResopnseContent response = new ResopnseContent();
            MasterStatus masterStatus = new MasterStatus();

            try{
                Instant instant = Instant.now();
                Document document = new Document();
                document.setFileName(doc.file_name);
                document.setCreatedBy(doc.createBy);
                document.setExpiredDate(instant);
                document.setExpiredMonth(doc.expired_month);
                document.setExpiredYear(doc.expired_year);

                Instant instant1 = Instant.now();
                long time = instant1.toEpochMilli();
                FileManage fileManage = new FileManage();
                String filePath = fileManage.convertBase64ToImage(doc.Base64, time+"");
                document.setLink(filePath);
                document.setCreatedBy(doc.createBy);
                documentRepository.save(document);

                response.status = masterStatus.SUCCESSFULL;
                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content= exception.toString();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }

    public boolean IsEmailExisted(String email){
        return userService.IsEmailExisted(email);
    }



}

class DocumentRequest{


    public String getExpired_month() {
        return expired_month;
    }

    public void setExpired_month(String expired_month) {
        this.expired_month = expired_month;
    }

    public String getExpired_year() {
        return expired_year;
    }

    public void setExpired_year(String expired_year) {
        this.expired_year = expired_year;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    String Base64;


    String expired_month;
    String expired_year;
    String file_name;
    String createBy;

    public String getBase64() {
        return Base64;
    }

    public void setBase64(String base64) {
        Base64 = base64;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

class RegisterCompany{
    String email;
    String password;
    String Name;

    String PhoneNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String Language;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
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


    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getLanguage() {
        return Language;
    }
}