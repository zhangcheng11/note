package com.pattern.visitor.example;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Manger extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
