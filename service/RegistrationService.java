package com.onlinecakeshopping.service;

import org.springframework.stereotype.Service;

import com.onlinecakeshopping.model.User;

@Service
public interface RegistrationService {
	
	public User regUser(User user);

}
