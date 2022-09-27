package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.Feedback;

@Repository
public interface FeedbackRepository  extends JpaRepository<Feedback, Integer>{

}
