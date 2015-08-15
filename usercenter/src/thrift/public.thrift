namespace java com.baidu.fpu.usercenter.model.dto

struct UserData{
    1:required i64 fbuId;
    2:required i64 status;
    3:required string name;
    4:required string prcid;
    5:required string cashCard;
    6:optional string createBy;
    7:optional string createTime;
    8:optional string updateBy;
    9:optional string updateTime;
}