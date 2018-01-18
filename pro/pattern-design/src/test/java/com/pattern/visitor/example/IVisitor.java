package com.pattern.visitor.example;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public interface IVisitor {
    void visit(Manger manger);
    void visit(CommonEmployee commonEmployee);
}
