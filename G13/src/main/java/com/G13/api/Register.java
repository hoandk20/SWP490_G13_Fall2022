package com.G13.api;

import com.G13.domain.Rider;
import com.G13.domain.User;
import com.G13.domain.UserRole;
import com.G13.master.MasterStatus;
import com.G13.repo.RiderRepository;
import com.G13.repo.UserRepository;
import com.G13.repo.UserRoleRepository;
import com.G13.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Register {

    UserRepository userRepository;
    UserRoleRepository userRoleRepository;
    RiderRepository riderRepository;
        private final UserService userService;

        @PostMapping("/RegisterPassenger")
        public ResponseEntity<ResopnseContent> RegisterPassenger(@RequestBody RegisterPassenger rp) {
            ResopnseContent response = new ResopnseContent();
            MasterStatus masterStatus = new MasterStatus();
            try {
                User u = new User();
                u.setEmail(rp.email);
                u.setPassword(rp.password);
                userService.saveUser(u);
                Rider rider = new Rider();
                rider.setEmail(rp.email);
                rider.setFirstName(rp.fistName);
                rider.setLastName(rp.LastName);
                rider.setMobileNo(rp.PhoneNumber);
                rider.setLanguageCode(rp.Language);
                response.setStatus(masterStatus.SUCCESSFULL);
                riderRepository.save(rider);
                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content=exception.getMessage();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.ok().body(response);
            }

        }


}
class RegisterPassenger{
    String email;
    String password;
    String fistName;
    String LastName;
    String PhoneNumber;
    String Language;
}
