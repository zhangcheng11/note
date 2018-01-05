package com.pattern.builder.common;

/**
 * Created by cheng.zhang on 2018/1/5.
 */
public class Director {
    private Builder builder = new ConcreteBuilder();
    public Product getAProduct(){
        builder.setPart();
        /**
         * 设置不同的零件产生不同的产品
         */
        return builder.buildProduct();
    }
}
