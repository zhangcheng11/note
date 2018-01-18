package com.pattern.decorator.example.ex1;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public class ConcreteDecorator extends PhoneDecorator {
    public ConcreteDecorator(CellPhone cellPhone) {
        super(cellPhone);
    }
    public void method1(){
        System.out.println("手机振动");
    }
    public void operate() {
        super.cellPhone.receiveCall();
        method1();
    }
}
