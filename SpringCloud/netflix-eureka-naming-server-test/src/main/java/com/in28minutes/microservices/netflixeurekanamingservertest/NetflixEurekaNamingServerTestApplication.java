package com.in28minutes.microservices.netflixeurekanamingservertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetflixEurekaNamingServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerTestApplication.class, args);
	}
}
