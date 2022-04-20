package com.wbazmy.service;

import com.wbazmy.dao.DaoClass;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.Socket;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/13 - 23:54
 */
@Service("userService")
public class ServiceClass {
    @Resource(name = "userDao")
    DaoClass daoClass;

    public void run() {
        daoClass.run();
    }
}
