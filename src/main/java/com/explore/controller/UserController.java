package com.explore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.explore.model.User;
import com.explore.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	@ResponseBody
	public User addUser(@RequestBody User user)
	{
		System.out.println("UserController.addUser()");
		userService.addUser(user);
		return user;
	}

	
	@GetMapping("/")
	public String get()
	{
		System.out.println("UserController.get()");
		return "index";
	}
}
