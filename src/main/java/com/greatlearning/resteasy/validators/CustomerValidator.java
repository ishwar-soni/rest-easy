package com.greatlearning.resteasy.validators;

import com.greatlearning.resteasy.dtos.LoginRequest;
import com.greatlearning.resteasy.exceptions.APIException;

public interface CustomerValidator {
    public void validateCustomerLogin(LoginRequest loginRequest) throws APIException;
}
