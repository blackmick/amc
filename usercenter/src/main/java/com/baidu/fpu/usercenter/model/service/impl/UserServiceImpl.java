package com.baidu.fpu.usercenter.model.service.impl;

import com.baidu.fpu.usercenter.dao.UserDao;
import com.baidu.fpu.usercenter.model.po.User;
import com.baidu.fpu.usercenter.model.service.intf.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by shawn on 7/28/15.
 */
@Service
public class UserServiceImpl implements UserService{
    private Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user){
        return userDao.add(user);
    }

    @Override
    public User getUser(long id){
        return userDao.get(id);
    }

    public User getByPrcid(String prcid){
        return userDao.getByPrcid(prcid);
    }
    public int update(User user){
        return userDao.update(user);
    }
}
