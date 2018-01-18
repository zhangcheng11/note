package com.pattern.decorator.common;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    public void method1(){
        System.out.println("methd1:do some thing else.");
    }
    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
