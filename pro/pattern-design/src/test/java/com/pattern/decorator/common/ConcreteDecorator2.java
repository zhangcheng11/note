package com.pattern.decorator.common;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    public void method2(){
        System.out.println("method : do some thing else");
    }

    @Override
    public void operate() {
        method2();
        super.operate();
    }
}
