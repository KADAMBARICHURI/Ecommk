package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.domain.Category;

public interface CategoryDAO {
	
	//declare the methods
	
	//what type of operations you are going to do for user.
	
	
	//Operations
	//1) create/register  - save
	//2) update the user details  - update
	//3) validate the credentials  -  validate
	//4) get all users   - list
	
	
	//declare the methods with proper signature
	//access_specifier return_tye methodName( parameter_list)  throws exception_list
	
	
	
	// create/register  - save
	
	public  boolean save(Category category);
	
	// update the user details  - update
	public boolean update(Category user);
	
	// validate the credentials  -  validate
	//WE are going to use spring security in future.
	//we can delete this method. after using spring security.
	public boolean validate(String id, String name, String description);
	
	// get all users   - list
	
	public List<Category> list();
	
	
	//get user details based on userID
	
	public Category get(String id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

