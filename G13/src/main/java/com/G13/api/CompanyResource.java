package com.G13.api;

import com.G13.File.FileManage;
import com.G13.domain.*;
import com.G13.master.*;
import com.G13.model.*;
import com.G13.repo.*;
import com.G13.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api/company")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor
public class CompanyResource {

    private final CompanyRepository companyRepository;
    private final VehicleRepository vehicleRepository;
    private final DriverRepository driverRepository;
    private final UserServiceImpl userService;
    private final UserRoleRepository userRoleRepository;
    private final DocumentRepository documentRepository;
    private final VehicledocumentRepository vehicledocumentRepository;
    private final PromotiontripRepository promotiontripRepository;
    private final TripRepository tripRepository;
    private final RiderRepository riderRepository;

    @PostMapping("/addVehicle")
    public ResponseEntity<?> AddVehicle(@RequestBody VehicleRequest vr) {
        Date date = new Date();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        CarStatus carStatus = new CarStatus();
        float nofloat = 0;
        short noShort = (short) 0;
        long timeMilli = date.getTime();

        try {
            Vehicle vehicle = new Vehicle();

            vehicle.setCompanyID(companyRepository.findByNote(vr.getCompanyEmail()).getId());
            vehicle.setProduceYear(vr.getProduceYear());
            vehicle.setInteriorColor(vr.getInteriorColor());
            vehicle.setExteriorColor(vr.getExteriorColor());
            vehicle.setPlate(vr.getPlate());
            vehicle.setLisencePlatState(vr.getPlatState());
            vehicle.setLisencePlatCountry(vr.getPlateCountry());
            vehicle.setCarTypeID(vr.getTypeId());
            vehicle.setCreatedBy(vr.getProducer());
            vehicle.setStatus(carStatus.Car_Pending);


            response.setContent("");
            response.setObject(vehicleRepository.saveAndFlush(vehicle));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/editVehicle")
    public ResponseEntity<?> EditVehicle(@RequestBody VehicleRequest vr) {
        Date date = new Date();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        float nofloat = 0;
        short noShort = (short) 0;
        long timeMilli = date.getTime();

        try {

            Vehicle vehicle = vehicleRepository.findById(vr.getId());
            vehicle.setProduceYear(vr.getProduceYear());
            vehicle.setInteriorColor(vr.getInteriorColor());
            vehicle.setExteriorColor(vr.getExteriorColor());
            vehicle.setPlate(vr.getPlate());
            vehicle.setLisencePlatState(vr.getPlatState());
            vehicle.setLisencePlatCountry(vr.getPlateCountry());
            //    vehicle.setCarTypeID(vr.getTypeId());
            vehicle.setCreatedBy(vr.getProducer());


            response.setContent(vehicleRepository.save(vehicle).toString());
            response.setObject(vehicle);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("getVehicle")
    public ResponseEntity<?> getVehicle(String companyEmail, String plate, String status, String typeId) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        UploadFileMaster uploadFileMaster = new UploadFileMaster();
        try {

            Company company = companyRepository.findByNote(companyEmail);
            List<Vehicle> vehicles = vehicleRepository.findByCompanyIDOrderByCreatedDateDesc(company.getId());
            List<VehicleRequest> vehicleRequests = new ArrayList<>();

            for (Vehicle vehicle : vehicles) {
                VehicleRequest vehicleRequest = new VehicleRequest();
                vehicleRequest.setId(vehicle.getId());
                vehicleRequest.setCompanyEmail(companyEmail);
                vehicleRequest.setProducer(vehicle.getCreatedBy());
                vehicleRequest.setProduceYear(vehicle.getProduceYear());
                vehicleRequest.setInteriorColor(vehicle.getInteriorColor());
                vehicleRequest.setExteriorColor(vehicle.getExteriorColor());
                vehicleRequest.setPlate(vehicle.getPlate());
                vehicleRequest.setPlatState(vehicle.getLisencePlatState());
                vehicleRequest.setPlateCountry(vehicle.getLisencePlatCountry());
                vehicleRequest.setTypeId(vehicle.getCarTypeID());
                vehicleRequest.setVehicleStatus(vehicle.getStatus());
                Driver driver = driverRepository.findDriverByCurrentVehicle(vehicle.getId());
                if (driver != null) {
                    vehicleRequest.setDriverEmail(driver.getEmail());
                }
                if (!plate.equals("")) {
                    if (!vehicleRequest.getPlate().contains(plate)) {
                        continue;
                    }
                }
                if (!status.equals("")) {
                    if (!vehicleRequest.getVehicleStatus().contains(status)) {
                        continue;
                    }
                }
                if (!typeId.equals("")) {
                    int id = 0;
                    try {
                        id = Integer.parseInt(typeId);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    if (vehicleRequest.getTypeId() != id) {
                        continue;
                    }
                }
                boolean isHasCNBH = false;
                boolean isHasCNDK = false;
                List<Vehicledocument> vehicledocuments = vehicledocumentRepository.findVehicledocumentsByVehicleidOrderByIdDesc(vehicleRepository.findVehicleById(vehicle.getId()));
                for (Vehicledocument vehicledocument : vehicledocuments) {
                    DocumentRequest doc = new DocumentRequest();
                    FileManage fileManage = new FileManage();
                    Document document = documentRepository
                            .findDocumentById(vehicledocument.getDocumentid().getId());
                    doc.setExpired_month(document.getExpiredMonth());
                    doc.setExpired_year(document.getExpiredYear());
                    doc.setFile_name(document.getFileName());
                    doc.setStatus(document.getStatus());
                    //       doc.setBase64(fileManage.GetBase64FromPath(document.getLink()));
                    doc.setId(document.getId());
                    if (doc.getFile_name().equals(uploadFileMaster.Chung_Nhan_Bao_Hiem) && !isHasCNBH) {
                        isHasCNBH = true;
                        vehicleRequest.setCNBH(doc);
                    }
                    if (doc.getFile_name().equals(uploadFileMaster.Chung_Nhan_Dang_Kiem) && !isHasCNDK) {
                        isHasCNDK = true;
                        vehicleRequest.setCNDK(doc);
                    }
                }

                vehicleRequests.add(vehicleRequest);
            }

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(vehicleRequests);

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("getDocument")
    public ResponseEntity<?> getVehicle(String docId) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            int id = Integer.parseInt(docId);
            DocumentRequest doc = new DocumentRequest();
            FileManage fileManage = new FileManage();
            Document document = documentRepository
                    .findDocumentById(id);
            doc.setExpired_month(document.getExpiredMonth());
            doc.setExpired_year(document.getExpiredYear());
            doc.setFile_name(document.getFileName());
            doc.setStatus(document.getStatus());
            doc.setBase64(fileManage.GetBase64FromPath(document.getLink()));
            doc.setId(document.getId());


            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(doc);

            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/deleteVehicle")
    public ResponseEntity<?> deleteVehicle(@RequestBody VehicleRequest vehicleRequest) {

        int id = vehicleRequest.getId();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Vehicle vehicle = vehicleRepository.findById(id);
            if (vehicle == null) {
                response.setStatus(masterStatus.FAILURE);
                response.setObject("driver not existed!");
                return ResponseEntity.badRequest().body(response);
            }
            vehicleRepository.delete(vehicle);
            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(vehicle);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/RegisterDriver")
    public ResponseEntity<?> RegisterDriver(@RequestBody RegisterDriverCompany rd) {
        Date date = new Date();
        Instant timeStamp = Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        DriverStatus driverStatus = new DriverStatus();
        float nofloat = 0;
        short noShort = (short) 0;

        if (IsEmailExisted(rd.getEmail())) {

            Map<String, Boolean> err = new HashMap<>();
            err.put("IsExistedEmail", true);
            response.setObject(err);
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
        try {
            Driver driver = new Driver();
            Company company = companyRepository.findByNote(rd.getCompanyEmail());
            driver.setCompanyID(company.getId());
            driver.setCompanyName(company.getName());
            driver.setId(rd.getEmail());
            driver.setLanguageCode("vi");
            driver.setDriverCode("DR");
            driver.setEmail(rd.getEmail());
            driver.setFirstName(rd.getFirstName());
            driver.setLastName(rd.getLastName());
            driver.setMobileNo(rd.getPhoneNumber());
            driver.setLanguageCode(rd.getLanguage());
            driver.setCountryCode(rd.getCountry());
            driver.setBranchCityId(rd.getCityId());
            driver.setStatus(driverStatus.NEW);
            driverRepository.save(driver);
            User u = new User();
            u.setEmail(rd.getEmail());
            u.setPassword(rd.getPassword());
            User usersave = userService.saveUser(u);
            UserRole userRole = new UserRole();
            userRole.setUserId(new Long(usersave.getId()));
            userRole.setRoleId(new Long(1));
            userRoleRepository.save(userRole);
            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(driver);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/editDriver")
    public ResponseEntity<?> editDriver(@RequestBody RegisterDriverCompany rd) {
        Date date = new Date();
        Instant timeStamp = Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat = 0;
        short noShort = (short) 0;
        try {
            Driver driver = driverRepository.findByEmail(rd.getEmail());
            driver.setLanguageCode("vi");
            driver.setDriverCode("DR");
            driver.setFirstName(rd.getFirstName());
            driver.setLastName(rd.getLastName());
            driver.setMobileNo(rd.getPhoneNumber());
            driver.setLanguageCode(rd.getLanguage());
            driver.setCountryCode(rd.getCountry());
            driver.setBranchCityId(rd.getCityId());
            driverRepository.save(driver);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(driver);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/setDriverVehicle")
    public ResponseEntity<?> setDriverVehicle(@RequestBody RegisterDriverCompany rd) {
        Date date = new Date();
        Instant timeStamp = Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat = 0;
        short noShort = (short) 0;
        try {
            Driver driver = driverRepository.findByEmail(rd.getEmail());
            if (driver == null) {
                response.setContent("driver not existed");
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);
            }
            Vehicle vehicle = new Vehicle();
            try {
                if (rd.getVehicle() != 0) {
                    vehicle = vehicleRepository.findById(rd.getVehicle());
                    vehicle.setStatus("US");
                    vehicleRepository.save(vehicle);
                } else {
                    vehicle = vehicleRepository.findById(rd.getRemoveVehicleId());
                    vehicle.setStatus("PE");
                    vehicleRepository.save(vehicle);
                }
            } catch (Exception e) {
            }

            driver.setCurrentVehicle(rd.getVehicle());
            driver.setDeviceType("N/A");
            driverRepository.save(driver);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(driver);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/deleteDriver")
    public ResponseEntity<?> deleteDriver(@RequestBody RegisterDriverCompany driverRequest) {

        String email = driverRequest.getDriverID();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Driver driver = driverRepository.findByEmailOrderByCreatedDateDesc(email);
            if (driver == null) {
                response.setStatus(masterStatus.FAILURE);
                response.setObject("driver not existed!");
                return ResponseEntity.badRequest().body(response);
            }
            driverRepository.delete(driver);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(driver);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/GetDriver")
    public ResponseEntity<?> getDriver(String companyEmail, String status, String email, String name, String city) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Company company = companyRepository.findByNote(companyEmail);
            List<Driver> drivers = driverRepository.findDriversByCompanyID(company.getId());
            List<RegisterDriverCompany> registerDriverCompanies = new ArrayList<>();

            for (Driver driver : drivers) {
                RegisterDriverCompany r = new RegisterDriverCompany();
                r.setCompanyEmail(companyEmail);
                r.setEmail(driver.getEmail());
                r.setFirstName(driver.getFirstName());
                r.setLastName(driver.getLastName());
                r.setPhoneNumber(driver.getMobileNo());
                r.setLanguage(driver.getLanguageCode());
                r.setCountry(driver.getCountryCode());
                r.setDriverID(driver.getId());
                r.setCompanyName(driver.getCompanyName());
                r.setStatus(driver.getStatus());
                try {
                    r.setCityId(driver.getBranchCityId());
                } catch (Exception e) {
                }
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
                    System.out.println(e.toString());
                }

                registerDriverCompanies.add(r);
            }

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(filterDriverCompany(registerDriverCompanies, status, email, name, city));
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    List<RegisterDriverCompany> filterDriverCompany(List<RegisterDriverCompany> list, String status, String email, String name, String city) {
        List<RegisterDriverCompany> listResult = new ArrayList<>();
        for (RegisterDriverCompany r : list) {

            if (!status.equals("")) {
                if (!r.getStatus().contains(status)) {
                    continue;
                }
            }
            if (!email.equals("")) {
                if (!r.getEmail().contains(email)) {
                    continue;
                }
            }
            if (!name.equals("")) {
                if (!r.getFirstName().contains(name) && !r.getLastName().contains(name)) {
                    continue;
                }
            }
            if (!city.equals("")) {
                int cityid = 0;
                try {
                    cityid = Integer.parseInt(city);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                if (r.getCityId() != cityid) {
                    continue;
                }
            }

            listResult.add(r);
        }
        return listResult;
    }

    @PostMapping("/listTrip")
    public ResponseEntity<?> listTrip(@RequestBody filterTripPassenger filter) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            List<Driver> driverList = driverRepository.findDriversByCompanyID(filter.companyID);
            List<TripDriver> driverTrips = new ArrayList<>();
            for (Driver d : driverList) {
                List<Promotiontrip> list = promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc(d.getEmail());
                for (Promotiontrip detail : list) {
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
                    Driver driver = driverRepository.findByEmail(tripDriver.getDriverEmail());
                    Vehicle vehicle = vehicleRepository.findVehicleById(driver.getCurrentVehicle());
                    if (vehicle != null) {
                        tripDriver.setVehiclePlate(vehicle.getPlate());
                        tripDriver.setVehicleColor(vehicle.getExteriorColor());
                        tripDriver.setVehicleName(vehicle.getCreatedBy());
                    }
                    driverTrips.add(tripDriver);
                }
            }

            driverTrips = filterTripDriver(driverTrips, filter);

            response.setObject(driverTrips);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    List<TripDriver> filterTripDriver(List<TripDriver> tripDriver, filterTripPassenger filter) {
        List<TripDriver> listResult = new ArrayList<>();
        for (TripDriver t : tripDriver
        ) {
            if (filter.status != null && !filter.status.equals("")) {
                if (!filter.status.equals(t.getStatus())) {
                    continue;
                }
            }
            if (filter.dateFrom != null) {
                if (filter.dateFrom.compareTo(t.getTimeStart()) >= 0) {
                    continue;
                }
            }
            if (filter.dateTo != null) {
                if (filter.dateTo.compareTo(t.getTimeStart()) <= 0) {
                    continue;
                }
            }
            if (filter.passengerEmail != null && !filter.passengerEmail.equals("")) {
                List<Trip> listRegister = tripRepository.findAllByTripCodeOrderByCreatedDateDesc(t.getTripID());
                boolean isHasPassenger = false;
                for (Trip trip : listRegister) {
                    if (trip.getRiderID().equals(filter.passengerEmail)) {
                        isHasPassenger = true;
                    }
                }
                if (isHasPassenger == false) {
                    continue;
                }
            }
            listResult.add(t);
        }

        return listResult;
    }

    public boolean IsEmailExisted(String email) {
        return userService.IsEmailExisted(email);
    }

    @GetMapping("/detail")
    public ResponseEntity<?> CompanyDetail(String companyEmail) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            Company c = companyRepository.findByNote(companyEmail);

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
            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(companyInfo);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/reportCompany")
    public ResponseEntity<?> reportCompany(int companyId) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        CarStatus carStatus = new CarStatus();
        try {
            ReportCompany reportCompany = new ReportCompany();
            List<Driver> driverList = driverRepository.findDriversByCompanyID(companyId);
            List<Driver> driverListNoVehicle = driverRepository.findDriversByCompanyIDAndCurrentVehicle(companyId,0);
            List<Vehicle> vehicleList = vehicleRepository.findByCompanyIDOrderByCreatedDateDesc(companyId);
            List<Vehicle> vehicleNoDriver = vehicleRepository.findByCompanyIDAndStatus(companyId,carStatus.Car_Pending);


            int Trip=0;
            int TripOpen=0;
            int TripClose=0;
            int TripCancel=0;
            for (Driver d : driverList) {
                List<Promotiontrip> promotiontripList = promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc(d.getId());
                for (Promotiontrip p:promotiontripList) {
                    Trip++;
                    if(p.getStatus().equals(masterTripStatus.TRIP_OPEN)){
                        TripOpen++;
                    }
                    if(p.getStatus().equals(masterTripStatus.TRIP_CANCEL)){
                        TripCancel++;
                    }
                    if(p.getStatus().equals(masterTripStatus.TRIP_CLOSE)){
                        TripClose++;
                    }
                }
            }



            reportCompany.setDriverNo(driverList.size());
            reportCompany.setVehicleNo(vehicleList.size());
            reportCompany.setTripOpenNo(TripOpen);
            reportCompany.setTripNo(Trip);
            reportCompany.setTripClose(TripClose);
            reportCompany.setTripCancel(TripCancel);
            reportCompany.setVehicleNoDriver(vehicleNoDriver.size());
            reportCompany.setDriverNoVehicle(driverListNoVehicle.size());

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(reportCompany);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/changeInfo")
    public ResponseEntity<?> changeInfoCompany(@RequestBody CompanyInfo companyInfo){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            Company company = companyRepository.findCompanyById(companyInfo.getCompanyId());

            commonFuntion commonFuntion = new commonFuntion();
            if(commonFuntion.IsPhoneExisted(companyInfo.getPhone(),riderRepository,driverRepository,companyRepository)
            &&!company.getPhoneNo().equals(companyInfo.getPhone())){
                Map<String,Boolean> err = new HashMap<>();
                err.put("IsExistedPhone",true);
                response.setObject(err);
                response.setStatus(masterStatus.FAILURE);
                return ResponseEntity.badRequest().body(response);
            }
            company.setAddressID(companyInfo.getCompanyAddress());
            company.setCityID(companyInfo.getCityId());
            company.setPhoneNo(companyInfo.getPhone());
            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(companyRepository.saveAndFlush(company));
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }
}


