package com.baidu.fpu.usercenter.service;

import com.baidu.fpu.usercenter.model.po.UserChannelMapping;

/**
 * Created by shawn on 7/30/15.
 */
public interface UserChannelMappingService {
    public int add(UserChannelMapping data);
    public UserChannelMapping get(long id);
}
