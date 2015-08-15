package com.baidu.fpu.usercenter.test;

import com.baidu.fpu.usercenter.model.po.User;
import com.baidu.fpu.usercenter.model.service.intf.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shawn on 7/28/15.
 */
public class DbTest {
    private UserService userService;

    @Before
    public void before(){
        @SuppressWarnings("resources")
        ApplicationContext ctxt = new ClassPathXmlApplicationContext(new String[]{
                "classpath:spring-config.xml"
        });
        userService = (UserService)ctxt.getBean("userServiceImpl");
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setcName("TestName");
        user.setcPrcid("1100119820219098");
        user.setcCashCard("test cash card");
        int ret = userService.addUser(user);
        System.out.println("in Test.addUser");
    }

    @Test
    public void getUser(){
        User user = userService.getUser(2);
        System.out.println("get User[2]:" + user);
    }
}
