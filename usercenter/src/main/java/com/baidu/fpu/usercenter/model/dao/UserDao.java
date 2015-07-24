package com.baidu.fpu.usercenter.model.dao;

import com.baidu.fpu.usercenter.model.po.User;

import java.util.List;

/**
 * Created by shawn on 7/20/15.
 */
public interface UserDao {
    public List<User> getAllUser();
    public void add(User user);
}
