package com.a2soft.templates;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author root make sure that package in which we are having restController
 *         should be in cluded in component scan
 */
@RestController
public class RestApiTemplate {

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String get() {
		return "return object";
	}

	

}
