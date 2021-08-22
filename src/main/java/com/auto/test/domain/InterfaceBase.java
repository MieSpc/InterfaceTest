package com.auto.test.domain;

import java.util.Date;

public class InterfaceBase {
    private Long id;

    private String apiName;

    private Byte requestMethod;

    private Byte paramType;

    private Byte headerType;

    private Long createUser;

    private Long updateUser;

    private Date createTime;

    private Date lastUpdateTime;

    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Byte getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(Byte requestMethod) {
        this.requestMethod = requestMethod;
    }

    public Byte getParamType() {
        return paramType;
    }

    public void setParamType(Byte paramType) {
        this.paramType = paramType;
    }

    public Byte getHeaderType() {
        return headerType;
    }

    public void setHeaderType(Byte headerType) {
        this.headerType = headerType;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}