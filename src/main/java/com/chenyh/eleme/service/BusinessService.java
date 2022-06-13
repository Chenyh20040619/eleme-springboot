package com.chenyh.eleme.service;

import com.chenyh.eleme.po.Business;

import java.util.List;

public interface BusinessService{
    /**
     * 获取所有商家
     */
    List<Business> listBusinessAll();

    /**
     * 获取满足要求的商家
     * @param businessName
     * @param businessAddress
     * @return
     */
    List<Business> listBusiness(String businessName, String businessAddress);

    int saveBusiness(String businessName);
    int removeBusiness(Integer businessId);
    Business login(Integer businessId, String password);
    Business showBusiness(Integer businessId);

    /**
     * 修改商机信息
     * @param business
     * @return
     */
    int editBusiness(Business business);

    /**
     * 根据商家id 修改商家密码
     * @param businessId
     * @param password
     * @return
     */
    int updateBusinessByPassword(Integer businessId, String password);
}
