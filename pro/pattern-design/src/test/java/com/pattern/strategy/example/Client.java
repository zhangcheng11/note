package com.pattern.strategy.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Add(1, 2);
        Context context = new Context(calculator);
        int result = context.execute();
    }
}
