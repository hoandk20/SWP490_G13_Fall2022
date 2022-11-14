package com.G13.api;

import com.G13.domain.*;
import com.G13.master.CarStatus;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.model.RegisterDriverCompany;
import com.G13.model.VehicleRequest;
import com.G13.repo.CompanyRepository;
import com.G13.repo.DriverRepository;
import com.G13.repo.UserRoleRepository;
import com.G13.repo.VehicleRepository;
import com.G13.service.UserServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api/company")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class CompanyResource {

    private final CompanyRepository companyRepository;
    private final VehicleRepository vehicleRepository;
    private final DriverRepository driverRepository;
    private final UserServiceImpl userService;
    private final UserRoleRepository userRoleRepository;
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


            response.content= vehicleRepository.save(vehicle).toString();
            response.object=vehicle;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @PostMapping("/editVehicle")
    public ResponseEntity<?> EditVehicle (@RequestBody VehicleRequest vr) {
        Date date = new Date();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        float nofloat =0;
        short noShort = (short)0;
        long timeMilli = date.getTime();

        try {

            Vehicle vehicle  = vehicleRepository.findById(vr.getId());
            vehicle.setProduceYear(vr.getProduceYear());
            vehicle.setInteriorColor(vr.getInteriorColor());
            vehicle.setExteriorColor(vr.getExteriorColor());
            vehicle.setPlate(vr.getPlate());
            vehicle.setLisencePlatState(vr.getPlatState());
            vehicle.setLisencePlatCountry(vr.getPlateCountry());
            vehicle.setCarTypeID(vr.getTypeId());
            vehicle.setCreatedBy(vr.getProducer());


            response.content= vehicleRepository.save(vehicle).toString();
            response.object=vehicle;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @GetMapping("getVehicle")
    public ResponseEntity<?> getVehicle (String companyEmail){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Company company=companyRepository.findByNote(companyEmail);
            List<Vehicle> vehicles = vehicleRepository.findByCompanyIDOrderByCreatedDateDesc(company.getId());
            List<VehicleRequest> vehicleRequests = new ArrayList<>();

            for (Vehicle vehicle:vehicles) {
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
                vehicleRequests.add(vehicleRequest);
            }

            response.status = masterStatus.SUCCESSFULL;
            response.object = vehicleRequests;

            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("/deleteVehicle")
    public ResponseEntity<?> deleteVehicle(@RequestBody VehicleRequest vehicleRequest){

        int id = vehicleRequest.getId();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Vehicle vehicle  = vehicleRepository.findById(id);
            if(vehicle==null){
                response.setStatus(masterStatus.FAILURE);
                response.object = "driver not existed!";
                return ResponseEntity.badRequest().body(response);
            }
            vehicleRepository.delete(vehicle);
            response.setStatus(masterStatus.SUCCESSFULL);
            response.object = vehicle;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/RegisterDriver")
    public  ResponseEntity<?> RegisterDriver(@RequestBody RegisterDriverCompany rd){
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
            response.object = driver;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @PostMapping("/editDriver")
    public  ResponseEntity<?> editDriver(@RequestBody RegisterDriverCompany rd){
        Date date = new Date();
        Instant timeStamp= Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat =0;
        short noShort = (short)0;
        try {
            Driver driver  = driverRepository.findByEmail(rd.getEmail());
            driver.setLanguageCode("vi");
            driver.setDriverCode("DR");
            driver.setFirstName(rd.getFirstName());
            driver.setLastName(rd.getLastName());
            driver.setMobileNo(rd.getPhoneNumber());
            driver.setLanguageCode(rd.getLanguage());
            driver.setCountryCode(rd.getCountry());
            driverRepository.save(driver);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.object = driver;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @PostMapping("/setDriverVehicle")
    public  ResponseEntity<?> setDriverVehicle(@RequestBody RegisterDriverCompany rd){
        Date date = new Date();
        Instant timeStamp= Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat =0;
        short noShort = (short)0;
        try {
            Driver driver  = driverRepository.findByEmail(rd.getEmail());
            if(driver==null){
                response.content="driver not existed";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
            Vehicle vehicle = vehicleRepository.findById(rd.getVehicle());

            driver.setCurrentVehicle(rd.getVehicle());
            driver.setDeviceType("N/A");
            driverRepository.save(driver);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.object = driver;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
    @PostMapping("/deleteDriver")
    public ResponseEntity<?> deleteDriver(@RequestBody RegisterDriverCompany driverRequest){

        String email = driverRequest.getDriverID();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Driver driver  = driverRepository.findByEmailOrderByCreatedDateDesc(email);
            if(driver==null){
                response.setStatus(masterStatus.FAILURE);
                response.object = "driver not existed!";
                return ResponseEntity.badRequest().body(response);
            }
            driverRepository.delete(driver);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.object = driver;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @GetMapping("/GetDriver")
    public ResponseEntity<?> getDriver( String companyEmail){
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            Company company=companyRepository.findByNote(companyEmail);
            List<Driver> drivers = driverRepository.findDriversByCompanyID(company.getId());
            List<RegisterDriverCompany> registerDriverCompanies = new ArrayList<>();

            for (Driver driver:drivers) {
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
                registerDriverCompanies.add(r);
            }

            response.status = masterStatus.SUCCESSFULL;
            response.object = registerDriverCompanies;

            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content=exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    public boolean IsEmailExisted(String email){
        return userService.IsEmailExisted(email);
    }


}


