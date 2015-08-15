include "public.thrift"

namespace java com.baidu.fpu.usercenter.model.dto

struct CreateRequest{
    1:required string channelId;
    2:required string channelUid;
    3:required public.UserData data;
}

struct CreateResponse{
    1:required i64 errCode;
    2:required string errMessage;
    3:required i64 fbuId;
    4:optional string token;
}

service CreateService{
    CreateResponse create(1:CreateRequest request)
}