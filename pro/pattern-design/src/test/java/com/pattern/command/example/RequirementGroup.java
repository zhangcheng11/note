package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class RequirementGroup extends Group {
    public void find() {
        System.out.println("需求组发现需求");
    }

    public void add() {
        System.out.println("需求组增加需求");
    }

    public void delete() {
        System.out.println("需求组删除需求");
    }

    public void change() {
        System.out.println("需求组改变需求");
    }

    public void plan() {
        System.out.println("需求组发需求计划需求");
    }
}
