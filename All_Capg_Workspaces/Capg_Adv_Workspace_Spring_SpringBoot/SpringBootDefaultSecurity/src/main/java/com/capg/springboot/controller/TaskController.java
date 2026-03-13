package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@GetMapping("/secure")
	public String hello() {
		return "Hello Word";
	}
}
