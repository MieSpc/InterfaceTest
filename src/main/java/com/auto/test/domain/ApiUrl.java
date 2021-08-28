package com.auto.test.domain;

import com.auto.test.enums.AgreementType;

import java.util.Date;

public class ApiUrl {
    private Long id;

    private Long apiBaseId;

    private AgreementType agreement;

    private String domainName;

    private Integer port;

    private String apiPath;

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

    public Long getApiBaseId() {
        return apiBaseId;
    }

    public void setApiBaseId(Long apiBaseId) {
        this.apiBaseId = apiBaseId;
    }

    public AgreementType getAgreement() {
        return agreement;
    }

    public void setAgreement(AgreementType agreement) {
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

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
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