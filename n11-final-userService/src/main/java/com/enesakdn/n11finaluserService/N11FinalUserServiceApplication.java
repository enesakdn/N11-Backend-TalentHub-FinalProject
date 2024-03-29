package com.enesakdn.n11finaluserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class N11FinalUserServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(N11FinalUserServiceApplication.class, args);

	}

}
