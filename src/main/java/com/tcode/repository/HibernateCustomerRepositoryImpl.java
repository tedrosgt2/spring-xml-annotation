package com.tcode.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcode.model.Customer;

@Repository("CustomerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.tcode.repository.CustomerRepository#findall()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Daniel");
		customer.setLastname("Abrha");
		
		customers.add(customer);
		
		return customers;
		
	}

}
