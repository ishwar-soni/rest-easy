package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.entities.Customer;

public interface CustomerService {
    public Customer findByUsername(String username);
}
