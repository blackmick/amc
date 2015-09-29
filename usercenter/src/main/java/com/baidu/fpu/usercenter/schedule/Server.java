package com.baidu.fpu.usercenter.schedule;

import com.baidu.fpu.usercenter.rpc.RetrieveSerivce;
import com.baidu.fpu.usercenter.rpc.impl.RetrieveServiceImpl;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.server.TThreadPoolServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shawn on 7/17/15.
 */
public class Server {
    private static Logger LOG = LoggerFactory.getLogger(Server.class);
    private TServer server=null;

    public void init(){

    }

    public void run(){
        TMultiplexedProcessor mp = new TMultiplexedProcessor();
        mp.registerProcessor("RetrieveService", new RetrieveSerivce.Processor<RetrieveServiceImpl>(new RetrieveServiceImpl()));
        try{
            TServerTransport st = new TServerSocket(8082);
            Args args = new Args(st);
            args.processor(mp);
            args.protocolFactory(new TBinaryProtocol.Factory(true, true));
            server = new TThreadPoolServer(args);
            LOG.info("server start");
            server.serve();
            LOG.info("server end");
        }catch (TTransportException e){
            LOG.error(e.getMessage());
        }
    }
}
