package com.chenyh.eleme.dao;

import org.apache.ibatis.annotations.*;
import com.chenyh.eleme.po.Food;

import java.util.List;

@Mapper
public interface FoodDao {
    @Select("select * from food where businessId = #{businessId}")
    public List<Food> listFoodByBusinessId(@Param("businessId") Integer businessId);
    @Insert("insert into food value(#{foodId}, #{foodName}, #{foodExplain}, #{foodPrice}, #{businessId})")
    public int saveFood(Food food);
    @Select("select * from food where foodId = #{foodId}")
    public Food getFoodById(@Param("foodId") Integer foodId);
    @Update("update food set foodName = #{foodName}, foodExplain = #{foodExplain}, foodPrice = #{foodPrice} where foodId = #{foodId}")
    public int updateFood(Food food);
    @Delete("delete from food where foodId = #{foodId}")
    public int removeFood(@Param("foodId") Integer foodId);
}
