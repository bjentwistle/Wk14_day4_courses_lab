package com.codeclan.example.courseservice.repositories;

import com.codeclan.example.courseservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
