package com.chenyh.eleme.service.impl;

import com.chenyh.eleme.dao.UserDao;
import com.chenyh.eleme.po.User;
import com.chenyh.eleme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public int addUser(User user) {
        int result = userDao.addUser(user);
        return result;
    }

    @Override
    public int deleteUser(String telephone) {
        int result = userDao.deleteUser(telephone);
        return result;
    }

    @Override
    public int updateUser(User user) {
        int result = userDao.updateUser(user);
        return result;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userDao.getUsers();
        return users;
    }

    @Override
    public User getUserByTelephone(String telephone) {
        User user = userDao.getUserByTelephone(telephone);
        return user;
    }
}
