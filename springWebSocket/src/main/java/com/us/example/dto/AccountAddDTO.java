package com.us.example.dto;

import java.util.Date;

public class AccountAddDTO {

    private String account;
    private String nickname;
    private String password;
    private String mobilenum;
    private Integer faceid;
    private String facebookid;
    private String weixinid;
    private String faceurl;
    private Boolean sex;

    private String country;

    private Date registertime;

    private String registerip;

    private String version;

    private Integer platform;

    private String language;

    private Integer channel;

    private String mobileid;

    private String protectpassword;

    private String ip;

    private Date logintime;

    private String currentversion;

    private Byte usertype;

    private Integer logontype;

    private Boolean upgradeaccount;

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getRegisterip() {
        return registerip;
    }

    public void setRegisterip(String registerip) {
        this.registerip = registerip;
    }

    public AccountAddDTO(String account, String nickname, String password, String mobilenum, Integer faceid, String facebookid, String weixinid, String faceurl, Boolean sex, String country, Date registertime, String registerip, String version, Integer platform, String language, Integer channel, String mobileid, String protectpassword, String ip, Date logintime, String currentversion, Byte usertype, Integer logontype, Boolean upgradeaccount) {
        this.account = account;
        this.nickname = nickname;
        this.password = password;
        this.mobilenum = mobilenum;
        this.faceid = faceid;
        this.facebookid = facebookid;
        this.weixinid = weixinid;
        this.faceurl = faceurl;
        this.sex = sex;
        this.country = country;
        this.registertime = registertime;
        this.registerip = registerip;
        this.version = version;
        this.platform = platform;
        this.language = language;
        this.channel = channel;
        this.mobileid = mobileid;
        this.protectpassword = protectpassword;
        this.ip = ip;
        this.logintime = logintime;
        this.currentversion = currentversion;
        this.usertype = usertype;
        this.logontype = logontype;
        this.upgradeaccount = upgradeaccount;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getMobileid() {
        return mobileid;
    }

    public void setMobileid(String mobileid) {
        this.mobileid = mobileid;
    }

    public String getProtectpassword() {
        return protectpassword;
    }

    public void setProtectpassword(String protectpassword) {
        this.protectpassword = protectpassword;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getCurrentversion() {
        return currentversion;
    }

    public void setCurrentversion(String currentversion) {
        this.currentversion = currentversion;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Integer getLogontype() {
        return logontype;
    }

    public void setLogontype(Integer logontype) {
        this.logontype = logontype;
    }

    public Boolean getUpgradeaccount() {
        return upgradeaccount;
    }

    public void setUpgradeaccount(Boolean upgradeaccount) {
        this.upgradeaccount = upgradeaccount;
    }

    public String getFaceurl() {
        return faceurl;
    }

    public void setFaceurl(String faceurl) {
        this.faceurl = faceurl;
    }

    public String getWeixinid() {
        return weixinid;
    }

    public void setWeixinid(String weixinid) {
        this.weixinid = weixinid;
    }

    public String getFacebookid() {
        return facebookid;
    }

    public void setFacebookid(String facebookid) {
        this.facebookid = facebookid;
    }

    public Integer getFaceid() {
        return faceid;
    }

    public void setFaceid(Integer faceid) {
        this.faceid = faceid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }
}
