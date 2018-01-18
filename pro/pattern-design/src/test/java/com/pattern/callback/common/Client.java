package com.pattern.callback.common;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Task task = new SimpleTask();
        Callback callback = new Callback() {
            public void call() {
                System.out.println("运行回调函数。");
            }
        };

        task.executeWith(callback);
    }
}
