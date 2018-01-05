package com.pattern.singleton.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
