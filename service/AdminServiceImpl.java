package com.onlinecakeshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecakeshopping.dao.CakeRepository;
import com.onlinecakeshopping.dao.FeedbackRepository;
import com.onlinecakeshopping.dao.OrderRepository;
import com.onlinecakeshopping.dao.RaiseComplaintRepository;
import com.onlinecakeshopping.dao.UserRepository;
import com.onlinecakeshopping.exception.CakeIdNotFoundException;
import com.onlinecakeshopping.exception.OrderIdNotFoundException;
import com.onlinecakeshopping.exception.UserIdNotFoundException;
import com.onlinecakeshopping.model.Cake;
import com.onlinecakeshopping.model.Feedback;
import com.onlinecakeshopping.model.Order;
import com.onlinecakeshopping.model.RaiseComplaint;
import com.onlinecakeshopping.model.User;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private CakeRepository cakeRepo;
	


	@Autowired
	private RaiseComplaintRepository raiseRepo;
	
	

	@Autowired
	private FeedbackRepository feedbackRepo;
	
	

	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private UserRepository userRepo;



	@Override
	public Cake addCakes(Cake cake) {
		Cake veg= cakeRepo.saveAndFlush(cake);
		return veg;
	}
	

	@Override
	public Cake deleteCakes(int cakeId) throws CakeIdNotFoundException {
		try {
		 cakeRepo.deleteById(cakeId);
		return null;
		}catch (Exception e) {
			throw new CakeIdNotFoundException("Entered Cake id is not found");
		}
	}
	
	

	@Override
	public Cake updateCakes(Cake Cake) {
		Cake UpdatedCake = cakeRepo.saveAndFlush(Cake);
		return UpdatedCake;
	}

	

	@Override
	public List<Cake> getAllCakes() {
		
		return cakeRepo.findAll();
	}
	
	

	@Override
	public List<RaiseComplaint> viewComplaints() {
		
		return raiseRepo.findAll();
	}
	
	

	@Override
	public List<Feedback> viewFeedbacks() {
		
		return feedbackRepo.findAll();
	}
	
	

	@Override
	public List<Order> viewOrders() {
		
		return orderRepo.findAll();
	}

	@Override
	public Cake getById(int CakeId) throws CakeIdNotFoundException {
		try {
		Optional<Cake> Cake=cakeRepo.findById(CakeId);
		return Cake.get();
		}catch (Exception e) {
			throw new CakeIdNotFoundException("Entered Cake id is not found");
		}
	}

	@Override
	public Order getOrderById(int orderId) throws OrderIdNotFoundException{
		try {
		Optional<Order> orderById=orderRepo.findById(orderId);
		return orderById.get();
		}catch (Exception e) {
			throw new OrderIdNotFoundException("Entered order id is not found");
		}
	}
	

	@Override
	public User viewUserById(int userId) throws UserIdNotFoundException{
		try {
		Optional<User> user=userRepo.findById(userId);
		return user.get();
		}catch (Exception e) {
			throw new UserIdNotFoundException("Entered user id is not found");
		}
	}

	


	
}