package com.G13.controller;

import com.G13.domain.*;
import com.G13.masterData.MasterStatus;
import com.G13.modelDto.*;
import com.G13.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor
public class AdminController {
    private final DriverService driverService;
    private final TripService tripService;
    private final CompanyService companyService;
    private final PromotionTripService promotionTripService;

    private final DocumentService documentService;
    private final VehicleService vehicleService;
    private final RiderService riderService;
    private final AdminService adminService;


    @GetMapping("/GetDrivers")
    public ResponseEntity<?> getDrivers(String regFrom, String regTo, String phone, String driverName, String email,
                                        String Status, String city, String plate) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            List<Driver> drivers = driverService.getAllDriver();
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
                    Company company = companyService.getCompanyByID(companyId);
                    CompanyInfo companyInfo = new CompanyInfo();
                    companyInfo.setCompanyAddress(company.getAddressID());
                    companyInfo.setCompanyName(company.getName());
                    companyInfo.setPhone(company.getPhoneNo());
                    companyInfo.setCompanyStatus(company.getStatus());
                    r.setCompanyInfo(companyInfo);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                try {
                    Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
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
            Date dateFrom=null;
            Date dateTo=null;
            if(regFrom!=null&&!regFrom.equals("")){
                Instant instant = Instant.parse(regFrom);
                dateFrom =  Date.from(instant);
            }
            if(regTo!=null&&!regTo.equals("")){
                Instant instant = Instant.parse(regTo);
                dateTo =  Date.from(instant);
            }

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(adminService.filterListDriverCompany(registerDriverCompanies, dateFrom, dateTo, phone,
                    driverName,
                    email, Status, city, plate));

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/GetCompanies")
    public ResponseEntity<?> getCompanies(String regFrom, String regTo, String companyName, String email, String Status, String city) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            List<Company> list = companyService.getAllCompany();
            List<CompanyInfo> companyInfos = new ArrayList<>();
            for (Company c : list
            ) {
                CompanyInfo companyInfo = new CompanyInfo();
                companyInfo.setCompanyId(c.getId());
                companyInfo.setCompanyStatus(c.getStatus());
                companyInfo.setCreateDate(c.getCreatedDate());
                companyInfo.setCompanyAddress(c.getAddressID());
                companyInfo.setEmail(c.getNote());
                companyInfo.setPhone(c.getPhoneNo());
                companyInfo.setCompanyName(c.getName());
                companyInfos.add(companyInfo);
            }
            Date dateFrom=null;
            Date dateTo=null;
            if(regFrom!=null&&!regFrom.equals("")){
                Instant instant = Instant.parse(regFrom);
                dateFrom =  Date.from(instant);
            }
            if(regTo!=null&&!regTo.equals("")){
                Instant instant = Instant.parse(regTo);
                dateTo =  Date.from(instant);
            }
            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(filterListCompany(companyInfos, dateFrom, dateTo, companyName, email, Status, city));

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    List<CompanyInfo> filterListCompany(List<CompanyInfo> list, Date regFrom, Date regTo, String companyName,
                                        String email, String Status, String city) {

        List<CompanyInfo> listResult = new ArrayList<>();
        for (CompanyInfo c:list) {
            if(companyName!=null&&!companyName.equals("")){
                if(!c.getCompanyName().toLowerCase().contains(companyName)){continue;}
            }
            if(email!=null&&!email.equals("")){
                if(!c.getEmail().toLowerCase().contains(email)){continue;}
            }
            if(Status!=null&&!Status.equals("")){
                if(!c.getCompanyStatus().toLowerCase().contains(Status)){continue;}
            }
            if(city!=null&&!city.equals("")){
                if(!c.getCompanyAddress().toLowerCase().contains(city)){continue;}
            }
            if (regFrom != null) {
                Instant instantFrom = regFrom.toInstant();
                if (instantFrom.compareTo(c.getCreateDate()) > 0) {
                    continue;
                }
            }
            if (regTo != null) {
                Instant instantTo = regTo.toInstant();
                if (instantTo.compareTo(c.getCreateDate()) < 0) {
                    continue;
                }
            }


            listResult.add(c);
        }

        return listResult;
    }

    @GetMapping("/GetAllTrip")
    public ResponseEntity<?> listTrip(String regFrom, String regTo, String phoneDriver, String phonePassenger, String Status) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try {
            List<Promotiontrip> list = promotionTripService.getAllTrip();
            List<TripDriver> driverTrips = new ArrayList<>();
            for (Promotiontrip detail : list
            ) {
                TripDriver tripDriver = new TripDriver();
                tripDriver.setDriverEmail(detail.getDriverID());
                tripDriver.setFrom(detail.getFromAddress());
                tripDriver.setTo(detail.getToAddress());
                tripDriver.setSeat(detail.getCapacity());
                tripDriver.setId(detail.getId());
                tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                tripDriver.setStatus(detail.getStatus());
                tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                tripDriver.setWaitingTime(detail.getDuration());
                tripDriver.setPrice(detail.getFee());
                tripDriver.setInstantTimeStart(detail.getTimeStart());
                tripDriver.setTripID(detail.getId());
                Driver driver = driverService.getDriverByID(detail.getDriverID());
                if (driver != null) {
                    tripDriver.setPhoneDriver(driver.getMobileNo());
                }
                List<Trip> listTripPassenger = tripService.getAllByTripCode(detail.getId());
                for (Trip i : listTripPassenger
                ) {
                    tripDriver.setPhonePassenger(tripDriver.getPhonePassenger() + "," + i.getMobileRelative());
                }
                driverTrips.add(tripDriver);
            }
            Date dateFrom=null;
            Date dateTo=null;
            if(regFrom!=null&&!regFrom.equals("")){
                Instant instant = Instant.parse(regFrom);
                dateFrom =  Date.from(instant);
            }
            if(regTo!=null&&!regTo.equals("")){
                Instant instant = Instant.parse(regTo);
                dateTo =  Date.from(instant);
            }

            response.setObject(adminService.filterlistTrips(driverTrips, dateFrom, dateTo, phoneDriver, phonePassenger,
                    Status));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/reportAdmin")
    public ResponseEntity<?> reportCompany() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        ReportAdmin reportAdmin = new ReportAdmin();
        try {
            reportAdmin.setCompanyNo(companyService.getAllCompany().size());
            reportAdmin.setDriveNo(driverService.getAllDriver().size());
            reportAdmin.setVehicleNo(vehicleService.getAllVehicle().size());
            reportAdmin.setPassengerNo(riderService.getAllRider().size());
            reportAdmin.setTripNo(promotionTripService.getAllTrip().size());

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(reportAdmin);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("DocumentChangeStatus")
    public ResponseEntity<?> DocumentChangeStatus(@RequestBody DocumentRequest doc) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            Document docExist = documentService.GetDocById(doc.getId());
            if (docExist == null) {
                response.setContent("document not existed");
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);
            }
            docExist.setStatus(doc.getStatus());
            documentService.SaveDocument(docExist);
            response.setObject(docExist);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/GetAllRider")
    public ResponseEntity<?> listRider(String name, String phone, String email) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try {
            List<Rider> list = riderService.getAllRider();
            List<PassengerInfo> passengerInfos = new ArrayList<>();
            for (Rider rider : list
            ) {
                PassengerInfo passengerInfo = new PassengerInfo();
                passengerInfo.setId(rider.getId());
                passengerInfo.setAddress(rider.getHomeAddressID());
                passengerInfo.setLassName(rider.getLastName());
                passengerInfo.setFirstName(rider.getFirstName());
                passengerInfo.setPhone(rider.getMobileNo());
                passengerInfo.setEmail(rider.getEmail());
                try{
                    passengerInfo.setCityId(rider.getCityID());
                }catch (Exception e){
                    System.out.println(e.toString());
                }

                passengerInfos.add(passengerInfo);
            }

            response.setObject(adminService.filterlistRider(passengerInfos, phone, name,email));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/ChangeStatusDriver")
    public ResponseEntity<?> ChangeStatusDriver(@RequestBody ChangeStatus changeStatus) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            Driver driver = driverService.getDriverByID(changeStatus.getId());
            if(driver==null){
                response.setContent("driver not existed");
                return ResponseEntity.badRequest().body(response);
            }
            driver.setStatus(changeStatus.getStatus());
            response.setObject(driverService.SaveDriver(driver));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("/ChangeStatusCompany")
    public ResponseEntity<?> ChangeStatusCompany(@RequestBody ChangeStatus changeStatus) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            Company company = companyService.getCompanyByID(Integer.parseInt(changeStatus.getId()));
            if(company==null){
                response.setContent("company not existed");
                return ResponseEntity.badRequest().body(response);
            }
            company.setStatus(changeStatus.getStatus());
            response.setObject(companyService.SaveCompany(company));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

}


