package com.baidu.fpu.usercenter.model.dao.impl;

import com.baidu.fpu.usercenter.model.dao.BaseDaoImpl;
import com.baidu.fpu.usercenter.model.dao.UserDao;
import com.baidu.fpu.usercenter.model.po.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by shawn on 7/20/15.
 */
public class UserImpl implements UserDao {
    public List<User> getAllUser(){
        SqlSession sqlSession = BaseDaoImpl.getSqlSessionFactory().openSession();
        List<User> userList = null;
        try{
            userList = sqlSession.selectList("mybatis.mapper.getAllUser");
        }finally {
            sqlSession.close();
        }

        return userList;
    }

    public void add(User user){
        SqlSession sqlSession = BaseDaoImpl.getSqlSessionFactory().openSession();
        User newUser = null;
        int ret = 0;
        try{
            ret = sqlSession.insert("mybatis.mapper.add");
        }finally {
            sqlSession.close();
        }
    }
}
