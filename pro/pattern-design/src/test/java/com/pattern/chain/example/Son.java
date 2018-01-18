package com.pattern.chain.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Son extends Handler {
    public Son() {
        super(WIDOW);
    }
    public void response(String request) {
        System.out.println("母亲请求儿子");
        System.out.println(request);
        System.out.println("儿子同意母亲的请求");
    }
}
