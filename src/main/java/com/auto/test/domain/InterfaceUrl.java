package com.auto.test.domain;

import java.util.Date;

public class InterfaceUrl {
    private Long id;

    private Long interfaceBaseId;

    private Byte agreement;

    private String domainName;

    private Integer port;

    private Long createUser;

    private Long updateUser;

    private Date createTime;

    private Date lastUpdateTime;

    private Byte isDeleted;

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

    public Byte getAgreement() {
        return agreement;
    }

    public void setAgreement(Byte agreement) {
        this.agreement = agreement;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
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

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}