include "public.thrift"

namespace java com.baidu.fpu.usercenter.model.dto

//request
struct RetrieveRequest{
    1:required string channelId;
    2:required string channelUid;
    3:required string channelType;
//    4:required bool isInsert;
}

//response
struct RetrieveResponse{
    1:required i32 status;
    2:required string message;
    3:required string fbuId;
    4:optional public.UserData data;
}

service RetrieveSerivce{
    RetrieveResponse get(1:RetrieveRequest request)
}