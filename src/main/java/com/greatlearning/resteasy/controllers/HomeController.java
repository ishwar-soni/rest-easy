package com.greatlearning.resteasy.controllers;

import com.greatlearning.resteasy.entities.FoodVendor;
import com.greatlearning.resteasy.services.FoodVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    public FoodVendorService foodVendorService;

    @GetMapping
    public List<FoodVendor> welcomePage() {
        return foodVendorService.findAll();
    }
}
