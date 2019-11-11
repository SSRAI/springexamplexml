package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository 
{
	public List<Customer> findAll()
	{
		Customer c1 = new Customer();
		c1.setFirstName("Bill");
		c1.setLastName("Gates");
		
		Customer c2 = new Customer();
		c2.setFirstName("Stev");
		c2.setLastName("Jobs");
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		
		
		return list;
	}
}
