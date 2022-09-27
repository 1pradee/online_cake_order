package com.onlinecakeshopping.service;

import org.springframework.stereotype.Service;

import com.onlinecakeshopping.model.Order;

@Service
public interface CartService {
	
	public Order makeOrder(Order order);

}
