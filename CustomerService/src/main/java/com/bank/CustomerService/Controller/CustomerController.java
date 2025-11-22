package com.bank.CustomerService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Customer")
public class CustomerController {

	@GetMapping("/hello")
	public String gethello() {
		return "Hello from Denny";
	}
	
}
