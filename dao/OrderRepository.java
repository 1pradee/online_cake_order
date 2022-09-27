package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
