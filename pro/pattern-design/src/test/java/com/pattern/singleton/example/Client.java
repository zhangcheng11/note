package com.pattern.singleton.example;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = SingletonFactory.getInstance();
        instance.dosomething();
    }
}
