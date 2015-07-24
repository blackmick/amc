namespace java com.baidu.fpu.usercenter.model.dto

//request
struct queryRequest{
    1:required string channelId;
    2:required string channelUid;
    3:required string channelType;
    4:required bool isInsert;
}

//response
struct queryResponse{
    1:required i32 status;
    2:required string message;
    3:required string fbuId;
}

service querySerivce{
    queryResponse getBaseInfo(1:queryRequest request)

    bool isExist(1:queryRequest request)
}