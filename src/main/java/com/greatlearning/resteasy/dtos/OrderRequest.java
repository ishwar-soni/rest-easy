package com.greatlearning.resteasy.dtos;

public class OrderRequest {
    private Integer dishId;
    private Integer foodVendorId;
    private Integer quantity;

    public OrderRequest() {
    }

    public OrderRequest(Integer dishId, Integer foodVendorId, Integer quantity) {
        this.dishId = dishId;
        this.foodVendorId = foodVendorId;
        this.quantity = quantity;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getFoodVendorId() {
        return foodVendorId;
    }

    public void setFoodVendorId(Integer foodVendorId) {
        this.foodVendorId = foodVendorId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "dishId=" + dishId +
                ", foodVendorId=" + foodVendorId +
                ", quantity=" + quantity +
                '}';
    }
}
