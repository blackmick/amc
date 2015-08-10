package com.baidu.fpu.usercenter.model.po;

import com.baidu.fpu.usercenter.common.util.ClassUtil;

import java.lang.reflect.Field;
import java.util.Date;

public class User {
    private Long id;

    private String cCreateBy;

    private Date cCreateTime;

    private String cUpdateBy;

    private Date cUpdateTime;

    private Byte cDelete;

    private Byte cStatus;

    private String cPrcid;

    private String cName;

    private String cCashCard;

    private String cExtra0;

    private String cExtra1;

    private String cExtra2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcCreateBy() {
        return cCreateBy;
    }

    public void setcCreateBy(String cCreateBy) {
        this.cCreateBy = cCreateBy == null ? null : cCreateBy.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public String getcUpdateBy() {
        return cUpdateBy;
    }

    public void setcUpdateBy(String cUpdateBy) {
        this.cUpdateBy = cUpdateBy == null ? null : cUpdateBy.trim();
    }

    public Date getcUpdateTime() {
        return cUpdateTime;
    }

    public void setcUpdateTime(Date cUpdateTime) {
        this.cUpdateTime = cUpdateTime;
    }

    public Byte getcDelete() {
        return cDelete;
    }

    public void setcDelete(Byte cDelete) {
        this.cDelete = cDelete;
    }

    public Byte getcStatus() {
        return cStatus;
    }

    public void setcStatus(Byte cStatus) {
        this.cStatus = cStatus;
    }

    public String getcPrcid() {
        return cPrcid;
    }

    public void setcPrcid(String cPrcid) {
        this.cPrcid = cPrcid == null ? null : cPrcid.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCashCard() {
        return cCashCard;
    }

    public void setcCashCard(String cCashCard) {
        this.cCashCard = cCashCard == null ? null : cCashCard.trim();
    }

    public String getcExtra0() {
        return cExtra0;
    }

    public void setcExtra0(String cExtra0) {
        this.cExtra0 = cExtra0 == null ? null : cExtra0.trim();
    }

    public String getcExtra1() {
        return cExtra1;
    }

    public void setcExtra1(String cExtra1) {
        this.cExtra1 = cExtra1 == null ? null : cExtra1.trim();
    }

    public String getcExtra2() {
        return cExtra2;
    }

    public void setcExtra2(String cExtra2) {
        this.cExtra2 = cExtra2 == null ? null : cExtra2.trim();
    }

    public String toString(){
        return ClassUtil.toString(this);
    }
}