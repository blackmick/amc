namespace java com.baidu.fpu.usercenter.model.dto

struct DeleteRequest{
    1: required string channelId;
    2: required string channelUid;
}

struct DeleteResponse{
    1: required i64 errCode;
    2: optional string errMessage;
}

service DeleteService{
    DeleteResponse remove(1:DeleteRequest request)
}