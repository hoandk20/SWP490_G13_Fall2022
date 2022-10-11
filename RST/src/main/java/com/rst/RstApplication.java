package com.rst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RstApplication {

	public static void main(String[] args) {
		SpringApplication.run(RstApplication.class, args);
	}
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
//	@Bean
//	CommandLineRunner run(UserService userService) {
//		MasterRole m = new MasterRole();
//        return args -> {
//
//            userService.saveRole(new Role(m.ROLE_DRIVER));
//            userService.saveRole(new Role( m.ROLE_PASSENGER));
//            userService.saveRole(new Role( m.ROLE_COMPANY));
//            userService.saveRole(new Role( m.ROLE_ADMIN));
//
//            userService.saveUser(new User("hoan", "hoan"));
//            userService.saveUser(new User("hoan1", "hoan1"));
//            userService.saveUser(new User("hoan2", "hoan2"));
//            userService.saveUser(new User("hoan3", "hoan3"));
//
//            userService.addRoleToUser("hoan", m.ROLE_DRIVER);
//            userService.addRoleToUser("hoan1", m.ROLE_PASSENGER);
//            userService.addRoleToUser("hoan2", m.ROLE_COMPANY);
//            userService.addRoleToUser("hoan3", m.ROLE_ADMIN);
//        };
//	}
}
