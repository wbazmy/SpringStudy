package com.wbazmy.service;

import com.wbazmy.TestDao;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/9 - 22:09
 */
public class UserService {
    private TestDao userDao;

    public void setUserDao(TestDao userDao) {
        this.userDao = userDao;
    }

    public UserService(TestDao userDao) {
        this.userDao = userDao;
    }

    public UserService() {
    }

    public void run() {
        userDao.run();
    }
}
