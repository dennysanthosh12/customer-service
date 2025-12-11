package com.bank.CustomerService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.CustomerService.DTO.CustomerDTO;
import com.bank.CustomerService.Model.Customer;
import com.bank.CustomerService.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public Customer createCustomer(CustomerDTO customer) {
		Customer newCustomer= new Customer(customer.getName(),customer.getEmail(),customer.getNumber());
		return repo.save(newCustomer);
	}
}
