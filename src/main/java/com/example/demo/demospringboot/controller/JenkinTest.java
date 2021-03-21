package com.example.demo.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinTest {
	
	@GetMapping("/jenkin")
	public String testJenkin() {
		 return "Success";
		
	}

}
