package com.test.onescmbe.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200/")
@RestController
public class InitController {
	
	
	
	@GetMapping("/getdetails")
	public String hello() {
		
		return "all users";
		
		
	}

}
