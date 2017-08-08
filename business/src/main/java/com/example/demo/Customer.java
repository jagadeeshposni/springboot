/**
 * 
 */
package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jagadeesh
 *
 */

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String email;
	
	public Customer() {
		super();
	}
	
	public Customer(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
