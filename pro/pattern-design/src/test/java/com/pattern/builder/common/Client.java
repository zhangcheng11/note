package com.pattern.builder.common;

/**
 * Created by cheng.zhang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        Hero riobard = new Hero.Builder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER).build();
    }
}
