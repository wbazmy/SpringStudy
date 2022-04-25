package com.wbazmy.Dao;

import com.wbazmy.domain.User;

import java.util.List;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/25 - 22:17
 */
public interface UserInterface {
    public List<User> findAll();
    public void add(User user);
}
