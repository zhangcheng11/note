package com.pattern.strategy.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Client2 {
    public static void main(String[] args) {
        int result = Calculate.ADD.exec(1, 2);
        System.out.println(result);
        result = Calculate.SUB.exec(1,2);
        System.out.println(result);
    }
}
