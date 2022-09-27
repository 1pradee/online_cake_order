package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.RegistrationForm;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationForm, Integer> {

}
