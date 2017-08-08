package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.data.CustomerRepository;

@SpringBootApplication
public class CustomerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerBackendApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(CustomerRepository customerRepository) {
		return (args) -> {
			customerRepository.save(new Customer(1, "Customer One", "customerone@gmail.com"));
			customerRepository.save(new Customer(2, "Customer Two", "customertwo@gmail.com"));
			customerRepository.save(new Customer(3, "Customer One", "customerthree@gmail.com"));
		};
	}
}
