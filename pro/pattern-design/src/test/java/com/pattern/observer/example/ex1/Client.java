package com.pattern.observer.example.ex1;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class Client {
    public static void main(String[] args) {
        Lisi lisi = new Lisi();
        Hanfeizi observable = new Hanfeizi();
        observable.addObserver(lisi);
        observable.dosomething();
    }
}
