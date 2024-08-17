package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.Customer;
import com.example.librarymanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.findById(id);
    }
    @PostMapping("/add-customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customer.setId(id);
        return customerService.save(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.delete(id);
    }
}
