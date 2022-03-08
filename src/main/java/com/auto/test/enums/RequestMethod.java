package com.auto.test.enums;

/**
 * 请求方法实体类
 */
public enum RequestMethod {
    GET(0,"GET"),
    POST(1,"POST");

    private Integer value;
    private String name;

    RequestMethod(Integer value,String name){
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static RequestMethod valueOf(Integer value) {

        for (RequestMethod requestMethod : RequestMethod.values()) {
            if (requestMethod.getValue().equals(value)) {
                return requestMethod;
            }
        }
        throw new RuntimeException("unknown RequestMethod, value:" + value);
    }
}
