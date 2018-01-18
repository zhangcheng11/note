package com.pattern.observer.example.ex1;

import java.util.Observable;
import java.util.Observer;

/** 订阅者
 * Created by cheng.zhang on 2018/1/18.
 */
public class Lisi implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("收到消息，马上进行处理。");
    }
}
