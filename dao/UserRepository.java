package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.Cart;
import com.onlinecakeshopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Object save(Cart carts);

}
