package com.pattern.strategy.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Add extends Calculator {
    private int a;
    private int b;
    public Add(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int execute() {
        return a + b;
    }
}
