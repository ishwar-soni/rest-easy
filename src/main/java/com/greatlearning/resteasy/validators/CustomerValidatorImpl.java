package com.greatlearning.resteasy.validators;

import com.greatlearning.resteasy.dao.CustomerDao;
import com.greatlearning.resteasy.dtos.LoginRequest;
import com.greatlearning.resteasy.exceptions.APIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerValidatorImpl implements CustomerValidator {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void validateCustomerLogin(LoginRequest loginRequest) throws APIException {
        if (loginRequest.getUsername() == null || loginRequest.getUsername().length() == 0) {
            throw new APIException("Invalid Username");
        }

        if (customerDao.findByUsername(loginRequest.getUsername()).isEmpty()){
            throw new APIException("This customer has not been registered.");
        }

        if (loginRequest.getPassword() == null || loginRequest.getPassword().length() == 0) {
            throw new APIException("Invalid Password");
        }
    }
}
