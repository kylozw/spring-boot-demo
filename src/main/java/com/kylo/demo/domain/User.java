package com.kylo.demo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * PackageName: com.example.domain
 * FileName: District.java
 * Description: TODO
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 *
 * @author wangzhang kylo.zw@gmail.com
 * @version 1.0, 16/3/25
 */
@Entity
@Table(name = "sxc_user")
public class User {

    public User() {
    }

    public User(String userName, String password, Integer userType, Integer state) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.state = state;
    }

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private String userName;

    private String mobilePhone;

    @Column(nullable = false)
    private String password;

    private Integer sex;

    private String address;

    @Column(nullable = false)
    private Integer userType;

    @Column(nullable = false)
    private Integer state;

    private String areaCode;

    private Integer pushId;

    private Integer pickhoseId;

    private Date createTime;

    private Integer cityCode;

    private String loginName;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public Integer getPickhoseId() {
        return pickhoseId;
    }

    public void setPickhoseId(Integer pickhoseId) {
        this.pickhoseId = pickhoseId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
