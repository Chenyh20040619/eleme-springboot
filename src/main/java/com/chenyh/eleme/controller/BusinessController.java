package com.chenyh.eleme.controller;

import com.chenyh.eleme.po.Business;
import com.chenyh.eleme.service.impl.BusinessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/business")
@RestController
public class BusinessController {
    @Autowired
    BusinessServiceImpl businessService;
    @PostMapping("/login")
    public Business login(@PathVariable("id") int adminId, @PathVariable("password") String password){
        Business business = businessService.login(adminId, password);
        return business;
    }

    @PostMapping("/listBusinessAll")
    public List<Business> listBusinessAll(){
        List<Business> businesses = businessService.listBusinessAll();
        return businesses;
    }
}
