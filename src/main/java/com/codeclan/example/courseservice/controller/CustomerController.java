package com.codeclan.example.courseservice.controller;

import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping(value = "/customers")
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id) {
        return new ResponseEntity<>(customerRepo.findById(id), HttpStatus.OK);
    }

}
