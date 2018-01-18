package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class CodeGroup extends Group {
    public void find() {
        System.out.println("代码组查找bug");
    }

    public void add() {
        System.out.println("代码组添加代码");
    }

    public void delete() {
        System.out.println("代码组删除代码");

    }

    public void change() {
        System.out.println("代码组修改bug");
    }

    public void plan() {
        System.out.println("代码组代码的计划");
    }
}
