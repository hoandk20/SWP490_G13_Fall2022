package com.G13.api;

import com.G13.domain.*;
import com.G13.master.MasterStatus;
import com.G13.model.*;
import com.G13.repo.*;
import com.G13.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor
public class AdminResource {
    private final DriverService driverService;
    private final TripService tripService;
    private final CompanyService companyService;
    private final PromotionTripService promotionTripService;

    private final DocumentService documentService;
    private final VehicleService vehicleService;
    private final RiderService riderService;
    private final AdminService adminService;

    @GetMapping("/GetDrivers")
    public ResponseEntity<?> getDrivers(Date regFrom, Date regTo, String phone, String driverName, String email,
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

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(adminService.filterListDriverCompany(registerDriverCompanies, regFrom, regTo, phone,
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
                companyInfo.setCompanyStatus(c.getStatus());
                companyInfo.setCreateDate(c.getCreatedDate());
                companyInfo.setCompanyAddress(c.getAddressID());
                companyInfo.setEmail(c.getNote());
                companyInfo.setPhone(c.getPhoneNo());
                companyInfo.setCompanyName(c.getName());
                companyInfos.add(companyInfo);
            }

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(filterListCompany(companyInfos, regFrom, regTo, companyName, email, Status, city));

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    List<CompanyInfo> filterListCompany(List<CompanyInfo> list, String regFrom, String regTo, String companyName, String email, String Status, String city) {


        List<CompanyInfo> listResult = list;
        if (regFrom.equals(regTo) && !regFrom.equals("")) {
            try {
                listResult = listResult.stream().filter(c -> c.getCreateDate().equals(Instant.parse(regFrom))).collect(toList());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } else {
            if (!regFrom.equals("")) {
                try {
                    listResult = listResult.stream().filter(c -> c.getCreateDate().isAfter(Instant.parse(regFrom))).collect(toList());
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            if (!regTo.equals("")) {
                try {
                    listResult = listResult.stream().filter(c -> c.getCreateDate().isAfter(Instant.parse(regTo))).collect(toList());
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }


        if (!companyName.equals("")) {
            listResult = listResult.stream().filter(c -> c.getCompanyName().contains(companyName)).collect(toList());
        }
        if (!email.equals("")) {
            listResult = listResult.stream().filter(c -> c.getEmail().contains(email)).collect(toList());

        }
        if (!Status.equals("")) {
            listResult = listResult.stream().filter(c -> c.getCompanyStatus().contains(Status)).collect(toList());

        }
        if (!city.equals("")) {
            listResult = listResult.stream().filter(c -> c.getCompanyAddress().contains(city)).collect(toList());

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

            response.setObject(adminService.filterlistTrips(driverTrips, regFrom, regTo, phoneDriver, phonePassenger,
                    Status));
            response.setStatus(masterStatus.SUCCESSFULL);
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


}


