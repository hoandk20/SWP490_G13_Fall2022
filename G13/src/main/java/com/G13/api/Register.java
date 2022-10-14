package com.G13.api;

import com.G13.domain.Rider;
import com.G13.domain.User;
import com.G13.master.MasterStatus;
import com.G13.repo.RiderRepository;
import com.G13.repo.UserRepository;
import com.G13.repo.UserRoleRepository;
import com.G13.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class Register {

    UserRepository userRepository;
    UserRoleRepository userRoleRepository;

        private final UserService userService;
        private  final RiderRepository riderRepository;

        public  ResponseEntity<?> RegisterDriver(@RequestBody RegisterDriver rd){
            
            return ResponseEntity.badRequest().body("");
        }
//    @PostMapping("/abc")
//        public String abc(String username,String password){
//            return (username+""+password);
//        }
        @PostMapping("/RegisterPassenger")
        public ResponseEntity<?> RegisterPassenger(@RequestBody RegisterPassenger rp) {
            Date date = new Date();
            Instant timeStamp= Instant.now();
            ResopnseContent response = new ResopnseContent();
            MasterStatus masterStatus = new MasterStatus();
            float nofloat =0;
            short noShort = (short)0;
            try {
                Rider rider = new Rider();
                rider.setCountryCode("vi");
                rider.setEmail(rp.email);
                rider.setFirstName(rp.firstName);
                rider.setLastName(rp.LastName);
                rider.setMobileNo(rp.PhoneNumber);
                rider.setLanguageCode(rp.Language);
                rider.setId(rp.email);
                rider.setBalance(nofloat);
                rider.setCancelRate(nofloat);
                rider.setStatus("at");
                rider.setTotalTrips(noShort);
                rider.setTotalPoint(0);
                rider.setTotalRequests(noShort);
                rider.setTotalCanelledTrips(noShort);
                rider.setCreatedBy(rp.getFirstName()+rp.getLastName());
                rider.setResentCount("0".getBytes()[0]);
                rider.setPromoStatus("0".getBytes()[0]);
                rider.setRewardedTrips(noShort);
                rider.setTotalPoint(0);
                rider.setCreatedDate(timeStamp);
                rider.setLastModifiedBy(rp.firstName+rp.getLastName());
                rider.setLastModifiedDate(timeStamp);
                rider.setRate(nofloat);
                rider.setFullName(rp.firstName+rp.getLastName());
                rider.setPromotionBalance(nofloat);
                rider.setTotalTripAdjustment(0.0);
                riderRepository.save(rider);
                User u = new User();
                u.setEmail(rp.email);
                u.setPassword(rp.password);
                userService.saveUser(u);

                response.setStatus(masterStatus.SUCCESSFULL);

                return ResponseEntity.ok().body(response);
            }catch (Exception exception){
                response.content=exception.getMessage();
                response.status = masterStatus.FAILURE;
                return ResponseEntity.badRequest().body(response);
            }

        }


}

class RegisterDriver{

}
class RegisterPassenger{
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getLanguage() {
        return Language;
    }

    String email;
    String password;
    String firstName;
    String LastName;
    String PhoneNumber;
    String Language;
}
