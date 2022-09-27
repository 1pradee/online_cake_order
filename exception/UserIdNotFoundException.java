package com.onlinecakeshopping.exception;

public class UserIdNotFoundException extends RuntimeException {
   
	public UserIdNotFoundException(String message) {
		super(message);
	}
}
