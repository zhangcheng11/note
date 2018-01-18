package com.pattern.chain.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        List<Woman> list = new ArrayList<Woman>();
        for(int i=1;i<4;i++){
            list.add(new Woman(i,"出去买点东西"));
        }
        for(Woman w : list){
            father.handleRequest(w);
        }
    }
}
