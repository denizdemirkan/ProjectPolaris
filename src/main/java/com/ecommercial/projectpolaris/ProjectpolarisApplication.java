package com.ecommercial.projectpolaris;

import com.ecommercial.projectpolaris.core.entities.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectpolarisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectpolarisApplication.class, args);

		Address adr = new Address();
		System.out.println(adr.getCreatedAt());
	}

}
