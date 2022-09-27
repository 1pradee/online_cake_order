package com.onlinecakeshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinecakeshopping.model.CustomerSupport;
import com.onlinecakeshopping.model.RaiseComplaint;

@Service
public interface CustomerSupportService {
	
	public List<RaiseComplaint> viewComplaints();
	
}
