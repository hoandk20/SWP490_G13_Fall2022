package com.G13.controller;

import com.G13.domain.*;
import com.G13.masterData.*;
import com.G13.modelDto.*;
import com.G13.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor
public class RegisterController {

    private final UserService userService;
    private final UserRoleService userRoleService;
    private final CompanyService companyService;
    private final DocumentService documentService;
    private final VehicleDocumentService vehicleDocumentService;
    private final VerifyAccountService verifyAccountService;
    private final VehicleService vehicleService;
    private final CommonService commonService;
    private final DriverService driverService;
    private final RiderService riderService;
    private final FileService fileService;

    @PostMapping("/RegisterCompany")
    public ResponseEntity<?> RegisterCompany(@RequestBody RegisterCompany rc) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        if (commonService.IsPhoneExisted(rc.getPhoneNumber())) {
            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedPhone", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
        if (IsEmailExisted(rc.getEmail())) {
            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedEmail", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
        Date date = new Date();
        Instant timeStamp = Instant.now();
        try {
            CompanyStatus companyStatus = new CompanyStatus();
            float nofloat = 0;
            short noShort = (short) 0;
            Company company = new Company();
            company.setNote(rc.getEmail());
            company.setName(rc.getName());
            company.setPhoneNo(rc.getPhoneNumber());
            company.setAddressID(rc.getAddress());
            company.setStatus(companyStatus.New);
            company.setCityID(rc.getCityId());
            companyService.SaveCompany(company);
            User u = new User();
            u.setEmail(rc.getEmail());
            u.setPassword(rc.getPassword());
            User usersave = userService.saveUser(u);
            userRoleService.SaveUserRole(usersave.getId(), 3);
            response.setObject(company);
            response.setStatus(masterStatus.SUCCESSFULL);
            Verifyaccount verifyaccount = new Verifyaccount();
            GenerateGUID guid = new GenerateGUID();
            verifyaccount.setUserid(usersave.getId());
            verifyaccount.setStatus("0");
            verifyaccount.setVerificode(guid.getRandomNumberString());
            verifyaccount.setExpiredate(timeStamp.plusSeconds(60*10));
            MailController mailAPI = new MailController();
            try{
                mailAPI.SendEmailVerifyAccount(rc.getEmail(), verifyaccount.getVerificode());
            }catch (Exception e){
                System.out.println(e.toString());
            }
            response.setObject(verifyAccountService.SaveVerifyAccount(verifyaccount));
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("ChangeStatusVerify")
    public ResponseEntity<?> ChangeStatusVerify(@RequestBody VerifyCode verifyCode) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();

        try {
            User user = userService.getUserByEmail(verifyCode.getEmail());
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount = verifyAccountService.getVerifyAccountByUserId(user.getId());
            if (verifyaccount == null) {
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);

            } else {
                verifyaccount.setStatus(verifyCode.getStatus());
                response.setObject(verifyAccountService.SaveVerifyAccount(verifyaccount));
                response.setStatus(masterStatus.SUCCESSFULL);
                return ResponseEntity.ok().body(response);
            }

        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/RegisterDriver")
    public ResponseEntity<?> RegisterDriver(@RequestBody RegisterDriver rd) {
        Date date = new Date();
        Instant timeStamp = Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DriverStatus driverStatus = new DriverStatus();
        float nofloat = 0;
        short noShort = (short) 0;

        if (commonService.IsPhoneExisted(rd.getPhoneNumber())) {
            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedPhone", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
        if (IsEmailExisted(rd.getEmail())) {

            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedEmail", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
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
            driver.setAddressID(rd.getCity() + " ");
            driver.setStatus(driverStatus.NEW);
            driver.setBranchCityId(rd.getCityId());
            driverService.SaveDriver(driver);
            User u = new User();
            u.setEmail(rd.getEmail());
            u.setPassword(rd.getPassword());
            User usersave = userService.saveUser(u);
            userRoleService.SaveUserRole(usersave.getId(), 1);
            Verifyaccount verifyaccount = new Verifyaccount();
            GenerateGUID guid = new GenerateGUID();
            verifyaccount.setUserid(usersave.getId());
            verifyaccount.setStatus("0");
            verifyaccount.setVerificode(guid.getRandomNumberString());
            verifyaccount.setExpiredate(timeStamp.plusSeconds(60*10));
            MailController mailAPI = new MailController();
            try{
                mailAPI.SendEmailVerifyAccount(rd.getEmail(), verifyaccount.getVerificode());
            }catch (Exception e){
                System.out.println(e.toString());
            }
            response.setObject(verifyAccountService.SaveVerifyAccount(verifyaccount));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
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
        Instant timeStamp = Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat = 0;
        short noShort = (short) 0;
        if (commonService.IsPhoneExisted(rp.getPhoneNumber())) {
            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedPhone", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
        if (IsEmailExisted(rp.getEmail())) {

            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedEmail", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
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
            rider.setCityID(rp.getCityId());
            rider.setId(rp.getEmail());
            rider.setBalance(nofloat);
            rider.setCancelRate(nofloat);
            rider.setStatus("at");
            rider.setTotalTrips(noShort);
            rider.setTotalPoint(0);
            rider.setTotalRequests(noShort);
            rider.setTotalCanelledTrips(noShort);
            rider.setCreatedBy(rp.getEmail() + rp.getLastName());
            rider.setResentCount("0".getBytes()[0]);
            rider.setPromoStatus("0".getBytes()[0]);
            rider.setRewardedTrips(noShort);
            rider.setTotalPoint(0);
            rider.setCreatedDate(timeStamp);
            rider.setLastModifiedBy(rp.getLastName() + rp.getLastName());
            rider.setLastModifiedDate(timeStamp);
            rider.setRate(nofloat);
            rider.setFullName(rp.getFirstName() + rp.getLastName());
            rider.setPromotionBalance(nofloat);
            rider.setTotalTripAdjustment(0.0);
            response.setStatus(masterStatus.SUCCESSFULL);
            riderService.SaveRider(rider);
            userRoleService.SaveUserRole(usersave.getId(), 2);
            Verifyaccount verifyaccount = new Verifyaccount();
            GenerateGUID guid = new GenerateGUID();
            verifyaccount.setUserid(usersave.getId());
            verifyaccount.setStatus("0");
            verifyaccount.setVerificode(guid.getRandomNumberString());
            verifyaccount.setExpiredate(timeStamp.plusSeconds(60*10));
            MailController mailAPI = new MailController();
            try{
                mailAPI.SendEmailVerifyAccount(rp.getEmail(), verifyaccount.getVerificode());
            }catch (Exception e){
                System.out.println(e.toString());
            }
            response.setObject(verifyAccountService.SaveVerifyAccount(verifyaccount));
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.getCause().toString());
            System.out.println(response.getContent());
            return ResponseEntity.badRequest().body(response);
        }

    }


    @PostMapping("/Upload/Document")
    public ResponseEntity<?> UploadDocument(@RequestBody DocumentRequest doc) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();
        try {
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
            String filePath = fileService.convertBase64ToImage(doc.getBase64(), time + "");
            document.setLink(filePath);
            document.setCreatedBy(doc.getCreateBy());
            document.setCreatedDate(instant);
            document.setStatus(documentStatus.DOCUMENT_SENDED);
            documentService.SaveDocument(document);

            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/Upload/DocumentVehicle")
    public ResponseEntity<?> UploadDocumentVehicle(@RequestBody DocumentRequest doc) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();

        try {
            if (doc.getCreateBy() == null || doc.getCreateBy().equals("")) {
                throw new Exception();
            }
            int vehicleid = Integer.parseInt(doc.getVehicleId() + "");
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
            String filePath = fileService.convertBase64ToImage(doc.getBase64(), time + "");
            document.setLink(filePath);
            document.setCreatedBy(doc.getCreateBy());
            document.setCreatedDate(instant);
            document.setStatus(documentStatus.DOCUMENT_SENDED);
            Document document1 = documentService.SaveDocument(document);
            Vehicledocument vehicledocument = new Vehicledocument();
            Vehicle vehicle = vehicleService.getVehicleByID(vehicleid);
            vehicledocument.setDocumentid(document1);
            vehicledocument.setVehicleid(vehicle);

            vehicleDocumentService.SaveVehicleDocument(vehicledocument);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(document1);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/Upload/GetDocumentVehicle")
    public ResponseEntity<?> GetDocument(String vehicleid) {

        DocumentRequest doc = new DocumentRequest();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            int id = Integer.parseInt(vehicleid);
            List<Vehicledocument> vehicledocuments =
                    vehicleDocumentService.getVehicleDocumentByVehicle(vehicleService.getVehicleByID(id));
            List<DocumentRequest> documentRequests = new ArrayList<>();
            for (Vehicledocument vehicledocument : vehicledocuments) {
                DocumentRequest documentRequest = new DocumentRequest();
                Document document = documentService
                        .GetDocById(vehicledocument.getDocumentid().getId());
                doc.setExpired_month(document.getExpiredMonth());
                doc.setExpired_year(document.getExpiredYear());
                doc.setBase64(fileService.GetBase64FromPath(document.getLink()));
                doc.setId(document.getId());
                documentRequests.add(doc);
            }

            response.setObject(documentRequests);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/Upload/GetDocument")
    public ResponseEntity<?> GetDocument(String createBy, String file_name) {
        DocumentRequest doc = new DocumentRequest();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            Document document = documentService
                    .GetDocumentByCreateByAndFileName(createBy, file_name);
            try {
                Vehicledocument vehicledocument = vehicleDocumentService.getVehicleDocumentByDocument(document);
                if (vehicledocument != null) {
                    doc.setVehicleId(vehicledocument.getVehicleid().getId());
                } else {
                    doc.setVehicleId(0);
                }
            } catch (Exception e) {
            }
            if (document != null) {
                doc.setExpired_month(document.getExpiredMonth());
                doc.setExpired_year(document.getExpiredYear());
                doc.setBase64(fileService.GetBase64FromPath(document.getLink()));
                doc.setId(document.getId());
                doc.setStatus(document.getStatus());
                doc.setFile_name(document.getFileName());
                doc.setCreateBy(document.getCreatedBy());
                response.setObject(doc);
            } else {
                response.setObject("");
            }
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/VerifyCode")
    public ResponseEntity<?> VerifyCode(@RequestBody VerifyCode verifyCode) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();

        try {
            User user = userService.getUser(verifyCode.getEmail());
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount = verifyAccountService.getVerifyAccountByUserId(user.getId());
            if (verifyCode.getCode().equals(verifyaccount.getVerificode()) && verifyaccount.getExpiredate().isAfter(Instant.now())) {
                verifyaccount.setStatus("1");
                verifyAccountService.SaveVerifyAccount(verifyaccount);
                verifyCode.setExpired(false);
                verifyCode.setStatus("1");
                response.setContent("verify sussessfull");
                response.setObject(verifyCode);
                response.setStatus(masterStatus.SUCCESSFULL);
                return ResponseEntity.ok().body(response);
            } else {
                verifyCode.setExpired(true);
                verifyCode.setStatus("0");
                response.setContent("code is expired or invalid");
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);
            }
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/getResendCode")
    public ResponseEntity<?> ResendCode(String email) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();
        Instant now = Instant.now();

        try {
            User user = userService.getUserByEmail(email);
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount = verifyAccountService.getVerifyAccountByUserId(user.getId());
            GenerateGUID guid = new GenerateGUID();
            verifyaccount.setVerificode(guid.getRandomNumberString());
            verifyaccount.setExpiredate(now.plusSeconds(60*10));
            MailController mailAPI = new MailController();
            try{
                mailAPI.SendEmailVerifyAccount(email, verifyaccount.getVerificode());
            }catch (Exception e){
                System.out.println(e.toString());
            }

            verifyAccountService.SaveVerifyAccount(verifyaccount);
            response.setContent("send successfull");
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);

        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/getCode")
    public ResponseEntity<?> getCode(String email){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DocumentStatus documentStatus = new DocumentStatus();
        Instant now = Instant.now();

        try {
            User user = userService.getUserByEmail(email);
            Date date = new Date();
            Instant instant1 = Instant.now();
            Verifyaccount verifyaccount = verifyAccountService.getVerifyAccountByUserId(user.getId());
            response.setObject(verifyaccount);
            response.setContent("send successfull");
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }
    public boolean IsEmailExisted(String email) {
        return userService.IsEmailExisted(email);
    }


}






