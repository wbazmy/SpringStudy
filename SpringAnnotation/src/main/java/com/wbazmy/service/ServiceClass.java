package com.wbazmy.service;

import com.wbazmy.dao.DaoClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/13 - 21:35
 */
@Service("userService")
public class ServiceClass {
    @Resource(name = "userDao")
    private DaoClass daoClass;
    @Value("wbazmy")
    private String name;

    public void setDaoClass(DaoClass daoClass) {
        this.daoClass = daoClass;
    }
    public void run(){
        daoClass.run();
        System.out.println(name);
    }
}
