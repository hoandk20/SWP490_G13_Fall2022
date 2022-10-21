package com.G13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class G13Application {

	public static void main(String[] args) {
		SpringApplication.run(G13Application.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
//	@Bean
//	CommandLineRunner run() {
//		Base64 base64 = new Base64();
//		MasterRole m = new MasterRole();
//        return args -> {
//				base64.convertBase64ToImage();
//
//        };
//	}
}
