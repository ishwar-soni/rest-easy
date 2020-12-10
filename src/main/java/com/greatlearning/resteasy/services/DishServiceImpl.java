package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.dao.DishDao;
import com.greatlearning.resteasy.entities.DishView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    @Autowired
    private DishDao dishDao;

    @Override
    public List<DishView> getDishView() {
        return dishDao.getDishView();
    }

    @Override
    public List<DishView> getDishViewOrderByPriceAsc() {
        return dishDao.getDishViewOrderByPriceAsc();
    }

    @Override
    public List<DishView> getDishViewOrderByPriceDesc() {
        return dishDao.getDishViewOrderByPriceDesc();
    }
}
