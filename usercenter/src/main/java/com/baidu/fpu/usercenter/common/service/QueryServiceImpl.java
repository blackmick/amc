package com.baidu.fpu.usercenter.common.service;

import com.baidu.fpu.usercenter.rpc.querySerivce.Iface;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shawn on 7/24/15.
 */
public class QueryServiceImpl implements Iface {
    private static Logger LOG = LoggerFactory.getLogger(QueryServiceImpl.class);

    @Override
    public queryResponse getBaseInfo(queryRequest request) throws TException {
        LOG.info("get query from client:" + request);
        queryResponse qr = new queryResponse();
        qr.setFbuId("TEST_FUB_ID");
        qr.setMessage("test message");
        qr.setStatus(1);
        LOG.info("send response to client:" + qr);
        return qr;
    }

    public boolean isExist(queryRequest request) throws TException{
        return true;
    }
}
