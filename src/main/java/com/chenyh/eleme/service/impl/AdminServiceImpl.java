package com.chenyh.eleme.service.impl;

import com.chenyh.eleme.dao.AdminDao;
import com.chenyh.eleme.po.Admin;
import com.chenyh.eleme.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public Admin login(Integer adminId, String password) {
        Admin admin = adminDao.login(adminId, password);
        return admin;
    }
}
