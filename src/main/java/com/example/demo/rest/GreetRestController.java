package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Hello";
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome";
	}
}
