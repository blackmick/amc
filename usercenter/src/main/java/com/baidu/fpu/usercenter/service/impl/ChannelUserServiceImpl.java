package com.baidu.fpu.usercenter.service.impl;

import com.baidu.fpu.usercenter.dao.ChannelUserDao;
import com.baidu.fpu.usercenter.model.po.ChannelUser;
import com.baidu.fpu.usercenter.service.ChannelUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 7/30/15.
 */
public class ChannelUserServiceImpl implements ChannelUserService {
    private Logger logger = LoggerFactory.getLogger(ChannelUserServiceImpl.class);

    @Autowired
    private ChannelUserDao channelUserDao;

    @Override
    public int add(ChannelUser data){
        return  channelUserDao.add(data);
    }

    @Override
    public ChannelUser get(long id){
        return channelUserDao.get(id);
    }

    public ChannelUser get(long channelId, long channelUid){
        return channelUserDao.get(channelId, channelUid);
    }

    public int update(ChannelUser data){
        return channelUserDao.update(data);
    }
}
