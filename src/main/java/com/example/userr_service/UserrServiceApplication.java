package com.example.userr_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserrServiceApplication.class, args);
	}

}
