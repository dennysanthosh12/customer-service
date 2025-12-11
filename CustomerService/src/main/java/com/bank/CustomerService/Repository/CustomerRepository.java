package com.bank.CustomerService.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.CustomerService.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
