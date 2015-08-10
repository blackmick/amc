package com.baidu.fpu.usercenter.main;

import com.baidu.fpu.usercenter.schedule.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by shawn on 7/15/15.
 */
public class Test {
    private static final Logger LOG = LoggerFactory.getLogger(Test.class);
    public static void main(String args[]){
        System.out.println("Starting Test main procedure.");
        init();
        try{
            Server server = new Server();
            server.run();
        }catch(Exception e){
            LOG.error(e.getMessage());
        }
        LOG.info("End of Test main procedure");
    }

    private static void init(){

    }
}
