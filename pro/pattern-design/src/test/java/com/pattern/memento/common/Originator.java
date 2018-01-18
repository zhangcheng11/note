package com.pattern.memento.common;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Originator {
    private String status;
    public void changeStatus(String status){
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Memento createMemento(){
        return new Memento(this.status);
    }
    public void restoreMemento(Memento memento){
        this.setStatus(memento.getStatus());
    }
}
