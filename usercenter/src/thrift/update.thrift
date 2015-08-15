include "public.thrift"

namespace java com.baidu.fpu.usercenter.model.dto

struct UpdateRequest{
    1:required string channelId;
    2:required string channelUid;
    3:required public.UserData data;
}

struct UpdateResponse{
    1:required i64 errCode;
    2:required string errMessage;
    3:optional public.UserData data;
}

service UpdateService{
    UpdateResponse update(1:UpdateRequest request);
}