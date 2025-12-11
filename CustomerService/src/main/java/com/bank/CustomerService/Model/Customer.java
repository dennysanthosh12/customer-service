package com.bank.CustomerService.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true, nullable = false)
	private String email;
	private long number;
	
	public Customer(){
	}
	public Customer(String name,String email,Long number) {
		this.name=name;
		this.email=email;
		this.number=number;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public long getNumber() {
		return this.number;
	}
}
