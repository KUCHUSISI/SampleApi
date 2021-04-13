package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication(scanBasePackages = "com.example")
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.model")   
public class ExampleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApiApplication.class, args);
	}

}
