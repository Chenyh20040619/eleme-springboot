package com.chenyh.eleme.controller;

import com.chenyh.eleme.po.Business;
import com.chenyh.eleme.po.Food;
import com.chenyh.eleme.service.impl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("/food")
@RestController
public class FoodController {
    @Autowired
    FoodServiceImpl foodService;

    @RequestMapping("/getFood")
    public List<Food> getFood(@RequestBody Business business) {
        List<Food> foods = foodService.showFoodList(business.getBusinessId());
        return foods;
    }
}
