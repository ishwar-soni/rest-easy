package com.greatlearning.resteasy.controllers;

import com.greatlearning.resteasy.dtos.LoginRequest;
import com.greatlearning.resteasy.dtos.LoginResponse;
import com.greatlearning.resteasy.entities.Customer;
import com.greatlearning.resteasy.exceptions.APIException;
import com.greatlearning.resteasy.exceptions.BadCredentialsException;
import com.greatlearning.resteasy.services.CustomerService;
import com.greatlearning.resteasy.validators.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerValidator customerValidator;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) throws APIException, BadCredentialsException {
        customerValidator.validateCustomerLogin(loginRequest);
        Customer customer = customerService.findByUsername(loginRequest.getUsername());
        if (customer == null || !customer.getPassword().equals(loginRequest.getPassword())){
            throw new BadCredentialsException("Invalid Credentials");
        }

        LoginResponse loginResponse = new LoginResponse(loginRequest.getUsername(), "Success", loginRequest.getUsername());
        return ResponseEntity.ok(loginResponse);
    }
}
