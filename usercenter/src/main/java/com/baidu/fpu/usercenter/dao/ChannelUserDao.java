package com.baidu.fpu.usercenter.dao;

import com.baidu.fpu.usercenter.model.po.ChannelUser;

/**
 * Created by shawn on 7/30/15.
 */
public interface ChannelUserDao {
    public int add(ChannelUser data);
    public ChannelUser get(long id);
    public ChannelUser get(long channelId, long channelUid);
    public int update(ChannelUser data);
}
