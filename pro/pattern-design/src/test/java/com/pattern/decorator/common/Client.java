package com.pattern.decorator.common;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(new ConcreteComponent());
        concreteDecorator1.operate();
    }
}
