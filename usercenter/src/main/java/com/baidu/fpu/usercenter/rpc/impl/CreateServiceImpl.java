package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.common.util.ErrorCode;
import com.baidu.fpu.usercenter.model.dto.CreateRequest;
import com.baidu.fpu.usercenter.model.dto.CreateResponse;
import com.baidu.fpu.usercenter.model.po.ChannelUser;
import com.baidu.fpu.usercenter.model.po.User;
import com.baidu.fpu.usercenter.rpc.CreateService;
import com.baidu.fpu.usercenter.model.service.impl.ChannelUserServiceImpl;
import com.baidu.fpu.usercenter.model.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shawn on 7/30/15.
 */
public class CreateServiceImpl implements CreateService.Iface {

    private static Logger LOG = LoggerFactory.getLogger(CreateServiceImpl.class);
    private UserServiceImpl userService;
    private ChannelUserServiceImpl channelUserService;

    public CreateResponse create(CreateRequest request){
        CreateResponse response = new CreateResponse();
        long fbuId = 0;
        long channelId = 0;
        long channelUid = 0;
        String token = "";

        try {
            ChannelUser channelUser = channelUserService.get(request.getChannelId(), request.getChannelUid());
            if (channelUser != null) {
                //账户存在
                User user = userService.getUser(channelUser.getcUid());
                if (user != null) {
                    throw new Exception("This user is not exist!");
                }

                channelUserService.update(channelUser);
                userService.update(user);
            } else {
                //账户不存在
                ChannelUser newChannelUser = new ChannelUser();
                User user = userService.getByPrcid(request.getData().getPrcid());
                if (null != user){
                    //用户不存在
                    User newUser = new User();
                    newUser.setcPrcid(request.getData().getPrcid());
                    newUser.setcCashCard(request.getData().getCashCard());
                    newUser.setcCashCard(request.getData().getName());
                    fbuId = userService.addUser(newUser);
                }else{
                    //用户存在
                    fbuId = user.getId();
                    user.setcCashCard(request.getData().getPrcid());
                    user.setcCashCard(request.getData().getCashCard());
                    user.setcCashCard(request.getData().getName());
                    userService.update(user);
                }

                newChannelUser.setcUid(fbuId);
                newChannelUser.setcChannelId(request.getChannelId());
                newChannelUser.setcChannelUserId(request.getChannelUid());
                newChannelUser.setcPrcid(request.getData().getPrcid());
                newChannelUser.setcCashCard(request.getData().getCashCard());

                channelUserService.add(newChannelUser);
            }
        }catch(Exception e){
            LOG.error(e.getMessage());
        }

        response.setErrCode(ErrorCode.E_OK);
        response.setFbuId(fbuId);
        response.setToken(token);
        return response;
    }
}
