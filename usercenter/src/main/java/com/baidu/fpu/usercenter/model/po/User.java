package com.baidu.fpu.usercenter.model.po;

import java.sql.Date;

/**
 * Created by shawn on 7/20/15.
 */
public class User {
    private long id;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate;
    private int deleteFlag;
    private int status;
    private String prcid;
    private String name;
    private String cashCard;
    private String extra_0;
    private String extra_1;
    private String extra_2;

    @Override
    public String toString(){
        return "User[id = " + id + ", createBy = " + createBy + ", createDate = " + createDate + ", updateBy = " +
                updateBy + ", updateData = " + updateDate + ", deleteFlag = " + deleteFlag + ", status = " + status +
                ", prcid = " + prcid + ", name = " + name + ", cashCard = " + " {extra_0 = "+ extra_0 +
                ", extra_1 = " + extra_1 + ", extra_2 = " + extra_2 + "}]";
    }
}
