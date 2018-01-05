package com.pattern.factory.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class ConcreteCreator extends Creator {
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = (T)Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
