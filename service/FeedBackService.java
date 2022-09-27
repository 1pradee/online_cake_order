package com.onlinecakeshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinecakeshopping.model.Feedback;

@Service
public interface FeedBackService {
	//method for managing feedbacks given by the Instructor
			public List<Feedback> getAllFeedbacks();
			
}
