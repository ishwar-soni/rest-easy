package com.greatlearning.resteasy.entities;

import java.io.Serializable;

public class DishView implements Serializable {
    private Integer dishId;
    private String dishName;
    private Double dishCalories;
    private Integer foodVendorId;
    private String foodVendorName;
    private Double price;

    public DishView() {
    }

    public DishView(Integer dishId, String dishName, Double dishCalories, Integer foodVendorId, String foodVendorName, Double price) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.dishCalories = dishCalories;
        this.foodVendorId = foodVendorId;
        this.foodVendorName = foodVendorName;
        this.price = price;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Double getDishCalories() {
        return dishCalories;
    }

    public void setDishCalories(Double dishCalories) {
        this.dishCalories = dishCalories;
    }

    public Integer getFoodVendorId() {
        return foodVendorId;
    }

    public void setFoodVendorId(Integer foodVendorId) {
        this.foodVendorId = foodVendorId;
    }

    public String getFoodVendorName() {
        return foodVendorName;
    }

    public void setFoodVendorName(String foodVendorName) {
        this.foodVendorName = foodVendorName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DishView{" +
                "dishId=" + dishId +
                ", dishName='" + dishName + '\'' +
                ", dishCalories=" + dishCalories +
                ", foodVendorId=" + foodVendorId +
                ", foodVendorName='" + foodVendorName + '\'' +
                ", price=" + price +
                '}';
    }
}
