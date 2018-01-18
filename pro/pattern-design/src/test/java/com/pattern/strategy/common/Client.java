package com.pattern.strategy.common;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
