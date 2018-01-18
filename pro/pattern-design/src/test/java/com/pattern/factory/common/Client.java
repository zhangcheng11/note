package com.pattern.factory.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        ProductA productA = concreteCreator.createProduct(ProductA.class);
        productA.pubMethod();
        productA.method();
        ProductB productB = concreteCreator.createProduct(ProductB.class);
        productB.pubMethod();
        productB.method();
    }
}
