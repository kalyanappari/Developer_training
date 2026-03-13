package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDefaultSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDefaultSecurityApplication.class, args);
		
		System.out.println("Server Started!!!!");
	}

}
