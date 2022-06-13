package com.chenyh.eleme;

import com.chenyh.eleme.po.Business;
import com.chenyh.eleme.service.impl.BusinessServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ElemeApplicationTests {
    @Autowired
    BusinessServiceImpl businessService;
    @Test
    public void test(){
        Business login = businessService.login(1, "123");
        System.out.println(login);
    }
}
