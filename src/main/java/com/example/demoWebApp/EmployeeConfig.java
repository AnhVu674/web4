package com.example.demoWebApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRespository employeeRes) {
		return args -> {
			Employee e = new Employee("Vu", "02/09/2002", 21, "huynhanhvu02092002@gmail.com");
		};
	}
}
