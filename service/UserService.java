package com.onlinecakeshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinecakeshopping.exception.CakeIdNotFoundException;
import com.onlinecakeshopping.model.Cake;
import com.onlinecakeshopping.model.Cart;
import com.onlinecakeshopping.model.Feedback;
import com.onlinecakeshopping.model.RaiseComplaint;

@Service
public interface UserService {
	
	public Feedback giveFeedback(Feedback feedback);
	public List<Cake> viewAllCakes();
	public Cart  addcakeToCart(Cart cart);
	public List<Cart> viewCart();
	public RaiseComplaint raiseCompliant(RaiseComplaint raisecomplaint);
	public Cart deleteCakebyId(int cakeId) throws CakeIdNotFoundException ;
	public Cake getById(int cakeId) throws CakeIdNotFoundException;

		
	
	
	

}
