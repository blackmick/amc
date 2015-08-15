package com.baidu.fpu.usercenter.model.service.impl;

import com.baidu.fpu.usercenter.dao.ChannelMetaDao;
import com.baidu.fpu.usercenter.model.po.ChannelMeta;
import com.baidu.fpu.usercenter.model.service.intf.ChannelMetaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 7/31/15.
 */
public class ChannelMetaServiceImpl implements ChannelMetaService {
    @Autowired
    private ChannelMetaDao cmDao;

    @Override
    public int add (ChannelMeta data){
        return cmDao.add(data);
    }

    @Override
    public ChannelMeta get(long id){
        return cmDao.get(id);
    }
}
