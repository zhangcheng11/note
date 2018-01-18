package com.pattern.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer){
        this.observers.add(observer);
    }
    public void delete(Observer observer){
        this.observers.remove(observer);
    }
    public void notifyObservers(){
        for(Observer o : observers){
            o.update();
        }
    }
    public abstract void dosomething();
}
