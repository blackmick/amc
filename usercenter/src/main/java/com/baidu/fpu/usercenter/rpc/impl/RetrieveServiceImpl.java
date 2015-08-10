package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.model.dto.RetrieveRequest;
import com.baidu.fpu.usercenter.model.dto.RetrieveResponse;
import com.baidu.fpu.usercenter.rpc.RetrieveSerivce;

/**
 * Created by shawn on 7/30/15.
 */
public class RetrieveServiceImpl implements RetrieveSerivce.Iface {
    public RetrieveResponse get(RetrieveRequest request){
        RetrieveResponse response = new RetrieveResponse();
        return response;
    }
}
