package com.auto.test.entity;

import java.io.Serializable;

public class SimpleLongRequest implements Serializable {

    private static final long serialVersionUID = 3164125894042914062L;
    private Long data;

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }
}
