package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerServiceImpl;

@RestController
public class CustomerBackendRestController {
	
	@Autowired
	private CustomerService customerService;
	
	/*private static List<Customer> customers = new ArrayList<Customer>();

	static {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Customer 1");
		customer1.setEmail("customer1@gmail.com");
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Customer 2");
		customer2.setEmail("Customer2@gmail.com");
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setName("Customer 3");
		customer3.setEmail("Customer3@gmail.com");
		Customer customer4 = new Customer();
		customer4.setId(4);
		customer4.setName("Customer 4");
		customer4.setEmail("Customer4@gmail.com");
		Customer customer5 = new Customer();
		customer5.setId(5);
		customer5.setName("Customer 5");
		customer5.setEmail("Customer5@gmail.com");
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
	}
	*/
	@RequestMapping("/")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping("/customer")
	public Customer getCustomerByID(@RequestParam(value="id") long id) {
		
		for(Customer customer: customerService.getAllCustomers()) {
			if(customer.getId() == id) {
				return customer;
			}
		}
		
		return null;
		
	}
}