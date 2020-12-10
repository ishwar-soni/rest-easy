package com.greatlearning.resteasy.dao;

import com.greatlearning.resteasy.entities.Order;
import com.greatlearning.resteasy.entities.OrderView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDao extends JpaRepository<Order, Integer> {
    @Query("" +
            "select new com.greatlearning.resteasy.entities.OrderView " +
            "(o.id, concat(c.firstName, ' ', c.lastName), o.date, sum(od.quantity * fvdm.price)) " +
            "from Order o, Customer c, OrderDetail od, FoodVendorDishMapping fvdm " +
            "where o.customer = c and od.order = o and od.foodVendorDishMapping = fvdm " +
            "group by o.id " +
            "order by o.id ")
    public List<OrderView> getOrderView();
}
