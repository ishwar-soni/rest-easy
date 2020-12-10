package com.greatlearning.resteasy.dao;

import com.greatlearning.resteasy.entities.Dish;
import com.greatlearning.resteasy.entities.DishView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DishDao extends JpaRepository<Dish, Integer> {

    @Query("" +
            "select new com.greatlearning.resteasy.entities.DishView " +
            "(d.id, d.name, d.calories, fv.id, fv.name, fvdm.price) " +
            "from Dish d, FoodVendor fv, FoodVendorDishMapping fvdm " +
            "where d = fvdm.dish and fv = fvdm.foodVendor")
    public List<DishView> getDishView();

    @Query("" +
            "select new com.greatlearning.resteasy.entities.DishView " +
            "(d.id, d.name, d.calories, fv.id, fv.name, fvdm.price) " +
            "from Dish d, FoodVendor fv, FoodVendorDishMapping fvdm " +
            "where d = fvdm.dish and fv = fvdm.foodVendor " +
            "order by fvdm.price asc")
    public List<DishView> getDishViewOrderByPriceAsc();

    @Query("" +
            "select new com.greatlearning.resteasy.entities.DishView " +
            "(d.id, d.name, d.calories, fv.id, fv.name, fvdm.price) " +
            "from Dish d, FoodVendor fv, FoodVendorDishMapping fvdm " +
            "where d = fvdm.dish and fv = fvdm.foodVendor " +
            "order by fvdm.price desc")
    public List<DishView> getDishViewOrderByPriceDesc();
}
