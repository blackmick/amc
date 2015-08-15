package com.baidu.fpu.usercenter.model.service.intf;

import com.baidu.fpu.usercenter.model.po.User;
/**
 * Created by shawn on 7/28/15.
 */
public interface UserService {
    public int addUser(User user);

    public User getUser(long id);
}
