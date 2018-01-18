package com.pattern.visitor.example;

/**
 * Created by cheng.zhang on 2018/1/11.
 */
public class Visitor implements IVisitor {
    public void visit(Manger manger) {
        System.out.println(getMangerInfo(manger));
    }

    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }
    private String  getEmployeeBaseInfo(Employee employee){
        return "姓名："+employee.getName()+",性别："+employee.getSex().name() + ",年龄："+employee.getAge();
    }
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee){
        String employeeBaseInfo = getEmployeeBaseInfo(commonEmployee);
        String job = ",工作："+commonEmployee.getJob();
        return employeeBaseInfo + job;
    }
    private String getMangerInfo(Manger manager){
        String employeeBaseInfo = getEmployeeBaseInfo(manager);
        String performance = ",业绩"+ manager.getPerformance();
        return employeeBaseInfo + performance;
    }
}
