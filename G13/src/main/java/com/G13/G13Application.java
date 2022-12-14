package com.G13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.G13.repository")
@EntityScan("com.G13.domain")
@SpringBootApplication
public class G13Application {

	public static void main(String[] args) {
		SpringApplication.run(G13Application.class, args);
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
