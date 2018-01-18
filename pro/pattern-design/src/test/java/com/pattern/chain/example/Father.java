package com.pattern.chain.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Father extends Handler {
    public Father() {
        super(UNMARRIED);
    }

    public void response(String request) {
        System.out.println("女儿请求父亲");
        System.out.println(request);
        System.out.println("父亲同意女儿的请求");
    }
}
