package com.chenyh.eleme.dao;

import com.chenyh.eleme.po.Admin;
import com.chenyh.eleme.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user where telephone = #{telephone}")
    User getUserByTelephone(String telephone);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(String telephone);

    @Select("select * from user")
    List<User> getUsers();
}
