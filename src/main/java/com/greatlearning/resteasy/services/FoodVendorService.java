package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.entities.FoodVendor;

import java.util.List;

public interface FoodVendorService {
    public List<FoodVendor> findAll();
    public List<FoodVendor> findAllByDishName(String dishName);
}
