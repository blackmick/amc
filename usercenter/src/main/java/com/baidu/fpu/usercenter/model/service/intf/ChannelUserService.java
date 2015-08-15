package com.baidu.fpu.usercenter.model.service.intf;

import com.baidu.fpu.usercenter.model.po.ChannelUser;

/**
 * Created by shawn on 7/30/15.
 */
public interface ChannelUserService {
    public int add(ChannelUser data);
    public ChannelUser get(long id);
}
