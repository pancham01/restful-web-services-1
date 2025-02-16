package com.explore.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.explore.model.User;
import com.explore.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	public String get() {
		return "This is your welcome.............";
	}

	@PostMapping
	public ResponseEntity addUser(@Valid @RequestBody User user, BindingResult result) {
		if (result.hasErrors()) {  // Check if validation errors exist
		    Map<String, String> errors = new HashMap<>();
		    
		    List<FieldError> fieldErrors = result.getFieldErrors(); // Get all field errors

		    for(FieldError f: fieldErrors) {  
		        errors.put(f.getField(), f.getDefaultMessage()); // Store field name & message
		    }
		    
		    return ResponseEntity.badRequest().body(errors);  // Return JSON response with errors
		}
		System.out.println("UserController.addUser()");
		userService.addUser(user);
		return ResponseEntity.ok("User registered successfully!");

	}

}
