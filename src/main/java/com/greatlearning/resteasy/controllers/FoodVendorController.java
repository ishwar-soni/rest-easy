package com.greatlearning.resteasy.controllers;

import com.greatlearning.resteasy.entities.FoodVendor;
import com.greatlearning.resteasy.services.FoodVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodvendors")
public class FoodVendorController {

    @Autowired
    private FoodVendorService foodVendorService;

    @GetMapping
    public List<FoodVendor> getAll() {
        return foodVendorService.findAll();
    }

    @GetMapping("/{dishName}")
    public List<FoodVendor> getAllByDishName(@PathVariable String dishName) {
        return foodVendorService.findAllByDishName(dishName);
    }
}
