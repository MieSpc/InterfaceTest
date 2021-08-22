package com.auto.test.entity;

import com.auto.test.enums.AgreementType;

/**
 * 接口url实体类
 */
public class ApiUrlEntity {

    private AgreementType agreementType;

    private String domainName;

    private Integer port;

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
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
}
