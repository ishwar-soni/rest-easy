package com.greatlearning.resteasy.controllers;

import com.greatlearning.resteasy.dtos.OrderRequest;
import com.greatlearning.resteasy.dtos.OrderResponse;
import com.greatlearning.resteasy.entities.OrderView;
import com.greatlearning.resteasy.exceptions.APIException;
import com.greatlearning.resteasy.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderResponse createOrder
            (@RequestBody List<OrderRequest> orderRequests, @RequestHeader("token") String token)
            throws APIException {
        return orderService.addOrder(orderRequests, token);
    }

    @GetMapping
    public List<OrderView> getOrders(@RequestParam(required = false) String by, @RequestParam(required = false) String order) {
        List<OrderView> response = orderService.getOrderView();
        if (by == null || order == null) {
            return response;
        } else if (by.toUpperCase().equals("AMOUNT") && order.toUpperCase().equals("ASC")) {
            response.sort(Comparator.comparing(OrderView::getAmount));
        } else if (by.toUpperCase().equals("AMOUNT") && order.toUpperCase().equals("DESC")) {
            response.sort(Comparator.comparing(OrderView::getAmount).reversed());
        } else if (by.toUpperCase().equals("DATE") && order.toUpperCase().equals("ASC")) {
            response.sort(Comparator.comparing(OrderView::getOrderDate));
        } else if (by.toUpperCase().equals("DATE") && order.toUpperCase().equals("DESC")) {
            response.sort(Comparator.comparing(OrderView::getOrderDate).reversed());
        }
        return response;
    }
}
