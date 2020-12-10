package com.greatlearning.resteasy.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "food_vendor_dish_id")
    private FoodVendorDishMapping foodVendorDishMapping;

    @Column(name = "quantity")
    private Integer quantity;

    public OrderDetail() {
    }

    public OrderDetail(Integer id, Order order, FoodVendorDishMapping foodVendorDishMapping, Integer quantity) {
        this.id = id;
        this.order = order;
        this.foodVendorDishMapping = foodVendorDishMapping;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public FoodVendorDishMapping getFoodVendorDishMapping() {
        return foodVendorDishMapping;
    }

    public void setFoodVendorDishMapping(FoodVendorDishMapping foodVendorDishMapping) {
        this.foodVendorDishMapping = foodVendorDishMapping;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", order=" + order +
                ", foodVendorDishMapping=" + foodVendorDishMapping +
                ", quantity=" + quantity +
                '}';
    }
}
