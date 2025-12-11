package com.bank.CustomerService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.CustomerService.DTO.CustomerDTO;
import com.bank.CustomerService.Model.Customer;
import com.bank.CustomerService.Service.CustomerService;

@RestController
@RequestMapping("Customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/hello")
	public String gethello() {
		return "Hello from Denny";
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody CustomerDTO customerDTO){
		try {
			return new ResponseEntity<>(service.createCustomer(customerDTO),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
