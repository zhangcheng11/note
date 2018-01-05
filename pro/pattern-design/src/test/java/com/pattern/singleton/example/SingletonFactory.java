package com.pattern.singleton.example;

import java.lang.reflect.Constructor;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Constructor<? extends Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            singleton = declaredConstructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
