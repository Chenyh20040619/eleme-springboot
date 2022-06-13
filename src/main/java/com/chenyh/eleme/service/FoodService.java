package com.chenyh.eleme.service;

import com.chenyh.eleme.po.Food;

import java.util.List;

public interface FoodService {
    List<Food> showFoodList(Integer businessId);
    int saveFood(Food food);
    int updateFood(Food food);
    int removeFood(Integer foodId);
}
