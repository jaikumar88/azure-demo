package com.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	@GetMapping("/message")
	public String demoMessage() {
		return "Welcome to azure demo app. V2";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
