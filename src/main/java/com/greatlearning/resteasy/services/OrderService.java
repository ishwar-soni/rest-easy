package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.dtos.OrderRequest;
import com.greatlearning.resteasy.dtos.OrderResponse;
import com.greatlearning.resteasy.entities.OrderView;
import com.greatlearning.resteasy.exceptions.APIException;

import java.util.List;

public interface OrderService {
    public OrderResponse addOrder(List<OrderRequest> orderRequests, String token) throws APIException;
    public List<OrderView> getOrderView();
}
