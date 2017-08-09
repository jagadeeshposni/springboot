package com.example.demo.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByEmail(String email);
	Customer findByEmailAndName(String email, String name);

}
