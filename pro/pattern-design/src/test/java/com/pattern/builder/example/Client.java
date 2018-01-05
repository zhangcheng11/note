package com.pattern.builder.example;

/**
 * Created by cheng.zhang on 2018/1/5.
 */
public class Client {
    public static void main(String[] args) {
        /*Hreo hreo = HreoBuilder.Builder().withName("张诚").withWeapon("屠龙刀").withHairColor("红色").build();
        System.out.println(hreo);*/
        Hreo hreo = Hreo.HreoBuilder.builder().withName("张诚").withWeapon("屠龙刀").withHairColor("红色").build();
        System.out.println(hreo);
    }
}
