package com.pattern.factory.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> cls);
}
