package com.baidu.fpu.usercenter.service.impl;

import com.baidu.fpu.usercenter.dao.UserChannelMappingDao;
import com.baidu.fpu.usercenter.model.po.UserChannelMapping;
import com.baidu.fpu.usercenter.service.UserChannelMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 7/31/15.
 */
public class UserChannelMappingServiceImpl implements UserChannelMappingService {
    private Logger loger = LoggerFactory.getLogger(UserChannelMappingServiceImpl.class);

    @Autowired
    private UserChannelMappingDao ucmDao;

    @Override
    public int add(UserChannelMapping data){
        return ucmDao.add(data);
    }

    @Override
    public UserChannelMapping get(long id){
        return ucmDao.get(id);
    }
}
