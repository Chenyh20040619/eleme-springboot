package com.chenyh.eleme.controller;

import com.chenyh.eleme.po.Admin;
import com.chenyh.eleme.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/admin")
@RestController
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin){
        Admin resultAdmin = adminService.login(admin.getAdminId(), admin.getPassword());
        return resultAdmin;
    }
}
