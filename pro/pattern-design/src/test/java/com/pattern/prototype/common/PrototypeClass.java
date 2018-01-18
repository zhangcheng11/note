package com.pattern.prototype.common;

/**
 * Created by cheng.zhang on 2018/1/5.
 */
public class PrototypeClass implements Cloneable {
    public void dosometing(){
        //
    }

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
