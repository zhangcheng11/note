package com.pattern.observer.common;


/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class ConcrereObserver2 extends Observer {
    public void update() {
        System.out.println("ConcreteObserver2接收到消息，并进行处理");
    }
}
