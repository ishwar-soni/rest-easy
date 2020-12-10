package com.greatlearning.resteasy.dao;

import com.greatlearning.resteasy.entities.Dish;
import com.greatlearning.resteasy.entities.FoodVendor;
import com.greatlearning.resteasy.entities.FoodVendorDishMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodVendorDishMappingDao extends JpaRepository<FoodVendorDishMapping, Integer> {
    public FoodVendorDishMapping findByFoodVendorAndDish(FoodVendor foodVendor, Dish dish);
}
