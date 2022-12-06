package com.G13;



import com.G13.domain.Cityname;
import com.G13.domain.User;
import com.G13.domain.Vehicle;
import com.G13.model.UserChangePassword;
import com.G13.repo.UserRepository;
import com.G13.security.SecurityConfig;
import com.G13.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.event.annotation.PrepareTestInstance;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;

    @Mock
    PasswordEncoder passwordEncoder;


    @BeforeEach
    void addData(){
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);
        when(passwordEncoder.matches("123123",user.getPassword())).thenReturn(true);
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("user1@gmail.com");
        when(userRepository.findByEmail("user1@gmail.com")).thenReturn(user1);
    }
    //test user change password
    @Test
    void testChangePasswordWrongOldPass(){
        UserChangePassword userChangePassword = new UserChangePassword();
        //wrong old password
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("12345678");
        userChangePassword.setOldPassword("123456");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);

    }
    @Test
    void testNewPasswordBlank(){


        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("");
        userChangePassword.setOldPassword("123456");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
    @Test
    void testNewPasswordLong(){


        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is too long
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword(
                "11111111111111111111112222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        userChangePassword.setOldPassword("123456");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
    @Test
    void testRightPassword(){
        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("999999");
        userChangePassword.setOldPassword("123123");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(true);
    }
    @Test
    void testRightPasswordButNewPasswordBlank(){

        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("");
        userChangePassword.setOldPassword("123123");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
    @Test
    void testRightPasswordButNewTooLong(){

        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword(
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        userChangePassword.setOldPassword("123123");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
    @Test
    void testOldPassAndNewPassBlank(){

        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("");
        userChangePassword.setOldPassword("");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }

    //test get user by email
    @Test
    void testGetUserByEmailFound(){
        String expectEmail = "user1@gmail.com";
        User ActualUser = userService.getUserByEmail(expectEmail);
        assertThat(ActualUser.getEmail()).isEqualTo(expectEmail);
    }
    @Test
    void testGetUserByEmailNotFound(){
        String expectEmail = "userxx@gmail.com";
        User ActualUser = userService.getUserByEmail(expectEmail);
        assertThat(ActualUser).isEqualTo(null);
    }
    @Test
    void testGetUserByEmailInvalid(){
        String expectEmail = "user";
        User ActualUser = userService.getUserByEmail(expectEmail);
        assertThat(ActualUser).isEqualTo(null);
    }

    //test check email existed
    @Test
    void testCheckEmailExisted(){
        boolean ActualStatus = userService.IsEmailExisted("congtyFPT5@qa.team");
        assertThat(ActualStatus).isEqualTo(true);
    }
    @Test
    void testCheckEmailNotExisted(){
        boolean ActualStatus = userService.IsEmailExisted("congtyzzqa.team");
        assertThat(ActualStatus).isEqualTo(false);
    }
}
