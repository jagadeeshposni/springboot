/**
 * 
 */
package com.example.demo;

/**
 * @author Jagadeesh
 *
 */
public class Customer {
	
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
	private long id;
	private String name;
	private String email;

}
