package com.pattern.facade.common;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void methodA(){
        this.classA.dosomethingA();
    }
    public void methodB(){
        this.classB.dosomethingB();
    }
    public void methodC(){
        this.classC.dosomethingC();
    }
}
