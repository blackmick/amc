include "public.thrift"

namespace java com.baidu.fpu.usercenter.model.dto

struct UpdateRequest{
    1:required i64 channelId;
    2:required i64 channelUid;
    3:required public.UserData data;
}

struct UpdateResponse{
    1:required i32 status;
    2:required string message;
    3:optional public.UserData data;
}

service UpdateService{
    UpdateResponse update(1:UpdateRequest request);
}