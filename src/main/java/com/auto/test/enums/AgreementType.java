package com.auto.test.enums;

/**
 * 协议类型
 */
public enum AgreementType {
    HTTP(0,"http"),
    HTTPS(1,"https");

    private Integer value;
    private String name;

    AgreementType(Integer value,String name){
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static AgreementType valueOf(Integer value) {

        for (AgreementType agreementType : AgreementType.values()) {
            if (agreementType.getValue().equals(value)) {
                return agreementType;
            }
        }
        throw new RuntimeException("unknown AgreementType, value:" + value);
    }
}
