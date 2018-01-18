package com.pattern.decorator.example.ex1;

/**
 * Created by cheng.zhang on 2018/1/18.
 */
public abstract class PhoneDecorator{
    protected CellPhone cellPhone = null;
    public PhoneDecorator(CellPhone cellPhone){
        this.cellPhone = cellPhone;
    }
    public abstract  void operate();
}
