package com.greatlearning.resteasy.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class OrderView implements Serializable {
    private Integer orderId;
    private String customerName;
    private LocalDate orderDate;
    private Double amount;

    public OrderView() {
    }

    public OrderView(Integer orderId, String customerName, LocalDate orderDate, Double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderView{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                ", amount=" + amount +
                '}';
    }
}
