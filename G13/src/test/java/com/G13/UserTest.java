package com.G13;



import com.G13.domain.Cityname;
import com.G13.domain.User;
import com.G13.model.UserChangePassword;
import com.G13.repo.UserRepository;
import com.G13.security.SecurityConfig;
import com.G13.service.UserService;
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


    @Test
    void testChangePasswordWrongOldPass(){
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);

        UserChangePassword userChangePassword = new UserChangePassword();

        //wrong old password
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("12345678");
        userChangePassword.setOldPassword("123456");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);





    }
    @Test
    void testNewPasswordBlank(){
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);

        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("");
        userChangePassword.setOldPassword("123456");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
    @Test
    void testNewPasswordLong(){
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);

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
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);
        when(passwordEncoder.matches("123123",user.getPassword())).thenReturn(true);
        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("999999");
        userChangePassword.setOldPassword("123123");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(true);
    }
    @Test
    void testRightPasswordButNewPasswordBlank(){
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);
        when(passwordEncoder.matches("123123",user.getPassword())).thenReturn(true);
        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("");
        userChangePassword.setOldPassword("123123");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
    @Test
    void testRightPasswordButNewTooLong(){
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);
        when(passwordEncoder.matches("123123",user.getPassword())).thenReturn(true);
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
        User user = new User();
        user.setId(1);
        user.setEmail("congtyFPT5@qa.team");
        user.setPassword("$2a$10$n8jNtZqdfe3OdrC7T0Ldc.DP6QAM7IhYO3Q.krLDV4CHvawiR7d2q");
        when(userRepository.findByEmail("congtyFPT5@qa.team")).thenReturn(user);
        when(passwordEncoder.matches("123123",user.getPassword())).thenReturn(true);
        UserChangePassword userChangePassword = new UserChangePassword();
        //new password is blank
        userChangePassword.setEmail("congtyFPT5@qa.team");
        userChangePassword.setNewPassword("");
        userChangePassword.setOldPassword("");
        assertThat(userService.changePassword(userChangePassword)).isEqualTo(false);
    }
}
