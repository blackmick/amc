namespace java com.baidu.fpu.usercenter.model.dto

struct DeleteRequest{
    1: required i64 channelId;
    2: required i64 channelUid;
}

struct DeleteResponse{
    1: i32 status
}

service DeleteService{
    DeleteResponse remove(1:DeleteRequest request)
}