package com.baidu.fpu.usercenter.model.po;

import java.util.Date;

public class ChannelUser {
    private Long id;

    private String cUpdateBy;

    private Date cUpdateTime;

    private Byte cDelete;

    private Byte cStatus;

    private Long cChannelId;

    private Long cChannelUserId;

    private String cPrcid;

    private String cCashCard;

    private String cPhoneNumber;

    private String cPhoto;

    private String cIdPhoto;

    private String cCloudId;

    private String cRegPosition;

    private String cSalt;

    private String cPassword;

    private String cCreateBy;

    private Date cCreateTime;

    private String cExtra0;

    private String cExtra1;

    private String cExtra2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getcChannelId() {
        return cChannelId;
    }

    public void setcChannelId(Long cChannelId) {
        this.cChannelId = cChannelId;
    }

    public Long getcChannelUserId() {
        return cChannelUserId;
    }

    public void setcChannelUserId(Long cChannelUserId) {
        this.cChannelUserId = cChannelUserId;
    }

    public String getcPrcid() {
        return cPrcid;
    }

    public void setcPrcid(String cPrcid) {
        this.cPrcid = cPrcid == null ? null : cPrcid.trim();
    }

    public String getcCashCard() {
        return cCashCard;
    }

    public void setcCashCard(String cCashCard) {
        this.cCashCard = cCashCard == null ? null : cCashCard.trim();
    }

    public String getcPhoneNumber() {
        return cPhoneNumber;
    }

    public void setcPhoneNumber(String cPhoneNumber) {
        this.cPhoneNumber = cPhoneNumber == null ? null : cPhoneNumber.trim();
    }

    public String getcPhoto() {
        return cPhoto;
    }

    public void setcPhoto(String cPhoto) {
        this.cPhoto = cPhoto == null ? null : cPhoto.trim();
    }

    public String getcIdPhoto() {
        return cIdPhoto;
    }

    public void setcIdPhoto(String cIdPhoto) {
        this.cIdPhoto = cIdPhoto == null ? null : cIdPhoto.trim();
    }

    public String getcCloudId() {
        return cCloudId;
    }

    public void setcCloudId(String cCloudId) {
        this.cCloudId = cCloudId == null ? null : cCloudId.trim();
    }

    public String getcRegPosition() {
        return cRegPosition;
    }

    public void setcRegPosition(String cRegPosition) {
        this.cRegPosition = cRegPosition == null ? null : cRegPosition.trim();
    }

    public String getcSalt() {
        return cSalt;
    }

    public void setcSalt(String cSalt) {
        this.cSalt = cSalt == null ? null : cSalt.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
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
}