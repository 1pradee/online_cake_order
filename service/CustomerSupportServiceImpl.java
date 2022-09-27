package com.onlinecakeshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecakeshopping.dao.RaiseComplaintRepository;
import com.onlinecakeshopping.model.CustomerSupport;
import com.onlinecakeshopping.model.RaiseComplaint;

@Service
public class CustomerSupportServiceImpl implements CustomerSupportService {

	// connecting the service implementation with the RaiseCompliant repository

	@Autowired
	private RaiseComplaintRepository raiseRepo;
	
	
	// method implementing to view all complaints

	@Override
	public List<RaiseComplaint> viewComplaints() {
		
		return raiseRepo.findAll();
	}
	


	

	

}
