package com.chenyh.eleme.service.impl;

import com.chenyh.eleme.dao.FoodDao;
import com.chenyh.eleme.po.Food;
import com.chenyh.eleme.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodDao foodDao;
    @Override
    public List<Food> showFoodList(Integer businessId) {
        List<Food> foods = foodDao.listFoodByBusinessId(businessId);
        return foods;
    }

    @Override
    public int saveFood(Food food) {
        int result = foodDao.saveFood(food);
        return result;
    }

    @Override
    public int updateFood(Food food) {
        int result = foodDao.updateFood(food);
        return result;
    }

    @Override
    public int removeFood(Integer foodId) {
        int result = foodDao.removeFood(foodId);
        return result;
    }
}
