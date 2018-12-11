package com.thoughtmechanix.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * @SpringBootApplication - Tells the Spring Boot framework that this class is
 * the entry point for the Spring Boot service
 */
@SpringBootApplication
/*
 * @RestController - Tells Spring Boot you’re going to expose the code in this
 * class as a Spring RestController class
 */
@RestController
/*
 * All URLs exposed in this application will be prefaced with /hello prefix.
 */
@RequestMapping(value = "hello")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	 * Spring Boot will expose an endpoint as a GET-based REST endpoint that will
	 * take two parameters: firstName and lastName.
	 */
	@RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
	/*
	 * Maps the firstName and lastName parameters passed in on the URL to two
	 * variables passed into the hello function
	 */
	public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {

		return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
	}
}
