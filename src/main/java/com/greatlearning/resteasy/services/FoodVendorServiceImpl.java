package com.greatlearning.resteasy.services;

import com.greatlearning.resteasy.dao.FoodVendorDao;
import com.greatlearning.resteasy.entities.FoodVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodVendorServiceImpl implements FoodVendorService {

    @Autowired
    private FoodVendorDao foodVendorDao;


    @Override
    public List<FoodVendor> findAll() {
        return foodVendorDao.findAll();
    }

    @Override
    public List<FoodVendor> findAllByDishName(String dishName) {
        return foodVendorDao.findByDishName(dishName);
    }
}
