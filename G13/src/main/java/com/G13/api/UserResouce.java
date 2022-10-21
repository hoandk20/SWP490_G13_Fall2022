package com.G13.api;


import antlr.Token;
import com.G13.domain.*;
import com.G13.master.MasterRole;
import com.G13.master.MasterStatus;
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
        userInfo.avatarBase64 = "data:image/png;base64,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";
        userInfo.email = username;

        Driver driver = driverRepository.findByEmail(username);
        if(driver!=null){
            userInfo.firstname = driver.getFirstName();
            userInfo.lastname = driver.getLastName();
            userInfo.address = driver.getAddressID();
            userInfo.phone = driver.getMobileNo();
            userInfo.Country = driver.getCountryCode();

        }

        Rider rider = riderRepository.findByEmail(username);
        if(rider!=null){
            userInfo.firstname = rider.getFirstName();
            userInfo.lastname = rider.getLastName();
            userInfo.address = rider.getHomeAddressID();
            userInfo.phone = rider.getMobileNo();
            userInfo.Country = rider.getCountryCode();
        }
        Company company = companyRepository.findByNote(username);
        if(company!=null){
            userInfo.firstname = company.getName();
            userInfo.address = company.getAddressID();
            userInfo.phone = company.getPhoneNo();
        }



        return ResponseEntity.badRequest().body(userInfo);
    }

    @PostMapping("user/changePassword")

    public ResponseEntity<?> changePassword(@RequestBody User user){

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try{
            User userExisted = userService.getUser(user.getEmail());
            userExisted.setPassword(user.getPassword());

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
    String Country;
}
@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}
