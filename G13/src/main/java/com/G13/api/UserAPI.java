package com.G13.api;


import com.G13.domain.*;
import com.G13.master.*;
import com.G13.modelDto.*;
import com.G13.repository.*;
import com.G13.service.*;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import static java.util.Arrays.stream;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserAPI {

    private final UserService userService;
    private final CompanyService companyService;
    private final RiderService riderService;
    private final DocumentRepository documentRepository;
    private final VerifyAccountService verifyAccountService;
    private final PromotionTripService tripDriverService;
    private final DriverService driverService;
    private final CityService cityService;
    private final VehicleService vehicleService;
    private final CommonService commonService;
    private final FileService fileService;

    @GetMapping("user/info")
    public ResponseEntity<?> getUserInfo(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail(username);
        userInfo.setUsername(username);
        User user = new User();
        user = userService.getUserByEmail(username);
        UploadFileMaster uploadFileMaster = new UploadFileMaster();
        Document document = documentRepository
                .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(username, uploadFileMaster.avatar);

        if (document != null) {
            userInfo.setAvatarBase64(fileService.GetBase64FromPath(document.getLink()));
            userInfo.setEmail(username);
        }
        Driver driver = driverService.getDriverByEmail(username);
        if (driver != null) {
            userInfo.setFirstname(driver.getFirstName());
            userInfo.setLastname(driver.getLastName());
            userInfo.setAddress(driver.getAddressID());
            userInfo.setPhone(driver.getMobileNo());
            userInfo.setCountry(driver.getCountryCode());
            userInfo.setRole("ROLE_DRIVER");
            userInfo.setStatusDriver(driver.getStatus());
            try {
                userInfo.setCompanyId(driver.getCompanyID());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                userInfo.setCityId(driver.getBranchCityId());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
                if (vehicle != null) {
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
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        Rider rider = riderService.getRiderByEmail(username);
        ;
        if (rider != null) {
            userInfo.setFirstname(rider.getFirstName());
            userInfo.setLastname(rider.getLastName());
            userInfo.setAddress(rider.getHomeAddressID());
            userInfo.setPhone(rider.getMobileNo());
            userInfo.setCountry(rider.getCountryCode());
            userInfo.setUsername(rider.getEmail());
            userInfo.setEmail(rider.getEmail());
            userInfo.setRole("ROLE_PASSENGER");
            try {
                userInfo.setCityId(rider.getCityID());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        Company company = companyService.getCompanyByEmail(username);
        if (company != null) {
            userInfo.setFirstname(company.getName());
            userInfo.setAddress(company.getAddressID());
            userInfo.setPhone(company.getPhoneNo());
            userInfo.setUsername(company.getNote());
            userInfo.setEmail(company.getNote());
            userInfo.setRole("ROLE_COMPANY");
            userInfo.setCompanyId(company.getId());
            userInfo.setStatusCompany(company.getStatus());
            try {
                userInfo.setCityId(company.getCityID());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                Vehicle vehicle = vehicleService.getFistVehicleByCompanyId(company.getId());
                if (vehicle != null) {
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
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        if (user.getEmail().equals("admin")) {
            userInfo.setRole("ROLE_ADMIN");
        }

        Verifyaccount verifyaccount = verifyAccountService.getVerifyAccountByUserId(user.getId());
        if (verifyaccount != null) {
            userInfo.setStatusVerify(verifyaccount.getStatus());
        }
        return ResponseEntity.ok().body(userInfo);
    }

    @PostMapping("user/changePassword")

    public ResponseEntity<?> changePassword(@RequestBody UserChangePassword user) {

        ResopnseContent response = new ResopnseContent();
        try {
            if (userService.changePassword(user)) {
                return ResponseEntity.ok().body(response);
            } else {
                return ResponseEntity.badRequest().body(response);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(response);
        }


    }

    @GetMapping("/token/refresh")
    public void refreshToken(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String authorizationHeader = httpServletRequest.getHeader(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
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
                        .withExpiresAt(new Date(System.currentTimeMillis() + 30 * 60 * 1000))
                        .withClaim("roles", role.getName())
                        .sign(algorithm);
                Map<String, String> tokens = new HashMap<>();
                tokens.put("access_token", access_token);
                tokens.put("refresh_token", refresh_token);
                httpServletResponse.setContentType(APPLICATION_JSON_VALUE);

                new ObjectMapper().writeValue(httpServletResponse.getOutputStream(), tokens);

            } catch (Exception exception) {
                httpServletResponse.setHeader("error", exception.getMessage());
                httpServletResponse.setStatus(FORBIDDEN.value());
                //  response.sendError(FORBIDDEN.value());
                Map<String, String> error = new HashMap<>();
                error.put("error_message", exception.getMessage());
                httpServletResponse.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(httpServletResponse.getOutputStream(), error);
            }
        } else {
            throw new RuntimeException("Refresh token is missing");
        }
    }

    @GetMapping("/city")
    public ResponseEntity<?> getcity() {
        List<Cityname> list = cityService.getListCity();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/GetTop10Trip")
    public ResponseEntity<?> Top10Trip() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        List<Promotiontrip> list = tripDriverService.getTop10TripOpen();
        try {
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

                driverTrips.add(tripDriver);
            }
            response.setObject(driverTrips);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("ForgotPassword")
    public ResponseEntity<?> ForgotPassword(String email) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            if (email.equals("admin")) {
                return ResponseEntity.badRequest().body(response);
            }

            User user = userService.getUser(email);
            String newPassword = commonService.generatePassword(8);
            user.setPassword(newPassword);
            userService.saveUser(user);
            MailAPI mailAPI = new MailAPI();
            mailAPI.ForgotPasswor(user.getEmail(), newPassword);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/autoGenUser")
    public void autoGenerateUser() {
        MasterRole m = new MasterRole();
//        userService.saveRole(new Role(m.ROLE_DRIVER));
//        userService.saveRole(new Role(m.ROLE_PASSENGER));
//        userService.saveRole(new Role(m.ROLE_COMPANY));
//        userService.saveRole(new Role(m.ROLE_ADMIN));

//        userService.saveUser(new User("hoan", "hoan"));
//        userService.saveUser(new User("hoan1", "hoan1"));
//        userService.saveUser(new User("hoan2", "hoan2"));
        userService.saveUser(new User("admin", "admin"));

//        userService.addRoleToUser("hoan", m.ROLE_DRIVER);
//        userService.addRoleToUser("hoan1", m.ROLE_PASSENGER);
//        userService.addRoleToUser("hoan2", m.ROLE_COMPANY);
        userService.addRoleToUser("admin", m.ROLE_ADMIN);
    }
}


