package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.dao.*;
import com.greatlearning.resteasy.dtos.OrderRequest;
import com.greatlearning.resteasy.dtos.OrderResponse;
import com.greatlearning.resteasy.entities.*;
import com.greatlearning.resteasy.exceptions.APIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private DishDao dishDao;

    @Autowired
    private FoodVendorDao foodVendorDao;

    @Autowired
    private FoodVendorDishMappingDao foodVendorDishMappingDao;

    @Override
    public OrderResponse addOrder(List<OrderRequest> orderRequests, String token) throws APIException {
        Customer customer = customerDao.findByUsername(token).orElseThrow(() -> new APIException("Incorrect Token"));
        Order order = new Order(0, customer, LocalDate.now());
        Order savedOrder = orderDao.save(order);
        for (OrderRequest orderRequest: orderRequests) {
            Dish dish = dishDao.findById(orderRequest.getDishId())
                    .orElseThrow(() -> new APIException("Incorrect Dish Id"));
            FoodVendor foodVendor = foodVendorDao.findById(orderRequest.getFoodVendorId())
                    .orElseThrow(() -> new APIException("Incorrect Food Vendor Id"));
            Integer quantity = orderRequest.getQuantity();
            FoodVendorDishMapping foodVendorDishMapping =
                    foodVendorDishMappingDao.findByFoodVendorAndDish(foodVendor, dish);
            OrderDetail orderDetail = new OrderDetail(0, savedOrder, foodVendorDishMapping, quantity);
            orderDetailDao.save(orderDetail);
        }
        return new OrderResponse(savedOrder.getId(), "Success");
    }

    @Override
    public List<OrderView> getOrderView() {
        return orderDao.getOrderView();
    }
}
