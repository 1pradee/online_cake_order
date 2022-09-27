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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecakeshopping.exception.CakeIdNotFoundException;
import com.onlinecakeshopping.exception.OrderIdNotFoundException;
import com.onlinecakeshopping.exception.UserIdNotFoundException;
import com.onlinecakeshopping.model.Cake;
import com.onlinecakeshopping.model.Feedback;
import com.onlinecakeshopping.model.Order;
import com.onlinecakeshopping.model.RaiseComplaint;
import com.onlinecakeshopping.model.User;
import com.onlinecakeshopping.service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class AdminController {
	
	
	@Autowired
	private AdminService adServe;
	
	
	//localhost:8091/onlinecakeorder/admin/addcake
	@PostMapping("/addcake")
	public ResponseEntity<Cake> addcake(@RequestBody Cake cake) {
		adServe.addCakes(cake);
		return new ResponseEntity("Cake added", HttpStatus.OK);

	}
	//localhost:8091/onlinecakeorder/admin/deleteById/
	@DeleteMapping("/deleteById/{cakeId}")
	public ResponseEntity<Cake> deleteVegById(@PathVariable("cakeId") Integer cakeId) throws CakeIdNotFoundException {
		adServe.deleteCakes(cakeId);
		return new ResponseEntity("Cake Deleted", HttpStatus.OK);

	}
	//localhost:8091/onlinecakeorder/admin/update
	@PutMapping("/update")
	public ResponseEntity<Cake> updateCakes(@RequestBody Cake cakes) {
		Cake updatecake = adServe.updateCakes(cakes);

		return new ResponseEntity("Cake updated successfully", HttpStatus.OK);

	}
	//localhost:8091/onlinecakeorder/admin/allcake
	@GetMapping("/allcake")
	public ResponseEntity<List<Cake>> getAllCake() {
		List<Cake> cakeList = adServe.getAllCakes();
		if (cakeList.isEmpty()) {
			return new ResponseEntity("Sorry no cake list found!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Cake>>(cakeList, HttpStatus.OK);
	}
		
	//localhost:8091/onlinecakeorder/admin/viewallraise
		@GetMapping("/viewallraise")
		public ResponseEntity<List<RaiseComplaint>> viewCompliant() {
			List<RaiseComplaint> raisecomplaint = adServe.viewComplaints();
			return new ResponseEntity<List<RaiseComplaint>>(raisecomplaint, HttpStatus.OK);

		}
		
		//localhost:8091/onlinecakeorder/admin/viewfeedback
		
		@GetMapping("/viewfeedback")
		public ResponseEntity<List<Feedback>> viewFeedback() {
			List<Feedback> viewfeedback = adServe.viewFeedbacks();
			return new ResponseEntity(viewfeedback, HttpStatus.OK);

		}
		
		//localhost:8091/onlinecakeorder/admin/vieworder
		@GetMapping("/vieworder")
		public ResponseEntity<List<Order>> viewOrders() {
			List<Order> viewOrder = adServe.viewOrders();
			return new ResponseEntity(viewOrder, HttpStatus.OK);

		}
		
		//localhost:8091/onlinecakeorder/admin/cakebyid/
		@GetMapping("/cakebyid/{cakeId}")
		public ResponseEntity getVegById(@PathVariable("cakeId") int cakeId) throws CakeIdNotFoundException {
			Cake cake = adServe.getById(cakeId);
			return new ResponseEntity<Object>(cake, HttpStatus.OK);

		}
		
		//localhost:8091/onlinecakeorder/admin/orderbyid/--
		@GetMapping("/orderbyid/{orderId}")
		public ResponseEntity geOrderById(@PathVariable("orderId") int ordreId) throws OrderIdNotFoundException {
			Order order = adServe.getOrderById(ordreId);
			return new ResponseEntity<Object>(order, HttpStatus.OK);

		}
		//localhost:8091/onlinecakeorder/admin/userbyid/
		@GetMapping("/userbyid/{userId}")
		public ResponseEntity geUserById(@PathVariable("userId") int userId) throws UserIdNotFoundException{
			User user = adServe.viewUserById(userId);
			return new ResponseEntity<Object>(user, HttpStatus.OK);

		}
		

}
