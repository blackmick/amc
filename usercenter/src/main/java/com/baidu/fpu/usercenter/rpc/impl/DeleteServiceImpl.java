package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.model.dto.DeleteRequest;
import com.baidu.fpu.usercenter.model.dto.DeleteResponse;
import com.baidu.fpu.usercenter.rpc.DeleteService;

/**
 * Created by shawn on 7/30/15.
 */
public class DeleteServiceImpl implements DeleteService.Iface {
    public DeleteResponse remove(DeleteRequest request){
        DeleteResponse response = new DeleteResponse();
        return response;
    }
}
