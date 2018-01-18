package com.pattern.decorator.common;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public abstract class Decorator {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    public void operate(){
        this.component.operate();
    }
}
