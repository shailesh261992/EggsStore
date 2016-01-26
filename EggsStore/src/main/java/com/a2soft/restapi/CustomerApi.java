package com.a2soft.restapi;

import java.util.Random;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.a2soft.domain.Customer;
import com.a2soft.domain.Name;

@RestController
public class CustomerApi {
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public Customer get(@PathVariable("id") long id) {

		Customer customer = new Customer();
		customer.setId(id);
		Name name = new Name("shailesh", "kadam");
		customer.setName(name);
		return customer;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public long create(@RequestBody Customer customer) {
		int id = new Random().nextInt(100);
		customer.setId(id);
		System.out.println("Customer created " + customer);
		return id;
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
	public Customer put(@PathVariable("id") long id, @RequestBody Customer customer) {
		System.out.println("Updating customer " + customer);
		return customer;

	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
	public long delete(@PathVariable("id") long id) {
		System.out.println("Deleteing user " + id);
		return id;
	}

}
