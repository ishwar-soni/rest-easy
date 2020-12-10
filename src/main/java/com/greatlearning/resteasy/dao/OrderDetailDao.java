package com.greatlearning.resteasy.dao;

import com.greatlearning.resteasy.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer> {
}
