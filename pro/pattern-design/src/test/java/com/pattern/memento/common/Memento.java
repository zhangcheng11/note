package com.pattern.memento.common;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Memento {
    private String status;

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
