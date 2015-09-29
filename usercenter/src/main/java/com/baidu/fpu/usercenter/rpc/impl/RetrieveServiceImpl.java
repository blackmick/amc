package com.baidu.fpu.usercenter.rpc.impl;

import com.baidu.fpu.usercenter.common.util.ErrorCode;
import com.baidu.fpu.usercenter.dao.UserDao;
import com.baidu.fpu.usercenter.model.dto.RetrieveRequest;
import com.baidu.fpu.usercenter.model.dto.RetrieveResponse;
import com.baidu.fpu.usercenter.model.dto.UserData;
import com.baidu.fpu.usercenter.model.po.ChannelUser;
import com.baidu.fpu.usercenter.model.po.User;
import com.baidu.fpu.usercenter.model.service.impl.ChannelUserServiceImpl;
import com.baidu.fpu.usercenter.model.service.impl.UserServiceImpl;
import com.baidu.fpu.usercenter.rpc.RetrieveSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 7/30/15.
 */
public class RetrieveServiceImpl implements RetrieveSerivce.Iface {
    @Autowired
    private ChannelUserServiceImpl channelUserService;

    @Autowired
    private UserServiceImpl userService;

    private static Logger LOG = LoggerFactory.getLogger(RetrieveServiceImpl.class);

    @Override
    public RetrieveResponse get(RetrieveRequest request){
        LOG.debug("RetrieveServiceImpl.get entry.");
        RetrieveResponse response = new RetrieveResponse();
        int errCode;

        if (!checkParam(request)){
            response.setStatus(ErrorCode.E_INVALID_PARAM);
            return response;
        }

        ChannelUser channelUser = channelUserService.get(
                request.getChannelId(),
                request.getChannelUid());

        if (null == channelUser){
            errCode = ErrorCode.E_USER_NOT_FOUND;
            response.setStatus(errCode);
            response.setMessage(ErrorCode.getMessage(errCode));
            return response;
        }

        User user = userService.getUser(channelUser.getcUid());

        if (null == user){
            errCode = ErrorCode.E_USER_NOT_FOUND;
            response.setStatus(errCode);
            response.setMessage(ErrorCode.getMessage(errCode));
            return response;
        }

        response = formatResponse(channelUser, user);
        LOG.debug("RetrieveServiceImpl.get exit.");
        return response;
    }

    private RetrieveResponse formatResponse(ChannelUser channelUser, User user){
        RetrieveResponse response = new RetrieveResponse();

        UserData userData = new UserData();

        userData.setStatus(user.getcStatus());
        userData.setFbuId(user.getId());
        userData.setCashCard(channelUser.getcCashCard());
        userData.setName(user.getcName());
        userData.setPrcid(user.getcPrcid());

        response.setData(userData);
        return response;
    }

    /**
     *
     * @param request
     * @return
     */
    public boolean isExist(RetrieveRequest request){
        if (!checkParam(request)){
            return false;
        }

        ChannelUser channelUser = channelUserService.get(
                request.getChannelId(),
                request.getChannelUid());

        if (null == channelUser){
            return false;
        }

        User user = userService.getUser(channelUser.getcUid());

        if (null == user) {
            return false;
        }

        return true;
    }

    private boolean checkParam(RetrieveRequest request){
        if (request.getChannelId().isEmpty()){
            LOG.warn("invalid parameter[channel_id]:" + request.getChannelId());
            return false;
        }

        if (request.getChannelUid().isEmpty()){
            LOG.warn("invalid parameter[channel_user_id]:" + request.getChannelId());
            return false;
        }

        return true;
    }
}
