package com.chenyh.eleme.controller;

import com.chenyh.eleme.po.User;
import com.chenyh.eleme.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping("/register")
    public boolean register(@RequestBody User user){
        int result = userService.addUser(user);
        return (result == 1) ? true : false;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){
        User resultUser = userService.getUserByTelephone(user.getTelephone());
        return resultUser;
    }
}
