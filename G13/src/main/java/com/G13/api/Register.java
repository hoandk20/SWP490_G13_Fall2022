package com.G13.api;

import com.G13.File.FileManage;
import com.G13.domain.*;
import com.G13.master.DocumentStatus;
import com.G13.master.GenerateGUID;
import com.G13.master.MasterStatus;
import com.G13.model.*;
import com.G13.repo.*;
import com.G13.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
        private  final VehicleRepository vehicleRepository;
        private  final  VerifyaccountRepository verifyaccountRepository;
    @PostMapping("/RegisterCompany")
    public  ResponseEntity<?> RegisterCompany(@RequestBody RegisterCompany rc){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        if(IsEmailExisted(rc.getEmail())){

            Map<String,Boolean> err = new HashMap<>();
            err.put("IsExistedEmail",true);
            response.object = err;
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

        Date date = new Date();
        Instant timeStamp= Instant.now();
        try {
            float nofloat =0;
            short noShort = (short)0;
            Company company = new Company();
            company.setNote(rc.getEmail());
            company.setName(rc.getName());
            company.setPhoneNo(rc.getPhoneNumber());
            company.setAddressID(rc.getAddress());
            companyRepository.save(company);
            User u = new User();
            u.setEmail(rc.getEmail());
            u.setPassword(rc.getPassword());
            User usersave = userService.saveUser(u);
            UserRole userRole = new UserRole();
            userRole.setUserId(new Long(usersave.getId()));
            userRole.setRoleId(new Long(3));
            userRoleRepository.save(userRole);
            response.object = company;
            response.setStatus(masterStatus.SUCCESSFULL);
            Verifyaccount verifyaccount = new Verifyaccount();
            GenerateGUID guid = new GenerateGUID();
            verifyaccount.setUserid(usersave.getId());
            verifyaccount.setStatus("0");
            verifyaccount.setVerificode(guid.getRandomNumberString());
            verifyaccount.setExpiredate(timeStamp.plusSeconds(60));
            MailAPI mailAPI = new MailAPI();
            mailAPI.SendEmailVerifyAccount(rc.getEmail(),verifyaccount.getVerificode());
            response.object=verifyaccountRepository.saveAndFlush(verifyaccount);
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("ChangeStatusVerify")
    public ResponseEntity<?> ChangeStatusVerify(@RequestBody VerifyCode verifyCode){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();

        try{
            User user = userRepository.findByEmail(verifyCode.getEmail());
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount =verifyaccountRepository.findVerifyaccountByUseridOrderByExpiredateDesc(user.getId());
            if(verifyaccount==null){
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);

            }else{
                verifyaccount.setStatus(verifyCode.getStatus());
                Verifyaccount verifyaccount1=verifyaccountRepository.saveAndFlush(verifyaccount);
                response.setObject(verifyaccount1);
                response.status = masterStatus.SUCCESSFULL;
                return ResponseEntity.ok().body(response);
            }

        }catch (Exception exception){
            response.content= exception.toString();
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

        if(IsEmailExisted(rd.getEmail())){

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
                driver.setMobileNo(rd.getPhoneNumber());
                driver.setLanguageCode("vi");
                driver.setCountryCode(rd.getCountry());
                driver.setLanguageCode(rd.getLanguage());
                driver.setAddressID(rd.getCity()+" ");
                driverRepository.save(driver);
                User u = new User();
                u.setEmail(rd.getEmail());
                u.setPassword(rd.getPassword());
                User usersave = userService.saveUser(u);
                UserRole userRole = new UserRole();
                userRole.setUserId(new Long(usersave.getId()));
                userRole.setRoleId(new Long(1));
                userRoleRepository.save(userRole);
                Verifyaccount verifyaccount = new Verifyaccount();
                GenerateGUID guid = new GenerateGUID();
                verifyaccount.setUserid(usersave.getId());
                verifyaccount.setStatus("0");
                verifyaccount.setVerificode(guid.getRandomNumberString());
                verifyaccount.setExpiredate(timeStamp.plusSeconds(60));
                MailAPI mailAPI = new MailAPI();
                mailAPI.SendEmailVerifyAccount(rd.getEmail(),verifyaccount.getVerificode());
                response.object=verifyaccountRepository.saveAndFlush(verifyaccount);
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

            if(IsEmailExisted(rp.getEmail())){

                Map<String,Boolean> err = new HashMap<>();
                err.put("IsExistedEmail",true);
                response.object = err;
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
            try {


                User u = new User();
                u.setEmail(rp.getEmail());
                u.setPassword(rp.getPassword());
                User usersave = userService.saveUser(u);

                Rider rider = new Rider();
                rider.setCountryCode("vi");
                rider.setEmail(rp.getEmail());
                rider.setFirstName(rp.getFirstName());
                rider.setLastName(rp.getLastName());
                rider.setMobileNo(rp.getPhoneNumber());
                rider.setLanguageCode(rp.getLanguage());
                rider.setId(rp.getEmail());
                rider.setBalance(nofloat);
                rider.setCancelRate(nofloat);
                rider.setStatus("at");
                rider.setTotalTrips(noShort);
                rider.setTotalPoint(0);
                rider.setTotalRequests(noShort);
                rider.setTotalCanelledTrips(noShort);
                rider.setCreatedBy(rp.getEmail()+rp.getLastName());
                rider.setResentCount("0".getBytes()[0]);
                rider.setPromoStatus("0".getBytes()[0]);
                rider.setRewardedTrips(noShort);
                rider.setTotalPoint(0);
                rider.setCreatedDate(timeStamp);
                rider.setLastModifiedBy(rp.getLastName()+rp.getLastName());
                rider.setLastModifiedDate(timeStamp);
                rider.setRate(nofloat);
                rider.setFullName(rp.getFirstName()+rp.getLastName());
                rider.setPromotionBalance(nofloat);
                rider.setTotalTripAdjustment(0.0);
                response.setStatus(masterStatus.SUCCESSFULL);
                riderRepository.save(rider);

                UserRole userRole = new UserRole();
                userRole.setUserId(new Long(usersave.getId()));
                userRole.setRoleId(new Long(2));
                userRoleRepository.save(userRole);

                Verifyaccount verifyaccount = new Verifyaccount();
                GenerateGUID guid = new GenerateGUID();
                verifyaccount.setUserid(usersave.getId());
                verifyaccount.setStatus("0");
                verifyaccount.setVerificode(guid.getRandomNumberString());
                verifyaccount.setExpiredate(timeStamp.plusSeconds(60));
                MailAPI mailAPI = new MailAPI();
                mailAPI.SendEmailVerifyAccount(rp.getEmail(),verifyaccount.getVerificode());
                response.object=verifyaccountRepository.saveAndFlush(verifyaccount);
                response.setStatus(masterStatus.SUCCESSFULL);

                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content=exception.getCause().toString();
                System.out.println(response.content);
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }


        @PostMapping("/Upload/Document")
        public ResponseEntity<?> UploadDocument(@RequestBody DocumentRequest doc){

            ResopnseContent response = new ResopnseContent();
            MasterStatus masterStatus = new MasterStatus();
            DocumentStatus documentStatus = new DocumentStatus();
            try{
                Date date = new Date();
                long time = date.getTime();
                Instant instant = Instant.now();
                Document document = new Document();
                document.setFileName(doc.getFile_name());
                document.setCreatedBy(doc.getCreateBy());
                document.setExpiredDate(instant);
                document.setExpiredMonth(doc.getExpired_month());
                document.setExpiredYear(doc.getExpired_year());

                Instant instant1 = Instant.now();
                FileManage fileManage = new FileManage();
                String filePath = fileManage.convertBase64ToImage(doc.getBase64(), time+"");
                document.setLink(filePath);
                document.setCreatedBy(doc.getCreateBy());
                document.setCreatedDate(instant);
                document.setStatus(documentStatus.DOCUMENT_SENDED);
                documentRepository.save(document);

                response.status = masterStatus.SUCCESSFULL;
                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content= exception.toString();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }
        @GetMapping("/Upload/GetDocument")
        public ResponseEntity<?> GetDocument(String createBy, String file_name){
        DocumentRequest doc = new DocumentRequest();

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try{
            FileManage fileManage = new FileManage();
            Document document = documentRepository
                    .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(createBy,file_name);
            doc.setExpired_month(document.getExpiredMonth());
            doc.setExpired_year(document.getExpiredYear());
            doc.setBase64(fileManage.GetBase64FromPath(document.getLink()));
            doc.setId(document.getId());

            response.object = doc;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content= exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/VerifyCode")
    public ResponseEntity<?> VerifyCode(@RequestBody VerifyCode verifyCode){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();

        try{
            User user = userRepository.findByEmail(verifyCode.getEmail());
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount =verifyaccountRepository.findVerifyaccountByUseridOrderByExpiredateDesc(user.getId());
            if(verifyCode.getCode().equals(verifyaccount.getVerificode())&&verifyaccount.getExpiredate().isAfter(Instant.now())){
                verifyaccount.setStatus("1");
                verifyaccountRepository.save(verifyaccount);
                verifyCode.setExpired(false);
                verifyCode.setStatus("1");
                response.content= "verify sussessfull";
                response.object = verifyCode;
                response.status = masterStatus.SUCCESSFULL;
                return ResponseEntity.ok().body(response);
            }else{
                verifyCode.setExpired(true);
                verifyCode.setStatus("0");
                response.content= "code is expired or invalid";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }catch (Exception exception){
            response.content= exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @GetMapping("/getResendCode")
    public ResponseEntity<?> ResendCode(String email){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();
        Instant now = Instant.now();

        try{
            User user = userRepository.findByEmail(email);
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount =verifyaccountRepository.findVerifyaccountByUseridOrderByExpiredateDesc(user.getId());
            GenerateGUID guid = new GenerateGUID();
            verifyaccount.setVerificode(guid.getRandomNumberString());
            verifyaccount.setExpiredate(now.plusSeconds(60));
            MailAPI mailAPI = new MailAPI();
            mailAPI.SendEmailVerifyAccount(email,verifyaccount.getVerificode());
            verifyaccountRepository.save(verifyaccount);
            response.content= "send successfull";
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






