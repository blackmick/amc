package com.baidu.fpu.usercenter.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by shawn on 7/22/15.
 */
public class RunnableExecutorService {
    private final static Logger LOG = LoggerFactory.getLogger(RunnableExecutorService.class);
    private static ExecutorService threadPoolService = null;

    @PostConstruct
    public void init(){
        threadPoolService = Executors.newFixedThreadPool(32);
        LOG.info("Thread pool init successfully.");
        System.out.println("Thread pool destroy successfully.");
    }

    @PreDestroy
    public  void destroy(){
        if (threadPoolService != null){
            threadPoolService.shutdown();
            threadPoolService = null;
        }

        LOG.info("Thread pool destroy successfully.");
    }

    public static boolean execute(final Runnable command){
        assert(threadPoolService != null);

        threadPoolService.execute(new Runnable() {
            @Override
            public void run(){
                try{
                    command.run();
                    LOG.info("thread end");
                }catch (Throwable e){
                    LOG.error(e.getMessage());
                }
            }
        });
        return true;
    }
}
