package com.pattern.strategy.common;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy _strategy){
        this.strategy = _strategy;
    }
    public void doAnything(){
        this.strategy.doSomething();
    }
}
