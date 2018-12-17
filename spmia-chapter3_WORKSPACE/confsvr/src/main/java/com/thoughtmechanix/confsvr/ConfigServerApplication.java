package com.thoughtmechanix.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 * Your Spring Cloud Config service is a Spring Boot Application, so you mark it
 * with @SpringBootApplication.
 */
@SpringBootApplication
/*
 * The @EnableConfigServer annotation enables the service as a Spring Cloud
 * Config service.
 */
@EnableConfigServer
public class ConfigServerApplication {
	/* The main method launches the service and starts the Spring container */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
