package com.pattern.chain.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Woman implements IWoman {
    private int type;
    private String request;
    public Woman(int type,String request){
        this.type = type;
        this.request = request;
    }
    public int getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }
}
