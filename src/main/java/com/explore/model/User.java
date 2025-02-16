package com.explore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 2,message = "Name is too short")
	private String name;
	@Size(min = 6,message = "password is too short")
	private String password;
	
	@Email(message = "abbee oooo.................")
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Long id, String name,
			 String password,  String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
