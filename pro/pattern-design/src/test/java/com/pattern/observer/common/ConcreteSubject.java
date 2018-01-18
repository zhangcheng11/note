package com.pattern.observer.common;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class ConcreteSubject extends Subject{
    public void dosomething() {
        System.out.println("ConcreteSubject is doing some thing.");
        super.notifyObservers();
    }
}
