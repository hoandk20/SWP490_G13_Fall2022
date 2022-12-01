package com.G13.api;

import com.G13.domain.*;
import com.G13.master.CarStatus;
import com.G13.master.MasterStatus;
import com.G13.master.UploadFileMaster;
import com.G13.model.*;
import com.G13.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/driver")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class DriverResource {
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    private final VehicleRepository vehicleRepository;
    private final DocumentRepository documentRepository;
    private final PromotiontripRepository promotiontripRepository;
    private final TripRepository tripRepository;
    @PostMapping("/addVehicle")
    public ResponseEntity<?> AddVehicle (@RequestBody VehicleRequest vr) {
        Date date = new Date();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        CarStatus carStatus = new CarStatus();
        float nofloat =0;
        short noShort = (short)0;
        long timeMilli = date.getTime();

        try {
            Vehicle vehicle = new Vehicle();

            vehicle.setCompanyID(0);
            vehicle.setProduceYear(vr.getProduceYear());
            vehicle.setInteriorColor(vr.getInteriorColor());
            vehicle.setExteriorColor(vr.getExteriorColor());
            vehicle.setPlate(vr.getPlate());
            vehicle.setLisencePlatState(vr.getPlatState());
            vehicle.setLisencePlatCountry(vr.getPlateCountry());
            vehicle.setCarTypeID(vr.getTypeId());
            vehicle.setCreatedBy(vr.getProducer());
            vehicle.setStatus(carStatus.Car_Using);
            Vehicle vehicleSave = vehicleRepository.saveAndFlush(vehicle);
            Driver driver  = driverRepository.findByEmail(vr.getDriverEmail());
            driver.setCurrentVehicle(vehicleSave.getId());
            driver.setDeviceType("N/A");
            driverRepository.save(driver);
            response.object=vehicleSave;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @GetMapping("/detail")
    public ResponseEntity<?> AddVehicle(String driverEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
            try {
            Driver driver = driverRepository.findByEmailOrderByCreatedDateDesc(driverEmail);
                RegisterDriverCompany r = new RegisterDriverCompany();
                r.setAddress(driver.getAddressID());
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



            response.status = masterStatus.SUCCESSFULL;
            response.object = r;

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }


}
