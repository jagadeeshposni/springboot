package com.example.demo.service;

import java.util.List;

import com.example.demo.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	
	public Customer getCustomerById(long id);

	public Customer getCustomerByEmail(String email);
	
	public Customer getCustomerByEmailAndName(String email, String name);

}
