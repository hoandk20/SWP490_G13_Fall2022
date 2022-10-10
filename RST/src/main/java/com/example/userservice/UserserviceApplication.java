package com.example.userservice;

import com.example.userservice.domain.Role;
import com.example.userservice.domain.User;
import com.example.userservice.master.MasterRole;
import com.example.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run (UserService userService){
		MasterRole m = new MasterRole();
		return args -> {
		userService.saveRole(new Role(null, m.ROLE_DRIVER));
		userService.saveRole(new Role(null,m.ROLE_PASSENGER));
		userService.saveRole(new Role(null,m.ROLE_COMPANY));
		userService.saveRole(new Role(null,m.ROLE_ADMIN));

		userService.saveUser(new User("hoan","hoan",null,new ArrayList<Role>()));
		userService.saveUser(new User("hoan1","hoan1",null,new ArrayList<Role>()));
		userService.saveUser(new User("hoan2","hoan2",null,new ArrayList<Role>()));
		userService.saveUser(new User("hoan3","hoan3",null,new ArrayList<Role>()));
		userService.addRoleToUser("hoan",m.ROLE_DRIVER);
		userService.addRoleToUser("hoan1",m.ROLE_PASSENGER);
			userService.addRoleToUser("hoan2",m.ROLE_COMPANY);
			userService.addRoleToUser("hoan3",m.ROLE_ADMIN);
		};
	}
}
