package com.auto.test.enums;

/**
 * header类型
 */
public enum HeaderType {
    HAS_HEADER(0,"需要header"),
    NOT_HAS_HEADER(1,"不需要header");

    private Integer value;
    private String name;

    HeaderType(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static HeaderType valueOf(Integer value) {

        for (HeaderType headerType : HeaderType.values()) {
            if (headerType.getValue().equals(value)) {
                return headerType;
            }
        }
        throw new RuntimeException("unknown HeaderType, value:" + value);
    }
}
