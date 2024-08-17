package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Customer;
import com.example.librarymanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
