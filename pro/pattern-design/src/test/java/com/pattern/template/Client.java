package com.pattern.template;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        AbstactTemplate template = new ConcreteTemplate();
        template.algorithm();
    }
}
