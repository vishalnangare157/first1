package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		System.out.println("hello in welcome in docker");
		SpringApplication.run(FirstApplication.class, args);
	}

}
