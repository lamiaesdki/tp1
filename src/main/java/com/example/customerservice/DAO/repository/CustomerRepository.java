package com.example.customerservice.DAO.repository;

import com.example.customerservice.DAO.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
