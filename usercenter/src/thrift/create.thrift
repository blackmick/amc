include "public.thrift"

namespace java com.baidu.fpu.usercenter.model.dto

struct CreateRequest{
    1:required i64 channelId;
    2:required i64 channelUid;
    3:required public.UserData data;
}

struct CreateResponse{
    1:required i32 status
    2:required i64 fbu_id
    3:string token
}

service CreateService{
    CreateResponse create(1:CreateRequest request)
}