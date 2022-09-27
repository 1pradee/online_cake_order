package com.onlinecakeshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecakeshopping.dao.RegistrationRepository;
import com.onlinecakeshopping.dao.UserRepository;
import com.onlinecakeshopping.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	// connecting the service implementation with the Registration repository

	@Autowired
	private RegistrationRepository regRepo;
	
	// connecting the service implementation with the User repository

	@Autowired
	private UserRepository useRepo;
	
	// method implementing to add user

	@Override
	public User regUser(User user) {
		User adduser = useRepo.saveAndFlush(user);
		return adduser;
	}
	


}
