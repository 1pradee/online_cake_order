package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.Cake;

@Repository
public interface CakeRepository extends JpaRepository<Cake, Integer> {

}
