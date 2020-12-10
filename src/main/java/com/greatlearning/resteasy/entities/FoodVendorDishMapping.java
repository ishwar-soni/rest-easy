package com.greatlearning.resteasy.entities;

import javax.persistence.*;

@Entity
@Table(name = "food_vendor_dish")
public class FoodVendorDishMapping {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "food_vendor_id")
    private FoodVendor foodVendor;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;

    @Column(name = "price", columnDefinition = "DECIMAL")
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FoodVendor getFoodVendor() {
        return foodVendor;
    }

    public void setFoodVendor(FoodVendor foodVendor) {
        this.foodVendor = foodVendor;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodVendorDishMapping{" +
                "id=" + id +
                ", foodVendor=" + foodVendor +
                ", dish=" + dish +
                ", price=" + price +
                '}';
    }
}
