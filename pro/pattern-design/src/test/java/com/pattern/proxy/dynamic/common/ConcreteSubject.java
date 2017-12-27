package com.pattern.proxy.dynamic.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class ConcreteSubject extends Subject {
    public void dosomething() {
        System.out.print("具体业务逻辑");
    }
}
