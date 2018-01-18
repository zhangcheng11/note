package com.pattern.callback.common;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public abstract class Task {
    public void executeWith(Callback callback){
        execute();
        if(callback != null){
            callback.call();
        }
    }

    public abstract void execute();
}
