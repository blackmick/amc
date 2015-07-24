package com.baidu.fpu.usercenter.cluster.core;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shawn on 7/23/15.
 */
public class ServerManager {
    private static boolean started=false;
    public void start(){
        if (!started){

            started = true;
        }
    }
}


class SThread extends Thread{
    private Logger LOG = LoggerFactory.getLogger(SThread.class);
    private TServer server;
    SThread(int port){
        TMultiplexedProcessor mp = new TMultiplexedProcessor();
        TServerSocket serverSocket = null;
        try{
            serverSocket = new TServerSocket(port);
        }catch(TTransportException e){
            LOG.error("create listen socket fail.");
        }
        Args args = new Args(serverSocket);
        TProtocolFactory protoFactory = new TCompactProtocol.Factory();
        args.protocolFactory(protoFactory);
    }
}
