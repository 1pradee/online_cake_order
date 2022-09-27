package com.onlinecakeshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecakeshopping.model.RaiseComplaint;
import com.onlinecakeshopping.service.CustomerSupportService;


@RestController
@CrossOrigin("*")
@RequestMapping("/customersupport")
public class CustomerSupportController {
	
	@Autowired
	private CustomerSupportService customerserve;
	
	//http://localhost:8091/onlinecakeorder/customersupport/viewallraisecomplaints
	
	@GetMapping("/viewallraisecomplaints")
	public ResponseEntity<List<RaiseComplaint>> viewcompliants()
	{
		List<RaiseComplaint> viewcompliant = customerserve.viewComplaints();
		return new ResponseEntity<List<RaiseComplaint>>(viewcompliant, HttpStatus.OK);
		
	}

}
