package com.pattern.prototype.common;

/**
 * Created by cheng.zhang on 2018/1/5.
 */
public class Client {
    public static void main(String[] args) {
        PrototypeClass instance = new PrototypeClass();
        PrototypeClass clone = instance.clone();
    }
}
