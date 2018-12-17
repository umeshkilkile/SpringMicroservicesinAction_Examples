package com.thoughtmechanix.licenses.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtmechanix.licenses.config.ServiceConfig;

@RestController
@RequestMapping(value = "v1/organizations")
public class LicenseServiceController {

	@Autowired
	private ServiceConfig serviceConfig;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLicenses() {

		return serviceConfig.getExampleProperty();
	}

}
