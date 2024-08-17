package com.example.librarymanagement.repository;

import com.example.librarymanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
