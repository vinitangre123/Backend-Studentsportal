package com.example.StudentsData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class StudentsDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsDataApplication.class, args);
		
		System.out.println("hello vinit");
	}

}
