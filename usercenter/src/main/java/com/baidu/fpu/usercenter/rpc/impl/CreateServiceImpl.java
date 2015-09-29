package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.common.service.CloudService;
import com.baidu.fpu.usercenter.common.util.ErrorCode;
import com.baidu.fpu.usercenter.model.dto.CreateRequest;
import com.baidu.fpu.usercenter.model.dto.CreateResponse;
import com.baidu.fpu.usercenter.model.dto.UserData;
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
        int errCode = ErrorCode.E_OK;
        CreateResponse response = new CreateResponse();

        if (!checkParams(request)){
            errCode = ErrorCode.E_INVALID_PARAM;
            response.setErrCode(errCode);
            response.setErrMessage(ErrorCode.getMessage(errCode));
            return response;
        }

        long fbuId = 0;
        String token = "";
        String channelId = request.getChannelId();
        String channelUid = request.getChannelUid();
        UserData data = request.getData();
        ChannelUser channelUser = null;
        User user = null;

        try {
            channelUser = channelUserService.get(channelId, channelUid);
            if (channelUser != null) {
                //账户存在
                user = userService.getUser(channelUser.getcUid());
                if (user != null) {
                    //用户存在
                    //TODO:update the user information?
                    user = updateUser(data);
                    userService.update(user);
                    //TODO: update channel user information.
                    channelUser = updateChannelUser(data);
                    channelUserService.update(channelUser);
                } else {
                    LOG.error("The channel user is exist but the user is not exist.");
                    errCode = ErrorCode.E_INTERNAL;
                    //throw new Exception("The channel user is exist but the user is not exist.");
                }
            } else {
                //账户不存在
                user = userService.getByPrcid(data.getPrcid());
                if (null != user){
                    //用户不存在
                    //TODO: create new user.
                    user = createUser(data);
                    fbuId = userService.addUser(user);
                } else {
                    //用户存在
                    //TODO: create new channel user.
                    fbuId = user.getId();
                }
                //TODO: add new channel user information.
                channelUser = createChannelUser(data);
                channelUser.setcUid(fbuId);

                channelUserService.add(channelUser);
            }

            //errCode = ErrorCode.E_OK;
            response.setErrCode(errCode);
            response.setErrMessage(ErrorCode.getMessage(errCode));
            response.setToken(token);
        }catch(Exception e){
            LOG.error(e.getMessage());
        }

        return response;
    }

    private boolean checkParams(CreateRequest request){
        if (request.getChannelId().isEmpty()){
            LOG.error("invalid param[channel id]");
            return false;
        }
        if (request.getChannelUid().isEmpty()){
            LOG.error("invalid param[channel uid]");
            return false;
        }
        if (null == request.getData()){
            LOG.error("invalid param[data]");
            return false;
        }

        UserData userData = request.getData();

        if (userData.getPrcid().isEmpty()){
            LOG.error("invalid param[prcid]");
            return false;
        }
        if (userData.getCashCard().isEmpty()){
            LOG.error("invalid param[cash_card]");
            return false;
        }
        if (userData.getName().isEmpty()){
            LOG.error("invalid param[name]");
            return false;
        }
        return true;
    }

    private ChannelUser createChannelUser(UserData data){
        ChannelUser channelUser = new ChannelUser();

        channelUser.setcPrcid(data.getPrcid());
        channelUser.setcCashCard(data.getCashCard());
        channelUser.setcPhoneNumber(data.getPhoneNumber());
        channelUser.setcPhoto(data.getPhoto());
        channelUser.setcIdPhoto(data.getIdPhoto());

        //set cloud pushing id.
        channelUser.setcCloudId(CloudService.getCloudId(channelUser));

        return channelUser;
    }

    private User createUser(UserData data){
        User user = new User();

        user.setcPrcid(data.getPrcid());
        user.setcCashCard(data.getCashCard());
        user.setcName(data.getName());

        return user;
    }

    private ChannelUser updateChannelUser(UserData data){
        return createChannelUser(data);
    }

    private User updateUser(UserData data){
        return createUser(data);
    }
}
