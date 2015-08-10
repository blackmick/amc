package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.model.dto.UpdateRequest;
import com.baidu.fpu.usercenter.model.dto.UpdateResponse;
import com.baidu.fpu.usercenter.rpc.UpdateService;

/**
 * Created by shawn on 7/30/15.
 */
public class UpdateServiceImpl implements UpdateService.Iface {
    public UpdateResponse update(UpdateRequest request){
        UpdateResponse response = new UpdateResponse();
        return response;
    }
}
