package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;

@RestController
public class CustomerBackendRestController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@RequestMapping("/customer")
	public Customer getCustomerByID(@RequestParam(value = "name") String name, 
									@RequestParam(value = "email") String email) {

		return customerService.getCustomerByEmailAndName(email, name);

	}
}