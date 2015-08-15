package com.baidu.fpu.usercenter.dao;

import com.baidu.fpu.usercenter.model.po.User;
/**
 * Created by shawn on 7/28/15.
 */
public interface UserDao {
    public int add(User user);

    public User get(long id);

    public User getByPrcid(String prcid);

    public int update(User user);
}
