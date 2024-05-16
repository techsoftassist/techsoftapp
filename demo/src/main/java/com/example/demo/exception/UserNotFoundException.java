package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(Long empid) {
		
		super("Could Not Found the User with id " + empid);
		
	}

}
