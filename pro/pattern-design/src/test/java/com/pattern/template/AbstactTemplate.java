package com.pattern.template;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public abstract class AbstactTemplate {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
    public void algorithm(){
        method1();
        method3();
        method2();
    }
}
