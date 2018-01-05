package com.pattern.builder.example;

/**
 * Created by cheng.zhang on 2018/1/5.
 */
public final class Hreo {
    private  String name;
    private  String hairType;
    private  String hairColor;
    private  String armor;
    private  String weapon;

    private Hreo(HreoBuilder builder){
        this.name = builder.name;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
    }

    public String getName() {
        return name;
    }

    public String getHairType() {
        return hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Hreo{" +
                "name='" + name + '\'' +
                ", hairType='" + hairType + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", armor='" + armor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public static class HreoBuilder{
        private  String name;
        private  String hairType;
        private  String hairColor;
        private  String armor;
        private  String weapon;
        private HreoBuilder(){
        }
        public static HreoBuilder builder(){
            return new HreoBuilder();
        }
        public HreoBuilder withHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public HreoBuilder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public HreoBuilder withArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public HreoBuilder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }
        public HreoBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public Hreo build(){
            return new Hreo(this);
        }
    }
}
