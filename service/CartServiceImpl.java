package com.onlinecakeshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecakeshopping.dao.OrderRepository;
import com.onlinecakeshopping.model.Order;

@Service
public class CartServiceImpl implements CartService{

	

	@Autowired
	private OrderRepository orderRepo;
	


	@Override
	public Order makeOrder(Order order) {
		
		Order makeorder=orderRepo.saveAndFlush(order);
		return order;
	}

}
