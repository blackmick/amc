namespace java com.baidu.fpu.usercenter.model.dto

struct UserData{
    1:required i64 fbuId;
    2:required i64 status;
    3:required string name;
    4:required string prcid;
    5:required string cashCard;
    6:required string phoneNumber;
    7:optional string photo;
    8:optional string idPhoto;
    9:optional string password;
    10:optional string createBy;
    11:optional string createTime;
    12:optional string updateBy;
    13:optional string updateTime;
}