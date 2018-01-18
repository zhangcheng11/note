package com.pattern.memento.common;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setStatus("running");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
