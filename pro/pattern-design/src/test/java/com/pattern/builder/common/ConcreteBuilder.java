package com.pattern.builder.common;

/**
 * Created by cheng.zhang on 2018/1/5.
 */
public class ConcreteBuilder extends  Builder{
    private Product product = new Product();
    public void setPart() {
        //产品内部的逻辑处理
    }

    public Product buildProduct() {
        return product;
    }
}
