package com.student.springdemo.dao;

import java.util.List;

import com.student.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public Object deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);
	

	
}
