package com.baidu.fpu.usercenter.dao;

import com.baidu.fpu.usercenter.model.po.UserChannelMapping;

/**
 * Created by shawn on 7/30/15.
 */
public interface UserChannelMappingDao {
    public int add(UserChannelMapping data);
    public UserChannelMapping get(long id);
    public boolean update(UserChannelMapping data);
}
