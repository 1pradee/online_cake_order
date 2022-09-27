package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.RaiseComplaint;

@Repository
public interface RaiseComplaintRepository extends JpaRepository<RaiseComplaint, Integer>{

}
