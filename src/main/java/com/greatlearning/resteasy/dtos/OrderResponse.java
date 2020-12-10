package com.greatlearning.resteasy.dtos;

public class OrderResponse {
    private Integer orderId;
    private String message;

    public OrderResponse() {
    }

    public OrderResponse(Integer orderId, String message) {
        this.orderId = orderId;
        this.message = message;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "orderId=" + orderId +
                ", message='" + message + '\'' +
                '}';
    }
}
