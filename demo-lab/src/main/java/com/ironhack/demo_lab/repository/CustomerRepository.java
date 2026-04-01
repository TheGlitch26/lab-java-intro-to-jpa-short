package com.ironhack.demo_lab.repository;

import com.ironhack.demo_lab.entity.Customer;
import com.ironhack.demo_lab.entity.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByCustomerStatus(CustomerStatus status);
}
