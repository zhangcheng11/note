package com.pattern.strategy.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Context {
    private Calculator calculator;
    public Context(Calculator calculator){
        this.calculator = calculator;
    }
    public int execute(){
        return this.calculator.execute();
    }
}
