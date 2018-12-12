package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * @RestController tells Spring Boot this is a REST-based services and will
 * automatically serialize/deserialize service request/response to JSON.
 */
@RestController
/*
 * Exposes all the HTTP endpoints in this class with a prefix of
 * /v1/organizations/{organizationId}/licenses
 */
@RequestMapping(value = "v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
	@Autowired
	private LicenseService licenseService;

	@RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
	public License getLicenses(@PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId) {

		// return licenseService.getLicense(licenseId);
		return new License().withId(licenseId).withOrganizationId(organizationId).withProductName("Teleco")
				.withLicenseType("Seat");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.PUT)
	public String updateLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the put");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.POST)
	public String saveLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the post");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the Delete");
	}
}
/*
 * - @RestController
 * 
 * - The @RestController is a class-level Java annotation and tells the Spring
 * Container that this Java class is going to be used for a REST-based service.
 * 
 * - This annotation automatically handles the serialization of data passed into
 * the services as JSON or XML (by default the @RestController class will
 * serialize returned data into JSON).
 * 
 * - Unlike the traditional Spring @Controller annotation, the @RestController
 * annotation doesn’t require you as the developer to return a ResponseBody
 * class from your controller class. This is all handled by the presence of
 * the @RestController annotation, which includes the @ResponseBody annotation.
 * 
 * 
 * - @RequestMapping
 * 
 * - @RequestMapping annotation as a class-level and method-level annotation.
 * The @RequestMapping annotation is used to tell the Spring container the HTTP
 * endpoint that the service is going to expose to the world. When you use the
 * class-level @RequestMapping annotation, you’re establishing the root of the
 * URL for all the other endpoints exposed by the controller.
 * 
 * - The @RequestMapping(value="/v1/organizations/{organizationId}/ licenses")
 * uses the value attribute to establish the root of the URL for all endpoints
 * exposed in the controller class.
 * 
 * - All service endpoints exposed in this controller will start with
 * /v1/organizations/{organizationId}/licenses as the root of their endpoint.
 * 
 * - The @Path- Variable annotation is used to map the parameter values passed
 * in the incoming URL
 */