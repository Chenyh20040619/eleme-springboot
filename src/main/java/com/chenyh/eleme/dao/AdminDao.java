package com.chenyh.eleme.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.chenyh.eleme.po.Admin;

@Mapper
public interface AdminDao {
    @Select("select * from admin where adminName = #{adminName} and password = #{password}")
    public Admin getAdminByNameByPass(@Param("adminName") String adminName, @Param("password") String password);

    @Select("select * from admin where adminId = #{adminId} and password = #{password}")
    Admin login(@Param("adminId") Integer adminId, @Param("password") String password);
}
