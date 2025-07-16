package com.ktech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GreetApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApiAppApplication.class, args);
	}
}
