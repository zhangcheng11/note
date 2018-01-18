package com.pattern.callback.common;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class SimpleTask extends Task {
    public void execute() {
        System.out.println("执行某项任务，随后调用回调函数。");
    }
}
