package com.infinity.business.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocApplication {
	@RequestMapping("/")
	public String home() {
		return "Hello POC service.";
	}

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}
}
