package com.G13.api;


import com.G13.File.FileManage;
import com.G13.domain.*;
import com.G13.master.*;
import com.G13.model.*;
import com.G13.repo.*;
import com.G13.service.UserService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.util.*;

import static java.util.Arrays.stream;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NoRole {

    private final UserService userService;

    private final RoleRepository roleRepository;
    UserDetailsService userDetailsService;
    private final UserRepository userRepository;
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    private final RiderRepository riderRepository;
    private final DocumentRepository documentRepository;
    private  final VerifyaccountRepository verifyaccountRepository;
    private final VehicleRepository vehicleRepository;
    private final CitynameRepository citynameRepository;
    private final PromotiontripRepository promotiontripRepository;
    @GetMapping("/checkEmailExist")
    public ResponseEntity<?> checkEmailExisted(String email){
        boolean IsExisted = userService.IsEmailExisted(email);
        Map<String,String> res = new HashMap<>();
        res.put("IsExisted",IsExisted?"true":"false");
        return ResponseEntity.ok().body(res);
    }


    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @GetMapping("user/info")

    public ResponseEntity<?> getUserInfo(String username){
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail(username);
        userInfo.setUsername(username);
        User user = new User();
        user = userRepository.findByEmail(username);
        UploadFileMaster uploadFileMaster = new UploadFileMaster();
        Document document = documentRepository
                .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(username,uploadFileMaster.avatar);

        if(document!=null){
            FileManage fileManage = new FileManage();
            userInfo.setAvatarBase64(fileManage.GetBase64FromPath(document.getLink()));
            userInfo.setEmail(username);
        }


        Driver driver = driverRepository.findByEmailOrderByCreatedDateDesc(username);
        if(driver!=null){
            userInfo.setFirstname(driver.getFirstName());
            userInfo.setLastname(driver.getLastName());
            userInfo.setAddress(driver.getAddressID());
            userInfo.setPhone(driver.getMobileNo());
            userInfo.setCountry(driver.getCountryCode());
            userInfo.setRole("ROLE_DRIVER");

            userInfo.setCompanyId(driver.getCompanyID());
            try{
                Vehicle vehicle = vehicleRepository.findVehicleById(driver.getCurrentVehicle());
                if(vehicle!=null){
                    VehicleRequest vehicleRequest = new VehicleRequest();
                    vehicleRequest.setId(vehicle.getId());
                    vehicleRequest.setCompanyEmail("");
                    vehicleRequest.setProducer(vehicle.getCreatedBy());
                    vehicleRequest.setProduceYear(vehicle.getProduceYear());
                    vehicleRequest.setInteriorColor(vehicle.getInteriorColor());
                    vehicleRequest.setExteriorColor(vehicle.getExteriorColor());
                    vehicleRequest.setPlate(vehicle.getPlate());
                    vehicleRequest.setPlatState(vehicle.getLisencePlatState());
                    vehicleRequest.setPlateCountry(vehicle.getLisencePlatCountry());
                    vehicleRequest.setTypeId(vehicle.getCarTypeID());
                    userInfo.setVehicleRequest(vehicleRequest);
                }
            }catch (Exception e){

            }
        }
        Rider rider = riderRepository.findByEmail(username);
        if(rider!=null){
            userInfo.setFirstname(rider.getFirstName());
            userInfo.setLastname(rider.getLastName());
            userInfo.setAddress(rider.getHomeAddressID());
            userInfo.setPhone(rider.getMobileNo());
            userInfo.setCountry(rider.getCountryCode());
            userInfo.setUsername(rider.getEmail());
            userInfo.setEmail(rider.getEmail());
            userInfo.setRole("ROLE_PASSENGER");
        }
        Company company = companyRepository.findByNote(username);
        if(company!=null){
            userInfo.setFirstname(company.getName());
            userInfo.setAddress(company.getAddressID());
            userInfo.setPhone(company.getPhoneNo());
            userInfo.setUsername(company.getNote());
            userInfo.setEmail(company.getNote());
            userInfo.setRole("ROLE_COMPANY");
            try{
                Vehicle vehicle = vehicleRepository.findFirstByOrderByCreatedDateDesc();
                if(vehicle!=null){
                    VehicleRequest vehicleRequest = new VehicleRequest();
                    vehicleRequest.setId(vehicle.getId());
                    vehicleRequest.setCompanyEmail("");
                    vehicleRequest.setProducer(vehicle.getCreatedBy());
                    vehicleRequest.setProduceYear(vehicle.getProduceYear());
                    vehicleRequest.setInteriorColor(vehicle.getInteriorColor());
                    vehicleRequest.setExteriorColor(vehicle.getExteriorColor());
                    vehicleRequest.setPlate(vehicle.getPlate());
                    vehicleRequest.setPlatState(vehicle.getLisencePlatState());
                    vehicleRequest.setPlateCountry(vehicle.getLisencePlatCountry());
                    vehicleRequest.setTypeId(vehicle.getCarTypeID());
                    userInfo.setVehicleRequest(vehicleRequest);
                }
            }catch (Exception e){

            }
        }


        Verifyaccount verifyaccount = verifyaccountRepository.findVerifyaccountByUseridOrderByExpiredateDesc(user.getId());
        if(verifyaccount!=null){
            userInfo.setStatusVerify(verifyaccount.getStatus());
        }
        return ResponseEntity.ok().body(userInfo);
    }

    @PostMapping("user/changeinfoDriver")
    public ResponseEntity<?> changeDriver(@RequestBody UserInfo userInfo){
        Driver driver = driverRepository.findByEmail(userInfo.getUsername());
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            if(driver!=null){
                driver.setFirstName(userInfo.getFirstname());
                driver.setLastName(userInfo.getLastname());
                driver.setAddressID(userInfo.getAddress());
                driver.setMobileNo(userInfo.getPhone());
                driver.setCountryCode(userInfo.getCountry());

                response.status = masterStatus.SUCCESSFULL;
                response.object = driverRepository.save(driver);
                return ResponseEntity.ok().body(response);
            }else{
                response.content = "driver not existed";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
        }catch (Exception e){
            response.content= e.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("user/changeinfoPassenger")
    public ResponseEntity<?> changePassenger(@RequestBody UserInfo userInfo){
        Rider rider = riderRepository.findByEmail(userInfo.getUsername());
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            if(rider!=null){
                rider.setFirstName(userInfo.getFirstname());
                rider.setLastName(userInfo.getLastname());
                rider.setHomeAddressID(userInfo.getAddress());
                rider.setMobileNo(userInfo.getPhone());
                rider.setHomeAddressID(userInfo.getAddress());
                rider.setCountryCode(userInfo.getCountry());
                response.status = masterStatus.SUCCESSFULL;
                response.object = riderRepository.save(rider);
                return ResponseEntity.ok().body(response);
            }else{
                response.content = "passenger not existed";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
        }catch (Exception e){
            response.content= e.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("user/changePassword")

    public ResponseEntity<?> changePassword(@RequestBody UserChangePassword user){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            User userExisted = userService.getUser(user.getEmail());
            if(!userService.combinePassword(user.getOldPassword(),userExisted.getPassword())){
                response.content=  "old password is invalid!";
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }
            userExisted.setPassword(user.getNewPassword());
            userService.saveUser(userExisted);
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception e){
            response.content= e.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }


    }
    @PostMapping("/role/AddToUser")
    public ResponseEntity<?> saveRole(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/token/refresh")
    public void refreshToken(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String authorizationHeader = httpServletRequest.getHeader(HttpHeaders.AUTHORIZATION);
        if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer ")){
            try {
                String refresh_token = authorizationHeader.substring("Bearer ".length());
                Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT = verifier.verify(refresh_token);
                String username = decodedJWT.getSubject();
                User user = userService.getUser(username);


                Role role = userService.GetRoleByUser(username);
                String access_token = JWT.create()
                        .withSubject(user.getEmail())
                        .withExpiresAt(new Date(System.currentTimeMillis()+30*60*1000))
                        .withClaim("roles",role.getName())
                        .sign(algorithm);
                Map<String, String> tokens = new HashMap<>();
                tokens.put("access_token",access_token);
                tokens.put("refresh_token",refresh_token);
                httpServletResponse.setContentType(APPLICATION_JSON_VALUE);

                new ObjectMapper().writeValue(httpServletResponse.getOutputStream(),tokens);

            }catch (Exception exception){
                httpServletResponse.setHeader("error",exception.getMessage());
                httpServletResponse.setStatus(FORBIDDEN.value());
                //  response.sendError(FORBIDDEN.value());
                Map<String, String> error = new HashMap<>();
                error.put("error_message",exception.getMessage());
                httpServletResponse.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(httpServletResponse.getOutputStream(),error);
            }
        }else{
            throw new RuntimeException("Refresh token is missing");
        }
    }

    @GetMapping("/autoGenUser")
    public void autoGenerateUser() {
        MasterRole m = new MasterRole();
        userService.saveRole(new Role(m.ROLE_DRIVER));
        userService.saveRole(new Role(m.ROLE_PASSENGER));
        userService.saveRole(new Role(m.ROLE_COMPANY));
        userService.saveRole(new Role(m.ROLE_ADMIN));

        userService.saveUser(new User("hoan", "hoan"));
        userService.saveUser(new User("hoan1", "hoan1"));
        userService.saveUser(new User("hoan2", "hoan2"));
        userService.saveUser(new User("hoan3", "hoan3"));

        userService.addRoleToUser("hoan", m.ROLE_DRIVER);
        userService.addRoleToUser("hoan1", m.ROLE_PASSENGER);
        userService.addRoleToUser("hoan2", m.ROLE_COMPANY);
        userService.addRoleToUser("hoan3", m.ROLE_ADMIN);
    }

    @GetMapping("/city")
    public ResponseEntity<?> getcity(){
       List<Cityname> list = citynameRepository.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/GetTop10Trip")
    public ResponseEntity<?> Top10Trip() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        try {
            List<Promotiontrip> list = promotiontripRepository.findTop10ByStatusOrderByCreatedDateDesc(masterTripStatus.TRIP_OPEN);
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
                Driver driver = driverRepository.findDriverById(detail.getDriverID());
                if (driver != null) {
                    tripDriver.setPhoneDriver(driver.getMobileNo());
                }

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
}


