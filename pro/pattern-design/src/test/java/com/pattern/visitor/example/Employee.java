package com.pattern.visitor.example;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public abstract class Employee {
    private String name;
    private Sex sex;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    protected abstract void accept(IVisitor visitor);
}
