package com.onlinecakeshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecakeshopping.model.User;
import com.onlinecakeshopping.service.RegistrationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService regServe;
	
	
	
	//http://localhost:8091/onlinecakeorder/registration/adduser
	
	@PostMapping("/adduser")
	public ResponseEntity<User> adduser(@RequestBody User user)
	{
		regServe.regUser(user);
		return new ResponseEntity("User is added", HttpStatus.OK);
		
	}

}
