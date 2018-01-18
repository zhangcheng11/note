package com.pattern.chain.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Husband extends Handler {
    public Husband() {
        super(MARRIED);
    }

    public void response(String request) {
        System.out.println("女子请求丈夫");
        System.out.println(request);
        System.out.println("丈夫同意女子的请求");
    }
}
