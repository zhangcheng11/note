package com.pattern.proxy.dynamic.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Subject subjectProxy = SubjectProxy.newProxyInstance(concreteSubject);
        subjectProxy.dosomething();
    }
}
