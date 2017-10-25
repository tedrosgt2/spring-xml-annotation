package com.tcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcode.model.Customer;
import com.tcode.repository.CustomerRepository;

@Service("customerService")

public class CustomerServiceIml implements CustomerService {

	@Autowired
	public CustomerRepository customerRepository; 

	/* (non-Javadoc)
	 * @see com.tcode.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}
}