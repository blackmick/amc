package com.baidu.fpu.usercenter.dao;

import com.baidu.fpu.usercenter.model.po.ChannelMeta;

/**
 * Created by shawn on 7/30/15.
 */
public interface ChannelMetaDao {
    public int add(ChannelMeta data);
    public ChannelMeta get(long id);
}
