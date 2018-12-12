package com.thoughtmechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication tells the Spring Boot framework that this is the
 * bootstrap class for the project
 * 
 *  - Under the covers, the @SpringBootApplication annotation marks the
 * Application class as a configuration class, then begins auto-scanning all the
 * classes on the Java class path for other Spring Beans.
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/*
		 * Call to start the entire Spring Boot service. The
		 * SpringApplication.run(Application.class, args), the call starts the Spring
		 * container and returns a Spring ApplicationContext object.
		 */
		SpringApplication.run(Application.class, args);
	}
}
