package com.chenyh.eleme.dao;

import org.apache.ibatis.annotations.*;
import com.chenyh.eleme.po.Business;

import java.util.List;
@Mapper
public interface BusinessDao {
    public List<Business> listBusiness(@Param("businessName") String businessName, @Param("businessAddress") String businessAddress);
    @Insert("insert into business(businessName, password) value(#{businessName},'123')")
    public int saveBusiness(@Param("businessName") String businessName);
    @Delete("delete from business where businessId = #{businessId}")
    public int removeBusiness(@Param("businessId") int businessId);
    @Select("select * from business where businessId = #{businessId} and password = #{password}")
    public Business getBusinessByIdByPass(@Param("businessId") Integer businessId,@Param("password") String password);
    @Select("select * from business where businessId = #{businessId}")
    public Business getBusinessById(Integer businessId);
    @Update("update business set businessName=#{businessName},businessAddress=#{businessAddress},businessExplain=#{businessExplain}," +
            "starPrice=#{starPrice},deliveryPrice=#{deliveryPrice} where businessId = #{businessId}")
    public int updateBusiness(Business business);
    @Update("update business set password = #{password} where businessId = #{businessId}")
    public int updateBusinessByPassword(@Param("businessId") Integer businessId,@Param("password") String password);
}
