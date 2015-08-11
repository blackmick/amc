package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.model.dto.CreateRequest;
import com.baidu.fpu.usercenter.model.dto.CreateResponse;
import com.baidu.fpu.usercenter.model.po.ChannelUser;
import com.baidu.fpu.usercenter.model.po.User;
import com.baidu.fpu.usercenter.rpc.CreateService;
import com.baidu.fpu.usercenter.service.impl.ChannelUserServiceImpl;
import com.baidu.fpu.usercenter.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * Created by shawn on 7/30/15.
 */
public class CreateServiceImpl implements CreateService.Iface {
    private static Logger LOG = LoggerFactory.getLogger(CreateServiceImpl.class);

    private UserServiceImpl userService;
    private ChannelUserServiceImpl channelUserService;
    public CreateResponse create(CreateRequest request){
        CreateResponse response = new CreateResponse();

//        userService.addUser(user);
        try {
            ChannelUser channelUser = channelUserService.get(request.getChannelId(), request.getChannelUid());
            if (channelUser != null) {
                User user = userService.getUser(channelUser.getcUid());
                if (user != null) {
                    throw new Exception("This user is not exist!");
                }
                channelUserService.update(channelUser);
                userService.update(user);
            } else {
                ChannelUser newChannelUser = new ChannelUser();
                User newUser = new User();

                newChannelUser.setcChannelId(request.getChannelId());
                newChannelUser.setcChannelUserId(request.getChannelUid());
                newChannelUser.setcPrcid(request.getData().getPrcid());
                newChannelUser.setcCashCard(request.getData().getCashCard());

                channelUserService.add(newChannelUser);
                userService.addUser(newUser);
            }
        }catch(Exception e){
            LOG.error(e.getMessage());
        }

        return response;
    }
}
