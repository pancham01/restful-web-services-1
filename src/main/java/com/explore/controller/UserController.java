package com.explore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.explore.model.User;
import com.explore.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public User addUser(@RequestBody User user)
	{
		System.out.println("UserController.addUser()");
		userService.addUser(user);
		return user;
	}

}
