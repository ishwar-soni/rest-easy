package com.greatlearning.resteasy.dao;

import com.greatlearning.resteasy.entities.FoodVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodVendorDao extends JpaRepository<FoodVendor, Integer> {

    @Query(value = "" +
            "SELECT\n" +
            "\tfood_vendor.id,\n" +
            "\tfood_vendor.name\n" +
            "FROM\n" +
            "\tfood_vendor\n" +
            "\tJOIN food_vendor_dish ON food_vendor.id = food_vendor_dish.food_vendor_id\n" +
            "\tJOIN dish ON dish.id = food_vendor_dish.dish_id\n" +
            "WHERE\n" +
            "\tdish.name = :dishName" +
            "", nativeQuery = true)
    public List<FoodVendor> findByDishName(@Param("dishName") String dishName);
}
