package com.baidu.fpu.usercenter.common.core;

import com.baidu.fpu.usercenter.rpc.CreateService;
import com.baidu.fpu.usercenter.rpc.DeleteService;
import com.baidu.fpu.usercenter.rpc.RetrieveSerivce;
import com.baidu.fpu.usercenter.rpc.UpdateService;
import com.baidu.fpu.usercenter.rpc.impl.CreateServiceImpl;
import com.baidu.fpu.usercenter.rpc.impl.DeleteServiceImpl;
import com.baidu.fpu.usercenter.rpc.impl.RetrieveServiceImpl;
import com.baidu.fpu.usercenter.rpc.impl.UpdateServiceImpl;
import org.apache.thrift.TException;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.server.TThreadPoolServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shawn on 7/29/15.
 */
public class RpcServiceManager {
    private static Logger logger = LoggerFactory.getLogger(RpcServiceManager.class);

    private int port;

    private TServer server = null;

    public boolean registerRpcService(TMultiplexedProcessor mp){
        mp.registerProcessor("RetrieveService", new RetrieveSerivce.Processor<RetrieveServiceImpl>(new RetrieveServiceImpl()));
        mp.registerProcessor("CreateService", new CreateService.Processor<CreateServiceImpl>(new CreateServiceImpl()));
        mp.registerProcessor("UpdateService", new UpdateService.Processor<UpdateServiceImpl>(new UpdateServiceImpl()));
        mp.registerProcessor("DeleteService", new DeleteService.Processor<DeleteServiceImpl>(new DeleteServiceImpl()));
        return true;
    }

    public void start(){
        logger.info("RPC server starting...");
        port = 8082;
        TMultiplexedProcessor mp = new TMultiplexedProcessor();
        try{
            TServerTransport st = new TServerSocket(port);

            //TODO:register processors by configuration.
            this.registerRpcService(mp);

            Args args = new Args(st);
            args.protocolFactory(new TBinaryProtocol.Factory(true, true));
            args.processor(mp);

            server = new TThreadPoolServer(args);
            logger.info("RPC server has been started successfully!");
            server.serve();
            logger.info("RPC server has been ended.");
        }catch(TException e){
            logger.error(e.getMessage());
        }
    }
}
