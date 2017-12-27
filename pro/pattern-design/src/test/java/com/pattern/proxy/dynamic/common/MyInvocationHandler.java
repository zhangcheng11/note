package com.pattern.proxy.dynamic.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object obj;
    public MyInvocationHandler(Object _obj){
        this.obj = _obj;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj,args);
    }
}
