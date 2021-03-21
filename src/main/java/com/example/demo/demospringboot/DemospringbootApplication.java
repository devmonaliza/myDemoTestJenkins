package com.example.demo.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemospringbootApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(DemospringbootApplication.class);
	   }
	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
		System.out.println("Monalisa");
	}

}
