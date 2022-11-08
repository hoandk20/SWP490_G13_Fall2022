package com.G13.api;


import antlr.Token;
import com.G13.File.FileManage;
import com.G13.domain.*;
import com.G13.master.MasterRole;
import com.G13.master.MasterStatus;
import com.G13.master.UploadFileMaster;
import com.G13.repo.*;
import com.G13.service.UserService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.source.tree.TryTree;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.nio.file.attribute.UserPrincipal;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResouce {

    private final UserService userService;

    private final RoleRepository roleRepository;
    UserDetailsService userDetailsService;
    private final UserRepository userRepository;
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    private final RiderRepository riderRepository;
    private final DocumentRepository documentRepository;

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
        User user = new User();
        user = userRepository.findByEmail(username);
        UploadFileMaster uploadFileMaster = new UploadFileMaster();
        Document document = documentRepository
                .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(username,uploadFileMaster.avatar);

        if(document!=null){
            FileManage fileManage = new FileManage();
            userInfo.avatarBase64 = fileManage.GetBase64FromPath(document.getLink());
            userInfo.email = username;
        }


        Driver driver = driverRepository.findByEmailOrderByCreatedDateDesc(username);
        if(driver!=null){
            userInfo.firstname = driver.getFirstName();
            userInfo.lastname = driver.getLastName();
            userInfo.address = driver.getAddressID();
            userInfo.phone = driver.getMobileNo();
            userInfo.country = driver.getCountryCode();

        }
        Rider rider = riderRepository.findByEmail(username);
        if(rider!=null){
            userInfo.firstname = rider.getFirstName();
            userInfo.lastname = rider.getLastName();
            userInfo.address = rider.getHomeAddressID();
            userInfo.phone = rider.getMobileNo();
            userInfo.country = rider.getCountryCode();
            userInfo.username = rider.getEmail();
            userInfo.email = rider.getEmail();
        }
        Company company = companyRepository.findByNote(username);
        if(company!=null){
            userInfo.firstname = company.getName();
            userInfo.address = company.getAddressID();
            userInfo.phone = company.getPhoneNo();
            userInfo.username = company.getNote();
            userInfo.email = company.getNote();
        }
        return ResponseEntity.ok().body(userInfo);
    }

    @PostMapping("user/changeinfoDriver")
    public ResponseEntity<?> changeDriver(@RequestBody UserInfo userInfo){
        Driver driver = driverRepository.findByEmail(userInfo.username);
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            if(driver!=null){
                driver.setFirstName(userInfo.firstname);
                driver.setLastName(userInfo.lastname);
                driver.setAddressID(userInfo.address);
                driver.setMobileNo(userInfo.phone);
                driver.setCountryCode(userInfo.country);

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
        Rider rider = riderRepository.findByEmail(userInfo.username);
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            if(rider!=null){
                rider.setFirstName(userInfo.firstname);
                rider.setLastName(userInfo.lastname);
                rider.setHomeAddressID(userInfo.address);
                rider.setMobileNo(userInfo.phone);
                rider.setCountryCode(userInfo.country);
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
}
@Data
class UserInfo{
    String username;
    String firstname;
    String lastname;
    String avatarBase64;
    String address;
    String email;
    String phone;
    String country;
}
@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}
@Data
class UserChangePassword{
    String email;
    String oldPassword;
    String newPassword;
}