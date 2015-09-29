package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.common.util.ErrorCode;
import com.baidu.fpu.usercenter.model.dto.UpdateRequest;
import com.baidu.fpu.usercenter.model.dto.UpdateResponse;
import com.baidu.fpu.usercenter.model.dto.UserData;
import com.baidu.fpu.usercenter.model.po.ChannelUser;
import com.baidu.fpu.usercenter.model.po.User;
import com.baidu.fpu.usercenter.model.service.impl.ChannelUserServiceImpl;
import com.baidu.fpu.usercenter.model.service.impl.UserServiceImpl;
import com.baidu.fpu.usercenter.rpc.UpdateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 7/30/15.
 */
public class UpdateServiceImpl implements UpdateService.Iface {
    private static Logger LOG = LoggerFactory.getLogger(UpdateServiceImpl.class);

    @Autowired
    private ChannelUserServiceImpl channelUserService;

    @Autowired
    private UserServiceImpl userService;

    private User user = null;

    private ChannelUser channelUser = null;

    public UpdateResponse update(UpdateRequest request){
        int errCode = ErrorCode.E_OK;
        UpdateResponse response = new UpdateResponse();
        if (!checkParams(request)){
            errCode = ErrorCode.E_INVALID_PARAM;
            response.setErrCode(errCode);
            response.setErrMessage(ErrorCode.getMessage(errCode));
            return response;
        }

        String channelId = request.getChannelId();
        String channelUid = request.getChannelUid();
        UserData userData = request.getData();

        channelUser = channelUserService.get(channelId, channelUid);
        if (null == channelUser){
            LOG.warn("channel user[channel id: "
                            + channelId
                            + ", channel uid:"
                            + channelUid
                            + "] not found."
            );
            errCode = ErrorCode.E_USER_NOT_FOUND;
            response.setErrCode(errCode);
            response.setErrMessage(ErrorCode.getMessage(errCode));
            return response;
        }

        user = userService.getUser(channelUser.getcUid());
        if (null == user){
            LOG.warn("user[uid: "
                            + channelUser.getcUid()
                            + "] not found."
            );
            errCode = ErrorCode.E_USER_NOT_FOUND;
            response.setErrCode(errCode);
            response.setErrMessage(ErrorCode.getMessage(errCode));
            return response;
        }

        channelUser = setChannelUser(userData);
        user = setUser(userData);

        channelUserService.update(channelUser);
        userService.update(user);

        return response;
    }

    private ChannelUser setChannelUser(UserData userData){
        ChannelUser channelUser = new ChannelUser();

        return  channelUser;
    }

    private User setUser(UserData userData){
        User user = new User();

        return user;
    }

    private boolean checkParams(UpdateRequest request){
        if (request.getChannelId().isEmpty()){
            LOG.error("invalid parameter[channel id]");
            return false;
        }

        if (request.getChannelUid().isEmpty()){
            LOG.error("invalid parameter[channel uid]");
            return false;
        }

        UserData data = request.getData();
        if (null == data){
            LOG.error("invalid parameter[data]");
            return false;
        }

        /*
        if (data.getPrcid().isEmpty()){
            LOG.error("invalid parameter[prcid]");
            return false;
        }
        */

        return true;
    }
}
