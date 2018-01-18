package com.pattern.adapter.common;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class adapter extends adaptee implements Target {
    public void request() {
        super.dosomething();
    }
}
