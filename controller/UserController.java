package com.onlinecakeshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecakeshopping.exception.CakeIdNotFoundException;
import com.onlinecakeshopping.model.Cake;
import com.onlinecakeshopping.model.Cart;
import com.onlinecakeshopping.model.Feedback;
import com.onlinecakeshopping.model.RaiseComplaint;
import com.onlinecakeshopping.service.UserService;

@RestController
@CrossOrigin(origins ="*", allowedHeaders= "*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServe;
	

	
	
	 //http://localhost:8091/onlinecakeorder/user/feedback
	
	@PostMapping("/feedback") 
	public ResponseEntity<Feedback> giveFeedback(@RequestBody Feedback feedback)
	{
	userServe.giveFeedback(feedback);
		return new ResponseEntity("Feedback Recorded",HttpStatus.OK);
		
	}
	
	

	//http://localhost:8091/onlinecakeorder/user/allcake

	@GetMapping("/allcake") 
	public ResponseEntity<List<Cake>> viewAllcakes()
	{
		List<Cake> viewAllCakes = userServe.viewAllCakes();
		
		return  new ResponseEntity<List<Cake>>(viewAllCakes, HttpStatus.OK);
		
	}
	


	//http://localhost:8091/onlinecakeorder/user/addcaketocart
	
	@PostMapping("/addcaketocart") 
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart)
	{
		Cart carts= userServe.addcakeToCart(cart);
		return new ResponseEntity(carts, HttpStatus.OK) ;
		
	}
	
	//http://localhost:8091/onlinecakeorder/user/viewcart
	
	@GetMapping("/viewcart")
	public ResponseEntity<List<Cart>> viewCart()
	{
		List<Cart> viewAddCart = userServe.viewCart();
		return new ResponseEntity<List<Cart>>(viewAddCart, HttpStatus.OK);
		
	}
	


	//http://localhost:8091/onlinecakeorder/user/deletebycakeid--
	
	@DeleteMapping("/deletebycakeid/{cakeId}")
	public ResponseEntity<Cart> deleteById(@PathVariable("cakeId") Integer cakeId) throws CakeIdNotFoundException
	{
		userServe.deleteCakebyId(cakeId);
		return new ResponseEntity("Successfully deleted from cart ", HttpStatus.OK);
		
	}



	
	//http://localhost:8091/onlinecakeorder/user/raise--
	@PostMapping("/raise")
	public ResponseEntity<RaiseComplaint> raiseCompliant(@RequestBody RaiseComplaint raisecompliant)
	{
		userServe.raiseCompliant(raisecompliant);
		return new ResponseEntity("Compliant is Raised successfully", HttpStatus.OK);
		
	}
	
	
	//localhost:8091/onlinecakeorder/user/cakebyid/
	@GetMapping("/cakebyid/{cakeId}")
	public ResponseEntity getcakeById(@PathVariable("cakeId") Integer cakeId) throws CakeIdNotFoundException {
		Cake cake=userServe.getById(cakeId);
		return new ResponseEntity<Object>(cake,HttpStatus.OK);
		
	}
	
	
	
	
	

}
