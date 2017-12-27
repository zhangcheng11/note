package com.pattern.proxy.dynamic.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler invocationHandler){
        return (T)Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
