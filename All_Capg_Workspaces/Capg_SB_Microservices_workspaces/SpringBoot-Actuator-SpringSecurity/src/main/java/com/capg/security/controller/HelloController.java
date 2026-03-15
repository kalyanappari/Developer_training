package com.capg.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Actuator!!";
	}
	
	@GetMapping("/admin/dashboard")
	@PreAuthorize("hasRole('ADMIN')")
	public String helloadmin() {
		return "Welcome to admin dashboard";
	}
	
	@GetMapping("/user/dashboard")
	@PreAuthorize("hasRole('USER')")
	public String hellouser() {
		return "Welcome to user dashboard";
	}
}

