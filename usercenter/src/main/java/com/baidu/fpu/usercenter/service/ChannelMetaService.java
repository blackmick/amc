package com.baidu.fpu.usercenter.service;

import com.baidu.fpu.usercenter.model.po.ChannelMeta;

/**
 * Created by shawn on 7/30/15.
 */
public interface ChannelMetaService {
    public int add(ChannelMeta data);
    public ChannelMeta get(long id);
}
