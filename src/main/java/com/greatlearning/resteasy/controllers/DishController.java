package com.greatlearning.resteasy.controllers;

import com.greatlearning.resteasy.entities.DishView;
import com.greatlearning.resteasy.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dishes")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping
    public List<DishView> getDishView(@RequestParam(required = false) String sort) {
        if (sort == null) {
            return dishService.getDishView();
        } else if (sort.toUpperCase().equals("ASC")) {
            return dishService.getDishViewOrderByPriceAsc();
        } else {
            return dishService.getDishViewOrderByPriceDesc();
        }
    }
}
