package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.dao.CustomerDao;
import com.greatlearning.resteasy.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer findByUsername(String username) {
        return customerDao.findByUsername(username).orElse(null);
    }
}
