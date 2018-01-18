package com.pattern.visitor.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.setName("小张");
        commonEmployee.setSex(Sex.FEMALE);
        commonEmployee.setAge(27);
        commonEmployee.setJob("软件");
        list.add(commonEmployee);

        Manger manger = new Manger();
        manger.setName("小兵");
        manger.setSex(Sex.MALE);
        manger.setAge(24);
        manger.setPerformance("5a");
        list.add(manger);

        Visitor visitor = new Visitor();
        //visitor.visit(manger);
        for(Employee employee : list){
            employee.accept(visitor);
        }
    }
}
