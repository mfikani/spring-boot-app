package com.propertyunderconstruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:starter.xml")
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
}
