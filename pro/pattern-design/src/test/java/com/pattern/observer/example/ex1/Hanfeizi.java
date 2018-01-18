package com.pattern.observer.example.ex1;

import java.util.Observable;

/** 发布者
 * Created by cheng.zhang on 2018/1/18.
 */
public class Hanfeizi extends Observable {
    public void dosomething(){
        System.out.println("hanfeizi is doing someting");
        super.setChanged();
        super.notifyObservers();
    }
}
