package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.entities.DishView;

import java.util.List;

public interface DishService {
    public List<DishView> getDishView();
    public List<DishView> getDishViewOrderByPriceAsc();
    public List<DishView> getDishViewOrderByPriceDesc();
}
