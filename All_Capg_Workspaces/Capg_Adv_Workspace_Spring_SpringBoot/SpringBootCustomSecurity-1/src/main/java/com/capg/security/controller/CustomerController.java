package com.capg.security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("/home")
	public String helloController() {
		
		return "Welcome to Customer Profile";
	}
	
	@GetMapping("/customer")
	public String getCustomerDetails() {
		return "Hello" + SecurityContextHolder.getContext();
	}
}
