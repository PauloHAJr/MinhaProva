package com.example.ApiNoticias.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.ApiNoticias.repository")
public class ApiNoticiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNoticiasApplication.class, args);
	}

}
