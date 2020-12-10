package com.greatlearning.resteasy.dao;

import com.greatlearning.resteasy.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
    public Optional<Customer> findByUsername(String username);
}
