package com.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	public String demoMessage() {
		return "Welcome to azure demo app";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
