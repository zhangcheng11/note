package com.pattern.factory.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public abstract class Product {
    public void pubMethod(){
        System.out.println("这是产品类的公共方法");
    }
    public abstract void method();
}
