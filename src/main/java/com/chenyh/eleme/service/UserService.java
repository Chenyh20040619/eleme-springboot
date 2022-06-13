package com.chenyh.eleme.service;

import com.chenyh.eleme.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUser(String telephone);
    int updateUser(User user);
    List<User> getUsers();
    User getUserByTelephone(String telephone);
}
