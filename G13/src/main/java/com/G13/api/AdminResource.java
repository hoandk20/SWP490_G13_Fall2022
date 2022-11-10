package com.G13.api;

import com.G13.domain.*;
import com.G13.master.MasterStatus;
import com.G13.master.UploadFileMaster;
import com.G13.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor
public class AdminResource {
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    private final PromotiontripRepository promotiontripRepository;

    private final DocumentRepository documentRepository;
    private final VehicleRepository vehicleRepository;

    @GetMapping("/GetDrivers")
    public ResponseEntity<?> getDrivers() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {


            List<Driver> drivers = driverRepository.findAll();
            List<RegisterDriverCompany> registerDriverCompanies = new ArrayList<>();

            for (Driver driver : drivers) {
                RegisterDriverCompany r = new RegisterDriverCompany();
                r.setEmail(driver.getEmail());
                r.setFirstName(driver.getFirstName());
                r.setLastName(driver.getLastName());
                r.setPhoneNumber(driver.getMobileNo());
                r.setLanguage(driver.getLanguageCode());
                r.setCountry(driver.getCountryCode());
                r.setDriverID(driver.getId());
                r.setCompanyName(driver.getCompanyName());
                r.setCreateDate(driver.getCreatedDate());
                r.setStatus(driver.getStatus());
                r.setDeviceType(driver.getDeviceType());
                r.setDocStatus("");
                r.setLh("");
                r.setCountry(driver.getCountryCode());
                try {
                    int companyId = driver.getCompanyID();
                    Company company = companyRepository.findCompanyById(companyId);
                    CompanyInfo companyInfo = new CompanyInfo();
                    companyInfo.setCompanyAddress(company.getAddressID());
                    companyInfo.setCompanyName(company.getName());
                    companyInfo.setPhone(company.getPhoneNo());
                    companyInfo.setCompanyStatus(company.getStatus());
                    r.setCompanyInfo(companyInfo);
                } catch (Exception e) {

                }
                List<DocumentRequest> documentRequests = new ArrayList<>();
                UploadFileMaster uploadFileMaster = new UploadFileMaster();
                Document document1 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(driver.getEmail(), uploadFileMaster.Bang_lai_xe);
                if (document1 != null) {
                    DocumentRequest documentRequest1 = new DocumentRequest();
                    documentRequest1.setExpired_month(document1.getExpiredMonth());
                    documentRequest1.setExpired_year(document1.getExpiredYear());
                    documentRequest1.setId(document1.getId());
                    documentRequest1.setStatus(document1.getStatus());
                    documentRequest1.setFile_name(document1.getFileName());
                    documentRequest1.setCreateBy(document1.getCreatedBy());
                    documentRequests.add(documentRequest1);
                }
                Document document2 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(driver.getEmail(), uploadFileMaster.Chung_Nhan_Kinh_nghiem);
                if (document2 != null) {
                    DocumentRequest documentRequest2 = new DocumentRequest();
                    documentRequest2.setExpired_month(document2.getExpiredMonth());
                    documentRequest2.setExpired_year(document2.getExpiredYear());
                    documentRequest2.setId(document2.getId());
                    documentRequest2.setStatus(document2.getStatus());
                    documentRequest2.setFile_name(document2.getFileName());
                    documentRequest2.setCreateBy(document2.getCreatedBy());
                    documentRequests.add(documentRequest2);
                }
                Document document3 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(driver.getEmail(), uploadFileMaster.Chung_Nhan_Bao_Hiem);
                if (document3 != null) {
                    DocumentRequest documentRequest = new DocumentRequest();
                    documentRequest.setExpired_month(document3.getExpiredMonth());
                    documentRequest.setExpired_year(document3.getExpiredYear());
                    documentRequest.setId(document3.getId());
                    documentRequest.setStatus(document3.getStatus());
                    documentRequest.setFile_name(document3.getFileName());
                    documentRequest.setCreateBy(document3.getCreatedBy());
                    documentRequests.add(documentRequest);
                }
                Document document4 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(driver.getEmail(), uploadFileMaster.Chung_Nhan_Dang_Kiem);
                if (document4 != null) {
                    DocumentRequest documentRequest = new DocumentRequest();
                    documentRequest.setExpired_month(document4.getExpiredMonth());
                    documentRequest.setExpired_year(document4.getExpiredYear());
                    documentRequest.setId(document4.getId());
                    documentRequest.setStatus(document4.getStatus());
                    documentRequest.setFile_name(document4.getFileName());
                    documentRequest.setCreateBy(document4.getCreatedBy());
                    documentRequests.add(documentRequest);
                }
                r.setListDocs(documentRequests);

                try {
                    Vehicle vehicle = vehicleRepository.findVehicleById(driver.getCurrentVehicle());
                    if (vehicle != null) {
                        VehicleRequest vehicleRequest = new VehicleRequest();
                        vehicleRequest.setId(vehicle.getId());
                        vehicleRequest.setCompanyEmail(r.getCompanyEmail());
                        vehicleRequest.setProducer(vehicle.getCreatedBy());
                        vehicleRequest.setProduceYear(vehicle.getProduceYear());
                        vehicleRequest.setInteriorColor(vehicle.getInteriorColor());
                        vehicleRequest.setExteriorColor(vehicle.getExteriorColor());
                        vehicleRequest.setPlate(vehicle.getPlate());
                        vehicleRequest.setPlatState(vehicle.getLisencePlatState());
                        vehicleRequest.setPlateCountry(vehicle.getLisencePlatCountry());
                        vehicleRequest.setTypeId(vehicle.getCarTypeID());
                        r.setVehicleInfo(vehicleRequest);
                    }
                } catch (Exception e) {
                }


                registerDriverCompanies.add(r);
            }

            response.status = masterStatus.SUCCESSFULL;
            response.object = registerDriverCompanies;

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/GetCompanies")
    public ResponseEntity<?> getCompanies() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            List<Company> list = companyRepository.findAll();
            List<CompanyInfo> companyInfos = new ArrayList<>();
            for (Company c : list
            ) {
                CompanyInfo companyInfo = new CompanyInfo();
                companyInfo.setCompanyStatus(c.getStatus());
                companyInfo.setCreateDate(c.getCreatedDate());
                companyInfo.setCompanyAddress(c.getAddressID());
                companyInfo.setEmail(c.getNote());
                companyInfo.setPhone(c.getPhoneNo());
                companyInfo.setCompanyName(c.getName());
                List<DocumentRequest> documentRequests = new ArrayList<>();
                UploadFileMaster uploadFileMaster = new UploadFileMaster();
                Document document1 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(companyInfo.getEmail(), uploadFileMaster.Bang_lai_xe);
                if (document1 != null) {
                    DocumentRequest documentRequest = new DocumentRequest();
                    documentRequest.setExpired_month(document1.getExpiredMonth());
                    documentRequest.setExpired_year(document1.getExpiredYear());
                    documentRequest.setId(document1.getId());
                    documentRequest.setStatus(document1.getStatus());
                    documentRequest.setFile_name(document1.getFileName());
                    documentRequest.setCreateBy(document1.getCreatedBy());
                    documentRequests.add(documentRequest);
                }
                Document document2 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(companyInfo.getEmail(), uploadFileMaster.Chung_Nhan_Kinh_nghiem);
                if (document2 != null) {
                    DocumentRequest documentRequest = new DocumentRequest();
                    documentRequest.setExpired_month(document2.getExpiredMonth());
                    documentRequest.setExpired_year(document2.getExpiredYear());
                    documentRequest.setId(document2.getId());
                    documentRequest.setStatus(document2.getStatus());
                    documentRequest.setFile_name(document2.getFileName());
                    documentRequest.setCreateBy(document2.getCreatedBy());
                    documentRequests.add(documentRequest);
                }
                Document document3 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(companyInfo.getEmail(), uploadFileMaster.GP_Kinh_Doanh);
                if (document3 != null) {
                    DocumentRequest documentRequest = new DocumentRequest();
                    documentRequest.setExpired_month(document3.getExpiredMonth());
                    documentRequest.setExpired_year(document3.getExpiredYear());
                    documentRequest.setId(document3.getId());
                    documentRequest.setStatus(document3.getStatus());
                    documentRequest.setFile_name(document3.getFileName());
                    documentRequest.setCreateBy(document3.getCreatedBy());
                    documentRequests.add(documentRequest);
                }
                Document document4 = documentRepository
                        .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(companyInfo.getEmail(), uploadFileMaster.GP_Hoat_Dong);
                if (document3 != null) {
                    DocumentRequest documentRequest = new DocumentRequest();
                    documentRequest.setExpired_month(document4.getExpiredMonth());
                    documentRequest.setExpired_year(document4.getExpiredYear());
                    documentRequest.setId(document4.getId());
                    documentRequest.setStatus(document4.getStatus());
                    documentRequest.setFile_name(document4.getFileName());
                    documentRequest.setCreateBy(document4.getCreatedBy());
                    documentRequests.add(documentRequest);
                }
                companyInfo.setListDoc(documentRequests);
                companyInfos.add(companyInfo);

            }

            response.status = masterStatus.SUCCESSFULL;
            response.object = companyInfos;

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/GetAllTrip")
    public ResponseEntity<?> listTrip() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try {
            List<Promotiontrip> list = promotiontripRepository.findAll();
            List<TripDriver> driverTrips = new ArrayList<>();
            for (Promotiontrip detail : list
            ) {
                TripDriver tripDriver = new TripDriver();
                tripDriver.driverEmail = detail.getDriverID();
                tripDriver.from = detail.getFromAddress();
                tripDriver.to = detail.getToAddress();
                tripDriver.setSeat(detail.getCapacity());
                tripDriver.id = detail.getId();
                tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                tripDriver.status = detail.getStatus();
                tripDriver.timeStart = Date.from(detail.getTimeStart());
                tripDriver.setWaitingTime(detail.getDuration());
                tripDriver.price = detail.getFee();
                driverTrips.add(tripDriver);
            }

            response.object = driverTrips;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("DocumentChangeStatus")
    public ResponseEntity<?> DocumentChangeStatus(@RequestBody DocumentRequest doc) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            Document docExist = documentRepository.findDocumentById(doc.getId());
            if(docExist==null){
                response.content = "document not existed";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
            docExist.setStatus(doc.getStatus());
            documentRepository.save(docExist);
            response.object = docExist;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
}


