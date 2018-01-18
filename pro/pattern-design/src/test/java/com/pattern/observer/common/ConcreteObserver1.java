package com.pattern.observer.common;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class ConcreteObserver1 extends Observer {
    public void update() {
        System.out.println("ConcreteObserver1接收到消息，并进行处理");
    }
}
