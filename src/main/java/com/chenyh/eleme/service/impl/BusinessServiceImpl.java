package com.chenyh.eleme.service.impl;

import com.chenyh.eleme.dao.BusinessDao;
import com.chenyh.eleme.po.Business;
import com.chenyh.eleme.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    BusinessDao businessDao;

    @Override
    public List<Business> listBusinessAll() {
        List<Business> businesses = businessDao.listBusiness(null, null);
        return businesses;
    }

    @Override
    public List<Business> listBusiness(String businessName, String businessAddress) {
        List<Business> businesses = businessDao.listBusiness(businessName, businessAddress);
        return businesses;
    }

    @Override
    public int saveBusiness(String businessName) {
        int result = businessDao.saveBusiness(businessName);
        return result;
    }

    @Override
    public int removeBusiness(Integer businessId) {
        int result = businessDao.removeBusiness(businessId);
        return result;
    }

    @Override
    public Business login(Integer businessId, String password) {
        Business business = businessDao.getBusinessByIdByPass(businessId, password);
        return business;
    }

    @Override
    public Business showBusiness(Integer businessId) {
        Business business = businessDao.getBusinessById(businessId);
        return business;
    }

    @Override
    public int editBusiness(Business business) {
        int result = businessDao.updateBusiness(business);
        return result;
    }

    @Override
    public int updateBusinessByPassword(Integer businessId, String password) {
        int result = businessDao.updateBusinessByPassword(businessId, password);
        return result;
    }
}
