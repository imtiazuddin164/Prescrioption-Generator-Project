package com.spring.prescription.generation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.spring")
@EntityScan(basePackages = { "com.spring.model" })
@EnableJpaRepositories(basePackages = { "com.spring"})
@SpringBootApplication
public class PrescriptionGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrescriptionGenerationApplication.class, args);
		

	}

}
