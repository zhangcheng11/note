package com.pattern.proxy.dynamic.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class SubjectProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, interfaces, myInvocationHandler);
    }
}
