package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class PageGroup extends Group {
    public void find() {
        System.out.println("页面组找页面");
    }

    public void add() {
        System.out.println("页面组添加页面");
    }

    public void delete() {
        System.out.println("页面组删除页面");
    }

    public void change() {
        System.out.println("页面组改变页面");
    }

    public void plan() {
        System.out.println("页面组计划");
    }
}
