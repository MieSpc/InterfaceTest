package com.auto.test.enums;

/**
 * 参数类型
 */
public enum ParamType {
    NO_PARAM(0,"无需参数"),
    ON_PATH(1,"路径参数"),
    ON_BODY(2,"Body参数");

    private Integer value;
    private String name;

    ParamType(Integer value,String name){
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static ParamType valueOf(Integer value) {

        for (ParamType paramType : ParamType.values()) {
            if (paramType.getValue().equals(value)) {
                return paramType;
            }
        }
        throw new RuntimeException("unknown ParamType, value:" + value);
    }
}
