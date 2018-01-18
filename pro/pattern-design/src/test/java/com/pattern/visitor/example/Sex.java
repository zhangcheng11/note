package com.pattern.visitor.example;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public enum Sex {
    MALE("男"),
    FEMALE("女"),
    ;
    private String sex;
    Sex(String sex){
        this.sex = sex;
    }
}
