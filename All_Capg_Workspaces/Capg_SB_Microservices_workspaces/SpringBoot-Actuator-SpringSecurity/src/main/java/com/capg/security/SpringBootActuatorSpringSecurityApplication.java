package com.capg.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class SpringBootActuatorSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorSpringSecurityApplication.class, args);
		System.out.println("Server Started!!!");
	}

}
