package com.auto.test.domain;

import java.util.Date;

public class InterfaceHeader {
    private Long id;

    private Long interfaceBaseId;

    private Long createUser;

    private Long updateUser;

    private Date createTime;

    private Date lastUpdateTime;

    private Boolean isDeleted;

    private String headerBody;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInterfaceBaseId() {
        return interfaceBaseId;
    }

    public void setInterfaceBaseId(Long interfaceBaseId) {
        this.interfaceBaseId = interfaceBaseId;
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

    public String getHeaderBody() {
        return headerBody;
    }

    public void setHeaderBody(String headerBody) {
        this.headerBody = headerBody;
    }
}