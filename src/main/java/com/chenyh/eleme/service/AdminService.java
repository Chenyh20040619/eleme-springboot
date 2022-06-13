package com.chenyh.eleme.service;

import com.chenyh.eleme.po.Admin;

public interface AdminService {
    Admin login(Integer adminId, String password);
}
